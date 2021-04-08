/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biletsatisotomasyonuu;

import dosyaislemi.readAndWritedosya;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import static jdk.nashorn.internal.objects.NativeArray.pop;
import konser.konserislemleri;

/**
 * FXML Controller class
 *
 * @author nurcan
 */
public class KonserpageController implements Initializable {

    @FXML
    private TextField konser_sanatci_araa;
    @FXML
    private ImageView arama_iconu;
    @FXML
    private ComboBox<String> sanatci_sec;
    @FXML
    private ComboBox<String> sehir_sec;
    @FXML
    private DatePicker tarihsec;
    @FXML
    private Button bilet_bul;
    @FXML
    private ChoiceBox<String> kategori_sec;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        kategori_sec.getItems().add("pop");
        kategori_sec.getItems().add("caz");
        kategori_sec.getItems().add("rock");

        kategori_sec.valueProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (kategori_sec.getValue().equals("pop")) {
                    sanatci_sec.getItems().add("Murat Boz");
                    sanatci_sec.getItems().add("Sezen Aksu");
                    sanatci_sec.getItems().add("Sıla");
                    sanatci_sec.getItems().add("HandeYener");
                    sanatci_sec.getItems().add("Tarkan");

                    sehir_sec.getItems().add("İstanbul");
                    sehir_sec.getItems().add("Ankara");
                    sehir_sec.getItems().add("Erzurum");

                } else if (kategori_sec.getValue().equals("caz")) {
                    sanatci_sec.getItems().add("Elif Çağlar Muslu");
                    sanatci_sec.getItems().add("Fatih Erkoç");
                    sanatci_sec.getItems().add("ilhan Erşahin");
                    sanatci_sec.getItems().add("Önder Focan");
                    sanatci_sec.getItems().add("Sİbel Köse");

                    sehir_sec.getItems().add("İstanbul");
                    sehir_sec.getItems().add("Ankara");
                    sehir_sec.getItems().add("Erzurum");

                } else if (kategori_sec.getValue().equals("rock")) {
                    sanatci_sec.getItems().add("Duman");
                    sanatci_sec.getItems().add("Teoman");
                    sanatci_sec.getItems().add("Hayko Cepkin");
                    sanatci_sec.getItems().add("Athena");
                    sanatci_sec.getItems().add("Mor Ve Ötesi");

                    sehir_sec.getItems().add("İstanbul");
                    sehir_sec.getItems().add("Ankara");
                    sehir_sec.getItems().add("Erzurum");

                }

            }
        });
    }

    @FXML
    private void sanatcisecmeye_git(MouseEvent event) {
    }

    @FXML
    private void sehirsecmeye_git(MouseEvent event) {
    }

    @FXML
    private void biletbulmaya_git(MouseEvent event) throws IOException {
        String m = "(Kategori :" + kategori_sec.getValue() + ")"
                + " (Sanatçı : " + sanatci_sec.getValue() + ")"
                + " (Şehir : " + sehir_sec.getValue() + ")"
                + " (Tarih : " + tarihsec.getValue() + ")"
                + " Bulundu . ";
        s.olustur("biletiniz");
        s.write(m, "biletiniz");

        Stage s = (Stage) sanatci_sec.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("odemeislemlerikonser.fxml"));
        Scene scene = new Scene(root);
        s.setScene(scene);
        s.show();
        System.out.println(m);

    }
    readAndWritedosya s = new readAndWritedosya();

    @FXML
    private void kategori_secmeye_git(MouseEvent event) {
    }

}
