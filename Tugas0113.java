import java.util.Scanner;

public class Tugas0113 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean ulang = true;

        char[] kode = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };
        char[][] kota = {
                { 'B', 'A', 'N', 'T', 'E', 'N', ' ', ' ', ' ', ' ' },
                { 'J', 'A', 'K', 'A', 'R', 'T', 'A', ' ', ' ', ' ' },
                { 'B', 'A', 'N', 'D', 'U', 'N', 'G', ' ', ' ', ' ' },
                { 'C', 'I', 'R', 'E', 'B', 'O', 'N', ' ', ' ', ' ' },
                { 'B', 'O', 'G', 'O', 'R', ' ', ' ', ' ', ' ', ' ' },
                { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N' },
                { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G', ' ', ' ' },
                { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A', ' ', ' ' },
                { 'M', 'A', 'L', 'A', 'N', 'G', ' ', ' ', ' ', ' ' },
                { 'T', 'E', 'G', 'A', 'L', ' ', ' ', ' ', ' ', ' ' }
        };

        while (ulang) {
            System.out.print("Masukkan kode plat kendaraan (note : Ketik 'EXIT' untuk keluar dari program) :   ");
            String plat = input.nextLine().toUpperCase();

            if (plat.equals("EXIT")) {
                ulang = false;
                System.out.println("Terima kasih!");
            } else {
                int index = -1;

                for (int i = 0; i < kode.length; i++) {
                    if (kode[i] == plat.charAt(0)) {
                        index = i;
                        break;
                    }
                }

                if (index != -1) {
                    System.out.println("Kota: " + new String(kota[index]));
                } else {
                    System.out.println("Kode plat tidak ditemukan!");
                }

                System.out.print("Apakah ingin mencari kota lagi? (ya/tidak): ");
                String jawaban = input.nextLine().toLowerCase();
                ulang = jawaban.equals("ya");
            }
        }
    }
}
