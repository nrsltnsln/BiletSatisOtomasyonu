/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konser;

import dosyaislemi.readAndWritedosya;
import java.io.File;
import java.util.*;

/**
 *
 * @author nurcan
 */
public abstract class konserislemleri extends odemeIslemleriKonser {

    private String kategoriSec;
    private String sanatciSec;
    private String sehirSec;
    private int tarihSec;
    private int gun;
    private String ay;

    public String getKategoriSec() {
        return kategoriSec;
    }

    public void setKategoriSec(String kategoriSec) {
        this.kategoriSec = kategoriSec;
    }

    public String getSanatciSec() {
        return sanatciSec;
    }

    public void setSanatciSec(String sanatciSec) {
        this.sanatciSec = sanatciSec;
    }

    public String getSehirSec() {
        return sehirSec;
    }

    public void setSehirSec(String sehirSec) {
        this.sehirSec = sehirSec;
    }

    public int getTarihSec() {
        return tarihSec;
    }

    public void setTarihSec(int tarihSec) {
        this.tarihSec = tarihSec;
    }

    public int getGun() {
        return gun;
    }

    public void setGun(int gun) {
        this.gun = gun;
    }

    public String getAy() {
        return ay;
    }

    public void setAy(String ay) {
        this.ay = ay;
    }

    readAndWritedosya dosya = new readAndWritedosya();
    Scanner klavye = new Scanner(System.in);

    public konserislemleri() {

    }

    @Override
    public void kimlikbilgilerial() {
        super.kimlikbilgilerial();
    }

    @Override
    public void odemeislemleriyap(int Kredi_kart_numarasi, String kredi_kart_kullanicinin_adi, int guvenli_kod) 
    {
        super.odemeislemleriyap(Kredi_kart_numarasi, kredi_kart_kullanicinin_adi, guvenli_kod);
    }

    public void konserbiletleri() {
        dosya.olustur("konserbiletleri");
        dosya.read("konserbiletleri");
    }

    public void secim() {

        int sayisec;
        String secim;
        System.out.println("Hangi müzik türünde Konser Bileti bakmak istiyorsanız lütfen adını giriniz:");
        dosya.olustur("kategorisecim");
        dosya.read("kategorisecim");

        secim = klavye.next();
        switch (secim) {
            case "CAZ":

                cazsecim(sanatciSec);

                break;

            case "POP":
                popsecim(sanatciSec);

                break;

            case "ROCK":

                rocksecim(sanatciSec);

                break;

            default:
                System.out.println("hatalı giriş yaptınız büyük harf küçük harf yazarken özen gösteriniz:");

                break;
        }
    }

    public void cazsecim(String sanatciSec) {
        this.sanatciSec = sanatciSec;

        dosya.olustur("cazsecim");
        dosya.read("cazsecim");

        System.out.println("Caz müzik için hangi sanatçıdan Konser bileti almak istiyorsanız lütfen adını giriniz:");

        sanatciSec = klavye.next();
        switch (sanatciSec) {

            case "Elif":
                sehirsec();
                break;

            case "Fatih":
                sehirsec();
                break;

            case "İlhan":
                sehirsec();
                break;

            case "Önder":
                sehirsec();
                break;

            case "Kerem":
                sehirsec();
                break;

            case "Sibel":
                sehirsec();
                break;

            default:
                System.out.println("hatalı giriş yaptınız büyük harf küçük harf yazarken özen gösteriniz:");

                break;

        }
    }

    public void sehirsec() {

        String sehirsec;

        dosya.olustur("sehirsec");
        dosya.read("sehirsec");
        System.out.println("Sehir seciniz:");
        sehirsec = klavye.next();

        switch (sehirsec) {
            case "İstanbul":
                tarihsec(gun, ay);
                break;

            case "Ankara":
                tarihsec(gun, ay);
                break;

            case "GaziAntep":
                tarihsec(gun, ay);
                break;

            case "Erzurum":
                tarihsec(gun, ay);
                break;

            case "Malatya":
                tarihsec(gun, ay);
                break;

            default:
                System.out.println("hatalı giriş yaptınız büyük harf küçük harf yazarken özen gösteriniz:");
                break;
        }

    }

    public void tarihsec(int gun, String ay) {

        System.out.println("Gün  giriniz");
        this.gun = klavye.nextInt();

        System.out.println("Ay giriniz");
        this.ay = klavye.next();

        //odemeislemleri..
    }

    public void popsecim(String sanatciSec) {
        this.sanatciSec = sanatciSec;
        System.out.println("Pop Tarzında bu yıl içersindekiler:\n");

        dosya.olustur("popsecim");
        dosya.read("popsecim");

        System.out.println("Pop müzik için hangi sanatçıdan Konser bileti almak istiyorsanız lütfen adını giriniz:");

        sanatciSec = klavye.next();

        switch (sanatciSec) {
            case "MuratBoz ":
                sehirsec();

                break;

            case "SezenAksu":
                sehirsec();
                break;

            case "Tarkan":
                sehirsec();
                break;

            case "HandeYener":
                sehirsec();
                break;

            case "Sıla":
                sehirsec();
                break;

            case "MustafaCeceli":
                sehirsec();
                break;

            default:
                System.out.println("hatalı giriş yaptınız büyük harf küçük harf yazarken özen gösteriniz:");

                break;

        }
    }

    public void rocksecim(String sanatciSec) {
        this.sanatciSec = sanatciSec;

        System.out.println("Rock Tarzında bu yıl içersindekiler:\n\n");

        dosya.olustur("rocksanatcisecim");
        dosya.read("rocksanatcisecim");

        System.out.println("Rock müzik için hangi sanatçıdan Konser bileti almak istiyorsanız lütfen adını giriniz:");

        sanatciSec = klavye.next();
        switch (sanatciSec) {
            case "Duman":
                sehirsec();

                break;

            case "Teoman":
                sehirsec();
                break;

            case "SebnemFerah":
                sehirsec();
                break;

            case "HaykoCepkin":
                sehirsec();
                break;

            case "MorVeÖtesi":
                sehirsec();
                break;

            case "Athena":
                sehirsec();
                break;

            default:
                System.out.println("hatalı giriş yaptınız büyük harf küçük harf yazarken özen gösteriniz:");

                break;

        }
    }

}
