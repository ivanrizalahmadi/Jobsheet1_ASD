import java.util.Scanner;

public class Fungsi13 {

    static Scanner input = new Scanner(System.in);
    static String[][] tokoBunga = new String[4][5];
    static String[][] bungaRusak = new String[4][5];
    static int aglomena = 75000, keladi = 50000, alocasia = 60000, mawar = 10000;
    static String[] namaBunga = { "Aglonema", "Keladi \t", "Alocasia", "Mawar \t" };

    public static void main(String[] args) {
        int pilihan = 0;
        tokoBunga[0][0] = "RoyalGarden 1";
        tokoBunga[0][1] = "10";
        tokoBunga[0][2] = "5";
        tokoBunga[0][3] = "15";
        tokoBunga[0][4] = "7";

        tokoBunga[1][0] = "RoyalGarden 2";
        tokoBunga[1][1] = "6";
        tokoBunga[1][2] = "11";
        tokoBunga[1][3] = "9";
        tokoBunga[1][4] = "12";

        tokoBunga[2][0] = "RoyalGarden 3";
        tokoBunga[2][1] = "2";
        tokoBunga[2][2] = "10";
        tokoBunga[2][3] = "10";
        tokoBunga[2][4] = "5";

        tokoBunga[3][0] = "RoyalGarden 4";
        tokoBunga[3][1] = "5";
        tokoBunga[3][2] = "7";
        tokoBunga[3][3] = "12";
        tokoBunga[3][4] = "9";

        while (true) {
            System.out.println("1. Cek Pendapatan Sold Out Semua Cabang");
            System.out.println("2. Cek Stok Cabang RoyalGarden 4");
            System.out.println("3. Exit");

            System.out.print("Pilih (1/2/3) :");
            pilihan = 0;
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    int[][] income = getIncome();
                    showData(income);
                    break;
                case 2:
                    updateStok();
                    showStok();
                    break;
                case 3:
                    return;

                default:
                    System.out.println("Pilihan tidak tersedia");
                    break;
            }
        }
    }

    public static int[][] getIncome() {
        int[][] income = new int[4][5];

        for (int i = 0; i < income.length; i++) {
            income[i][0] = Integer.valueOf(tokoBunga[i][1]) * aglomena;
            income[i][1] = Integer.valueOf(tokoBunga[i][2]) * keladi;
            income[i][2] = Integer.valueOf(tokoBunga[i][3]) * alocasia;
            income[i][3] = Integer.valueOf(tokoBunga[i][4]) * mawar;
            income[i][4] = 0; // Setel kolom ke-4 (index 3) ke 0 untuk menyimpan total pendapatan
            for (int j = 0; j < 4; j++) {
                income[i][4] += income[i][j];
            }
        }

        return income;
    }

    public static void showData(int[][] data) {
        System.out.println("Pendapatan Setiap Cabang Jika Semua Bunga Terjual:");
        for (int i = 0; i < data.length; i++) {
            System.out.println(tokoBunga[i][0] + ": " + data[i][4]);
        }
    }

    public static void updateStok() {
        System.out.println("Pengurangan Stok pada Cabang RoyalGarden 4:");
        int cabangIndex = 3; // RoyalGarden 4
        for (int j = 1; j < 5; j++) {
            String bungaRusakValue = bungaRusak[cabangIndex][j];
            if (bungaRusakValue != null && !bungaRusakValue.isEmpty()) {
                int stokAwal = Integer.parseInt(tokoBunga[cabangIndex][j]);
                int pengurangan = Integer.parseInt(bungaRusakValue);
                int stokAkhir = stokAwal + pengurangan;
                tokoBunga[cabangIndex][j] = Integer.toString(stokAkhir);
            } else {
                System.out.println("Error: Nilai pengurangan stok pada bunga ke-" + j + " tidak valid");
            }
        }
    }

    public static void showStok() {
        System.out.println("Jumlah Stock Setiap Jenis Bunga pada Cabang RoyalGarden 4 Setelah Pengurangan:");
        for (int j = 1; j < 5; j++) {
            System.out.println(namaBunga[j - 1] + ": " + tokoBunga[3][j]);
        }

        // Informasi Tambahan
        System.out.println("\nInformasi Tambahan:");
        System.out.println("Jumlah Stok RoyalGarden 4: Aglonema - 5, Keladi - 7, Alocasia - 12, Mawar - 9");
    }
}
