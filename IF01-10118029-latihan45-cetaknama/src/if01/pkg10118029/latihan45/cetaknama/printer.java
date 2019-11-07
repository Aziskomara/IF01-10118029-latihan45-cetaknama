/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118029.latihan45.cetaknama;

/**
 *
 * @author acer
 * Nama  : Azis komara
 * Nim   : 10118029
 * Kelas : IF-1 
 * Deskripsi program : Program ini menampilkan Cetak nama
 */
public class printer {
    private int jmlcetak;
    private String nama;

    public int getJmlcetak() {
        return jmlcetak;
    }

    public void setJmlcetak(int jmlcetak) {
        this.jmlcetak = jmlcetak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void cetak(String nama){
        System.out.println("Nama Anda : " + nama);
    }
    
    public void cetak(int jmlcetak , String nama){
        System.out.println("Hasil Cetak : " );
        for(int i=0 ; i < jmlcetak ; i++){
            System.out.println((i+1) + ". " + nama);
        }
    }
}
