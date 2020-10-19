package demo2;

/**
 * @author WJH
 * @date 2020/10/19
 */
public class Main {
    public static void main(String[] args) {
        IMessageSender sender = new MessageEmail();
        AbstractMessage message = new CommonMessage(sender);
        message.sendMessage();
    }
}
