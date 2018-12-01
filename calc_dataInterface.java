/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum10;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface calc_dataInterface extends Remote {

    public void FirstMethod(int angka1, int angka2, int operasi) throws RemoteException;

    public String SecondMethod() throws RemoteException;

}
