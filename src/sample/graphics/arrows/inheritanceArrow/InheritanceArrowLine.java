package sample.graphics.arrows.inheritanceArrow;

import javafx.scene.canvas.GraphicsContext;
import sample.graphics.arrows.ArrowLine;

class InheritanceArrowLine extends ArrowLine {

    @Override
    public void paint(double xStart, double yStart, double xEnd, double yEnd, GraphicsContext graphicsContext) {
        graphicsContext.beginPath();
        graphicsContext.setStroke(color);
        graphicsContext.setLineWidth(2);
        graphicsContext.moveTo(xStart, yStart);
        graphicsContext.lineTo(xEnd, yEnd);
        graphicsContext.stroke();
    }
}
