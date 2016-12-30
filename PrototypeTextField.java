/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication10;
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;


/**
 *
 * @author DrSMarkham
 */
public class ProtoTextField extends Application{
    
    TextField tf;
    Label response;
    
    public static void main(String[] args){
        
        launch(args);
    }
    
    public void start(Stage myStage){
        
        myStage.setTitle("Demonstrate Prototype");
        
        FlowPane rootNode = new FlowPane(10, 10);
        
        rootNode.setAlignment(Pos.CENTER);
        
        Scene myScene = new Scene(rootNode, 230, 140);
        
        myStage.setScene(myScene);
        
        //Create label that will report contents of text field
        response = new Label("Enter Tasking Expression");
        
        //Create button that gets the text
        Button btnGetText = new Button("Report Tasking Expression");
        
        tf = new TextField();
        tf.setPromptText("Enter Tasking Expression: Verb Tasker Taskee (Affected|Action) Where \n" +
"Start-When (End-When) Why Label (Mod)* ");
        tf.setPrefColumnCount(15);
        
        //Handle Action Events for TextField
        //Action Events are generated when ENTER IS PRESSED
        //Text in Field is obntained and displayed
        tf.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent ae){
                response.setText("Tasking Expression: " + tf.getText());
            }
        });
        
        //Get Text from Text Field when Button is pressed and display it
        btnGetText.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent ae){
                response.setText("Tasking Expression: " + tf.getText());
            }
        });
        
        Separator separator = new Separator();
        separator.setPrefWidth(180);

        rootNode.getChildren().addAll(tf, btnGetText, separator, response);
        
        myStage.show();
    }
}