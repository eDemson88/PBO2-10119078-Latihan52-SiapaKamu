/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119078.latihan52.siapakamu;

/**
 *
 * @author ryzen
 */
public class PBOIF210119078Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dosen d = new Dosen();
        d.setNip("41227829930");
        System.out.println("NIP DOSEN: " + d.getNip());
        d.setNama("Rizki Adam Kurniawan");
        d.setUmur(27);
        d.setMataKuliah("PBO");
        d.siapaKamu();
        d.mengajarApa();
        
        Mahasiswa m = new Mahasiswa();
        m.setNim("10110269");
        System.out.println("\nNIM MAHASISWA: " + m.getNim());
        m.setNama("Nindi");
        m.setUmur(17);
        m.setKelas("PBO2");
        m.siapaKamu();
        m.kelasApa();
    }
    
}
