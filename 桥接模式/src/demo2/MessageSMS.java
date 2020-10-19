package demo2;

/**
 * 以站内短消息的方式发送消息
 */
public class MessageSMS implements IMessageSender {
    public void send() {
        System.out.println("发送SMS");
    }
}
