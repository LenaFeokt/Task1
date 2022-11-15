package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class HelloController {
    public Canvas canvas;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.fillRect(100,100,100,100);
        gc.setFill(Color.RED);
        gc.setLineDashes(4);
        double[] a = {};
        double[] b = {};
        gc.setLineWidth(5);
        gc.strokeRect (100,100, 100, 100);
        gc.setStroke(Color.GREEN);
    }
}