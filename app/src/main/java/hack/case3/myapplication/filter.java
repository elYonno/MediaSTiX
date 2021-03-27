package hack.case3.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

public class filter extends AppCompatActivity {
    private String platforms;
    private String sortby;
    private String orderby;
    private ImageButton tiktok;
    private ImageButton snapchat;
    private ImageButton faceboook;
    private ImageButton instagram;
    private ImageButton youtube;
    private ImageButton twitter;
    private TextView platform;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);

        tiktok = findViewById(R.id.imgbtnTikTok2);
        snapchat = findViewById(R.id.imgbtnSnapchat2);
        faceboook = findViewById(R.id.imgbtnFacebook2);
        instagram = findViewById(R.id.imgbtnInstagram2);
        youtube = findViewById(R.id.imgbtnYouTube2);
        twitter = findViewById(R.id.imgbtnTwitter2);
        platform = findViewById(R.id.lblFilterPlatform);
    }

    public void onCancel_Clicked(View view) {
        Intent intent = new Intent(this, Posts.class);
        intent.putExtra("Origin", "Overview");
        intent.putExtra("Platform", "None");
        startActivity(intent);
    }

    public void onTikTok_Clicked(View caller) {
        platform.setText("Platform: TikTok");
        platforms = "TikTok";
    }
    public void onSnapchat_Clicked(View caller) {
        platform.setText("Platform: Snapchat");
        platforms = "Snapchat";
    }
    public void onFacebook_Clicked(View caller) {
        platform.setText("Platform: Facebook");
        platforms = "Facebook";
    }
    public void onInstagram_Clicked(View caller) {
        platform.setText("Platform: Instagram");
        platforms = "Instagram";
    }
    public void onYouTube_Clicked(View caller) {
        platform.setText("Platform: YouTube");
        platforms = "YouTube";
    }
    public void onTwitter_Clicked(View caller) {
        platform.setText("Platform: Twitter");
        platforms = "Twitter";
    }

    public void onSearch_Clicked(View caller) {
        Intent intent = new Intent(this, Posts.class);
        intent.putExtra("Origin", "Overview");
        intent.putExtra("Platform", platforms);
        startActivity(intent);
    }
}