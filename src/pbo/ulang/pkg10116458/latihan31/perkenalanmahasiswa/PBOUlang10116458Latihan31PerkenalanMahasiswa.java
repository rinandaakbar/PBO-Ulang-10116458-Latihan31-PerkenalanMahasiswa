/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10116458.latihan31.perkenalanmahasiswa;

/**
 *
 * @author
 * NAMA     : Rinanda Al Qorrie Akbar
 * NIM      : 10116458
 */
public class PBOUlang10116458Latihan31PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs = new Mahasiswa();
        mhs.nim = "10116458";
        mhs.nama = "Rinanda Al Qorrie Akbar";
        mhs.perkenalkanDiri(mhs.nim, mhs.nama);
        
        System.out.println();
        
        mhs.nim = "10116435";
        mhs.nama = "Luthfi";
        mhs.perkenalkanDiri(mhs.nim, mhs.nama);
    }
    
}
