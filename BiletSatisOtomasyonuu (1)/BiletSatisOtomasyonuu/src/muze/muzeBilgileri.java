package muze;

import dosyaislemi.readAndWritedosya;
import java.util.Scanner;

public class muzeBilgileri extends adSoyadBilgileri {

    Scanner klavye = new Scanner(System.in);
    readAndWritedosya dosya = new readAndWritedosya();

    private String muze_sec;
    private String sehir_sec;
    private int gun;
    private String ay;

    public muzeBilgileri() {
    }

    public String getMuze_adi() {
        return muze_sec;
    }

    public void setMuze_adi(String muze_sec) {
        this.muze_sec = muze_sec;
    }

    public String getSehir_sec() {
        return sehir_sec;
    }

    public void setSehir_sec(String sehir_sec) {
        this.sehir_sec = sehir_sec;
    }

    public void sehirSec() {
        dosya.olustur("muzeicinsehirsecim");
        dosya.read("muzeicinsehirsecim");
        System.out.println("Şehir giriniz:");
        this.sehir_sec = klavye.next();
        switch (sehir_sec) {
            case "Ankara":
                muzesec1();
                break;

            case "istanbul":
                muzesec2();
                break;

            case "izmir":
                muzesec3();
                break;

            case "Gaziantep":
                muzesec4();
                break;

            case "Samsun":
                muzesec5();
                break;

            case "Malatya":
                muzesec6();
                break;

        }

    }

    public void muzesec1() {
        dosya.olustur("muzesecimAnkara");
        dosya.read("muzesecimAnkara");
        System.out.println("Hangi müze için bilgileri görüntülemek veya satın almak için müzenin adını giriniz:");
        this.muze_sec = klavye.next();
        switch (muze_sec) {
            case "TBMM":
                tarihsec(gun, ay);
                break;
            case "PTT":
                tarihsec(gun, ay);
                break;
            case "Cumhuriyet":
                tarihsec(gun, ay);
                break;
            case "Anadolu Medeniyetler":
                tarihsec(gun, ay);
                break;

            default:
                tarihsec(gun, ay);
                System.out.println("Böyle bir müze bulunmamaktadır.");
        }
    }

    public void muzesec2() {

        dosya.olustur("muzesecimistanbul");
        dosya.read("muzesecimistanbul");
        System.out.println("Hangi müze için bilgileri görüntülemek veya satın almak için müzenin adını giriniz:");
        this.muze_sec = klavye.next();
        switch (muze_sec) {
            case "Ayasofya":
                tarihsec(gun, ay);
                break;
            case "Atatürk":
                tarihsec(gun, ay);
                break;
            case "Dolmabahçe":
                tarihsec(gun, ay);
                break;
            case "Topkapı Sarayı":
                tarihsec(gun, ay);
                break;

            default:
                tarihsec(gun, ay);
                System.out.println("Böyle bir müze bulunmamaktadır.");
                break;
        }
    }

    public void muzesec3() {
        dosya.olustur("muzesecimİzmir");
        dosya.read("muzesecimİzmir");
        System.out.println("Hangi müze için bilgileri görüntülemek veya satın almak için müzenin adını giriniz:");
        this.muze_sec = klavye.next();
        switch (muze_sec) {
            case "Arkeoloji":
                tarihsec(gun, ay);
                break;
            case "Etnografya":
                tarihsec(gun, ay);
                break;
            case "Cumhuriyet":
                tarihsec(gun, ay);
                break;
            case "Haberleşme":
                tarihsec(gun, ay);
                break;

            default:
                tarihsec(gun, ay);
                System.out.println("Böyle bir müze bulunmamaktadır.");
                break;
        }
    }

    public void muzesec4() {
        dosya.olustur("muzesecimGaziantep");
        dosya.read("muzesecimGaziantep");
        System.out.println("Hangi müze için bilgileri görüntülemek veya satın almak için müzenin adını giriniz:");
        this.muze_sec = klavye.next();
        switch (muze_sec) {
            case "Zeugma Mozaik":
                tarihsec(gun, ay);
                break;
            case "Savaş":
                tarihsec(gun, ay);
                break;
            case "Hamam":
                tarihsec(gun, ay);
                break;
            case "Saklı Konak":
                tarihsec(gun, ay);
                break;

            default:
                tarihsec(gun, ay);
                System.out.println("Böyle bir müze bulunmamaktadır.");
                break;
        }
    }

    public void muzesec5() {
        dosya.olustur("muzesecimSamsun");
        dosya.read("muzesecimSamsun");
        System.out.println("Hangi müze için bilgileri görüntülemek veya satın almak için müzenin adını giriniz:");
        this.muze_sec = klavye.next();
        switch (muze_sec) {
            case "Gazi":
                tarihsec(gun, ay);
                break;
            case "Kent":
                tarihsec(gun, ay);
                break;
            case "Panorama":
                tarihsec(gun, ay);
                break;
            case "Amazon Köyü":
                tarihsec(gun, ay);
                break;

            default:
                tarihsec(gun, ay);
                System.out.println("Böyle bir müze bulunmamaktadır.");
                break;
        }
    }

    public void muzesec6() {
        dosya.olustur("muzesecimMalatya");
        dosya.read("muzesecimMalatya");
        System.out.println("Hangi müze için bilgileri görüntülemek veya satın almak için müzenin adını giriniz:");
        this.muze_sec = klavye.next();
        switch (muze_sec) {
            case "Etnografya":
                tarihsec(gun, ay);
                break;
            case "Malatya":
                tarihsec(gun, ay);
                break;
            case "Fotoğraf makinesi":
                tarihsec(gun, ay);
                break;
            case "Atatürk evi":
                tarihsec(gun, ay);
                break;

            default:

                System.out.println("Böyle bir müze bulunmamaktadır.");
                // tarihsec(gun,ay);
                break;
        }
    }

    public void tarihsec(int gun, String ay) {

        this.gun = gun;
        this.ay = ay;

        System.out.println("Gün  giriniz");
        this.gun = klavye.nextInt();

        System.out.println("Ay giriniz");
        this.ay = klavye.next();

        kimlikbilgilerial();
    }

    public void muzebiletiniz() {
        dosya.olustur("Muzebiletiniz");
        dosya.write(("\nAdınız:") + this.getKisi_adi() + ("\nSoyadınız:") + this.getSoy_adi() + ("\nŞehir: ") + this.sehir_sec + ("\nMüze:") + this.muze_sec, "Otobusbiletiniz");//yarın burayı doldur.
        dosya.read("Otobusbiletiniz");
    }

}
