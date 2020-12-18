package View;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CarrierWindow extends Application {


    public void show() {

        BorderPane root = new BorderPane();
        root.setPadding(new Insets(50, 20, 50, 20));

        Button takeTimetableButton = new Button("Расписание");
        takeTimetableButton.setMinWidth(200);




        VBox buttons = new VBox(takeTimetableButton);
        buttons.setSpacing(10);
        root.setCenter(buttons);

        Stage primaryStage = new Stage();
        primaryStage.setTitle("Окно перевозчика");
        primaryStage.setScene(new Scene(root, 240, 260));
        primaryStage.show();
    }

    public void takeTimetable() {

    }



    @Override
    public void start(Stage stage) throws Exception {
        show();
    }
}