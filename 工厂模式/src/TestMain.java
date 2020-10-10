/**
 * @author WJH
 * @date 2020/10/10
 */
public class TestMain {
    public static void main(String[] args) {
        Logistics logistics = new RoadLogistics();//选择陆路运输工厂
        ITransport transport = logistics.createTransport();//工厂创建运输方案

        transport.deliver();//执行运输
    }
}
