package factory;

import product.Chair;
import product.Sofa;

/**
 * @author WJH
 * @date 2020/10/13
 */
public interface Factory {

    Chair createChair();

    Sofa createSofa();
}
