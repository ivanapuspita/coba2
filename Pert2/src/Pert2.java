
import Gudang.*;
import java.util.Scanner;

public class Pert2 {
   
    public static void main(String[] args) {
        /*Barang angka = new Barang();
        angka.penjumlahan();
        
        Karyawan manusia = new Karyawan();
        manusia.nama();*/
        
        Scanner input = new Scanner(System.in);
        System.out.println("Angka 1: ");
        int a= input.nextInt();
        System.out.println("Angka 2: ");
        int b= input.nextInt();
        
        //System.out.println("Jawaban :" + );
        hitung angka=new hitung();
        System.out.println("Perkalian : " + angka.kali(a,b));
        System.out.println("Pembagian : " + angka.bagi(a,b));
        System.out.println("Penjumlahan : " + angka.tambah(a,b));
        System.out.println("Pengurangan : " + angka.kurang(a,b));
    }
    
}
