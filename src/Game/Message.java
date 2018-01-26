package Game;

/**
 * Created by Benjamin Laprise on 2018-01-25.
 */
public class Message {
    private String text;
    private String type;


    public Message(String type, String text) {
        this.type = type;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
