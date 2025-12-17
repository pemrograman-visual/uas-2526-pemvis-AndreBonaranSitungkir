//12S25026-AndreBonaranSitungkir
//12S25029-Theressia Olivia Simanjuntak
import java.util.*;
import java.lang.Math;

public class SOAL 3 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, j, jmlPerangkat;
        int totalKamar, totalPribadi, wattInput;
        String[] namaPenghuni = new String[20];
        int[] totalPerOrang = new int[20];

        totalKamar = 0;
        System.out.println("Jumlah penghuni: ");
        n = Integer.parseInt(input.nextLine());
        for (i = 0; i <= n - 1; i++) {
            System.out.println("Penghuni ke-" + i + 1 + ": ");
            namaPenghuni[i] = input.nextLine();
            System.out.println("Jumlah perangkat: ");
            jmlPerangkat = Integer.parseInt(input.nextLine());
            totalPribadi = 0;
            for (j = 1; j <= jmlPerangkat; j++) {
                wattInput = ambilWattValid(j);
                totalPribadi = totalPribadi + wattInput;
            }
            totalPerOrang[i] = totalPribadi;
            totalKamar = totalKamar + totalPribadi;
        }
        System.out.println("");
        System.out.println("Total konsumsi: ");
        for (i = 0; i <= n - 1; i++) {
            System.out.println(namaPenghuni[i] + "=" + totalPerOrang[i] + " wh");
        }
        System.out.println("Total konsumsi kamar = " + totalKamar + " wh");
        cekStatusBahaya(totalKamar);
    }
    
    public static int ambilWattValid(int urutan) {
        int watt;

        do {
            System.out.println("Input watt perangkat ke-" + urutan + ":");
            watt = Integer.parseInt(input.nextLine());
            if (watt < 0) {
                System.out.println("INVALID");
            }
        } while (watt < 0);
        
        return watt;
    }
    
    public static void cekStatusBahaya(int totalKamar) {
        if (totalKamar > 10000) {
            System.out.println("PERINGATAN! Konsumsi melampaui batas (Overload)!");
        }
    }
}
