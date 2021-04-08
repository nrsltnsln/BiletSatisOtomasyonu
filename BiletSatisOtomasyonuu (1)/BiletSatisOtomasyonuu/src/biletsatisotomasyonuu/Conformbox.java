package biletsatisotomasyonuu;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Conformbox {

    public void display(String title, String massge) {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);

        window.setMinWidth(320);

        Label text = new Label();
        text.setText(massge);

        Button closebtn = new Button(" Close ");
        closebtn.setOnAction(e -> window.close());

        VBox layout = new VBox(10);
        layout.getChildren().addAll(text, closebtn);
        layout.setStyle("-fx-background-color: #FFFFFF;");
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);

        window.setScene(scene);
        window.showAndWait();
    }
}
