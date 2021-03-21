
import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fanat
 */
public class NotAJavaFile extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("ERROR 404");
        alert.setHeaderText("This is not a Java File");
        alert.setContentText("Please DELETE");
        alert.showAndWait();
    }
}
