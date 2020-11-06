package sample.controllers;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.input.MouseEvent;
import sample.graphics.arrows.CreateArrow;
import sample.graphics.arrows.associationArrow.AssociationArrowFactory;

public class Controller {

    private CreateArrow arrow = new CreateArrow(new AssociationArrowFactory());

    private double xStart;
    private double yStart;
    private double xEnd;
    private double yEnd;

    @FXML
    private Canvas canvas;

    @FXML
    void initialize() {
        canvas.setOnMousePressed(this::onStart);
        canvas.setOnMouseDragged(this::onEnd);
        canvas.setOnMouseReleased(this::onEnd);
    }

    private void onStart(MouseEvent event) {
        xStart = event.getX();
        yStart = event.getY();
    }

    private void onEnd(MouseEvent event) {
        xEnd = event.getX();
        yEnd = event.getY();
        canvas.getGraphicsContext2D().clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        arrow.paintArrow(xStart, yStart, xEnd, yEnd, canvas.getGraphicsContext2D());
    }
}
