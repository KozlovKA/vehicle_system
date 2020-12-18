package View;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.text.Text;

public class MainWindow extends Application {



    public void show() {

        BorderPane root = new BorderPane();
        root.setPadding(new Insets(20, 20, 50, 20));

        Label login = new Label("Имя пользователя:");
        TextField loginInput = new TextField();

        Label password = new Label("Пароль:");
        TextField passwordInput = new TextField();

        Button loginButton = new Button("Вход");
        loginButton.setMinWidth(200);

        CheckBox carrierCheckBox= new CheckBox("Перевозчик");
        CheckBox EngineerCheckBox= new CheckBox("Техник");


        VBox buttons = new VBox(login, loginInput, password, passwordInput, new HBox(loginButton),carrierCheckBox,EngineerCheckBox);
        buttons.setSpacing(10);
        root.setCenter(buttons);

        Stage primaryStage = new Stage();
        primaryStage.setTitle("Главное окно");
        primaryStage.setScene(new Scene(root, 240, 260));
        primaryStage.show();
    }

    public void userLogin() {

    }

    public void carrierLogin() {

    }


    public void EngineerLogin() {

    }


    @Override
    public void start(Stage stage) throws Exception {
        show();
    }
}
