package com.pluralsight.deli;

import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class HomeScreenView {
    private VBox root;
    private Button newOrderButton;

    public HomeScreenView() {
        root = new VBox();
        root.setSpacing(10);

        // Create Button
        newOrderButton = new Button("Add New Order");
        root.getChildren().add(newOrderButton);
    }

    public VBox getRoot() {
        return root;
    }

    public Button getNewOrderButton() {
        return newOrderButton;
    }
}
