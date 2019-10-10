
package if01.pkg10118006.latihan25.ejaannama;
import java.util.Scanner;
/*
 * Nama      : Alfarizi Rizki Pane
 * Kelas     : IF-1
 * NIM       : 10118006
 * Deskripsi : Mengeja Nama
 */

public class IF0110118006Latihan25EjaanNama {
    public static void main(String[] args) {


        String nama;
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        nama = masuk.nextLine();
        System.out.println("\nEjaan untuk \"" + nama + "\" adalah :");
        char ejaan[] = nama.toCharArray();

        for (int i = 0; i <= (ejaan.length - 1); i++) {
            System.out.println("Huruf ke-" + (i + 1) + " : " + ejaan[i]);
        }
       System.out.println("");
    }
   
}