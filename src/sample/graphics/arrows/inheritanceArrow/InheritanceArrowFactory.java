package sample.graphics.arrows.inheritanceArrow;

import sample.graphics.arrows.ArrowFactory;
import sample.graphics.arrows.ArrowLine;
import sample.graphics.arrows.Arrowhead;

public class InheritanceArrowFactory implements ArrowFactory {

    @Override
    public Arrowhead createArrowhead() {
        return new InheritanceArrowhead();
    }

    @Override
    public ArrowLine createArrowLine() {
        return new InheritanceArrowLine();
    }
}
