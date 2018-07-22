package tutorial.demo.btes.com.biztechtutorialapp;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate");
    }

    public void buttonClicked(View v) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "onRestoreInstanceState");
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.i(TAG, "onSaveInstanceState");
    }

    /* public void buttonClicked(View v){
       TextView textViewResult = (TextView) findViewById(R.id.userBMI);
        EditText editTextHeight = (EditText) findViewById(R.id.userHeight);
        EditText editTextWeight = (EditText) findViewById(R.id.userWeight);
        double userHeight = Double.parseDouble(editTextHeight.getText().toString());
        double userWeight = Double.parseDouble(editTextWeight.getText().toString());
        double bmi = userWeight / (userHeight * userHeight);
        textViewResult.setText(Double.toString(bmi));
    }*/
}
