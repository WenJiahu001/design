public class Main {

    public static void main(String[] args) {
        HandSetBrand a=new HandSetBrandA();
        HandSetSoft as=new HandSetGame();
        a.setSoft(as);
        a.run();
    }
}
