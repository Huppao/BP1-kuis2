package kuis;
import java.util.Scanner;
public class Kuis {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String barang[] = {"Piring", "Gelas", "Mangkok",
                           "Sendok", "Garpu", "Botol"};
        boolean ketemu;
        int i, pilih=1;
        do{
            System.out.println("Program Pencarian Barang");
            System.out.print("Nama Barang : ");
            for(i=0; i<barang.length; i++){
            System.out.print(barang[i]+" ");{
                }
            }
            ketemu=false;
            System.out.println("");
            System.out.print("Cari Barang : ");
            String cari=s.next();
            for(i=0;i<barang.length;i++){
               if(barang[i].compareToIgnoreCase(cari)==0){
               ketemu=true;
               break;
                }
            }
            if(ketemu==true){
               System.out.println("Ada di rak nomor "+(i+1));
            }else{
               System.out.println("Tidak ditemukan");
            }
            System.out.println("Cari Lagi?");
            System.out.println("(1. Ya) (2. Tidak)");
            System.out.print("Jawab : ");
            pilih=s.nextInt();
        }while(pilih==1);
        System.out.println("Thank You");
    }    
}
