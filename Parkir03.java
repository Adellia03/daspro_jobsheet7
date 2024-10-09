import java.util.Scanner;

public class Parkir03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jenis, durasi, total = 0;

        while (true) {
            System.out.print("Masukkan jenis kendaraan (1: Mobil, 2: Motor, 0: Keluar): ");
            jenis = scanner.nextInt();

            if (jenis == 0) {
                break; 
            }

            System.out.print("Masukkan durasi parkir (jam): ");
            durasi = scanner.nextInt();

            if (jenis == 1) { 
                if (durasi > 5) {
                    total += 12500; 
                } else {
                    total += durasi * 3000; 
                }
            } else if (jenis == 2) { 
                if (durasi > 5) {
                    total += 12500; 
                } else {
                    total += durasi * 2000; 
                }
            } else {
                System.out.println("Jenis kendaraan tidak valid. Silakan coba lagi.");
            }
        }

        System.out.println("Total pembayaran parkir: Rp " + total);

    }
}

