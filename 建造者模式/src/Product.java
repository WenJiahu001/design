import java.util.ArrayList;
import java.util.List;

/**
 * @author WJH
 * @date 2020/8/4
 */
public class Product {

    private List<String> product;

    public Product() {
        this.product = new ArrayList<>();
    }

    public void add(String part) {
        product.add(part);
    }

    public void show() {
        for (String s : product) {
            System.out.println(s);
        }
    }
}
