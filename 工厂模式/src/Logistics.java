/**
 * @author WJH
 * @date 2020/10/10
 * 注意该类的主要职责是运输，而不是创造运输方式
 */
public abstract class Logistics {
    abstract ITransport createTransport();
}
