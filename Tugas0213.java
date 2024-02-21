import java.util.Scanner;

public class Tugas0213 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Program Menghitung Kecepatan, Jarak, dan Waktu");
            System.out.println("1. Hitung Kecepatan");
            System.out.println("2. Hitung Jarak");
            System.out.println("3. Hitung Waktu");
            System.out.println("4. Keluar");

            System.out.print("Pilih menu (1-4): ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    hitungKecepatan();
                    break;
                case 2:
                    hitungJarak();
                    break;
                case 3:
                    hitungWaktu();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    input.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1-4.");
            }
        }
    }

    public static void hitungKecepatan() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jarak (s): ");
        double jarak = input.nextDouble();

        System.out.print("Masukkan waktu (t): ");
        double waktu = input.nextDouble();

        double kecepatan = jarak / waktu;
        System.out.println("Kecepatan (v) = " + kecepatan + " m/s");
    }

    public static void hitungJarak() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kecepatan (v): ");
        double kecepatan = input.nextDouble();

        System.out.print("Masukkan waktu (t): ");
        double waktu = input.nextDouble();

        double jarak = kecepatan * waktu;
        System.out.println("Jarak (s) = " + jarak + " meter");
    }

    public static void hitungWaktu() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jarak (s): ");
        double jarak = input.nextDouble();

        System.out.print("Masukkan kecepatan (v): ");
        double kecepatan = input.nextDouble();

        double waktu = jarak / kecepatan;
        System.out.println("Waktu (t) = " + waktu + " detik");
    }
}
