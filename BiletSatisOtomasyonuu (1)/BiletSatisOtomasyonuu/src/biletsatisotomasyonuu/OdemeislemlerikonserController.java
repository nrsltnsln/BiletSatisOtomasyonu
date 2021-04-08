/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biletsatisotomasyonuu;

import dosyaislemi.readAndWritedosya;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author nurcan
 */
public class OdemeislemlerikonserController implements Initializable {

    @FXML
    private Label bilet;
    @FXML
    private TextField kart_num;
    @FXML
    private TextField kart_kullanci_adi;
    @FXML
    private TextField kart_guvenli_kod;
    @FXML
    private DatePicker son_kullanim_tarih;
    @FXML
    private Label bilet1;

    @FXML
    private Label bilet2;
    @FXML
    private Label bilet21;
    /**
     * Initializes the controller class.
     */

    Conformbox c = new Conformbox();
    readAndWritedosya r = new readAndWritedosya();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        r.readmassage("otobusbiletiniz", bilet);
        r.readmassage("biletiniz", bilet2);
        r.readmassage("muzebiletiniz", bilet21);
    }

    @FXML
    private void BiletAl(MouseEvent event) {
        c.display("**TicketKingdom**", "Biletiniz Başarıyla Alınmıştır...");

    }

}
