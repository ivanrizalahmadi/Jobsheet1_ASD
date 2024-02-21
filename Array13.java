import java.util.Scanner;

public class Array13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mendefinisikan array untuk menyimpan data mata kuliah, bobot SKS, dan nilai
        // angka
        String[] mataKuliah = { "Pancasila", "KTI", "CTPS", "MDAS", "Bing", "Daspro", "Prak Daspro", "K3" };
        double[] bobotSKS = { 4.0, 3.5, 3.0, 2.5, 3.0, 3.0, 2.0, 2.0 };
        double[] nilaiAngka = new double[mataKuliah.length];
        double[] nilaiSetara = new double[mataKuliah.length];
        String[] nilaiHuruf = new String[mataKuliah.length];

        // Menginput nilai angka untuk setiap mata kuliah
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai angka " + mataKuliah[i] + ": ");
            nilaiAngka[i] = scanner.nextDouble();

            // Validasi nilai angka
            if (!isValidNilai(nilaiAngka[i])) {
                System.out.println("Nilai tidak valid. Program berhenti.");
                return;
            }
        }

        // Menampilkan nilai awal dan menghitung nilai setara
        System.out.println("\nNilai Awal, Perhitungan Nilai Setara, dan Konversi Nilai:");

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println(mataKuliah[i] + ": " + nilaiAngka[i]);
            nilaiSetara[i] = hitungNilaiSetara(nilaiAngka[i]);
            nilaiHuruf[i] = konversiNilaiKeHuruf(nilaiAngka[i]);
        }

        // Menampilkan nilai setara dan konversi huruf
        System.out.println("\nNilai Setara dan Konversi Huruf:");

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println(mataKuliah[i] + ": " + nilaiSetara[i] + " -> " + nilaiHuruf[i]);
        }

        // Menghitung IP Semester
        double ipSemester = hitungIPSemester(bobotSKS, nilaiSetara);

        // Menampilkan hasil IP Semester
        System.out.println("\nIP Semester: " + ipSemester);
    }

    private static boolean isValidNilai(double nilai) {
        return nilai >= 0 && nilai <= 100;
    }

    private static double hitungNilaiSetara(double nilaiAngka) {
        if (nilaiAngka > 80) {
            return 4.0;
        } else if (nilaiAngka > 73) {
            return 3.5;
        } else if (nilaiAngka > 65) {
            return 3.0;
        } else if (nilaiAngka > 60) {
            return 2.5;
        } else if (nilaiAngka > 50) {
            return 2.0;
        } else if (nilaiAngka > 39) {
            return 1.5;
        } else {
            return 1.0;
        }
    }

    private static String konversiNilaiKeHuruf(double nilai) {
        if (nilai > 80) {
            return "A";
        } else if (nilai > 73) {
            return "B+";
        } else if (nilai > 65) {
            return "B";
        } else if (nilai > 60) {
            return "C+";
        } else if (nilai > 50) {
            return "C";
        } else if (nilai > 39) {
            return "D";
        } else {
            return "E";
        }
    }

    private static double hitungIPSemester(double[] bobotSKS, double[] nilaiSetara) {
        double totalBobotNilai = 0;
        double totalSKS = 0;

        for (int i = 0; i < bobotSKS.length; i++) {
            totalBobotNilai += nilaiSetara[i] * bobotSKS[i];
            totalSKS += bobotSKS[i];
        }

        // Menghitung IP Semester
        return totalBobotNilai / totalSKS;
    }
}
