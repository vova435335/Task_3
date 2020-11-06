package sample.graphics.arrows.associationArrow;

import sample.graphics.arrows.ArrowFactory;
import sample.graphics.arrows.ArrowLine;
import sample.graphics.arrows.Arrowhead;

public class AssociationArrowFactory implements ArrowFactory {

    @Override
    public Arrowhead createArrowhead() {
        return new AssociationArrowhead();
    }

    @Override
    public ArrowLine createArrowLine() {
        return new AssociationArrowLine();
    }
}
