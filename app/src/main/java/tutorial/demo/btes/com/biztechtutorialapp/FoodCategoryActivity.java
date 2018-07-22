package tutorial.demo.btes.com.biztechtutorialapp;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FoodCategoryActivity extends ListActivity {
    private static final String TAG = "message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listFoods = getListView();
        ArrayAdapter<Food> listAdapter = new ArrayAdapter<Food>(this, android.R.layout.simple_list_item_1,Food.foods);
        listFoods.setAdapter(listAdapter);
    }


    @Override
    protected void onListItemClick(ListView listView, View itemview, int position, long id) {
        Log.i(TAG, "onListItemClick & in FoodCategoryActivity");
        super.onListItemClick(listView, itemview, position, id);
        Intent intent = new Intent(FoodCategoryActivity.this, FoodActivity.class);
        intent.putExtra(FoodActivity.EXTRA_FOODNO,  position);
        Log.i(TAG, "FoodCategoryActivity:: I have dropped the position");
        startActivity(intent);
    }
}
