package com.firebase.controller;
import java.util.*;
import com.firebase.dao.PlayerDao;
import com.firebase.model.Player;
public class PlayerController {
    PlayerDao dao=new PlayerDao();

    public void addPlayer(String name,int jersey,String country){
        Player player=new Player(name,jersey,country);
        dao.savePlayer(player);
    }

    public Player getPlayer(int jerseyNo){
        return dao.getPlayer(jerseyNo);
    }

    public void updatePlayer(int jersey,String name,String country){
        Player player=new Player(name,jersey,country);
        dao.updatePlayer(player);
    }

    public void deletePlayer(int jerseyNo){
        dao.deletePlayer(jerseyNo);
    }

    public List<Player> getAllPlayers(){
        return dao.getPlayers();
    }
}
