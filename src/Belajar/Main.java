package Belajar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Supermarket data[] = {
                new Supermarket("Mie", 233, 10, 2500),
                new Supermarket("Snack", 123, 23, 4000),
                new Supermarket("Shampoo", 012, 40, 7000),
                new Supermarket("Sirup", 34, 12, 4000),
                new Supermarket("Tisu", 122, 5, 3000)

        };

        System.out.println("Daftar Harga SUpermarket Belas Kasihan");

        for (int i = 0; i <data.length ; i++) {
            System.out.print((i+1)+". ");
            data[i].cetak();
        }

//        System.out.print("Masukkan jumlah barang yang akan dibeli = ");
//        int jumlah = sc.nextInt();


        int kdbarang = 0 ;
        int total = 0 ;


//        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan kode = ");
            kdbarang = sc.nextInt();
            System.out.print("Masukkan total");
             total = sc.nextInt();

//        }

        int harga = 0;
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i].kdbarang == kdbarang){
//                index = i;
//                System.out.println("Index " + index);
                System.out.println("Harga " + data[i].harga);
            }
        }

        System.out.println("\nTotal dibayar " + data[index].beli(total));




    }



}
