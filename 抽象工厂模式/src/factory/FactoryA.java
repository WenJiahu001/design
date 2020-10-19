package factory;

import product.Chair;
import product.ChairA;
import product.Sofa;
import product.SofaA;

/**
 * @author WJH
 * @date 2020/10/13
 */
public class FactoryA implements Factory {
    @Override
    public Chair createChair() {
        return new ChairA();
    }

    @Override
    public Sofa createSofa() {
        return new SofaA();
    }
}
