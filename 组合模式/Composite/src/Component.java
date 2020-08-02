/**
 * ClassName:Component
 * Package:${PACKAGE}
 *
 * @Date:2020/2/16 10:28
 * @Author:WenJiahu
 */
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void add(Component c);

    public abstract void remove(Component c);

    public abstract void display(int depth);
}
