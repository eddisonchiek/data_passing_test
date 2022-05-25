package sg.edu.sg.c346.id21034014.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    TextView tvAnswer;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        //Step 2
        tvAnswer = findViewById(R.id.textView3);
        Intent intentReceived = getIntent();
        double chara = intentReceived.getDoubleExtra("value",99.99);
        tvAnswer.setText("Double value received: " + chara);
    }
}