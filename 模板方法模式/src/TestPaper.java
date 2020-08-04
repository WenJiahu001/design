/**
 * @author WJH
 * @date 2020/8/4
 */
public abstract class TestPaper {
    protected void test1() {
        System.out.println("中国有几个省？");
        System.out.println("A.34个 B.33个 C.32个 D.31个");
        System.out.println("答案：" + anwser1());
    }

    abstract String anwser1();

    protected void test2() {
        System.out.println("软考每年有几次考试机会？");
        System.out.println("A.1次 B.2次 C.3次 D.4次");
        System.out.println("答案：" + anwser2());
    }

    abstract String anwser2();

    abstract String title();


    public void show() {
        System.out.println(title());
        test1();
        test2();
        System.out.println("");
    }
}
