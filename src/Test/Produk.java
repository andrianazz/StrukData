package Test;

public class Produk {
    public String nama;
    public String jenis;
    public int ukuran;
    public int harga;


    public Produk(String nama, String jenis, int ukuran, int harga) {
        this.nama = nama;
        this.jenis = jenis;
        this.ukuran = ukuran;
        this.harga = harga;
    }


    void tampil(){
        System.out.println("Nama = " + nama + " Jenis = " + jenis + " ukuran = " +ukuran + " Harga = " + harga );
    }

}
