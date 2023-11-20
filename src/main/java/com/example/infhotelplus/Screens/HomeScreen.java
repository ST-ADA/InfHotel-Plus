package com.example.infhotelplus.Screens;

import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;

public class HomeScreen {
    private Scene scene;
    private FlowPane sideBar;
    private FlowPane menu;

    public HomeScreen() {
        Pane root = new Pane();
        scene = new Scene(root, 1900, 1000);

        sideBar = new FlowPane();
        sideBar.setStyle("-fx-background-color: #292c33");
        sideBar.setPrefSize(140, scene.getHeight());
        sideBar.setMaxSize(140, scene.getHeight());
        sideBar.setOrientation(Orientation.VERTICAL);

        Label logo = new Label("InfHotel");
        logo.setStyle("-fx-background-color: #09e3c9");
        logo.setPrefSize(sideBar.getMaxWidth(), 50);
        logo.setAlignment(Pos.CENTER);

        menu = new FlowPane();
        menu.setStyle("-fx-background-color: #e4ff00");
        menu.setMaxSize(sideBar.getMaxWidth(), 550);

        generateMenuItem();

        sideBar.getChildren().addAll(logo, menu);
        root.getChildren().add(sideBar);
    }

    public void generateMenuItem() {
        FlowPane menuItem = new FlowPane();
        menuItem.setStyle("-fx-background-color: #1fe309");
        menuItem.setPrefSize(sideBar.getPrefWidth(), sideBar.getPrefWidth() - 30);

        Pane activeIndicator = new Pane();
        activeIndicator.setStyle("-fx-background-color: #ad09e3");
        activeIndicator.setPrefSize(10, menuItem.getPrefHeight());

        FlowPane menuItemInfo = new FlowPane();
        menuItemInfo.setStyle("-fx-background-color: #e36b09");
        menuItemInfo.setPrefSize(menuItem.getPrefWidth() - activeIndicator.getPrefWidth(), menuItem.getPrefHeight());

        menuItem.getChildren().addAll(activeIndicator, menuItemInfo);
        menu.getChildren().add(menuItem);
    }

    public Scene getScene() {
        return scene;
    }
}
