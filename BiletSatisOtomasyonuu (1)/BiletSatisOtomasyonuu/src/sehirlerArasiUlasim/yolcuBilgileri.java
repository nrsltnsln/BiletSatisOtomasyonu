/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sehirlerArasiUlasim;

import java.util.Scanner;

public class yolcuBilgileri extends odemeIslemleriUlasim {

    private String kisi_adi;
    private String soy_adi;
    private int tc;

    Scanner klavye = new Scanner(System.in);

    public yolcuBilgileri() {

    }

    public int getTc() {
        return tc;
    }

    public void setTc(int tc) {
        this.tc = tc;
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

    public void kimlikbilgilerial() {
        System.out.println("Lütfen adinizi giriniz");
        this.kisi_adi = klavye.next();

        System.out.println("Lütfen soyadinizi giriniz");
        this.soy_adi = klavye.next();

        System.out.println("Lütfen tc'nizi giriniz");
        this.tc = klavye.nextInt();

        odemeislemleriyapulasim(getKredi_kart_numarasi(), getKredi_kart_kullanicinin_adi(), getGuvenli_kod());

    }

}
