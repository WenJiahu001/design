/**
 * @author WJH
 * @date 2020/8/4
 */
public class EatAction extends Action {
    @Override
    public void getManConclusion(Man man) {
        System.out.println("吃饭快");
    }

    @Override
    public void getWomanConclusion(Woman woman) {
        System.out.println("吃饭慢");
    }
}
