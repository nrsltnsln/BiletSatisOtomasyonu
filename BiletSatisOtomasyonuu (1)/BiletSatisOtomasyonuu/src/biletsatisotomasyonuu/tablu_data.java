/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biletsatisotomasyonuu;

/**
 *
 * @author nurcan
 */
public class tablu_data {

    private String yer;
    private String tarih;
    private String tur;

    public tablu_data(String yer, String tarih, String tur) {
        this.yer = yer;
        this.tarih = tarih;
        this.tur = tur;
    }

    public String getYer() {
        return yer;
    }

    public void setYer(String yer) {
        this.yer = yer;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

}
