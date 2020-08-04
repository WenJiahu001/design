/**
 * @author WJH
 * @date 2020/8/4
 */
public class Man extends Person {

    public Man(String name) {
        this.setName(name);
    }

    @Override
    public void getConclusion(Action action) {
        action.execute(this);
    }
}
