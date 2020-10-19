package demo2;

/**
 * 抽象的消息对象
 */
public abstract class AbstractMessage {
    /**
     * 持有一个实现部分的对象
     */
    private IMessageSender impl;

    /**
     * 构造方法，传入实现部分的对象
     *
     * @param impl 实现部分的对象
     */
    public AbstractMessage(IMessageSender impl) {
        this.impl = impl;

    }

    public void sendMessage() {
        this.impl.send();
    }
}