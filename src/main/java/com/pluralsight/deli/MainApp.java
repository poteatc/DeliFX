package com.pluralsight.deli;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Initialize View
        com.pluralsight.deli.HomeScreenView homeScreenView = new com.pluralsight.deli.HomeScreenView();

        // Initialize Controller
        com.pluralsight.deli.HomeScreenController homeScreenController = new com.pluralsight.deli.HomeScreenController(homeScreenView);

        // Set up the stage
        Scene scene = new Scene(homeScreenView.getRoot(), 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Home Screen");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
