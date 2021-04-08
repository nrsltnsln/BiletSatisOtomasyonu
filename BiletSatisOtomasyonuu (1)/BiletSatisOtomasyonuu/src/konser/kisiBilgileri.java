/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konser;

import dosyaislemi.readAndWritedosya;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class kisiBilgileri extends konserislemleri {

    private String kisi_adi;
    private String soy_adi;
    private int yas;
    private double telefon_numara;

    Scanner klavye = new Scanner(System.in);

    public kisiBilgileri() {
    }

    public String getKisi_adi() {
        return kisi_adi;
    }

    public void setKisi_adi(String kisi_adi) {
        this.kisi_adi = kisi_adi;
    }

    public String getSoy_adi() {
        return soy_adi;
    }

    public void setSoy_adi(String soy_adi) {
        this.soy_adi = soy_adi;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public double getTelefon_numara() {
        return telefon_numara;
    }

    public void setTelefon_numara(double telefon_numara) {
        this.telefon_numara = telefon_numara;
    }

    public void kimlikbilgilerial() {
        System.out.println("Adınızı giriniz:");
        this.kisi_adi = klavye.next();
        System.out.println("Soyadınızı giriniz");
        this.soy_adi = klavye.next();

        dosya.olustur("bilet");

        //tarih,  isim, soyisim    
        dosya.write(this.kisi_adi + this.soy_adi + this.getTelefon_numara() + this.getYas(), "bilet");
        System.out.print("dosyada isim : ");
        dosya.read("bilet");

    }

    public void kimlikbilgilerial(int yas, int telefon_numara) {
        this.yas = yas;
        this.telefon_numara = telefon_numara;

        System.out.println("Telefon numaranızı giriniz");
        this.telefon_numara = klavye.nextInt();

        System.out.println("Yasinizi giriniz.");
        this.yas = klavye.nextInt();

        if (this.yas > 18) {
            odemeislemleriyap(getKredi_kart_numarasi(), getKredi_kart_kullanicinin_adi(), getGuvenli_kod());
            odemeislemleriyap(getSon_bitis_tarihi());
        } else {
            System.out.println("Yaşınız tutmadığı için işleminize devam edemiyoruz.");
        }

    }

}
