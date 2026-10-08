import sqlite3
from pathlib import Path

DB_PATH = Path(__file__).resolve().parents[1] / "data" / "cric_player.db"
conn = sqlite3.connect(DB_PATH)
cursor = conn.cursor()
cursor.execute("CREATE TABLE IF NOT EXISTS player (jersey_no int PRIMARY KEY,player_name text,avg_runs real)")
cursor.execute("INSERT OR IGNORE INTO player VALUES(7,'MS Dhoni',50.2)")
cursor.execute("INSERT OR IGNORE INTO player VALUES(18,'Virat Kohli',58.3)")
cursor.execute("INSERT OR IGNORE INTO player VALUES(45,'Rohit Sharma',48.5)")
conn.commit()
conn.close()
