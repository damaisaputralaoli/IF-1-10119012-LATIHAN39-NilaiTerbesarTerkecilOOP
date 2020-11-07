
package pbo10119012latihan39;
import java.util.Scanner;
/**
 *
 * @author damai
 * NAMA   : DAMAI SAPUTRA LAOLI
 * KELAS  : IF-1
 * NIM    : 10119012
 */
public class PBO10119012Latihan39 {

    
    public static void main(String[] args) {
       Penentu mahasiswa = new Penentu();
        Scanner scanner = new Scanner(System.in);
        int i, jumlahMahasiswa, nilaiTerbesar = 0, nilaiTerkecil;
        String petugas;

        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa======");
        petugas = mahasiswa.namaPetugas();
        jumlahMahasiswa = mahasiswa.getBanyak_mahasiswa();
        int[] nilai = new  int[jumlahMahasiswa];
        for (i =0; i < jumlahMahasiswa; i++) {
            System.out.printf("Nilai Mahasiswa ke-%d\t\t\t\t= ",i+1);
            nilai[i] = scanner.nextInt();
        }
        System.out.println();
        System.out.println("======Hasil Nilai Mahasiswa======");
        nilaiTerbesar = mahasiswa.nilaiTerbesar(nilai);
        nilaiTerkecil = mahasiswa.nilaiTerkecil(nilai);
        System.out.println();
        System.out.println("Nilai Terbesar Adalah "+nilaiTerbesar);
        System.out.println("Nilai Terkecil Adalah "+nilaiTerkecil);
        System.out.println();
        System.out.print("Petugas : "+petugas);
    }
}
