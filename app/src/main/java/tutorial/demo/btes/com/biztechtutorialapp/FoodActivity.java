package tutorial.demo.btes.com.biztechtutorialapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodActivity extends AppCompatActivity {

    public static final String EXTRA_FOODNO = "foodno";
    private static final String TAG = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "onCreate & in FoodActivity");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        int foodno = (Integer) getIntent().getExtras().get(EXTRA_FOODNO);
        Food food = Food.foods[foodno];
        TextView name = (TextView) findViewById(R.id.name);
        TextView desc = (TextView) findViewById(R.id.desc);
        ImageView imageView = (ImageView) findViewById(R.id.foodImage);
        name.setText(food.getName());
        desc.setText(food.getDescription());
        imageView.setImageResource(food.getImageID());
    }
}
