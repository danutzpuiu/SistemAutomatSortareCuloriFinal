package com.example.sistemautomatsortareculoare;

import android.app.Application;

public class MyApplication extends Application {
    private int rosu, verde, albastru, galben;

    public int getRosu(){
        return rosu;
    }
    public int getVerde(){
        return verde;
    }
    public int getAlbastru(){
        return albastru;
    }
    public int getGalben(){
        return galben;
    }
    public void setRosu(int rosu){
        this.rosu = rosu;
    }
    public void setVerde(int verde){
        this.verde = verde;
    }
    public void setAlbastru(int albastru){
        this.albastru = albastru;
    }
    public void setGalben(int galben){
        this.galben = galben;
    }
}
