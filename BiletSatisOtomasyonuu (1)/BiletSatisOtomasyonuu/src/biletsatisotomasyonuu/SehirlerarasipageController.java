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
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import sehirlerArasiUlasim.ulasim_islemleri;

/**
 * FXML Controller class
 *
 * @author nurcan
 */
public class SehirlerarasipageController implements Initializable {

    //private TableView firmatable;
    @FXML
    private Label otobus_bileti;
    @FXML
    private TextField bulundugunyer_otobusicin;
    @FXML
    private TextField gitmekistediginsehir_otobusicin;
    @FXML
    private DatePicker tarihsecotobus;
    @FXML
    private Button otobusbiletibul;
    @FXML
    private ChoiceBox<Integer> otobuskoltuksec;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        otobuskoltuksec.getItems().add(1);
        otobuskoltuksec.getItems().add(2);
        otobuskoltuksec.getItems().add(3);
        otobuskoltuksec.getItems().add(4);
        otobuskoltuksec.getItems().add(5);
        otobuskoltuksec.getItems().add(6);
        otobuskoltuksec.getItems().add(7);
        otobuskoltuksec.getItems().add(8);
        otobuskoltuksec.getItems().add(9);
        otobuskoltuksec.getItems().add(10);
        otobuskoltuksec.getItems().add(11);
        otobuskoltuksec.getItems().add(12);
        otobuskoltuksec.getItems().add(13);
        otobuskoltuksec.getItems().add(14);
        otobuskoltuksec.getItems().add(15);
        otobuskoltuksec.getItems().add(16);
        otobuskoltuksec.getItems().add(17);
        otobuskoltuksec.getItems().add(18);
        otobuskoltuksec.getItems().add(19);
        otobuskoltuksec.getItems().add(20);

    }

    readAndWritedosya s = new readAndWritedosya();

    @FXML
    private void otobus_bileti_almaya_git(MouseEvent event) throws IOException {
        String n = "(Kalkış Noktası :" + bulundugunyer_otobusicin.getText() + ")"
                + " (Varış Noktası : " + gitmekistediginsehir_otobusicin.getText() + ")"
                + " (Tarih: " + tarihsecotobus.getValue() + ")"
                + " (Koltuk Numaranız : " + otobuskoltuksec.getValue() + ")"
                + " Bulundu . ";
        s.olustur("otobusbiletiniz");
        s.write(n, "otobusbiletiniz");

        Stage s = (Stage) otobusbiletibul.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("odemeislemlerikonser.fxml"));
        Scene scene = new Scene(root);
        s.setScene(scene);
        s.show();
        System.out.println(n);
    }

    @FXML
    private void otobusbileti_bula_git(MouseEvent event) {
    }

    @FXML
    private void otobuskoltuksecmeyegit(MouseEvent event) {
    }

}
