package org.roman.p0081viewbyid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View myTextView = findViewById(R.id.myText);
        TextView textView = (TextView)myTextView;
        textView.setText("Если View подчеркнуто красным, то скорей всего этот класс не добавлен в " +
                "секцию import. Нажмите CTRL+SHIFT+O для автоматического обновления импорта.");

        Button button = (Button) findViewById(R.id.myBtn);
        button.setText("Some button");


        CheckBox myChb = (CheckBox) findViewById(R.id.myChb);
        myChb.setChecked(true);
    }
}
