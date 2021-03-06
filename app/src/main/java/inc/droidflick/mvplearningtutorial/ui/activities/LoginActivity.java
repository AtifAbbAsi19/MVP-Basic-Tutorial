package inc.droidflick.mvplearningtutorial.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import inc.droidflick.mvplearningtutorial.R;
import inc.droidflick.mvplearningtutorial.accessors.Accessors;
import inc.droidflick.mvplearningtutorial.presentor.authentication.LoginPresenter;
import inc.droidflick.mvplearningtutorial.presentor.authentication.LoginPresenterImplementation;
import inc.droidflick.mvplearningtutorial.ui.core.BaseActivity;
import inc.droidflick.mvplearningtutorial.ui.view.LoginView;

public class LoginActivity extends BaseActivity implements LoginView, View.OnClickListener {


    EditText email, password, signUpName;

    Button login, signup;


    LoginPresenter loginPresenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        loginPresenter = new LoginPresenterImplementation(LoginActivity.this);


    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    public void init() {

        signUpName = (EditText) findViewById(R.id.signUpName);
        email = (EditText) findViewById(R.id.signUpEmail);
        password = (EditText) findViewById(R.id.signUpPassword);
        login = (Button) findViewById(R.id.loginButton);
        signup = (Button) findViewById(R.id.signupButton);
        login.setOnClickListener(this);
        signup.setOnClickListener(this);
    }


    @Override
    public void initListener() {

    }

    @Override
    public void loginValidation() {

        email.setError("Invalid Value");
        password.setError("Invalid Value");
        signUpName.setError("Invalid Value");

    }

    @Override
    public void loginSuccess() {

        if (!TextUtils.isEmpty(signUpName.getText().toString())) {
            Accessors.getInstance().setName(signUpName.getText().toString());
        }


        startActivity(new Intent(this, MainActivity.class));
    }

    @Override
    public void loginError() {
        Toast.makeText(this, "Unable to Login", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.signupButton:
                signup();
                break;
            case R.id.loginButton:
                login();
                break;

        }

    }

    private void login() {


        String emailText = email.getText().toString();
        String passwordText = password.getText().toString();

        loginPresenter.performLogin(emailText, passwordText);


    }

    private void signup() {
    }
}
