package id.ac.poliban.dts.alfin.andriod_lat07;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //default title di action bar "Latihan07"
        //ubanh title di action bar
        if (getSupportActionBar()!= null) getSupportActionBar().setTitle("Main Activity");


        //Button Handler
        Button btExplicit =findViewById(R.id.btExplicit);
        Button btImplicit =findViewById(R.id.btImplicit);

        btExplicit.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        });

        btImplicit.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/IbnuAlfiannorFikri"));
            startActivity(intent);
        });
    }
}
