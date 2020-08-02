public class Main {

    public static void main(String[] args) {

        Composite root=new Composite("北京公司总部");
        root.add(new Leaf("人力资源部"));
        root.add(new Leaf("财务部"));

        Composite sh=new Composite("上海华东分公司");
        sh.add(new Leaf("人力资源部"));
        sh.add(new Leaf("财务部"));

        Composite nj=new Composite("南京办事处");
        nj.add(new Leaf("人力资源部"));
        nj.add(new Leaf("财务部"));

        Composite hz=new Composite("杭州办事处");
        hz.add(new Leaf("人力资源部"));
        hz.add(new Leaf("财务部"));



        //把各个部分组合起来
        root.add(sh);

        sh.add(nj);
        sh.add(hz);

        root.display(1);

    }
}
