package hack.case3.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Accounts extends AppCompatActivity {
    private Button btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accounts);
        btnReturn = findViewById(R.id.btnReturnAccounts);
    }

    public void onBtnReturn_Clicked(View caller) {
        startActivity(new Intent(this, Overview.class));
    }

    public void onYouTube_Clicked(View caller) {
        Intent intent = new Intent(this, Posts.class);
        intent.putExtra("Origin", "Accounts");
        intent.putExtra("Platform", "YouTube");
        startActivity(intent);
    }

    public void onTwitter_Clicked(View caller) {
        Intent intent = new Intent(this, Posts.class);
        intent.putExtra("Origin", "Accounts");
        intent.putExtra("Platform", "Twitter");
        startActivity(intent);
    }
}