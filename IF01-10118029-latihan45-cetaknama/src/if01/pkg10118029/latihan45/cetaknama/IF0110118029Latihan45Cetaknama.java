/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118029.latihan45.cetaknama;

import java.util.Scanner;

/**
 *
 * @author acer
 * Nama  : Azis komara
 * Nim   : 10118029
 * Kelas : IF-1 
 * Deskripsi program : Program ini menampilkan Cetak nama
 */
public class IF0110118029Latihan45Cetaknama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        printer printer = new printer();
        
        //
        System.out.println("======Aplikasi Pencetak Nama======");
        System.out.print("Masukan Nama Anda : " );
        printer.setNama(scanner.nextLine());
        System.out.print("Mau Cetak Nama Berapa Kali : ");
        printer.setJmlcetak(scanner.nextInt());
        
       // 
       printer.cetak(printer.getNama());
       printer.cetak(printer.getJmlcetak(), printer.getNama());
    }
    
}
