package demo2;

/**
 * 以Email的方式发送消息
 */
public class MessageEmail implements IMessageSender {
    public void send() {
        System.out.println("发送Email");
    }
}