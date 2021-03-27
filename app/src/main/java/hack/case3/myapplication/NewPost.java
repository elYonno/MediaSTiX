package hack.case3.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class NewPost extends AppCompatActivity {
    private ImageButton tiktok;
    private ImageButton snapchat;
    private ImageButton faceboook;
    private ImageButton instagram;
    private ImageButton youtube;
    private ImageButton twitter;
    private Button cancel;
    private TextView platform;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_post);
        tiktok = findViewById(R.id.imgbtnTikTok2);
        snapchat = findViewById(R.id.imgbtnSnapchat2);
        faceboook = findViewById(R.id.imgbtnFacebook2);
        instagram = findViewById(R.id.imgbtnInstagram2);
        youtube = findViewById(R.id.imgbtnYouTube2);
        twitter = findViewById(R.id.imgbtnTwitter2);
        cancel = findViewById(R.id.btnAddCancel);
        platform = findViewById(R.id.lblPlatform);
    }

    public void onTikTok_Clicked(View caller) { platform.setText("TikTok"); }
    public void onSnapchat_Clicked(View caller) { platform.setText("Snapchat"); }
    public void onFacebook_Clicked(View caller) { platform.setText("Facebook"); }
    public void onInstagram_Clicked(View caller) { platform.setText("Instagram"); }
    public void onYouTube_Clicked(View caller) { platform.setText("YouTube"); }
    public void onTwitter_Clicked(View caller) { platform.setText("Twitter"); }
    public void onCancel_Clicked(View caller) { startActivity(new Intent(this, Overview.class)); }
}