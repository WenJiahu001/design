/**
 * @author WJH
 * @date 2020/8/4
 */
public class ConcreteBuilder1 extends Builder {
    private Product product = new Product();

    @Override
    Builder buildA() {
        product.add("部件a");
        return this;
    }

    @Override
    Builder buildB() {
        product.add("部件b");
        return this;
    }

    @Override
    Product getProduct() {
        return product;
    }
}
