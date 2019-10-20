package Test;

import java.util.Scanner;

public class Casher {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Produk data[] = {
                new Produk("Tepung Terigu XYZ","Bahan Makanan", 500, 13000),
                new Produk("Sabun Mandi XYZ","Rumah Tangga", 400, 14000),
                new Produk("Sardines XYZ","Bahan Makanan", 600, 24500),
                new Produk("Bumbu Nasi Goreng","Bahan Makanan", 120, 8700),
                new Produk("Nugget XYZ","Bahan Makanan", 550, 39500),
                new Produk("Deterjen XYZ","Rumah Tangga", 350, 16000),
                new Produk("Pasta Gigi XYZ","Rumah Tangga", 250, 14000)
        };

        for (int i = 0; i < data.length ; i++) {
            System.out.print((i+1) + ". ");
            data[i].tampil();
        }

        System.out.println("Masukkan Nama Produk");
        String barang = sc.nextLine();


        for (int i = 0; i < data.length ; i++) {
            if (data[i].nama.equals(barang)) {
                data[i].tampil();
            }

        }

    }

}
