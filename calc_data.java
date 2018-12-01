/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum10;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class calc_data extends UnicastRemoteObject implements calc_dataInterface {

    private int hasil;

    public calc_data() throws RemoteException {

    }

    @Override
    public void FirstMethod(int angka1, int angka2, int operasi) throws RemoteException {
        if (operasi == 1) {
            hasil = angka1 + angka2;
        } else if (operasi == 2) {
            hasil = angka1 - angka2;
        } else if (operasi == 3) {
            hasil = angka1 / angka2;
        } else if (operasi == 4) {
            hasil = angka1 * angka2;
        }
    }

    @Override
    public String SecondMethod() throws RemoteException {
        return " "+hasil;
    }

}
