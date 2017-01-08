import javafx.application.*; 
import static javafx.application.Application.launch;
import javafx.scene.*; 
import javafx.stage.*; 
import javafx.scene.layout.*; 
import javafx.scene.control.*; 
import javafx.event.*; 
import javafx.geometry.*; 

 
public class PlanMenu extends Application{ 
    
    
  
Label response; 
public static void main(String args[]){ 
  launch(args); 
} 
    
public void start(Stage myStage){ 
    
myStage.setTitle("Prototype Menu"); 
BorderPane(rootNode) = new BorderPane(); 
Scene myScene = new Scene(rootNode, 300, 300); 
myStage.setScene(myScene); 
//Create Label to Report Selection 
response = new Label(); 
EventHandler<ActionEvent> MEHandler = new EventHandler<ActionEvent>(){ 
public void handle(ActionEvent ae){ 
String name = ((MenuItem)ae.getTarget()).getText(); 
if(name.equals("Exit")) Platform.exit(); 
response.setText( name + " selected"); 
} 
};

MenuBar mb = new MenuBar(); 

TextField tf = new TextField(); 
tf.setPrefColumnCount(20); 

ToolBar tbDebug = new ToolBar();

rootNode.setTop(mb); 

rootNode.setBottom(tbDebug); 

FlowPane fpRoot = new FlowPane(10, 10); 
fpRoot.setAlignment(Pos.CENTER); 
Separator separator = new Separator(); 
separator.setPrefWidth(260); 
fpRoot.getChildren().addAll(response, separator, tf); 
rootNode.setCenter(fpRoot); 
myStage.show(); 

Menu fileMenu = new Menu("File"); 
MenuItem open = new MenuItem("Open"); 
MenuItem close = new MenuItem("Close"); 
MenuItem save = new MenuItem("Save"); 
MenuItem exit = new MenuItem("Exit"); 
fileMenu.getItems().addAll(open, close, save, new SeparatorMenuItem(), exit);

//open.setAccelerator(KeyCombination.keyCombination("shortcut+O")); 
//close.setAccelerator(KeyCombination.keyCombination("shortcut+C")); 
//save.setAccelerator(KeyCombination.keyCombination("shortcut+S")); 
//exit.setAccelerator(KeyCombination.keyCombination("shortcut+E")); 

open.setOnAction(MEHandler); 
close.setOnAction(MEHandler); 
save.setOnAction(MEHandler); 
exit.setOnAction(MEHandler); 

mb.getMenus().add(fileMenu); 

Menu toolsMenu = new Menu("Tools"); 

MenuItem strrep = new MenuItem("Structural Plan Representation");  
MenuItem semrep = new MenuItem("Semanitic Plan Representation"); 
MenuItem absarg = new MenuItem("Abstract Argumentation Tool"); 
toolsMenu.getItems().addAll(strrep, semrep, absarg); 

mb.getMenus().add(toolsMenu); 


MenuItem metric = new MenuItem("Metric"); 
toolsMenu.getItems().add(metric); 
strrep.setOnAction(MEHandler); 
semrep.setOnAction(MEHandler); 
absarg.setOnAction(MEHandler); 

metric.setOnAction(MEHandler); 
mb.getMenus().add(toolsMenu); 

Menu helpMenu = new Menu("Help"); 
MenuItem about = new MenuItem("About"); 
helpMenu.getItems().add(about); 
about.setOnAction(MEHandler); 
mb.getMenus().add(helpMenu); 
 
Menu editMenu = new Menu("Edit");
MenuItem cut = new MenuItem("Cut"); 
MenuItem copy = new MenuItem("Copy"); 
MenuItem paste = new MenuItem("Paste");
editMenu.getItems().addAll(cut, copy, paste);
cut.setOnAction(MEHandler);
copy.setOnAction(MEHandler);
paste.setOnAction(MEHandler);
mb.getMenus().add(editMenu);
}
} 

 

