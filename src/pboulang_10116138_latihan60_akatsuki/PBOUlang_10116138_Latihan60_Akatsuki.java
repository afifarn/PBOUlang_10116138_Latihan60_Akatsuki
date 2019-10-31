/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116138_latihan60_akatsuki;

/**
 *
 * @author Aradnu
 */
public class PBOUlang_10116138_Latihan60_Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Leader pemimpin = new Leader("Nagato", "Uzumaki", "Conan");
        pemimpin.setPemimpin("Pemimpin");
        pemimpin.tampilAnggota();
        System.out.println("Di Akatsuki sebagai : " + pemimpin.getPemimpin());
        
        System.out.println("");
    
        Anggota member = new Anggota("Itachi", "Uchiha", "Kisame");
        member.setAnggota("Anggota");
        member.tampilAnggota();
        System.out.println("Di Akatsuki sebagai : " + member.getAnggota());
        System.out.println("");
        
        Anggota member2 = new Anggota("Kakuzu", "??", "Hidan");
        member2.setAnggota("Anggota");
        member2.tampilAnggota();
        System.out.println("Di Akatsuki sebagai : " + member2.getAnggota());
        System.out.println("");

    }
    
}
