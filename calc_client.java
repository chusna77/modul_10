/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum10;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class calc_client {

    public static void main(String[] args) throws NotBoundException, MalformedURLException, RemoteException, IOException {
        calc_dataInterface data = (calc_dataInterface) Naming.lookup("rmi://localhost:1099/data");
        System.out.println("Selamat Datang");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Masukkan Angka pertama : ");
        String angka1 = in.readLine();
        
        BufferedReader in2 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Masukkan Angka kedua : ");
        String angka2 = in2.readLine();
        
        BufferedReader in3 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Pilih operasi : \n1. Tambah\n2. Kurang\n3. Bagi\n4. Kali");
        String operasi = in3.readLine();

        data.FirstMethod(Integer.parseInt(angka1),Integer.parseInt(angka2), Integer.parseInt(operasi));
        System.out.println("-----------------------");
        System.out.println("Hasil  = "+data.SecondMethod());

    }
}
