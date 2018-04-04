package inc.droidflick.mvplearningtutorial.presentor.authentication;

/**
 * Created by Atif Arif on 4/4/2018.
 */

public interface LoginPresenter {

    void performLogin(String email, String password);

    void performSignup(String email, String password);


}
