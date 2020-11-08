/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119016.latihan38.perhitunganlingkaran2;
import java.util.Scanner;
/**
 *
 * @author aditi
 * NAMA              : Aditya Ilham Subagja
 * KELAS             : IF1
 * NIM               : 10119016
 * Deskripsi Program : Program ini berisi program untuk menampilkan cara 
 * melakukan penghitungan lingkaran berbasis objek
 */
public class IF110119016Latihan38PerhitunganLingkaran2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PerhitunganLingkaran lingkaran = new PerhitunganLingkaran();
        
        System.out.println("=====Perhitungan Lingkaran=====");
        System.out.print("Masukkan nilai diameter lingkaran : ");
        while(true) {
            try {
                lingkaran.diameter = Double.parseDouble(scanner.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nilai Diameter Tidak Sesuai\n");
                System.out.print("Masukkan nilai diameter lingkaran : ");
                continue;
            }
        }
        double jarijari = lingkaran.hitungJariJari();
        double luas = lingkaran.hitungLuas();
        double keliling = lingkaran.hitungKeliling();
        System.out.println();
        System.out.println("======Hasil Perhitungan Lingkaran======");
        System.out.printf("Jari-jari Lingkaran\t\t= %.2f%n", jarijari);
        System.out.printf("Luas Lingkaran\t\t\t= %.2f%n", luas);
        System.out.printf("Keliling lingkaran\t\t= %.2f%n", keliling);
    }
    
}
