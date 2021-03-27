package hack.case3.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Posts extends AppCompatActivity {

    private String previous;
    private String platform;
    private TextView platformtext;
    private ImageButton btn1;
    private ImageButton btn2;
    private ImageButton btn3;
    private ImageButton btn4;
    private ImageButton btn5;
    private ImageButton btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posts);
        previous = getIntent().getExtras().getString("Origin");
        platform = getIntent().getExtras().getString("Platform");

        btn1 = findViewById(R.id.btnPosts1);
        btn2 = findViewById(R.id.btnPosts2);
        btn3 = findViewById(R.id.btnPosts3);
        btn4 = findViewById(R.id.btnPosts4);
        btn5 = findViewById(R.id.btnPosts5);
        btn6 = findViewById(R.id.btnPosts6);
        platformtext = findViewById(R.id.lblPostsPlatform);

        setButtons();
    }

    public void onButtonReturn_Clicked(View view) {
        switch (previous) {
            case "Accounts":
                startActivity(new Intent(this, Accounts.class));
                break;
            case "Overview":
                startActivity(new Intent(this, Overview.class));
                break;
        }
    }

    private void setButtons() {
        switch (platform) {
            case "YouTube":
                platformtext.setText("Platform: YouTube");
                btn1.setImageResource(R.drawable.youtubetile1);
                btn2.setImageResource(R.drawable.youtubetile2);
                btn3.setImageResource(R.drawable.youtubetile3);
                btn4.setImageResource(R.drawable.youtubetile4);
                btn5.setImageResource(R.drawable.youtubetile5);
                btn6.setImageResource(R.drawable.youtubetile6);
                break;
            case "Twitter":
                platformtext.setText("Platform: Twitter");
                btn1.setImageResource(R.drawable.twittertile1);
                btn2.setImageResource(R.drawable.twittertile2);
                btn3.setImageResource(R.drawable.twittertile3);
                btn4.setImageResource(R.drawable.twittertile4);
                btn5.setImageResource(R.drawable.twittertile5);
                btn6.setImageResource(R.drawable.twittertile6);
                break;
            case "None":
                platformtext.setText("Platform: All");
                btn1.setImageResource(R.drawable.youtubetile1);
                btn2.setImageResource(R.drawable.twittertile2);
                btn3.setImageResource(R.drawable.twittertile3);
                btn4.setImageResource(R.drawable.youtubetile3);
                btn5.setImageResource(R.drawable.twittertile5);
                btn6.setImageResource(R.drawable.youtubetile6);
                break;
        }
    }

    public void btnAdd_Onclick(View view) { startActivity(new Intent(this, NewPost.class)); }

    public void btnSearch_OnClick(View view) {
        startActivity(new Intent(this, filter.class));
    }
}