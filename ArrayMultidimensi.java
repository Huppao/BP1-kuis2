/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraymultidimensi;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class ArrayMultidimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("| Daftar Barang || Harga |");
        String[][] daftarbarang = new String[3][2];
        System.out.println("-----------------------------------");
        daftarbarang[0][0] = "| Wireless Mouse|";
        daftarbarang[0][1] = "500.000 |";
        daftarbarang[1][0] = "| Deskmat       |";
        daftarbarang[1][1] = "399.999 |";
        daftarbarang[2][0] = "| Mechanical Keyboard|";
        daftarbarang[2][1] = "600.000 |";
        for (String[] barang : daftarbarang) {
    System.out.println(barang[0] + "| Rp " + barang[1]);
        }
    }
}



