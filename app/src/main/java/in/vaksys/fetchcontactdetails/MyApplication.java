package in.vaksys.fetchcontactdetails;

import android.app.Application;

import com.github.tamir7.contacts.Contacts;

/**
 * Created by dell980 on 5/9/2016.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Contacts.initialize(this);
    }
}