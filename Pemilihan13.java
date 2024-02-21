import java.util.Scanner;

public class Pemilihan13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println(" Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        System.out.print("Masukkan nilai tugas (0-100): ");
        int nilaiTugas = scanner.nextInt();
        if (!isValidNilai(nilaiTugas)) {
            System.out.println("Nilai tidak valid");
            return;
        }

        System.out.print("Masukkan nilai kuis (0-100): ");
        int nilaiKuis = scanner.nextInt();
        if (!isValidNilai(nilaiKuis)) {
            System.out.println("Nilai tidak valid");
            return;
        }

        System.out.print("Masukkan nilai UTS (0-100): ");
        int nilaiUTS = scanner.nextInt();
        if (!isValidNilai(nilaiUTS)) {
            System.out.println("Nilai tidak valid");
            return;
        }

        System.out.print("Masukkan nilai UAS (0-100): ");
        int nilaiUAS = scanner.nextInt();
        if (!isValidNilai(nilaiUAS)) {
            System.out.println("Nilai tidak valid");
            return;
        }

        // Hitung nilai akhir
        double nilaiAkhir = (nilaiTugas * 0.2) + (nilaiKuis * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.3);

        // Konversi nilai ke huruf
        String nilaiHuruf = konversiNilaiKeHuruf(nilaiAkhir);

        // Menentukan kelulusan
        String keterangan = (nilaiHuruf.equals("D") || nilaiHuruf.equals("E")) ? "TIDAK LULUS" : "LULUS";

        // Output hasil
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Huruf: " + nilaiHuruf);
        System.out.println("Keterangan: " + keterangan);
    }

    private static boolean isValidNilai(int nilai) {
        return nilai >= 0 && nilai <= 100;
    }

    private static String konversiNilaiKeHuruf(double nilaiAkhir) {
        if (nilaiAkhir >= 80) {
            return "A";
        } else if (nilaiAkhir >= 73) {
            return "B+";
        } else if (nilaiAkhir >= 65) {
            return "B";
        } else if (nilaiAkhir >= 60) {
            return "C+";
        } else if (nilaiAkhir >= 50) {
            return "C";
        } else if (nilaiAkhir >= 39) {
            return "D";
        } else {
            return "E";
        }
    }
}
