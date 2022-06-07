import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;

public class App extends Application{

    @Override
    public void start(Stage primarystage) {
        
        Parent root;

        try {

            root = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
            Scene scene = new Scene(root);
            primarystage.setScene(scene);
            primarystage.setTitle("Daftar Harga Lev Computer");
            primarystage.getIcons().add(new Image(App.class.getResourceAsStream("icon.png")));
            primarystage.show();

        } catch (IOException e) {
           
        }
        
    }

    public static void main(String[] args){

        Application.launch(args);

    }
    
} 