package gg.patrickcummins.independentpracticereposharingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setViews();
        CustomApadter myAdapter;

        mListView.setAdapter();
    }

    private void setViews() {
        mListView = (ListView) findViewById(R.id.ListView);
    }
}
