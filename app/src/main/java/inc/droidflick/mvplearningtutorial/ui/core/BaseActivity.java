package inc.droidflick.mvplearningtutorial.ui.core;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Atif Arif on 4/4/2018.
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
    }


    public abstract int getLayoutId();

    public abstract void init();

    public abstract void initListener();

    @Override
    protected void onStart() {
        getLayoutId();
        init();
        initListener();
        super.onStart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
