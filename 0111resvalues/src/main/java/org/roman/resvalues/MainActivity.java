package org.roman.resvalues;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvTop;
    TextView tvBottom;
    Button topButton;
    Button bottomButton;
    Button buttonClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        tvTop = (TextView)findViewById(R.id.tvTop);
        tvBottom = (TextView) findViewById(R.id.tvBottom);

        topButton = (Button) findViewById(R.id.btnTop);
        bottomButton  = (Button) findViewById(R.id.btnBottom);
        buttonClear = (Button) findViewById(R.id.buttonClear);

        topButton.setBackgroundResource(R.color.llBottomColor);

        View.OnClickListener oclBtn = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btnTop:
                        tvTop.setText("Нажата " + getString(R.string.btnTopText));
                        makeToast("Нажата " + getString(R.string.btnTopText));
                        break;
                    case R.id.btnBottom:
                        tvBottom.setText("Нажата " + getString(R.string.btnBottomText));
                        makeToast("Нажата " + getString(R.string.btnBottomText));
                        break;
                    case R.id.buttonClear:
                        tvBottom.setText(getString(R.string.tvBottomText));
                        tvTop.setText(getString(R.string.tvTopText));
                        makeToast("Очистка...");
                        break;

                }
            }
        };

        topButton.setOnClickListener(oclBtn);
        bottomButton.setOnClickListener(oclBtn);
        buttonClear.setOnClickListener(oclBtn);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void makeToast(String message){
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}
