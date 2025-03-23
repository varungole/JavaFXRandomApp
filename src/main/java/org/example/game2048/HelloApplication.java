package org.example.game2048;

import Controller.CustomerController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(new CustomerController().getView()));
        primaryStage.show();
    }
}