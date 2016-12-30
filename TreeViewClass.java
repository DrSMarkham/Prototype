import javafx.application.*;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javax.swing.event.ChangeListener;
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DrSMarkham
 */
public class TreeViewClass extends Application {
    Label response;
    
    public static void main(String[] args){
        launch(args);
    }
    
    public void start(Stage myStage){
        
        myStage.setTitle("Structural Plan Representation");
        
        FlowPane rootNode = new FlowPane(10, 10);
        rootNode.setAlignment(Pos.CENTER);
        
        Scene myScene = new Scene(rootNode, 310, 460);
        myStage.setScene(myScene);
        
        //Create label that reports state of selected tree item
        response = new Label("No Selection");
        
        TreeItem<String> tiRoot = new TreeItem<String>("Plan");
        
        TreeItem<String> tiFruit = new TreeItem<String>("TaskingExpression");
        
        tiFruit.getChildren().add(new TreeItem<String>("Verb"));
        tiFruit.getChildren().add(new TreeItem<String>("Tasker"));
        tiFruit.getChildren().add(new TreeItem<String>("Taskee"));
        tiFruit.getChildren().add(new TreeItem<String>("Affected"));
        tiFruit.getChildren().add(new TreeItem<String>("Action"));
        tiFruit.getChildren().add(new TreeItem<String>("Location"));
        tiFruit.getChildren().add(new TreeItem<String>("Route"));
        tiFruit.getChildren().add(new TreeItem<String>("StartTime"));
        tiFruit.getChildren().add(new TreeItem<String>("EndTime"));
        tiFruit.getChildren().add(new TreeItem<String>("Why"));
        tiFruit.getChildren().add(new TreeItem<String>("Label"));
        tiFruit.getChildren().add(new TreeItem<String>("Mod*"));
        
        tiRoot.getChildren().add(tiFruit);
        
        TreeView<String> tvTaskingExpression = new TreeView<String>(tiRoot);
        
        MultipleSelectionModel<TreeItem<String>> tvSelModel =
                tvTaskingExpression.getSelectModel();
        
        tvSelModel.selectedItemProperty().addListener(
        new ChangeListener<TreeItem<String>>(){
            public void changed(
            ObservableValue<? extends TreeItem<String>> changed,
                    TreeItem<String> oldVal, TreeItem<String> newVal){
                
                //Display the selection and its complete path from root
                if(newVal != null){
                    String path = newVal.getValue();
                    TreeItem<String> tmp = newVal.getParent();
                    while(tmp != null){
                        path=tmp.getValue() + " -> " + path;
                        tmp = tmp.getParent();
                    }
                    //Display selection and entire path
                    response.setText("Selection is " + newVal.getValue() +
                            "\nComplete path is " + path);
                }
                
            }
        });
        //Add controls to scene path
        rootNode.getChildren().addAll(tvTaskingExpression, response);
        //Show stage and scene
        myStage.show();
        
        
        
    }
    
}
