package sample.graphics.arrows.dependenceArrow;

import sample.graphics.arrows.ArrowFactory;
import sample.graphics.arrows.ArrowLine;
import sample.graphics.arrows.Arrowhead;

public class DependenceArrowFactory implements ArrowFactory {

    @Override
    public Arrowhead createArrowhead() {
        return new DependenceArrowhead();
    }

    @Override
    public ArrowLine createArrowLine() {
        return new DependenceArrowLine();
    }
}
