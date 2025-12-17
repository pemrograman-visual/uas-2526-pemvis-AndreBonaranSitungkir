//12S25026-AndreBonaranSitungkir
//12S25029-Theressia Olivia Simanjuntak
import java.util.*;
import java.lang.Math;

public class SOAL 4 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, total, maxShift, minShift;
        String[] nama = new String[20];
        int[] shift = new int[20];
        double average;
        String maxName, minName;

        total = 0;
        maxShift = -1;
        minShift = 999;
        System.out.println("Jumlah asisten:");
        n = Integer.parseInt(input.nextLine());
        for (i = 0; i <= n - 1; i++) {
            System.out.println("Nama asisten ke-" + i + 1 + ":");
            nama[i] = input.nextLine();
            shift[i] = ambilShift(nama[i]);
            total = total + shift[i];
            if (shift[i] > maxShift) {
                maxShift = shift[i];
                maxName = nama[i];
            }
            if (shift[i] < minShift) {
                minShift = shift[i];
                minName = nama[i];
            }
        }
        average = (double) total / n;
        System.out.println("Daftar shift:");
        for (i = 0; i <= n - 1; i++) {
            System.out.println(nama[i] + "=" + shift[i]);
        }
        System.out.println("Total shift = " + total);
        System.out.println("Rata-rata = " + average);
        System.out.println("Shift terbanyak: " + maxName + " (" + maxShift + ")");
        System.out.println("Shift tersedikit: " + minName + " (" + minShift + ")");
        cekEvaluasi(average);
    }
    
    public static int ambilShift(String namaAsisten) {
        int jml;

        do {
            System.out.println(namaAsisten + " -> Masukkan jumlah shift:");
            jml = Integer.parseInt(input.nextLine());
            if (jml < 0) {
                System.out.println("INVALID");
            }
        } while (jml < 0);
        
        return jml;
    }
    
    public static void cekEvaluasi(double rata) {
        if (rata < 3) {
            System.out.println("Distribusi tidak merata.");
        } else {
            if (rata >= 5) {
                System.out.println("Shift terlalu padat.");
            }
        }
    }
}
