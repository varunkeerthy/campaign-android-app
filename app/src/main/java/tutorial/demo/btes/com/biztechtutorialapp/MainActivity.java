package tutorial.demo.btes.com.biztechtutorialapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClicked(View v){
        /*TextView textViewResult = (TextView) findViewById(R.id.userBMI);
        EditText editTextHeight = (EditText) findViewById(R.id.userHeight);
        EditText editTextWeight = (EditText) findViewById(R.id.userWeight);
        double userHeight = Double.parseDouble(editTextHeight.getText().toString());
        double userWeight = Double.parseDouble(editTextWeight.getText().toString());
        double bmi = userWeight / (userHeight * userHeight);
        textViewResult.setText(Double.toString(bmi));*/
    }
}
