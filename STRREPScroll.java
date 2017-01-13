/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author DrSMarkham
 */
public class STRREPScroll extends Application {
    
  
    ScrollPane scrlPane;
    
    public static void main(String args[]) {
        
        launch(args);
        }
    
    public void start(Stage myStage){
        
        myStage.setTitle("Structural Plan Representation");
        
        FlowPane rootNode = new FlowPane(10, 10);
        
        rootNode.setAlignment(Pos.CENTER);
        
        Scene myScene = new Scene(rootNode, 200, 200);
        
        myStage.setScene(myScene);
        
        Label scrlLabel = 
 new Label("Use a tuple-based model:\n" +
"(Int start node(of edge), Int end node(of edge), Int number of multiple\n" +
"edges, Int forward degree of start node(of edge), String action_1, \n" + 
"String action_2,…, String action_( number of multiple edges), *String actor,\n" +
"*String resource, *String hazard, *String environmental factor,\n" + 
"Empty String,…,Empty String)\n" +
"i = start node(of edge) = state i\n" +
"j = end node(of edge) = state j\n" +
"m_ij = number of multiple edges from node i to node j = number of actions\n" +
"executed simultaneously between state i and state j\n" +
"d_i = forward degree of node i, i.e. the number of (directed) edges\n" + 
" leading away from node i\n" +
"action_1 = least priority action executed between nodes (states) i and j\n" +
"action_2 = next least priority action executed between nodes (states) i and j\n" +
".\n" +
".\n" +
"action_m_ij = highest priority action executed between nodes (states) i and j\n" +
"*String actor denotes m_ij tuple entries corresponding to the actors\n" +
"associated to the m_ij action tuple entities. These String actor tuples are\n" +
"ordered such that actor tuple entry k+m_ij corresponds to action tuple\n" +
"entry k.\n" +
"Similarly for *String resource, *String hazard and *String environmental\n" + 
"factor.\n" +
"\n" +
" The individual tuple entries for the actors will consist of sets of 2-tuples,\n" +
"each 2-tuple representing a (role, number of personnel in role) pair. The\n" +
" set of 2-tuples in a given actors tuple entry will represent the roles and\n" +
"number of personnel in the given roles for the corresponding action.\n" +
" Similarly individual tuple entries for the resources will consist of\n" +
"sets of 2-tuples, each 2-tuple representing a (resource, amount used) \n" + 
"pair.\n" +
"\n" +
" The individual tuple entries for the actions will be the corresponding\n" + 
" tasking expressions utilising verbs from the J3CIEDM tables\n" + 
" “action-event-category code”, “action-task-activity-code” and FM3-90.\n" + 
" Similarly each corresponding actor, resource, hazard and environmental\n" + 
" factor tuple entry will utilise code from the corresponding J3CIEDM category.\n" + 
" For example for:\n" +
"•	Actions use “action-task-activity-code”\n" +
"•	Roles use “person-type-category-code”\n" +
"•	Resources use “materiel-type-category-code”\n" +
"•	Hazards use “feature-type-category-code” and “object-type-category-code”\n" +
"•	Environmental Factors use “feature-type-category-code");
        
scrlPane = new ScrollPane(scrlLabel);

scrlPane.setPrefViewportWidth(130);
scrlPane.setPrefViewportHeight(80);

scrlPane.setPannable(true);
Button btnReset = new Button("Reset Scroll Bar Positions");

btnReset.setOnAction(new EventHandler<ActionEvent>() {
    public void handle(ActionEvent ae) {
        scrlPane.setVvalue(0);
        scrlPane.setHvalue(0);
    }
});

rootNode.getChildren().addAll(scrlPane, btnReset);

myStage.show();
    }
}
    
//    @Override
//    public void start(Stage primaryStage) {
//        Button btn = new Button();
//        btn.setText("Say 'Hello World'");
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//            
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("Hello World!");
//            }
//        });
//        
//        StackPane root = new StackPane();
//        root.getChildren().add(btn);
        
//        Scene scene = new Scene(root, 300, 250);
        
//        primaryStage.setTitle("Hello World!");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }