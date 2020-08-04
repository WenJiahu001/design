/**
 * @author WJH
 * @date 2020/8/4
 */
public class Main {
    public static void main(String[] args) {
        Person p = new Woman("小兰");
        Action a=new EatAction();
        p.getConclusion(a);
    }
}
