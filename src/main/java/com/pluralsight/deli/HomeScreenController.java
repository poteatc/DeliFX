package com.pluralsight.deli;

import com.pluralsight.deli.HomeScreenView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.ArrayList;
import java.util.List;

public class HomeScreenController {
    private HomeScreenView view;
    private List<Order> orders;

    public HomeScreenController(HomeScreenView view) {
        this.view = view;
        this.orders = new ArrayList<>();

        // Set up button action
        view.getNewOrderButton().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Add a new order (mock example)
                Order newOrder = new Order("Order #" + (orders.size() + 1));
                orders.add(newOrder);
                System.out.println("New order added: " + newOrder);
            }
        });
    }
}
