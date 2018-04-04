package inc.droidflick.mvplearningtutorial.model;

/**
 * Created by Atif Arif on 4/4/2018.
 */

public class Message implements MessageInterface {


    private String message = "";

    public Message() {
        this.message = "";
    }


    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
