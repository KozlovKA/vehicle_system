package View;

import Entity.Way;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RouteDelete extends Application {


    public void show() {

        BorderPane root = new BorderPane();
        root.setPadding(new Insets(20, 20, 50, 20));


        TextField wayNumber = new TextField();
        wayNumber.setPromptText("Введите номер маршрута");

        Button deleteWayButton = new Button("Удалить маршрут");
        deleteWayButton.setMinWidth(200);


        VBox buttons = new VBox(wayNumber, deleteWayButton);
        buttons.setSpacing(10);
        root.setCenter(buttons);

        Stage primaryStage = new Stage();
        primaryStage.setTitle("Главное окно");
        primaryStage.setScene(new Scene(root, 240, 260));
        primaryStage.show();
    }

    public void routeDelete(Way way) {

    }


    @Override
    public void start(Stage stage) throws Exception {
        show();
    }
}