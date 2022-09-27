package com.example.anchorpaneexample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        AnchorPane root;
        Scene scene;

        String[] textButtons = { "Anchor: TOP, LEFT", "Anchor: TOP, RIGHT", "Anchor: BOTTOM, LEFT", "Anchor: BOTTOM, RIGHT" };
        Button[] buttons = new Button[textButtons.length];

        // Creamos los botones con el texto del array textButtons
        for (int i = 0; i < textButtons.length; i++) {
            buttons[i] = new Button(textButtons[i]);
        }

        AnchorPane.setTopAnchor(buttons[0], 15.0);
        AnchorPane.setLeftAnchor(buttons[0], 15.0);

        AnchorPane.setTopAnchor(buttons[1], 15.0);
        AnchorPane.setRightAnchor(buttons[1], 15.0);

        AnchorPane.setBottomAnchor(buttons[2], 15.0);
        AnchorPane.setLeftAnchor(buttons[2], 15.0);

        AnchorPane.setBottomAnchor(buttons[3], 15.0);
        AnchorPane.setRightAnchor(buttons[3], 15.0);

        // Añadimos los nodos al contenedor
        root = new AnchorPane();
        root.getChildren().addAll(buttons);

        scene = new Scene(root, 450, 180);
        stage.setTitle("Ejemplo de uso de AnchorPane");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}