package sample.graphics.arrows;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Arrowhead {

    protected Color color = Color.BLACK;

    public abstract void paint(double xStart, double yStart, double xEnd, double yEnd, GraphicsContext graphicsContext);
}
