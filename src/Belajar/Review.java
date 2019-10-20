package Belajar;


public class Review {

    public static void main(String[] args) {

        Mahasiswa data[] = {
          new Mahasiswa("Budi","001",95,1999),
          new Mahasiswa("Alpin","002",79,2005),
          new Mahasiswa("Sodikin","003",93,2007),
        };


        for (int i = 0; i < data.length-1; i++) {
            for (int j = 0; j < data.length-1 ; j++) {
                if (data[j].nama.charAt(0) > data[j+1].nama.charAt(0)){
                    Mahasiswa temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < data.length ; i++) {
            System.out.println("Juara " + (i+1));
            data[i].cetak();
        }



    }
}
