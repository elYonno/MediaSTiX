package hack.case3.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private Button btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnLogin = findViewById(R.id.btnLogin);
    }

    public void onBtnLogin_Clicked(View caller) {
        Toast.makeText(getApplicationContext(), "Log in successful!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Overview.class);
        startActivity(intent);
    }
}