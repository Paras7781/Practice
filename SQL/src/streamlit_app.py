import sqlite3
from pathlib import Path

import streamlit as st

DB_PATH = Path(__file__).resolve().parents[1] / "data" / "cric_player.db"


def get_connection():
    conn = sqlite3.connect(DB_PATH)
    conn.row_factory = sqlite3.Row
    return conn


def init_db():
    with get_connection() as conn:
        conn.execute(
            """
            CREATE TABLE IF NOT EXISTS player (
                jersey_no INTEGER PRIMARY KEY,
                player_name TEXT NOT NULL,
                avg_runs REAL NOT NULL
            )
            """
        )
        conn.execute(
            "INSERT OR IGNORE INTO player (jersey_no, player_name, avg_runs) VALUES (?, ?, ?)",
            (7, "MS Dhoni", 50.2),
        )
        conn.execute(
            "INSERT OR IGNORE INTO player (jersey_no, player_name, avg_runs) VALUES (?, ?, ?)",
            (18, "Virat Kohli", 58.3),
        )
        conn.execute(
            "INSERT OR IGNORE INTO player (jersey_no, player_name, avg_runs) VALUES (?, ?, ?)",
            (45, "Rohit Sharma", 48.5),
        )
        conn.commit()


def fetch_players():
    with get_connection() as conn:
        rows = conn.execute(
            "SELECT jersey_no, player_name, avg_runs FROM player ORDER BY jersey_no"
        ).fetchall()
    return [dict(row) for row in rows]


st.set_page_config(page_title="Cricket Player Dashboard", layout="centered")
init_db()

st.title("🏏 Cricket Player Dashboard")
st.write("Manage cricket player records with a simple Streamlit interface.")

view_tab, add_tab = st.tabs(["View Players", "Add Player"])

with view_tab:
    players = fetch_players()
    if players:
        st.dataframe(players, use_container_width=True)
    else:
        st.info("No players found yet.")

with add_tab:
    with st.form("add_player_form", clear_on_submit=True):
        jersey_no = st.number_input("Jersey Number", min_value=1, step=1)
        player_name = st.text_input("Player Name")
        avg_runs = st.number_input("Average Runs", min_value=0.0, step=0.1)
        submitted = st.form_submit_button("Add Player")

        if submitted:
            try:
                with get_connection() as conn:
                    conn.execute(
                        "INSERT INTO player (jersey_no, player_name, avg_runs) VALUES (?, ?, ?)",
                        (jersey_no, player_name, avg_runs),
                    )
                    conn.commit()
                st.success("Player added successfully!")
                st.rerun()
            except sqlite3.IntegrityError:
                st.error("A player with this jersey number already exists.")
