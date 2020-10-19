package factory;

import product.*;

/**
 * @author WJH
 * @date 2020/10/13
 */
public class FactoryB implements Factory {
    @Override
    public Chair createChair() {
        return new ChairB();
    }

    @Override
    public Sofa createSofa() {
        return new SofaB();
    }
}
