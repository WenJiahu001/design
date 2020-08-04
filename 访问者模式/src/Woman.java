/**
 * @author WJH
 * @date 2020/8/4
 */
public class Woman extends Person {
    public Woman(String name) {
        this.setName(name);
    }

    @Override
    public void getConclusion(Action action) {
        action.execute(this);
    }
}
