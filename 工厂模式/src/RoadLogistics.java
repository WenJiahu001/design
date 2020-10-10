/**
 * @author WJH
 * @date 2020/10/10
 */
public class RoadLogistics extends Logistics {

    @Override
    ITransport createTransport() {
        return new Truck();
    }
}
