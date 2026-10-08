package com.firebase.dao;
import java.util.*;
import com.firebase.config.Firebaseconfig;
import com.firebase.model.Player;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;

public class PlayerDao {
    private Firestore db=Firebaseconfig.getFirestore();
    public void savePlayer(Player player){
        try{
            db.collection("Players")
            .document(String.valueOf(player.getjNo()))
            .create(player);

            System.out.println();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public Player getPlayer(int jersey){
        try{
            ApiFuture<DocumentSnapshot> future=db.collection("Players")
                .document(String.valueOf(jersey))
                .get();

            DocumentSnapshot document=future.get();
            if(document.exists()){
                return document.toObject(Player.class);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    public void updatePlayer(Player player){
        try{
            db.collection("Players")
                .document(String.valueOf(player.getjNo()))
                .update("playerName",player.getpName(),
                "playercountry",player.getcName());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void deletePlayer(int jerseyNo){
        try{
            db.collection("Players")
                .document(String.valueOf(jerseyNo))
                .delete();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public List<Player> getPlayers(){
        List<Player> list=new ArrayList<>();
        try{
            ApiFuture<QuerySnapshot> future=db.collection("Players").get();
            QuerySnapshot snapshot=future.get();
            for(DocumentSnapshot doc : snapshot.getDocuments()){

                Player player=doc.toObject(Player.class);
                list.add(player);
            }
        }catch(Exception e){
            e.printStackTrace();;
        }
        return list;
    }
}
