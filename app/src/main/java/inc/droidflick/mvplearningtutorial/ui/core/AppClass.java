package inc.droidflick.mvplearningtutorial.ui.core;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;

import inc.droidflick.mvplearningtutorial.accessors.Accessors;

/**
 * Created by Atif Arif on 4/4/2018.
 */

public class AppClass extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        Accessors.getInstance();

    }
}
