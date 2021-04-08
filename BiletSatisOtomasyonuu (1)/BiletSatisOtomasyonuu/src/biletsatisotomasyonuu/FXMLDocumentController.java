/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biletsatisotomasyonuu;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
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
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Callback;

/**
 *
 * @author nurcan
 */
public class FXMLDocumentController implements Initializable {

    private Label label;
    @FXML
    private TextField aramabar;
    @FXML
    private ImageView araImage;
    @FXML
    private Button muze;
    @FXML
    private Button konser;
    @FXML
    private Button ulasim;
    @FXML
    private TableView<String> tarih_yer_tablosu;
    @FXML
    private TableColumn<tablu_data, String> tarih;
    @FXML
    private TableColumn<tablu_data, String> yer;
    @FXML
    private TableColumn<tablu_data, String> tur;

    private void handleButtonAction(ActionEvent event) throws IOException {
        Stage s = (Stage) label.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("sehirlerarasipage.fxml"));
        Scene scene = new Scene(root);
        s.setScene(scene);
        s.show();
    }

    public void fined_data(TableColumn<tablu_data, String> tarih, TableColumn<tablu_data, String> yer, TableColumn<tablu_data, String> tur, TableView table) {
        ObservableList<tablu_data> list = FXCollections.observableArrayList();

        list.addAll(new tablu_data("İstanbul", "2020-04-15", "Konser-Duman"));
        list.addAll(new tablu_data("Ankara", "2020-04-17", "Konser-Tarkan"));
        list.addAll(new tablu_data("Erzurum", "2020-06-21", "Konser-Sıla"));
        list.addAll(new tablu_data("İstanbul", "2020-05-15", "Konser-Duman"));
        list.addAll(new tablu_data("Ankara", "2020-05-18", "Konser-Teoman"));
        list.addAll(new tablu_data("Erzurum", "2020-06-21", "Konser-Hayko Cepkin"));
        list.addAll(new tablu_data("İstanbul", "2020-04-17", "Konser-Hande Yener"));
        list.addAll(new tablu_data("Ankara", "2020-04-17", "Konser-Athena"));
        list.addAll(new tablu_data("Erzurum", "2020-06-21", "Konser-ilhan Erşahin"));

        tarih.setCellValueFactory(new PropertyValueFactory<>("tarih"));
        yer.setCellValueFactory(new PropertyValueFactory<>("yer"));
        tur.setCellValueFactory(new PropertyValueFactory<>("tur"));

        table.setItems(list);
    }

    @Override

    public void initialize(URL url, ResourceBundle rb) {
        fined_data(tarih, yer, tur, tarih_yer_tablosu);

        ulasim.setOnAction((ActionEvent event) -> {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("sehirlerarasipage.fxml"));

            try {
                Parent root = loader.load();
                SehirlerarasipageController muzecontroller = loader.getController();

                Stage stage = new Stage();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        );

        muze.setOnAction((ActionEvent event) -> {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("muze.fxml"));

            try {
                Parent root = loader.load();
                MuzeController muzecontroller = loader.getController();

                Stage stage = new Stage();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        );

        konser.setOnAction((ActionEvent event) -> {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("konserpage.fxml"));

            try {
                Parent root = loader.load();
                KonserpageController muzecontroller = loader.getController();

                Stage stage = new Stage();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        );

    }

    @FXML
    private void Ara(MouseEvent event) {
    }

    @FXML
    private void muzeye_git(MouseEvent event) {

        // Button button1 = new Button("muze.fxml");
    }

    @FXML
    private void konsere_git(MouseEvent event) {

    }

    @FXML
    private void Ulasima_git(MouseEvent event) {

    }

    Conformbox c = new Conformbox();

    @FXML
    private void yardima_git(MouseEvent event) {
        c.display("YARDIM", "Hangi kategoriden bilet almak istiyorsanız ona tıklayınız\nKarasız iseniz aşağıda en çok ziyaret edilenlere göz atabilirsiniz..");

    }

}
