package hack.case3.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class StatsMainActivity extends AppCompatActivity {
    ArrayList<String> platforms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats_main);

        ListView platformlist =(ListView)findViewById(R.id.listvw);

        platforms = new ArrayList<String>();
        getPlatforms();
        // Create The Adapter with passing ArrayList as 3rd parameter
        ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<String>(StatsMainActivity.this,android.R.layout.simple_list_item_1,
                        platforms);


        // Set The Adapter
        platformlist.setAdapter(arrayAdapter);
        // register onClickListener to handle click events on each item
//        platformlist.setOnItemClickListener(new AdapterView.OnItemClickListener()
//        {
//            // argument position gives the index of item which is clicked
//            public void onItemClick(AdapterView<?> arg0, View v, int position, long arg3)
//            {
//                String selectedmovie=platforms.get(position);
//                Toast.makeText(getApplicationContext(), "Platform Selected : "+selectedmovie,   Toast.LENGTH_LONG).show();
//            }
//        });
        platformlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(StatsMainActivity.this, StatsActivity.class);
                intent.putExtra("Platform:", platformlist.getItemAtPosition(position).toString());
                startActivity(intent);
            }
        });
    }

    public void onButtonBack_Clicked(View view) {
        startActivity(new Intent(this, Overview.class));
    }

    private void getPlatforms() {

        platforms.add("YOUTUBE");
        platforms.add("INSTAGRAM");
        platforms.add("FACEBOOK");
        platforms.add("TIKTOK");
        platforms.add("SNAPCHAT");


    }
}