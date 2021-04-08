/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biletsatisotomasyonuu;

import dosyaislemi.readAndWritedosya;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author nurcan
 */
public class MuzeController implements Initializable {

    @FXML
    private Button bilet_ara;
    @FXML
    private TextField arama_muze_sehir;
    @FXML
    private ChoiceBox<String> sehir_secimi;
    @FXML
    private ChoiceBox<String> muze_sec;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        sehir_secimi.getItems().add("Ankara");
        sehir_secimi.getItems().add("Gaziantep");
        sehir_secimi.getItems().add("Malatya");
        sehir_secimi.getItems().add("Samsun");
        sehir_secimi.getItems().add("İstanbul");
        sehir_secimi.getItems().add("İzmir");

        sehir_secimi.valueProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (sehir_secimi.getValue().equals("Ankara")) {
                    muze_sec.getItems().add("TBMM");
                    muze_sec.getItems().add("PTT");
                    muze_sec.getItems().add("Cumhuriyet");
                    muze_sec.getItems().add("Anadolu Ve Medeniyetleri");

                } else if (sehir_secimi.getValue().equals("Gaziantep")) {
                    muze_sec.getItems().add("Zeugma Mozaik");
                    muze_sec.getItems().add("Savaş");
                    muze_sec.getItems().add("Hamam");
                    muze_sec.getItems().add("Saklı Konak");

                } else if (sehir_secimi.getValue().equals("Malatya")) {
                    muze_sec.getItems().add("Etnografya");
                    muze_sec.getItems().add("Malatya");
                    muze_sec.getItems().add("Fotoğraf Makinesi");
                    muze_sec.getItems().add("Atatürk Evi");

                } else if (sehir_secimi.getValue().equals("Samsun")) {
                    muze_sec.getItems().add("Gazi");
                    muze_sec.getItems().add("Kent");
                    muze_sec.getItems().add("Panorama");
                    muze_sec.getItems().add("Amazon Köyü");

                } else if (sehir_secimi.getValue().equals("İstanbul")) {
                    muze_sec.getItems().add("Ayasofya");
                    muze_sec.getItems().add("Atatürk");
                    muze_sec.getItems().add("Dolmabahçe");
                    muze_sec.getItems().add("Topkapı Sarayı");

                } else if (sehir_secimi.getValue().equals("İzmir")) {
                    muze_sec.getItems().add("Arkeoloji");
                    muze_sec.getItems().add("Etnografya");
                    muze_sec.getItems().add("Cumhuriyet");
                    muze_sec.getItems().add("Haberleşme");

                }

            }
        });

    }
    readAndWritedosya s = new readAndWritedosya();

    @FXML
    private void biletbulmaya_git(MouseEvent event) throws IOException {
        String k = "(Şehir :" + sehir_secimi.getValue() + ")"
                + " (Müze : " + muze_sec.getValue() + ")"
                + " Bulundu . ";
        s.olustur("muzebiletiniz");
        s.write(k, "muzebiletiniz");

        Stage s = (Stage) bilet_ara.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("odemeislemlerikonser.fxml"));
        Scene scene = new Scene(root);
        s.setScene(scene);
        s.show();
        System.out.println(k);

    }

    @FXML
    private void sehirsecmeye_git(MouseEvent event) {
    }

    @FXML
    private void muzesecmeye_git(MouseEvent event) {
    }
}
