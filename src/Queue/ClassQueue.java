package Queue;

public class ClassQueue {
    String data[];
    int tail;
    int antrian;

    public ClassQueue(int x){
        data = new String[x];
        tail = -1;
        antrian = 0;
    }

    public void masuk(String nama) {
        if (tail < data.length) {
            antrian++;

            data[++tail] = nama;
            System.out.println("Antrian " + antrian );
            System.out.println("Costumer = " + nama);

        } else {
            System.out.println("Antrian Penuh");
        }
    }

    public String keluar(){
        if(tail > 0){
            antrian--;
            String temp = data[0];
            --tail;

            for (int i = 0; i < data.length-1 ; i++) {
                data[i] = data[i+1];

            }
            return temp;
        }
        else{
            System.out.println("antrian kosong");
        }

        return "";
    }

    public void print(){
        for (int i = 0; i < data.length; i++) {
            System.out.println("Antrian " + (i+1) );
            System.out.println("Costumer = " + data[i]);
        }
    }

}
