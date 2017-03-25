/*This Follows New Plan Frame and is followed by Palling Tool Descriptor Frames
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TextField;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author DrSMarkham
 */
public class Prototypemenu extends Application {
    
      
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
                        //new PlanOntology3();
                        
                   }
                };
        
        
        
        EventHandler<ActionEvent> MEHandler1 = 
                new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent ae) {
                        String name = ((MenuItem)ae.getTarget()).getText();
                        
                        if(name.equals("Exit")) Platform.exit();
                        
                        response.setText( name = "selected");
                        new PrototypeMenu2();
                        
                    }
                };
        
        EventHandler<ActionEvent> MEHandler2 = 
                new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent ae) {
                        String name = ((MenuItem)ae.getTarget()).getText();
                        
                        if(name.equals("Exit")) Platform.exit();
                        
                        response.setText( name = "selected");
                        new NewWindowSem();
                        
                    }
                };
        
        EventHandler<ActionEvent> MEHandler3 = 
                new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent ae) {
                        String name = ((MenuItem)ae.getTarget()).getText();
                        
                        if(name.equals("Exit")) Platform.exit();
                        
                        response.setText( name = "selected");
                        //new NewWindow2();
                        //new PlanToolAna();
                        NewWindow2 frame = new NewWindow2();
			frame.setVisible(true);
                    }
                };
        
        EventHandler<ActionEvent> MEHandler4 = 
                new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent ae) {
                        String name = ((MenuItem)ae.getTarget()).getText();
                        
                        if(name.equals("Exit")) Platform.exit();
                        
                        response.setText( name = "selected");
                        new NewWindow3();
                        
                    }
                };
        
        open.setOnAction(MEHandler);
        close.setOnAction(MEHandler);
        save.setOnAction(MEHandler);
        exit.setOnAction(MEHandler);
        strrep.setOnAction(MEHandler1);
        semrep.setOnAction(MEHandler2);
        anasch.setOnAction(MEHandler3);
        absarg.setOnAction(MEHandler4);
        metric.setOnAction(MEHandler);
        about.setOnAction(MEHandler);
        
        
        MenuItem cut = new MenuItem("Cut");
        MenuItem copy = new MenuItem("Copy");
        MenuItem paste = new MenuItem("Paste");
        
        final ContextMenu editMenu = new ContextMenu(cut,copy, paste);
        
        cut.setOnAction(MEHandler);
        copy.setOnAction(MEHandler);
        paste.setOnAction(MEHandler);
        
        TextField tf = new TextField();
        tf.setPrefColumnCount(20);
        tf.setContextMenu(editMenu);
        
        root.setTop(mb);
        
        FlowPane fpRoot = new FlowPane(10,10);
        fpRoot.setAlignment(Pos.CENTER);
        fpRoot.getChildren().addAll(response, tf);
        
        root.setCenter(fpRoot);
        
        root.setOnContextMenuRequested(
        new EventHandler<ContextMenuEvent>(){
            public void handle(ContextMenuEvent ae) {
                editMenu.show(root, ae.getScreenX(), ae.getScreenY());
            }
        });
        
        
        
        myStage.show();
    }

    /**
     * @param args the command line arguments
     */
    
    
}

