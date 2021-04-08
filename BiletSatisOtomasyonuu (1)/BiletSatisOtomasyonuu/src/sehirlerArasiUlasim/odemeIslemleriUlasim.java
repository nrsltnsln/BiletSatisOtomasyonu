/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sehirlerArasiUlasim;

import dosyaislemi.readAndWritedosya;
import java.util.Random;
import java.util.Scanner;

public abstract class odemeIslemleriUlasim {

    private int Kredi_kart_numarasi;
    private String kredi_kart_kullanicinin_adi;
    private int son_bitis_tarihi;
    private int guvenli_kod;

    public String getKredi_kart_kullanicinin_adi() {
        return kredi_kart_kullanicinin_adi;
    }

    public void setKredi_kart_kullanicinin_adi(String kredi_kart_kullanicinin_adi) {
        this.kredi_kart_kullanicinin_adi = kredi_kart_kullanicinin_adi;
    }

    public int getKredi_kart_numarasi() {
        return Kredi_kart_numarasi;
    }

    public void setKerdi_kart_numarasi(int Kredi_kart_numarasi) {
        this.Kredi_kart_numarasi = Kredi_kart_numarasi;
    }

    public int getSon_bitis_tarihi() {
        return son_bitis_tarihi;
    }

    public void setSon_bitis_tarihi(int son_bitis_tarihi) {
        this.son_bitis_tarihi = son_bitis_tarihi;
    }

    public int getGuvenli_kod() {
        return guvenli_kod;
    }

    public void setGuvenli_kod(int guvenli_kod) {
        this.guvenli_kod = guvenli_kod;
    }

    Scanner scan = new Scanner(System.in);

    public odemeIslemleriUlasim() {
    }

    readAndWritedosya dosya = new readAndWritedosya();

    public void odemeislemleriyapulasim(int Kredi_kart_numarasi, String kredi_kart_kullanicinin_adi, int guvenli_kod) {
        Random r = new Random();
        int low = 60;
        int high = 150;
        int result = r.nextInt(high - low) + low;

        this.Kredi_kart_numarasi = Kredi_kart_numarasi;
        this.kredi_kart_kullanicinin_adi = kredi_kart_kullanicinin_adi;
        this.guvenli_kod = guvenli_kod;

        System.out.println("*****ÖDEME İŞLEMLERİ*****");

        System.out.println("ücret:" + result);

        System.out.println("Kredi kartı numaranızı giriniz:");

        this.Kredi_kart_numarasi = scan.nextInt();
        System.out.println("Kredi kartı kullanıcı adınızı giriniz:");
        this.kredi_kart_kullanicinin_adi = scan.next();
        System.out.println("Kredi kartı güvenlik kodunuzu giriniz:");
        this.guvenli_kod = scan.nextInt();
        odemeislemleriyapulasim(getSon_bitis_tarihi());

    }

    public void odemeislemleriyapulasim(int son_bitis_tarihi) {
        this.son_bitis_tarihi = son_bitis_tarihi;

        System.out.println("Kredi kartı son bitiş tarihini giriniz:");
        this.son_bitis_tarihi = scan.nextInt();

    }

}
