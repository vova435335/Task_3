package sample.graphics.arrows.compositionArrow;

import sample.graphics.arrows.ArrowFactory;
import sample.graphics.arrows.ArrowLine;
import sample.graphics.arrows.Arrowhead;

public class CompositionArrowFactory implements ArrowFactory {

    @Override
    public Arrowhead createArrowhead() {
        return new CompositionArrowhead();
    }

    @Override
    public ArrowLine createArrowLine() {
        return new CompositionArrowLine();
    }
}
