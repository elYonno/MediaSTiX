package hack.case3.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Overview extends AppCompatActivity {
    private Button btnAccounts;
    private Button btnStats;
    private Button btnPosts;
    private FloatingActionButton btnAdd;
    private ImageView banner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview);

        btnAccounts = findViewById(R.id.btnAccounts);
        btnPosts = findViewById(R.id.btnPosts);
        btnStats = findViewById(R.id.btnStats);
        btnAdd = findViewById(R.id.fabUpload);
        banner = findViewById(R.id.imgvwHighBanner);
    }

    public void btnAccounts_OnClick(View view) {
        startActivity(new Intent(this, Accounts.class));
    }

    public void btnAdd_Onclick(View view) { startActivity(new Intent(this, NewPost.class)); }

    public void btnPosts_OnClick(View view) {
        Intent intent = new Intent(this, Posts.class);
        intent.putExtra("Origin", "Overview");
        intent.putExtra("Platform", "None");
        startActivity(intent);
    }

    public void imgHighBanner_OnClick(View view) {
        Intent intent = new Intent(this, SinglePosts.class);
        intent.putExtra("Post", "best");
        startActivity(intent);
    }

    public void imgLowBanner_OnClick(View view) {
        Intent intent = new Intent(this, SinglePosts.class);
        intent.putExtra("Post", "worst");
        startActivity(intent);
    }

    public void btnStats_OnClick(View view) {
        Intent intent = new Intent(this, StatsMainActivity.class);
        startActivity(intent);
    }

    public void btnPremium_OnClick(View view) {
        startActivity(new Intent(this, premium.class));
    }
}