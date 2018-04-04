package inc.droidflick.mvplearningtutorial.ui.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import inc.droidflick.mvplearningtutorial.R;
import inc.droidflick.mvplearningtutorial.accessors.Accessors;
import inc.droidflick.mvplearningtutorial.ui.core.BaseActivity;

public class MainActivity extends BaseActivity {

    //https://www.youtube.com/watch?v=_oz6Jni8gH4

    TextView displayTextView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        displayTextView.setText("Welcome \n" + Accessors.getInstance().getName());


    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void init() {
        displayTextView = findViewById(R.id.display);
    }

    @Override
    public void initListener() {

    }
}
