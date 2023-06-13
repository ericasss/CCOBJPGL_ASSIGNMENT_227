package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import model.*;

public class RestaurantController {

    @FXML
    ImageView img1, img2, img3, img4, img5;

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    Chowking chowking = new Chowking();
    Hapchan hapchan = new Hapchan();
    Marugame marugame = new Marugame();
    NorthPark northpark = new NorthPark();
    Samgyupsalamat samgyupsalamat = new Samgyupsalamat();

    public void initialize() {

        chowking.setBestSeller("Chaofan");
        chowking.setRate("5 Stars");

        hapchan.setBestSeller("Chicken");
        hapchan.setRate("5 Stars");

        marugame.setBestSeller("Katsudon");
        marugame.setRate("5 Stars");

        northpark.setBestSeller("Noodles");
        northpark.setRate("5 Stars");

        samgyupsalamat.setBestSeller("Bulgogi");
        samgyupsalamat.setRate("5 Stars");
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Chowking's best seller is " + chowking.getBestSeller() + " and their rate is "
            + chowking.getRate());
        }

        if (sourceButton == btn2) {
            alert.setContentText("Hapchan's best seller is " + hapchan.getBestSeller() + " and their rate is "
            + hapchan.getRate());
        }

        if (sourceButton.equals(btn3)) {
            alert.setContentText("Marugame's best seller is " + marugame.getBestSeller() + " and their rate is "
            + marugame.getRate());
        }

        if (sourceButton.equals(btn4)) {
            alert.setContentText("North Park's best seller is " + northpark.getBestSeller() + " and their rate is "
            + northpark.getRate());
        }

        if (sourceButton.equals(btn5)) {
            alert.setContentText("Samgyupsalamat's best seller is " + samgyupsalamat.getBestSeller() + " and their rate is "
            + samgyupsalamat.getRate());
        }

        alert.showAndWait();

    }
}
