/**
 * @author WJH
 * @date 2020/8/4
 */
public class Main {
    public static void main(String[] args) {
        Person p = new Man("小明");
        Action a=new EatAction();

        p.getConclusion(a);
    }
}
