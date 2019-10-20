package Belajar;

public class Supermarket {

    public String barang;
    public int kdbarang;
    public int stok;
    public int harga;


    public Supermarket(String barang, int kdbarang, int stok, int harga) {
        this.barang = barang;
        this.kdbarang = kdbarang;
        this.stok = stok;
        this.harga = harga;
    }

   void cetak(){
       System.out.print(" Nama Barang  = " + barang);
       System.out.print(" kode = " + kdbarang);
       System.out.print(" Stok = " + stok);
       System.out.print(" Harga = " + harga);
       System.out.println();
   }

    public int beli(int jumlah){
        return harga*jumlah;
    }
}
