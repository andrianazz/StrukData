package Queue;

public class Program {
    public static void main(String[] args) {
        ClassQueue antri = new ClassQueue(5);

        antri.masuk("Andrian");
        antri.masuk("Wira");
        antri.masuk("Rozi");
        System.out.println("=====================================");

        System.out.println(antri.keluar()+" Selesai");

        System.out.println();
        System.out.println();
        antri.print();
        System.out.println("========================");

        antri.masuk("ridho");

        System.out.println("============================");
        antri.print();
        System.out.println("============================");

        antri.masuk("Badri");
        System.out.println("====================================   ");
        antri.print();
        System.out.println("========================================");



    }
}
