package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;


public class Main extends Application {
	@Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(event ->
        System.out.println("Hello UK!"));
        
       /*         
        Button btn2 = new Button();
        btn2.setText("Say 'Hello UK'");
        btn2.setOnAction( event ->
                System.out.println("Hello UK!"));*/
          
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        //StackPane root2 = new StackPane();
        //root.getChildren().add(btn2);

 Scene scene = new Scene(root, 300, 250);
 //Scene scene2 = new Scene(root2, 300, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        //primaryStage.setScene(scene2);
        primaryStage.show();
    }
 public static void main(String[] args) {
        launch(args);
    }
}
