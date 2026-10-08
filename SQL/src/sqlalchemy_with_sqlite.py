from pathlib import Path
from sqlalchemy import create_engine
from sqlalchemy import Column, Integer, String, Float
from sqlalchemy.orm import declarative_base
from sqlalchemy.orm import sessionmaker

DB_PATH = Path(__file__).resolve().parents[1] / "data" / "sqlalchemy_test.db"

# create engine and base
engine = create_engine(f"sqlite:///{DB_PATH}", echo=True)
Base = declarative_base()

# define player model
class Player(Base):
    __tablename__ = 'player'
    jersey_no = Column(Integer, primary_key=True)
    player_name = Column(String)
    avg_runs = Column(Float)

# create table
Base.metadata.create_all(engine)

print("Database and table created successfully!")