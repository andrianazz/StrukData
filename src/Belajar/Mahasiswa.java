package Belajar;

public class Mahasiswa {

    public String nama;
    public String nim;
    public int nilai;
    public int tahun;



    Mahasiswa(String nama, String nim, int nilai, int tahun){
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
        this.tahun = tahun;
    }
    
    public void cetak(){
        System.out.println("Nama Mahasiswa = " + nama);
        System.out.println("NIM = " + nim);
        System.out.println("Nilai = "+ nilai);
        System.out.println("Umur = " + umur(tahun));
        System.out.println("\n");
    }
    
    int umur(int tahun){
        return 2019-tahun;
    }
}
