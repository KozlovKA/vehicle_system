package View;

import Entity.Way;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RouteAdd extends Application {


    public void show() {

        BorderPane root = new BorderPane();
        root.setPadding(new Insets(20, 20, 50, 20));

        ComboBox<String> vehicleType = new ComboBox<String>();
        vehicleType.setValue("Выберите вид транспорта");
        vehicleType.setMinWidth(200);
        TextField wayName = new TextField();
        wayName.setPromptText("Введите название маршрута");
        TextField wayNumber = new TextField();
        wayNumber.setPromptText("Введите номер маршрута");

        Button addWayButton = new Button("Добавить маршрут");
        addWayButton.setMinWidth(200);


        VBox buttons = new VBox(vehicleType, wayNumber, wayName, addWayButton);
        buttons.setSpacing(10);
        root.setCenter(buttons);

        Stage primaryStage = new Stage();
        primaryStage.setTitle("Главное окно");
        primaryStage.setScene(new Scene(root, 240, 260));
        primaryStage.show();
    }

    public Way routeAdd(String vehicleType, String wayNumber, String wayName) {
        return new Way(vehicleType, wayNumber, wayName);
    }


    @Override
    public void start(Stage stage) throws Exception {
        show();
    }
}