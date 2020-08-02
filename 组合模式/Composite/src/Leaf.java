/**
 * ClassName:Leaf
 * Package:${PACKAGE}
 *
 * @Date:2020/2/16 10:31
 * @Author:WenJiahu
 */
public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        System.out.println("不能给树叶加子节点");
    }

    @Override
    public void remove(Component c) {
        System.out.println("树叶没有子节点，不能移除");
    }

    @Override
    public void display(int depth) {
        String s = "";
        for (int i = 0; i < depth; i++) {
            s += "-";
        }
        System.out.println((s+ name));
    }
}
