/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sehirlerArasiUlasim;

import java.util.Scanner;

public class ulasim_islemleri extends yolcuBilgileri {

    private String kalkisNoktasi;
    private String varisNoktasi;
    private int tarihSec;
    private int koltukSec;

    Scanner klavye = new Scanner(System.in);

    public ulasim_islemleri() {
    }

    public String getKalkisNoktasi() {
        return kalkisNoktasi;
    }

    public void setKalkisNoktasi(String kalkisNoktasi) {
        this.kalkisNoktasi = kalkisNoktasi;
    }

    public String getVarisNoktasi() {
        return varisNoktasi;
    }

    public void setVarisNoktasi(String varisNoktasi) {
        this.varisNoktasi = varisNoktasi;
    }

    public int getTarihSec() {
        return tarihSec;
    }

    public void setTarihSec(int tarihSec) {
        this.tarihSec = tarihSec;
    }

    public int getKoltukSec() {
        return koltukSec;
    }

    public void setKoltukSec(int koltukSec) {
        this.koltukSec = koltukSec;
    }

    public void neredenNereye() {
        dosya.olustur("kalkisnoktalari");
        dosya.read("kalkisnoktalari");
        System.out.println("Lütfen bir kalkış noktasi seçiniz:");
        this.kalkisNoktasi = klavye.next();

        dosya.olustur("varisnoktalari");
        dosya.read("varisnoktalari");
        System.out.println("Lütfen bir varış noktasi seçiniz:");
        this.varisNoktasi = klavye.next();

        neredenNereye(this.tarihSec, this.koltukSec);

    }

    public void biletiniz() {
        dosya.olustur("Otobusbiletiniz");
        dosya.write(("\nKalkış noktası:") + this.kalkisNoktasi + ("\nVarış noktası:") + this.varisNoktasi + ("\nKoltuk numaranız:") + this.koltukSec + ("\nKişi Adı:") + this.getKisi_adi() + ("\nKişi Soyadı:") + this.getSoy_adi() + ("\nTC:") + this.getTc(), "Otobusbiletiniz");//yarın burayı doldur.
        dosya.read("Otobusbiletiniz");
    }

    public void neredenNereye(int tarihSec, int koltukSec) {
        this.tarihSec = tarihSec;
        this.koltukSec = koltukSec;

        dosya.olustur("SeferTarihleriVeSaatleri");
        dosya.read("SeferTarihleriVeSaatleri");
        System.out.println("Gün Giriniz:");
        this.tarihSec = klavye.nextInt();

        dosya.olustur("koltukdolubos");
        dosya.read("koltukdolubos");
        System.out.println("Koltuk Seciniz:");
        this.koltukSec = klavye.nextInt();

        if (this.koltukSec == 1 || this.koltukSec == 3 || this.koltukSec == 4 || this.koltukSec == 6 || this.koltukSec == 9 || this.koltukSec == 12 || this.koltukSec == 14) {
            System.out.println("Bu koltuk zaten dolu lütfen başka bir koltuk seçiniz:");

        } else {
            System.out.println("Koltuk Seçildi!");
        }
        System.out.println("----OTOBÜS BİLETİNİZ----");

        kimlikbilgilerial();

    }

}
