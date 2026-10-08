import sqlite3
import mysql.connector
from pathlib import Path

DB_PATH = Path(__file__).resolve().parents[1] / "data" / "cric_player.db"

# Connect to SQLite database
sqlite_conn = sqlite3.connect(DB_PATH)
sqlite_cursor = sqlite_conn.cursor()

# Fetch data from SQLite
sqlite_cursor.execute("SELECT * FROM player")
data = sqlite_cursor.fetchall()

sqlite_conn.close()

# Connect to MySQL
mysql_conn = mysql.connector.connect(
    host="localhost",
    user="root",
    password="paras0327",
    database="cric_player_db"
)

mysql_cursor = mysql_conn.cursor()

# Insert data
mysql_query = """
INSERT IGNORE INTO player (jersey_no, player_name, avg_runs)
VALUES (%s, %s, %s)
"""

mysql_cursor.executemany(mysql_query, data)

mysql_conn.commit()
mysql_conn.close()

print("Data migrated from SQLite to MySQL successfully!")