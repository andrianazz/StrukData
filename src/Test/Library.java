package Test;

public class Library {

    String nama;
    String kode;

    public Library(String nama, String kode) {
        this.nama = nama;
        this.kode = kode;
    }

    void tampil(){
        System.out.println(nama + "/"+kode);
    }
}
