import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ClassName:Composite
 * Package:${PACKAGE}
 *
 * @Date:2020/2/16 10:36
 * @Author:WenJiahu
 */
public class Composite extends Component {

    private List<Component> child = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        child.add(c);
    }

    @Override
    public void remove(Component c) {
        child.remove(c);
    }

    @Override
    public void display(int depth) {
        String s = "";
        for (int i = 0; i < depth; i++) {
            s += "-";
        }

        System.out.println((s + name));
        for (Component component : this.child) {
            component.display(depth + 2);
        }


    }
}
