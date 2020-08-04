/**
 * @author WJH
 * @date 2020/8/4
 */
public abstract class Person {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void getConclusion(Action action);

}
