package inc.droidflick.mvplearningtutorial.presentor.authentication;

import android.text.TextUtils;

import inc.droidflick.mvplearningtutorial.ui.view.LoginView;

/**
 * Created by Atif Arif on 4/4/2018.
 */

public class LoginPresenterImplementation implements LoginPresenter {


    LoginView loginView;

    public LoginPresenterImplementation(LoginView loginView) {
        this.loginView = loginView;
    }


    @Override
    public void performLogin(String email, String password) {

        if (TextUtils.isEmpty(email) || TextUtils.isEmpty(password)) {
            loginView.loginValidation();
        } else if (email.equalsIgnoreCase("testing@gmail.com") && password.equals("test123")) {
            loginView.loginSuccess();
        } else {
            loginView.loginError();
        }

    }

    @Override
    public void performSignup(String name, String email, String password) {


        if (TextUtils.isEmpty(name) || TextUtils.isEmpty(email) || TextUtils.isEmpty(password)) {
            loginView.loginValidation();
        } else {
            loginView.loginError();
        }


    }
}
