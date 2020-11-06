package sample.graphics.arrows;

import javafx.scene.canvas.GraphicsContext;

public class CreateArrow {

    private ArrowFactory factory;
    private Arrowhead head;
    private ArrowLine line;

    public CreateArrow(ArrowFactory factory) {
        this.factory = factory;
        createArrowhead();
        createArrowLine();
    }

    private void createArrowhead() {
        head = factory.createArrowhead();
    }

    private void paintHead(double xStart, double yStart, double xEnd, double yEnd, GraphicsContext graphicsContext) {
        head.paint(xStart, yStart, xEnd, yEnd, graphicsContext);
    }

    private void createArrowLine() {
        line = factory.createArrowLine();
    }

    private void paintLine(double xStart, double yStart, double xEnd, double yEnd, GraphicsContext graphicsContext) {
        line.paint(xStart, yStart, xEnd, yEnd, graphicsContext);
    }

    public void paintArrow(double xStart, double yStart, double xEnd, double yEnd, GraphicsContext graphicsContext) {
        paintLine(xStart, yStart, xEnd, yEnd, graphicsContext);
        paintHead(xStart, yStart, xEnd, yEnd, graphicsContext);
    }

}
