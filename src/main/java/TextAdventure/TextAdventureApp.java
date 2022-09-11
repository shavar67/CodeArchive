package TextAdventure;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;

public class TextAdventureApp extends Application {
    private TextArea output = new TextArea();
    private TextField input = new TextField();
    private Map<String,Command> commands = new HashMap<>();

    @Override
    public void start(Stage stage) throws Exception {
        stage.setScene(new Scene(createContent()));
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(TextAdventureApp.class,args);
    }

    private Parent createContent(){
        output.setPrefHeight(600-80);
        output.setEditable(false);
        output.setFont(Font.font(18));
        output.setFocusTraversable(false);
        input.setOnAction(action ->{
            String inputText = input.getText();
            input.clear();
            onInput(inputText);

        });
        VBox root = new VBox(15,output,input);
        root.setPadding(new Insets(15));
        root.setPrefSize(800,600);
        initGame();
        return root;
    }

    private void initGame(){
        println("welcome to text adventure v 0.1");
        initCommand();
    }
    private void println(String line){
        output.appendText(line + "\n");
    }

    private void  onInput(String line){
        if(!commands.containsKey(line)){
            println("Command "  + line + " not found");
            return;
        }
        commands.get(line).execute();
    }
    private void initCommand(){
        commands.put("Exit",new Command("Exit",": Exit the game", Platform::exit));
        commands.put("Help",new Command("Help",": Prints all the commands available",this::runHelp));
        commands.put("Go West",new Command("Go",": Move west",() -> runGo(-1,0)));
        commands.put("Go East",new Command("Go",": Move east",() -> runGo(1,0)));
        commands.put("Go North",new Command("Go",": Move west",() -> runGo(0,-1)));
        commands.put("Go South",new Command("Go",": Move east",() -> runGo(0,1)));

    }

    private void runHelp(){
       commands.forEach((name,cmd) ->{
           println(name + "\t" + cmd.getDescription());
       });
    }
    private void runGo(int dx, int dy){
     println("Moving by " + dx +  " " + dy);
    }
}
