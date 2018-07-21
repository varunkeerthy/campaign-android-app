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
        TextView textView = (TextView) findViewById(R.id.message);
        EditText editText = (EditText) findViewById(R.id.inputMessage);
        String incomingMessage = editText.getText().toString();
        textView.setText(incomingMessage);
    }
}
