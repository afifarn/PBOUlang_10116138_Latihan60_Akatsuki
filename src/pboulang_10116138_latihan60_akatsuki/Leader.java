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
public class Leader extends Clan{
    private String pemimpin;
    
    public Leader(String nama, String klan, String pasangan) {
        super(nama, klan, pasangan);
        this.nama=nama;
        this.klan=klan;
        this.pasangan=pasangan;
    }

    public String getPemimpin() {
        return pemimpin;
    }

    public void setPemimpin(String pemimpin) {
        this.pemimpin = pemimpin;
    }

}
