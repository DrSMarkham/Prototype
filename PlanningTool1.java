*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package planningtool;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author DrSMarkham
 */
public class PlanningTool1 extends Application {
    
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Planning Tool");
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        //grid.setPadding(new Insets(25, 25, 25, 25));
        
        Text scenetitle = new Text("Planning Tool");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        //Label label1 = new Label("Tasking Expression:");
        //grid.add(label1, 0, 6);
        //TextField textField1 = new TextField ();
        //HBox hb = new HBox();
        //hb.getChildren().addAll(label1, textField1);
        //hb.setSpacing(5);
        //grid.add(hb, 1, 6);

            //Creating a GridPane container
        //GridPane grid1 = new GridPane();
        //grid1.setPadding(new Insets(10, 10, 10, 10));
        //grid1.setVgap(5);
        //grid1.setHgap(5);
        //grid.setAlignment(Pos.BOTTOM_CENTER);
        
        //Defining the Name text field
        final TextField name1 = new TextField();
        name1.setPrefColumnCount(20);
        name1.setPromptText("Enter Tasking Expression:");
        name1.getText();
        GridPane.setConstraints(name1, 0, 0);
        grid.getChildren().add(name1);
        
        //Defining the Last Name text field
        final TextField lastName = new TextField();
        lastName.setPromptText("Enter (Role, Number in Role) list:");
        lastName.getText();
        GridPane.setConstraints(lastName, 0, 1);
        grid.getChildren().add(lastName);
        
        //Defining the Comment text field
        final TextField comment = new TextField();
        comment.setPrefColumnCount(20);
        comment.setPromptText("Enter (Resource, Resource Amount) list:");
        comment.getText();
        GridPane.setConstraints(comment, 0, 2);
        grid.getChildren().add(comment);

        //Defining the Submit button
        Button submit = new Button("Submit");
        GridPane.setConstraints(submit, 0, 3);
        grid.getChildren().add(submit);
        
        //Defining the Clear button
        Button clear = new Button("Clear");
        GridPane.setConstraints(clear, 0, 4);
        grid.getChildren().add(clear);

    
    
    
        
        
       
     
        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }    
        
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

    
    
    

