/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverrmi;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface IServices extends Remote{
    public class Player implements Serializable{// inner class
        public String name;
        public int posX;
        public int posY;
        public int map;
        public Player(String name,int posX,int posY ,int map){
            this.name=name;
            this.posX=posX;
            this.posY=posY;
            this.map=map;
        }
    }
    void giveData(Player p) throws RemoteException;
    ArrayList<Player> receiveData() throws RemoteException;
    void conexionPlayer(Player p) throws RemoteException;
}