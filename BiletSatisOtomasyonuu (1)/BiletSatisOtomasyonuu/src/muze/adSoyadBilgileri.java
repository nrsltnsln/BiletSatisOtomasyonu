/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muze;

import java.util.Scanner;

public abstract class adSoyadBilgileri extends odemeIslemleriMuze {

    private String kisi_adi;
    private String soy_adi;
    private int yas;

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
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

    Scanner klavye = new Scanner(System.in);

    public adSoyadBilgileri() {
    }

    public void kimlikbilgilerial() {
        System.out.println("Adınızı giriniz:");
        this.kisi_adi = klavye.next();
        System.out.println("Soyadınızı giriniz");
        this.soy_adi = klavye.next();
        kimlikbilgilerial(this.yas);
    }

    public void kimlikbilgilerial(int yas) {
        this.yas = yas;
        System.out.println("Lütfen yasinizi giriniz:");
        this.yas = klavye.nextInt();

        odemeislemleriyapmuze(this.getKredi_kart_numarasi(), this.getKredi_kart_kullanicinin_adi(), this.getGuvenli_kod());
    }

}
