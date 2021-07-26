import java.util.ArrayList;

public class MessagingService {

    private ArrayList<Message> messages = new ArrayList<>();

    public MessagingService() {

    }

    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            messages.add(message);
        }
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }
}
