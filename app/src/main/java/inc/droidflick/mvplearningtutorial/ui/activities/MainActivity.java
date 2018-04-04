package inc.droidflick.mvplearningtutorial.ui.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import inc.droidflick.mvplearningtutorial.R;
import inc.droidflick.mvplearningtutorial.ui.core.BaseActivity;

public class MainActivity extends BaseActivity {

    //https://www.youtube.com/watch?v=_oz6Jni8gH4

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
