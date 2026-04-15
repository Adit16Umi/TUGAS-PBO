package datamahasiswa;

import java.util.Scanner;
// Nama : A. Muhammad Aditya Irawan
// Nim  : 13020240081
// Hari/Tanggal : Rabu/15-04-2026
public class Mainmahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama : ");
        String nama = sc.nextLine();
        System.out.print("NIM  : ");
        String nim = sc.nextLine();
        System.out.print("Jml MK: ");
        int jmlMK = sc.nextInt();

        Mahasiswa mhs = new Mahasiswa(nama, nim, jmlMK);
        mhs.inputNilai(sc);
        mhs.tampilRapor();
    }
}
