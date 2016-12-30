import javafx.application.*;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DrSMarkham
 */
public class JavaFXlabel extends Application{
    public static void main(String[] args){
        launch(args);
    }
    
    public void start(Stage myStage){
        mystage.setTitle("Prototype");
        FlowPane rootNode = new FlowPane();
        rootNode.setAlignment(Pos.CENTER);
        
        Scene myScene = new Scene (rootNode, 300, 200);
        myStage.setScene(myScene);
        
            
        Button btnAlpha = new Button("StrRep");
        Button btnBeta = new Button("SemRep");
        
        btnAlpha.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent ae){
                response.setText("StrRep chosen");
        
        btnBeta.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent ae){
                response.setText("SemRep chosen");
            }
        });
              

        rootNode.getChildren().addAll(btnAlpha, btnBeta, response);
        myStage.show();
        
        
    }
}
        
        
   
