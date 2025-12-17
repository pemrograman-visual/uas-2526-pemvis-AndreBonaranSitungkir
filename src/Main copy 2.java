//12S25026-AndreBonaranSitungkir
//12S25029-Theressia Olivia Simanjuntak
import java.util.*;
import java.lang.Math;

public class SOAL 1 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, min, max, countHigh;
        int[] ratings = new int[20];
        double sum, average;

        min = 6;
        max = 0;
        countHigh = 0;
        sum = 0;
        do {
            n = Integer.parseInt(input.nextLine());
            for (i = 0; i <= n - 1; i++) {
                ratings[i] = ambilInputValid(i + 1);
                sum = sum + ratings[i];
                if (ratings[i] > max) {
                    max = ratings[i];
                }
                if (ratings[i] < min) {
                    min = ratings[i];
                }
                if (ratings[i] >= 4) {
                    countHigh = countHigh + 1;
                }
            }
            average = sum / n;
            System.out.println("Daftar rating: ");
            for (i = 0; i <= n - 1; i++) {
                System.out.print(ratings[i]);
            }
            System.out.println("");
            System.out.println("Rata-rata: " + average);
            System.out.println("Tertinggi: " + max);
            System.out.println("Terendah: " + min);
            System.out.println("Reviewer rating >= 4: " + countHigh + " orang");
            evaluasi(average);
        } while (n < 1 || n > 20);
    }
    
    public static int ambilInputValid(int urutan) {
        int rating;
        boolean valid;

        valid = false;
        while (valid == false) {
            System.out.println(urutan);
            rating = Integer.parseInt(input.nextLine());
            if (rating >= 1 && rating <= 5) {
                valid = true;
            }
        }
        
        return rating;
    }
    
    public static void evaluasi(double rata) {
        if (rata < 3) {
            System.out.println("Kantin perlu evaluasi manajemen!");
        } else {
            if (rata < 4) {
                System.out.println("Kondisi cukup, masih perlu peningkatan.");
            } else {
                System.out.println("Kantin dalam kondisi baik.");
            }
        }
    }
}

