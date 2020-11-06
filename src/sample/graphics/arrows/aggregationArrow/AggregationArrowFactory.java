package sample.graphics.arrows.aggregationArrow;

import sample.graphics.arrows.ArrowFactory;
import sample.graphics.arrows.ArrowLine;
import sample.graphics.arrows.Arrowhead;

public class AggregationArrowFactory implements ArrowFactory {

    @Override
    public Arrowhead createArrowhead() {
        return new AggregationArrowhead();
    }

    @Override
    public ArrowLine createArrowLine() {
        return new AggregationArrowLine();
    }
}
