/**
 * @author WJH
 * @date 2020/8/4
 */
public class Main {
    public static void main(String[] args) {
        TestPaper testPaper1=new ConcretePaper1();//学生1的试卷
        testPaper1.show();

        TestPaper testPaper2=new ConcretePaper2();//学生2的试卷
        testPaper2.show();
    }
}
