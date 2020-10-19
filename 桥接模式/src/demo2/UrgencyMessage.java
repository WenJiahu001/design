package demo2;

public class UrgencyMessage extends AbstractMessage {
    public UrgencyMessage(IMessageSender impl) {
        super(impl);
    }

    public void sendMessage() {
        System.out.print("【加急】");
        super.sendMessage();
    }

}