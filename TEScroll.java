 To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 

import javafx.application.Application;
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
public class TEScroll extends Application {
    
    ScrollPane scrlPane;
    
    public static void main(String args[]) {
        
        launch(args);
        }
    
    public void start(Stage myStage){
        
        myStage.setTitle("The Rules for the Tasking Grammar");
        
        FlowPane rootNode = new FlowPane(10, 10);
        
        rootNode.setAlignment(Pos.CENTER);
        
        Scene myScene = new Scene(rootNode, 200, 200);
        
        myStage.setScene(myScene);
        
        Label scrlLabel = 
 new Label("The tasking grammar scopes the assignment of single specific\n" +
"tasks to specific units as well as the giving of details of coordination.\n" +
"Therefore, the head rule of the tasking grammar is:\n" +
"(1) S → OB* C_Sp* C_T*\n" +
"This rule means that a tasking expression consists of\n" +
"basic order expressions to assign tasks to units\n" +
"(indicated by the non-terminal OB), spatial coordination\n" +
"(indicated by the non-terminal C_Sp), and temporal\n" +
       "coordination (indicated by the non-terminal C_T).\n" + 
       "The asterisk indicates that arbitrarily many of the\n" +
       "respective expressions can be concatenated together.\n" +
" Basic order expressions are composed of a verb and its frame.\n" +
"The verb denotes a task. These tasking verbs are taken from\n" +
"JC3IEDM’s table “action-task-activity-code.” Thus, the rules\n" + 
"to expand OB have the general form:\n" +
"OB → Verb Tasker Taskee(Affected|Action) Where\n" +
"Start-When (End-When) Why Label (Mod)*\n" + "\n" +
"OB → advance Tasker Taskee Route-Where\n" + 
"Start-When (End-When) Why Label (Mod)*\n" + "\n" +
"OB → defend Tasker Taskee Affected At-Where\n" +
"Start-When (End-When) Why Label (Mod)*\n" + "\n" +
" Tasker is to be expanded by the name of the one who gives the order.\n" +
"Taskee is to be expanded by the name of the unit that is ordered to\n" +
"execute the task. Start-When and End-When are to be expanded by temporal\n" + 
"phrases expressing when the execution of the task has to start and when\n" +
"it has to be finished. End-When is optional as indicated by the\n" +
"parentheses. Tasker, Taskee, Start-When, and End-When appear in each\n" +
"basic order rule. Affected has to be a term in the expression if someone,\n" +
"e.g., the enemy, will be directly affected by the task; in linguistic\n" +
"terms this is called the patient. Whether Affected is part of a rule\n" +
"depends on the tasking verb. For example, it is there in the case of\n" +
"attack or defend because the executing unit is tasked to attack the enemy\n" +
"or to defend against the enemy. It is not there in the case of advance.\n" +
"The tasking verbs come with frames that express which kind of constituents\n" +
"are required, e.g., a constituent of type Affected. This grants keeping\n" +
"the principles of completeness and coherence. Action is similar to\n" + 
"Affected. It only appears if the task affects an action, as a task of\n" + 
"type assist does – the unit is tasked to assist the execution of another\n" +
"task by another unit. In addition, the type of the Where is also\n" +
"determined by the verb. It is currently an At-Where or a Route-Where.\n" +
"An At-Where denotes a location, and a Route-Where a path to a location.\n" +
" A basic rule ends with Why, Label and the optional Mod. Why represents\n" + 
"a reason why the task specified by the rule is ordered. Label is a unique\n" +
"identifier for its task. By this identifier the task can referred to in\n" +
"other expressions, especially in temporal co-ordinations. The optional\n" +
"Mod (for modifier) is a wild-card that represents additional information\n" +
"that can be used to describe a particular task, e.g., formation – to\n" +
"specify a particular formation for an advance, or speed – to specify the\n" +
"speed of a road march.\n" +
"\n" +
"Examples of T-Verbs for expressing tasking expressions include:\n" +
"Divert\n" +
"Deceive\n" +
"Deny\n" +
"Envelope\n" +
"Support\n" +
"");
        
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

    /**
 //    * @param args the command line arguments
     */
 //   public static void main(String[] args) {
 //       launch(args);
 //   }
    
//}
