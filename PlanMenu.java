/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.input.*;
import javafx.beans.value.*;

/**
 *
 * @author DrSMarkham
 */
public class PlanMenu extends Application {
    
    MenuBar mb;
    EventHandler<ActionEvent>MEHandler;
    ContextMenu editMenu;
    ToolBar tbDebug;
    
    Label response;
    
    public static void main(String[] args){
        launch(args);
    }
    
    public void start(Stage myStage){
    
    myStage.setTitle("Prototype Menu");
    
    final BorderPane(rootNode) = new BorderPane();
    
    Scene myScene = new Scene(rootNode, 300, 300);
    
    myStage.setScene(myScene);
    
    //Create Label to Report Selection
    response = new Label();
    
    EventHandler<ActionEvent>MEHandler = new EventHandler<ActionEvent>(){
    public void handle(ActionEvent ae){
        String name = ((MenuItem)ae.getTarget()).getText();
        
        if(name.equals("Exit")) Platform.exit();
        
        response.setText( name + " selected");
    }
};

mb = new MenuBar();

makeFileMenu();
makeToolsMenu();
makeHelpMenu();
makeContextMenu();

TextField tf = new TextField();
tf.setPrefColumnCount(20);


makeToolBar();

rootNode.setOnCOntextMenuRequested(
tf.setContextMenu(editMenu);
new EventHandler<ContextMenuEvent>(){
public void handle(ContextMenuEvent ae){
//Popup menu at location of right click
editMenu.show(rootNode, ae.getScreenX(), ae.getScreenY());
}
});

rootNode.setTop(mb);

FlowPane fpRoot = new FlowPane(10, 10);
fpRoot.setAlignment(Pos.CENTER);

Separator separator = new Separator();
separator.setPrefWidth(260);

fpRoot.getChildren().addAll(response, separator, tf);

rootNode.setBottom(tbDebug);
rootNode.setCenter(fpRoot);
myStage.show();

void makeFileMenu(){
Menu fileMenu = new Menu("_File");

MeunItem open = new MenuItem("Open");
MeunItem close = new MenuItem("Close");
MeunItem save = new MenuItem("Save");
MeunItem exit = new MenuItem("Exit");

fileMenu.getItems().addAll(open, close, save, new SeparatorMenuItem(), exit);

open.setAccelerator(KeyCombination.keyCombination("shortcut+O"));
close.setAccelerator(KeyCombination.keyCombination("shortcut+C"));
save.setAccelerator(KeyCombination.keyCombination("shortcut+S"));
exit.setAccelerator(KeyCombination.keyCombination("shortcut+E"));

open.setOnAction(MEHandler);
close.setOnAction(MEHandler);
save.setOnAction(MEHandler);
exit.setOnAction(MEHandler);

mb.getMenus().add(fileMenu);
}

void makeToolsMenu(){
Menu toolsMenu = new Menu("Tools");

Menu coreMenu = new Menu("Core");

MenuItem strrep = new MenuItem("Structural Plan Representation"); 
MenuItem semrep = new MenuItem("Semanitic Plan Representation");
MenuItem absarg = new MenuItem("Abstract Argumentation Tool");

coreMenu.getItems().addAll(strrep, semrep, absarg);
toolsMenu.getItems().add(coreMenu);

Menu priorityMenu = new Menu("Priority");

RadioMenuItem high = new RadioMeniItem("High");
RadioMenuItem low = new RadioMeniItem("Low");

ToggleGroup tg = new ToggleGroup();
high.setToggleGroup();
low.setToggleGroup();

high.setSelected(true);

priorityMenu.getItems().addALL(high, low);
toolsMenu.getItems().add(priorityMenu);

toolsMenu.getItems().add(new SeparatorMenuItem());

MenuItem metric = new MenuItem("Metric");
toolsMenu.getitems().add(metric);

strrep.setOnAction(MEHandler);
semrep.setOnAction(MEHandler);
absarg.setOnAction(MEHandler);

high.setOnAction(MEHandler);
low.setOnAction(MEHandler);
metric.setOnAction(MEHandler);

tg.selectedToggleProperty().addListener(new ChangeListener<Toggle>(){
public void changed(ObservableValue<? extends Toggle> changed, Toggle oldVal, Toggle newVal){
if(newVal==null) return;

RadioMenuItem rmi = (PadioMenuItem) newVal;
response.setText("Priority selected is " + rmi.getText());
}
});

mb.getMenus().add(toolsMenu);

void makeHelpMenu(){
Menu helpMenu = new Menu("Help");

MenuItem about = new MenuItem("About");
helpMenu.getItems().add(about);

about.setOnAction(MEHandler);
mb.getMenus().add(helpMenu);
}

void makeContextMenu(){

MenuItem cut = new MenuItem("Cut");
MenuItem copy = new MenuItem("Copy");
MenuItem paste = new MenuItem("Paste");

//Create context i.e. popup menu that shows edit options
editMenu = new ContextMenu(cut, copy, paste);

cut.setOnAction(MEHandler);
copy.setOnAction(MEHandler);
paste.setOnAction(MEHandler);

void makeToolBar(){

Button btnSet = new Button("Set Breakpoint");
Button btnSet = new Button("Clear Breakpoint");
Button btnSet = new Button("Resume Execution");

tbDebug = new ToolBar(btnSet, btnClear, btnResume);

EventHandler<ActionEvent> btnHandler = new EventHandler<ActionEvent>(){
public void handle(ActionEvent ae){
response.setText(((Button)ae.getTarget()).getText());
}
};
btnSet.setOnAction(btnHandler);
btnClear.setOnAction(btnHandler);
btnResume.setOnAction(btnHandler);
}
}
    }
    }
}














        
    