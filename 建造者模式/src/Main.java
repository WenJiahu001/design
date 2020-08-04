/**
 * @author WJH
 * @date 2020/8/4
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        ConcreteBuilder1 builder1 = new ConcreteBuilder1();

        director.Construct(builder1);//建造过程交给了指挥者

        Product product = builder1.getProduct();

        product.show();
    }
}
