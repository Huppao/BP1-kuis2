package bubble2;
import java.util.Scanner;

public class Bubble2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Mengurutkan Harga barang dan abjadnya");
        String barang[] = new String[5];
        System.out.println("Masukkan Nama Barang");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nama Barang " + (i + 1) + " = ");
            barang[i] = s.next();
        }

        System.out.println("Barang Awal");
        for (int i = 0; i < barang.length; i++) {
            System.out.print(barang[i] + " ");
        }
        System.out.println("");

        for (int i = 0; i < barang.length - 1; i++) {
            for (int j = i + 1; j < barang.length; j++) {
                if (barang[i].compareTo(barang[j]) > 0) {
                    String temp = barang[j];
                    barang[j] = barang[i];
                    barang[i] = temp;
                }
            }
        }

        System.out.println("Barang Akhir");
        for (int i = 0; i < barang.length; i++) {
            System.out.print(barang[i] + " ");
        }
        System.out.println("\n");
        
        int data[] = new int[5];
        System.out.println("Masukkan Harga Awal");
        for (int i = 0; i < 5; i++) {
            System.out.print("Harga Barang " + (i + 1) + " = Rp. ");
            data[i] = s.nextInt();
        }

        System.out.print("Harga Awal = ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");

        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] > data[j]) {
                    int temp = data[j];
                    data[j] = data[i];
                    data[i] = temp;
                }
            }
        }

        System.out.print("Harga Akhir = ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
    }
}
