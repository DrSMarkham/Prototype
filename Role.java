//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Role;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author DrSMarkham
 */
public class Role extends Application{
    
    TextField tf;
    Label response;
    
    public static void main(String[] args){
        
        launch(args);
    }
    
    public void start(Stage myStage){
        
        myStage.setTitle("Roles");
        
        FlowPane rootNode = new FlowPane(10, 10);
        
        rootNode.setAlignment(Pos.CENTER);
        
        Scene myScene = new Scene(rootNode, 230, 140);
        
        myStage.setScene(myScene);
        
        //Create label that will report contents of text field
        response = new Label("Roles");
        
        //Create button that gets the text
        Button btnGetText = new Button("Input Roles");
        
        tf = new TextField();
        tf.setPromptText("Input Roles as (role, #role) 2-tuples");
        tf.setPrefColumnCount(15);
        
        //Handle Action Events for TextField
        //Action Events are generated when ENTER IS PRESSED
        //Text in Field is obntained and displayed
        tf.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent ae){
                response.setText("Roles" + tf.getText());
            }
        });
        
        //Get Text from Text Field when Button is pressed and display it
        btnGetText.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent ae){
                response.setText("Roles: " + tf.getText());
            }
        });
        
        Separator separator = new Separator();
        separator.setPrefWidth(180);

        rootNode.getChildren().addAll(tf, btnGetText, separator, response);
        
        myStage.show();
    }
}
