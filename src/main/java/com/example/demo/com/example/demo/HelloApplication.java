package com.example.demo;

//01
//import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Group;
//import javafx.scene.Scene;
//import javafx.scene.image.Image;
//import javafx.scene.input.KeyCombination;
//import javafx.scene.paint.Color;
//import javafx.stage.Stage;
//
//
//import java.io.IOException;
//
//public class HelloApplication extends Application {
//
//
//    public static void main(String[] args) {
//
//        launch(args);
//    }
//
//    @Override
//    public void start(Stage stage) throws Exception {
//
//        Group root = new Group();
//        Image image = new Image("icon_cat.png");
//        stage.getIcons().add(image);
//        Scene scene = new Scene(root );
//        stage.setScene(scene);
//        stage.setWidth(420);
//        stage.setHeight(420);
//        stage.setResizable(false);
//
////        stage.setX(50);
////        stage.setY(50);
////        stage.setFullScreen(true);
////        stage.setFullScreenExitHint("Hit q to exit full screen");
////        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
//
//        stage.setTitle("JavaFx demo yohohoho");
//
//        stage.show();
//    }
//}


//02
//import javafx.application.Application;
//import javafx.scene.Group;
//import javafx.scene.Scene;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Circle;
//import javafx.scene.shape.Line;
//import javafx.scene.shape.Polygon;
//import javafx.scene.shape.Rectangle;
//import javafx.scene.text.Font;
//import javafx.scene.text.Text;
//import javafx.stage.Stage;
//
//public class HelloApplication extends Application{
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//
//    @Override
//    public void start(Stage stage) throws Exception {
//        Group root = new Group();
//        Scene scene = new Scene(root,1080,720,Color.SKYBLUE);
//        Image icon = new Image("icon_cat.png");
//        stage.getIcons().add(icon);
//        stage.setTitle("Vooh vooh");
//
//        stage.setScene(scene);
//
//        Text text = new Text();
//        text.setText("Whooooa!!");
//        text.setX(100);
//        text.setY(100);
//        text.setFont(Font.font("Verdana",100));
//        text.setFill(Color.DARKGREEN);
//
//        root.getChildren().add(text);
//
//        Line line = new Line();
//        line.setStartX(100);
//        line.setStartY(150);
//        line.setEndX(700);
//        line.setEndY(150);
//        line.setStrokeWidth(5);
//        line.setStroke(Color.PALEVIOLETRED);
//
//        root.getChildren().add(line);
//
//        Rectangle rect = new Rectangle();
//        rect.setX(10);
//        rect.setY(175);
//        rect.setFill(Color.LIME);
//        rect.setHeight(100);
//        rect.setWidth(100);
//        rect.setStrokeWidth(5);
//        rect.setStroke(Color.BLACK);
//
//        root.getChildren().add(rect);
//
//        Polygon triangle = new Polygon();
//        triangle.getPoints().setAll(
//                200.0,200.0,
//                450.0,300.0,
//                150.0,300.0
//        );
//        triangle.setStroke(Color.BLACK);
//        triangle.setStrokeWidth(20);
//        triangle.setFill(Color.OLIVE);
//
//        root.getChildren().add(triangle);
//
//        Circle circle = new Circle();
//        circle.setCenterX(600);
//        circle.setCenterY(250);
//        circle.setRadius(50);
//        circle.setFill(Color.ORANGE);
//
//        root.getChildren().add(circle);
//
//        Image img = new Image("cat.jpg");
//        ImageView imgview = new ImageView(img);
//        imgview.setX(100);
//        imgview.setY(400);
//        imgview.setFitWidth(200.0);
//        imgview.setFitHeight(300.0);
//
//        root.getChildren().add(imgview);
//
//        stage.show();
//    }
//}

//03
//import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Group;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.image.Image;
//import javafx.stage.Stage;
//
//public class HelloApplication extends Application {
//
//    @Override
//    public void start(Stage stage) throws Exception {
//        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
//        Scene scene = new Scene(root);
//
//        stage.setTitle("Scenebuilder01");
//        stage.setWidth(720.0);
//        stage.setHeight(720.0);
//        stage.setResizable(false);
//        Image icon = new Image("icon_cat.png");
//        stage.getIcons().add(icon);
//        stage.setScene(scene);
//        stage.show();
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}

//04
//import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.stage.Stage;
//
//public class HelloApplication extends Application {
//
//    @Override
//    public void start(Stage stage)  {
//        try
//        {
//            Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
//
//            stage.setScene(new Scene(root));
//            stage.setResizable(false);
//            stage.show();
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}

//05
//import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.stage.Stage;
//
//public class HelloApplication extends Application {
//    @Override
//    public void start(Stage stage) {
//
//        try{
//            //Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
//            Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
//            Scene scene = new Scene(root);
//            String css = this.getClass().getResource("application.css").toExternalForm();
//            scene.getStylesheets().add(css);
//            stage.setScene(scene);
//            stage.show();
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}

//06
//import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.stage.Stage;
//
//public class HelloApplication extends Application {
//
//    @Override
//    public void start(Stage stage)  {
//        try {
//            Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
//            Scene scene1 = new Scene(root);
//            stage.setScene(scene1);
//            stage.show();
//        }
//        catch (Exception e)
//        {
//            System.out.println();
//            System.out.println("Error in javafx");
//            System.out.println();
//            e.printStackTrace();
//        }
//    }
//}

//07
//import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.stage.Stage;
//
//public class HelloApplication extends Application {
//    @Override
//    public void start(Stage stage){
//        try
//        {
//            Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
//            Scene scene = new Scene(root);
//
//            stage.setScene(scene);
//            stage.show();
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}

//08

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("scene2.fxml"));
        Scene scene = new Scene(root);


        stage.setScene(scene);
        stage.show();
        stage.setOnCloseRequest(
                event ->
                {
                    event.consume();
                    logout(stage);
                });
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void logout(Stage stage)
    {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Quit");
        alert.setHeaderText("You're about to exit");
        alert.setContentText("Do you want to save before exiting?: ");

        if(alert.showAndWait().get() == ButtonType.OK)
        {

            stage.close();
            System.out.println("Application closed!!");
        }
        else System.out.println("Cancelled exit!!");

    }
}