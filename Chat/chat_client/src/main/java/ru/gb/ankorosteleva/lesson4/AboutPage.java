package ru.gb.ankorosteleva.lesson4;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class AboutPage {

    public javafx.scene.control.Button closeButton;

    public void show() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/scene_about.fxml"));

        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setTitle("About");
        stage.setAlwaysOnTop(true);
        stage.setScene(new Scene(root, 300, 276));
        stage.show();
    }

    public void exit(ActionEvent actionEvent) {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }
}
