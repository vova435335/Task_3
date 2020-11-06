package sample.controllers;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.ChoiceBox;
import javafx.scene.input.MouseEvent;
import sample.graphics.arrows.ArrowFactory;
import sample.graphics.arrows.CreateArrow;
import sample.graphics.arrows.aggregationArrow.AggregationArrowFactory;
import sample.graphics.arrows.associationArrow.AssociationArrowFactory;
import sample.graphics.arrows.compositionArrow.CompositionArrowFactory;
import sample.graphics.arrows.dependenceArrow.DependenceArrowFactory;
import sample.graphics.arrows.implementationArrow.ImplementationArrowFactory;
import sample.graphics.arrows.inheritanceArrow.InheritanceArrowFactory;

import java.awt.*;

public class Controller {

    private CreateArrow arrow = new CreateArrow(new AssociationArrowFactory());

    private double xStart;
    private double yStart;

    @FXML
    private Canvas canvas;
    @FXML
    private ChoiceBox<String> select_cb;

    @FXML
    void initialize() {
        select_cb.getItems().addAll("Ассосифция", "Наследование", "Реализация", "Зависимость", "Агрегация", "Композиция");
        select_cb.setValue(select_cb.getItems().get(0));

        select_cb.setOnAction(event -> {
            arrow = new CreateArrow(selectArrow(select_cb.getSelectionModel().getSelectedIndex()));
        });

        canvas.setOnMousePressed(this::onStart);
        canvas.setOnMouseDragged(this::onEnd);
        canvas.setOnMouseReleased(this::onEnd);
    }

    private void onStart(MouseEvent event) {
        xStart = event.getX();
        yStart = event.getY();
    }

    private void onEnd(MouseEvent event) {
        double xEnd = event.getX();
        double yEnd = event.getY();
        canvas.getGraphicsContext2D().clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        arrow.paintArrow(xStart, yStart, xEnd, yEnd, canvas.getGraphicsContext2D());
    }

    private ArrowFactory selectArrow(int id) {
        switch (id) {
            case 0:
                return new AssociationArrowFactory();
            case 1:
                return new InheritanceArrowFactory();
            case 2:
                return new ImplementationArrowFactory();
            case 3:
                return new DependenceArrowFactory();
            case 4:
                return new AggregationArrowFactory();
            case 5:
                return new CompositionArrowFactory();
            default:
                return null;
        }
    }
}
