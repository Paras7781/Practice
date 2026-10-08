from fastapi import FastAPI,Depends
from sqlalchemy import create_engine
from sqlalchemy import Column, Integer, String, Float
from sqlalchemy.orm import declarative_base
from sqlalchemy.orm import sessionmaker,Session

URL="mysql+pymysql://root:paras0327@localhost/cric_player_db"
engine=create_engine(URL)
SessionLocal=sessionmaker(bind=engine)
Base=declarative_base()

class Player(Base):
    __tablename__='player'
    jersey_no=Column(Integer,primary_key=True)
    player_name=Column(String(100))
    avg_runs=Column(Float)

Base.metadata.create_all(engine)

app=FastAPI()

def get_db():
    db=SessionLocal()
    try:
        yield db
    finally:
        db.close()

@app.get("/players")
def read_players(db:Session=Depends(get_db)):
    return db.query(Player).all()

@app.post("/players")
def create_player(jersey_no:int,player_name:str,avg_runs:float,db:Session=Depends(get_db)):
    new_player=Player(jersey_no=jersey_no,player_name=player_name,avg_runs=avg_runs)
    db.add(new_player)
    db.commit()
    return {"message":"Player created successfully!"}

@app.put("/players/{jersey_no}")
def update__avg_runs(jersey_no:int,avg_runs:float,db:Session=Depends(get_db)):
    player=db.query(Player).filter(Player.jersey_no==jersey_no).first()
    if player:
        player.avg_runs=avg_runs
        db.commit()
        return {"message":"Player updated successfully!"}
    else:
        return {"message":"Player not found!"}

@app.delete("/players/{jersey_no}")
def delete_player(jersey_no:int,db:Session=Depends(get_db)):
    player=db.query(Player).filter(Player.jersey_no==jersey_no).first()
    if player:
        db.delete(player)
        db.commit()
        return {"message":"Player deleted successfully!"}
    else:
        return {"message":"Player not found!"}
   