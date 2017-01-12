/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stream;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author DrSMarkham
 */
public class ProtoMainMenu extends Application {
    
    Label response;
    
    public static void main(String args[]) {
        
        launch(args);
        
    }
    
    @Override
    public void start(Stage myStage) {
        
    //    Button btn = new Button();
    //    btn.setText("Say 'Hello World'");
    //    btn.setOnAction(new EventHandler<ActionEvent>() {
            
    //        @Override
    //        public void handle(ActionEvent event) {
    //            System.out.println("Hello World!");
    //        }
    //    });
        
    
      myStage.setTitle("Prototype");
      
      //BorderPane rootNode = new BorderPane();
      
        BorderPane root = new BorderPane();
        //root.getChildren().add(btn);
        
        Scene myScene = new Scene(root, 300, 250);
        
        //myStage.setTitle("Hello World!");
        myStage.setScene(myScene);
        
        response = new Label("Prototype Menu");
        
        MenuBar mb = new MenuBar();
        
        Menu fileMenu = new Menu("File");
        MenuItem open = new MenuItem("Open");
        MenuItem close = new MenuItem("Close");
        MenuItem save = new MenuItem("Save");
        MenuItem exit = new MenuItem("Exit");
        
        fileMenu.getItems().addAll(open, close, save, new SeparatorMenuItem(), exit);
        
        mb.getMenus().add(fileMenu);
        
        Menu toolsMenu = new Menu("Tools");
        MenuItem strrep = new MenuItem("Structural Plan Representation");
        MenuItem semrep = new MenuItem("Semantic Plan representation");
        MenuItem anasch = new MenuItem("Analogous Problem Search");
        MenuItem absarg = new MenuItem("Abstract Argumentation Framework");
        
        toolsMenu.getItems().addAll(strrep, semrep, anasch, absarg);
        
        toolsMenu.getItems().add(new SeparatorMenuItem());
        
        MenuItem metric = new MenuItem("Metric");
        toolsMenu.getItems().add(metric);
        
        mb.getMenus().add(toolsMenu);
        
        
        Menu helpMenu = new Menu("Help");
        MenuItem about = new MenuItem("About");
        helpMenu.getItems().add(helpMenu);
        
        EventHandler<ActionEvent> MEHandler = 
                new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent ae) {
                        String name = ((MenuItem)ae.getTarget()).getText();
                        
                        if(name.equals("Exit")) Platform.exit();
                        
                        response.setText( name = "selected");
                    }
                };
        
        open.setOnAction(MEHandler);
        close.setOnAction(MEHandler);
        save.setOnAction(MEHandler);
        exit.setOnAction(MEHandler);
        strrep.setOnAction(MEHandler);
        semrep.setOnAction(MEHandler);
        anasch.setOnAction(MEHandler);
        absarg.setOnAction(MEHandler);
        metric.setOnAction(MEHandler);
        about.setOnAction(MEHandler);
        
        root.setTop(mb);
        root.setCenter(response);       
        
        
        
        myStage.show();
    }

    /**
     * @param args the command line arguments
     */
    
    
}
