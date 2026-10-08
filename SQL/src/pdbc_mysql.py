import mysql.connector

# connect to MySQL server
conn = mysql.connector.connect(
    host="localhost",
    user="root",
    password="paras0327"
)

cursor = conn.cursor()

# create database if it does not exist
cursor.execute("CREATE DATABASE IF NOT EXISTS cric_player_db")

# switch to the database
conn.database = "cric_player_db"

# create table
cursor.execute("""
CREATE TABLE IF NOT EXISTS player(
    jersey_no INT PRIMARY KEY,
    player_name VARCHAR(255),
    avg_runs FLOAT
)
""")

# insert data (IGNORE prevents duplicate errors)
cursor.execute("INSERT IGNORE INTO player VALUES (7, 'MS Dhoni', 50.2)")
cursor.execute("INSERT IGNORE INTO player VALUES (18, 'Virat Kohli', 58.3)")
cursor.execute("INSERT IGNORE INTO player VALUES (45, 'Rohit Sharma', 48.5)")

# save changes
conn.commit()

# close connection
conn.close()

print("Database, table, and record created successfully!")