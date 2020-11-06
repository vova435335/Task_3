package sample.graphics.arrows;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class ArrowLine {

    Color color = Color.BLACK;

    public abstract void paint(double xStart, double yStart, double xEnd, double yEnd, GraphicsContext graphicsContext);
}
