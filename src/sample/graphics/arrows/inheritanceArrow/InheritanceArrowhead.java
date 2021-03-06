package sample.graphics.arrows.inheritanceArrow;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import sample.graphics.arrows.Arrowhead;

class InheritanceArrowhead extends Arrowhead {

    @Override
    public void paint(double xStart, double yStart, double xEnd, double yEnd, GraphicsContext graphicsContext) {
        double angle = Math.atan2((yEnd - yStart), (xEnd - xStart)) - Math.PI / 2.0;
        double sin = Math.sin(angle);
        double cos = Math.cos(angle);

        double x1 = (-1.0 / 2.0 * cos + Math.sqrt(3) / 2 * sin) * 18 + xEnd;
        double y1 = (-1.0 / 2.0 * sin - Math.sqrt(3) / 2 * cos) * 18 + yEnd;

        double x2 = (1.0 / 2.0 * cos + Math.sqrt(3) / 2 * sin) * 18 + xEnd;
        double y2 = (1.0 / 2.0 * sin - Math.sqrt(3) / 2 * cos) * 18 + yEnd;


        graphicsContext.beginPath();
        graphicsContext.setFill(Color.WHITE);

        graphicsContext.moveTo(xEnd, yEnd);
        graphicsContext.lineTo(x1, y1);
        graphicsContext.lineTo(x2, y2);

        graphicsContext.closePath();

        graphicsContext.fill();
        graphicsContext.stroke();
    }
}
