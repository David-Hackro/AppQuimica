package pue.mtz.pau.appquimica.Views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import pue.mtz.pau.appquimica.R;
import pue.mtz.pau.appquimica.Views.MainActivityImpl;

public class SplashImpl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        startActivity(new Intent(this, MainActivityImpl.class));
    }
}
