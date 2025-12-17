//12S25026-AndreBonaranSitungkir
//12S25029-Theressia Olivia Simanjuntak
import java.util.*;
import java.lang.Math;

public class SOAL 2 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] namaBarang = new String[10];
        int[] stokAwal = new int[10], terjual = new int[10], sisaStok = new int[10];
        int n, i;

        n = Integer.parseInt(input.nextLine());
        for (i = 0; i <= n - 1; i++) {
            System.out.println("Barang ke-" + i + 1);
            namaBarang[i] = input.nextLine();
            stokAwal[i] = ambilStokValid();
            terjual[i] = ambilTerjualValid(stokAwal[i]);
            sisaStok[i] = stokAwal[i] - terjual[i];
        }
        System.out.println("Nama | Stok Awal | Terjual | Sisa | Status");
        for (i = 0; i <= n - 1; i++) {
            String statusPesan;

            statusPesan = cekStatus(sisaStok[i]);
            System.out.println(namaBarang[i] + "|" + stokAwal[i] + "|" + terjual[i] + "|" + sisaStok[i] + "|" + statusPesan);
        }
    }
    
    public static int ambilStokValid() {
        int qty;

        do {
            qty = Integer.parseInt(input.nextLine());
            if (qty < 0) {
                System.out.println("INVALID");
            }
        } while (qty < 0);
        
        return qty;
    }
    
    public static int ambilTerjualValid(int batasStok) {
        int qty;

        do {
            qty = Integer.parseInt(input.nextLine());
            if (qty < 0) {
                System.out.println("INVALID");
            }
            if (qty > batasStok) {
                System.out.println("INVALID");
            }
        } while (qty < 0 || qty > batasStok);
        
        return qty;
    }
    
    public static String cekStatus(int sisa) {
        String status;

        if (sisa == 0) {
            status = "Habis, segera restock!";
        } else {
            if (sisa < 5) {
                status = "Stok menipis.";
            } else {
                status = "Stok aman.";
            }
        }
        
        return status;
    }
}
