package sample.graphics.arrows.implementationArrow;

import sample.graphics.arrows.ArrowFactory;
import sample.graphics.arrows.ArrowLine;
import sample.graphics.arrows.Arrowhead;

public class ImplementationArrowFactory implements ArrowFactory {

    @Override
    public Arrowhead createArrowhead() {
        return new ImplementationArrowhead();
    }

    @Override
    public ArrowLine createArrowLine() {
        return new ImplementationArrowLine();
    }
}
