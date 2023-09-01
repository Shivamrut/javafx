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
////06
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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
public class HelloController {
    @FXML
    private TextField textfield_name;
    private Stage stage;
    private Scene scene;
    private Parent root;


    public void login (ActionEvent event) throws Exception
    {
        System.out.println("Loading scene2!!");
        String username = textfield_name.getText();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("scene2.fxml"));
        root = loader.load();
        Controller2 scene2 = loader.getController();
        scene2.displayName(username);
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}