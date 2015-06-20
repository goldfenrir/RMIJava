/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverrmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface IServices extends Remote{
    void giveData(int posX, int posY,int mapa) throws RemoteException;
    ArrayList<Integer> receiveData() throws RemoteException;
}