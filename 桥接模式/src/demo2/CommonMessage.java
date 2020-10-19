package demo2;

public class CommonMessage extends AbstractMessage {
    public CommonMessage(IMessageSender impl) {
        super(impl);
    }

    @Override
    public void sendMessage() {
        System.out.print("【普通】");
        super.sendMessage();
    }

}