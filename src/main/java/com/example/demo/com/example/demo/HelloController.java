package com.example.demo;

//04
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.scene.shape.Circle;
//
//

//public class HelloController {
//
//    @FXML
//    private Circle circle;
//    private double x,y;
//
//    public HelloController()
//    {
//
//    }
//
//    public void up(ActionEvent e)
//    {
//        circle.setCenterY(y-=10);
//    }
//    public void down(ActionEvent e)
//    {
//        circle.setCenterY(y+=10);
//    }
//    public void left(ActionEvent e)
//    {
//        circle.setCenterX(x-=10);
//    }
//    public void right(ActionEvent e)
//    {
//        circle.setCenterX(x+=10);
//    }
//}

//06
//import javafx.event.ActionEvent;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Node;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.stage.Stage;
//

//public class HelloController {
//    private Stage stage;
//    private Scene scene;
//    private Parent root;
//
//    public void switchToScene1(ActionEvent event)
//    {
//        try{
//            root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
//            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
//            scene = new Scene(root);
//            stage.setScene(scene);
//            stage.show();
//
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//
//    }
//    public void switchToScene2(ActionEvent event)
//    {
//        try{
//            root = FXMLLoader.load(getClass().getResource("scene2.fxml"));
//            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
//            scene = new Scene(root);
//            stage.setScene(scene);
//            stage.show();
//
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//    }
//}

//07
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Node;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.control.TextField;
//import javafx.stage.Stage;
//public class HelloController {
//    @FXML
//    private TextField textfield_name;
//    private Stage stage;
//    private Scene scene;
//    private Parent root;
//
//
//    public void login (ActionEvent event) throws Exception
//    {
//        System.out.println("Loading scene2!!");
//        String username = textfield_name.getText();
//        FXMLLoader loader = new FXMLLoader(getClass().getResource("scene2.fxml"));
//        root = loader.load();
//        Controller2 scene2 = loader.getController();
//        scene2.displayName(username);
//        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//    }
//
//}


//08
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Node;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.control.Alert;
//import javafx.scene.control.Button;
//import javafx.scene.control.ButtonType;
//import javafx.scene.layout.AnchorPane;
//import javafx.stage.Stage;
//
//import java.io.IOException;
//
//
//public class HelloController {
//
//    @FXML
//    private Button button_logout, button_login;
//    @FXML
//    private AnchorPane scenePane, scenePane2;
//    private Stage stage;
//    private Parent root;
//    private Scene scene;
//
//    public void logout(ActionEvent event) throws IOException {
//        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
//        alert.setTitle("Logout");
//        alert.setHeaderText("You're about to logout");
//        alert.setContentText("Do you want to save before exiting?: ");
//
//        if(alert.showAndWait().get() == ButtonType.OK)
//        {
//            stage = (Stage) scenePane.getScene().getWindow();
//            root = FXMLLoader.load(getClass().getResource("scene2.fxml"));
//            stage.setScene(new Scene(root));
//            stage.show();
//            System.out.println("Logged out!!");
//        }
//        else System.out.println("Cancelled logout!!");
//
//    }
//
//    public void login(ActionEvent event) throws Exception
//    {
//        System.out.println("Logging in!!");
//        root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
//        scene = new Scene(root);
//        stage = (Stage) scenePane2.getScene().getWindow();
//        stage.setScene(scene);
//        stage.show();
//    }
//
//}

//09
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.HashMap;
import java.util.Map;

public class HelloController {
    @FXML
    private ImageView imageview_img1;
    @FXML
    private Button button_btn1;
    private boolean switchImg = false;
    private Image img ;
    private Map<String, Image> imageCache = new HashMap<>();

    public void displayImage() {
        String imageName = switchImg ? "cat.jpg" : "cat2.jpg";

        // Check if the image is in the cache
        if (imageCache.containsKey(imageName)) {
            img = imageCache.get(imageName);
        } else {
            img = new Image(getClass().getResourceAsStream(imageName));

            // Add the loaded image to the cache
            imageCache.put(imageName, img);
        }

        imageview_img1.setImage(img);
        switchImg = !switchImg;
        System.out.println("Click");
    }

}