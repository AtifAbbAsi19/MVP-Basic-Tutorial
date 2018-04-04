package inc.droidflick.mvplearningtutorial.accessors;

/**
 * Created by Atif Arif on 4/4/2018.
 */

public class Accessors {


    static Accessors instance = null;

    String name = "";


    public static Accessors getInstance() {

        if (instance == null) {
            instance = new Accessors();
        }

        return instance;

    }


    private Accessors() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
