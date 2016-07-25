package gg.patrickcummins.independentpracticereposharingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView mListView;
    ArrayList actorList;
    CustomApadter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setViews();
        populateList();
        myAdapter = new CustomApadter(actorList, MainActivity.this);

        mListView.setAdapter(myAdapter);
    }

    private void populateList() {
        actorList.add(new Actor("Leonardo Dicaprio", "November 11, 1974", 1));
        actorList.add(new Actor("Matt Damon", "October 8, 1970", 1));
        actorList.add(new Actor("Jennifer Lawrence", "August 15, 1990", 1));
        actorList.add(new Actor("Leonardo Dicaprio", "November 11, 1974", 1));
        actorList.add(new Actor("Matt Damon", "October 8, 1970", 1));
        actorList.add(new Actor("Jennifer Lawrence", "August 15, 1990", 1));
    }

    private void setViews() {
        mListView = (ListView) findViewById(R.id.listviewlay);
    }
}
