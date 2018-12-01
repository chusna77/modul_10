/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum10;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class calc_server {

    public static void main(String[] args) throws RemoteException, NotBoundException {
        Registry registry = LocateRegistry.createRegistry(1099);

        calc_data data = new calc_data();
        registry.rebind("data", data);

        System.out.println("Calculator Server is running");
    }
}
