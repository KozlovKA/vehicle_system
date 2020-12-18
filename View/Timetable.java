package View;

import Entity.Way;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Timetable extends Application {

    public void show() {

        BorderPane root = new BorderPane();
        root.setPadding(new Insets(20, 20, 50, 20));


        Button busButton = new Button("Автобус");
        busButton.setMinWidth(200);
        Button tramButton = new Button("Трамвай");
        tramButton.setMinWidth(200);
        Button trolleybusButton = new Button("Троллейбус");
        trolleybusButton.setMinWidth(200);
        Button metroButton = new Button("Метро");
        metroButton.setMinWidth(200);
        TextField vehicleNumberTextField = new TextField();
        vehicleNumberTextField.setPromptText("Введите номер транспорта:");
        Button searchButton = new Button("Поиск");
        searchButton.setMinWidth(200);


        VBox buttons = new VBox(busButton, tramButton, trolleybusButton, metroButton, vehicleNumberTextField, searchButton);
        buttons.setSpacing(10);
        root.setCenter(buttons);

        Stage primaryStage = new Stage();
        primaryStage.setTitle("Расписание");
        primaryStage.setScene(new Scene(root, 240, 260));
        primaryStage.show();
    }

    public Way routeChange(String vehicleType, String wayNumber, String wayName) {
        return new Way(vehicleType, wayNumber, wayName);
    }


    @Override
    public void start(Stage stage) throws Exception {
        show();
    }
}