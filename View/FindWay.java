package View;

import Entity.Way;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FindWay extends Application {



    public void show() {

        BorderPane root = new BorderPane();
        root.setPadding(new Insets(20, 20, 50, 20));


        TextField FromTextField = new TextField();
        FromTextField.setPromptText("Откуда:");
        TextField ToTextField = new TextField();
        ToTextField.setPromptText("Куда");
        Button searchButton = new Button("Поиск маршрута");
        searchButton.setMinWidth(200);


        VBox buttons = new VBox(FromTextField, ToTextField, searchButton);
        buttons.setSpacing(10);
        root.setCenter(buttons);

        Stage primaryStage = new Stage();
        primaryStage.setTitle("Поиск маршрута");
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