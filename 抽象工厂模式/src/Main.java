import factory.Factory;
import factory.FactoryA;
import product.Chair;
import product.Sofa;

/**
 * @author WJH
 * @date 2020/10/13
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new FactoryA();
        Chair chair = factory.createChair();
        Sofa sofa = factory.createSofa();
        chair.sitOn();
        sofa.exe();
    }
}
