package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


import java.io.IOException;

public class HelloApplication extends Application {


    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Group root = new Group();
        Image image = new Image("icon_cat.png");
        stage.getIcons().add(image);
        Scene scene = new Scene(root );
        stage.setScene(scene);
        stage.setWidth(420);
        stage.setHeight(420);
        stage.setResizable(false);

//        stage.setX(50);
//        stage.setY(50);
//        stage.setFullScreen(true);
//        stage.setFullScreenExitHint("Hit q to exit full screen");
//        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));

        stage.setTitle("JavaFx demo yohohoho");

        stage.show();
    }
}