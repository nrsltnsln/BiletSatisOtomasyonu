/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biletsatisotomasyonuu;

import dosyaislemi.readAndWritedosya;
import java.util.Scanner;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import konser.kisiBilgileri;
import konser.konserislemleri;
import konser.odemeIslemleriKonser;
import muze.adSoyadBilgileri;
import muze.muzeBilgileri;
import muze.odemeIslemleriMuze;
import sehirlerArasiUlasim.odemeIslemleriUlasim;
import sehirlerArasiUlasim.ulasim_islemleri;
import sehirlerArasiUlasim.yolcuBilgileri;

/**
 *
 * @author nurcan
 */
public class BiletSatisOtomasyonuu extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);

        kisiBilgileri adb = new kisiBilgileri();
        muzeBilgileri m = new muzeBilgileri();
        ulasim_islemleri ui = new ulasim_islemleri();

        System.out.println("*****************TİCKET KİNGDOM***********");
        System.out.println("Konser Bileti , Müze Bİleti , Otobüs Bileti alabilirsiniz.");
        System.out.println("Konser Bileti almak için 1'e\nMüze  Bileti almak için 2'ye\nOtobüs Bileti almak için 3'e\n---- BASINIZ!----");
        Scanner klv = new Scanner(System.in);
        int sayi;
        sayi = klv.nextInt();

        switch (sayi) {
            case 1:
                System.out.println("KONSER BİLETİ ALABİLİRSİNİZ");
                adb.konserbiletleri();
                adb.secim();
                adb.kimlikbilgilerial(adb.getYas(), (int) adb.getTelefon_numara());
                adb.kimlikbilgilerial();

                break;

            case 2:
                System.out.println("MÜZE BİLETİ ALABİLİRSİNİZ");

                m.sehirSec();
                m.muzebiletiniz();
                break;

            case 3:

                System.out.println("OTOBÜS BİLETİ ALABİLİRSİNİZ");
                ui.neredenNereye();
                ui.biletiniz();

                break;

            default:
                System.out.println("Hatalı giriş yaptınız! Böyle bir seçenek bulunmamaktadır...");

        }

    }

}
