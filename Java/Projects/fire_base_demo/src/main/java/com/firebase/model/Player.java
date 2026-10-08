package com.firebase.model;

public class Player {
    private String pName;
    private int jNo;
    private String cName;

    public Player(){}
    
    public Player(String pName, int jNo, String cName) {
        this.pName = pName;
        this.jNo = jNo;
        this.cName = cName;
    }
    public String getpName() {
        return pName;
    }
    public void setpName(String pName) {
        this.pName = pName;
    }
    public int getjNo() {
        return jNo;
    }
    public void setjNo(int jNo) {
        this.jNo = jNo;
    }
    public String getcName() {
        return cName;
    }
    public void setcName(String cName) {
        this.cName = cName;
    }
}

