package onesignal.test.com.unittestproject;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Date;
import java.util.concurrent.ExecutorService;

import javax.inject.Inject;
import javax.inject.Named;
//https://proandroiddev.com/how-to-dagger-2-with-android-part-1-18b5b941453f
public class MainActivity extends AppCompatActivity {
    @Inject MyExample mMyExample;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        TextView dateTextView = findViewById(R.id.tvDate);
        ((MyApplication) getApplication())
                .getMyComponent()
                .inject(MainActivity.this);
        dateTextView.setText((new Date(mMyExample.getDate())).toString());
    }

}
