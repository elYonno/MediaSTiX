package hack.case3.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class SinglePosts extends AppCompatActivity {

    private Button btnreturn;
    private String post;
    private ImageView imageView;
    private TextView title;
    private TextView caption;
    private TextView views;
    private TextView likes;
    private TextView dislikes;
    private ImageView score;
    private ImageView percentage;
    private FloatingActionButton star;
    private boolean pinned;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_posts);
        btnreturn = findViewById(R.id.btnSingleReturn);
        imageView = findViewById(R.id.imgvwSingleBanner);
        title = findViewById(R.id.lblSingleTitle);
        likes = findViewById(R.id.lblSingleLikes);
        dislikes = findViewById(R.id.lblSingleDislikes);
        caption = findViewById(R.id.lblSingleCaption);
        views = findViewById(R.id.lblSingleViews);
        score = findViewById(R.id.imgvwSingleScore);
        percentage = findViewById(R.id.imgvwSingleScore2);
        star = findViewById(R.id.btnSinglePin);
        pinned = false;

        post = (String) getIntent().getExtras().get("Post");
        changePictures();
    }

    private void changePictures() {
        if (post.equals("worst")) {
            imageView.setImageResource(R.drawable.images);
            score.setImageResource(R.drawable.lowscore);
            percentage.setImageResource(R.drawable.percentagelow);

            title.setText("Music");
            caption.setText("Zu is newly sober when she receives news that she is to become the sole guardian of her half-sister named Music, a young girl on the autism spectrum. The film explores two of Sia's favourite themes finding your voice and creating family.");
            views.setText("Views: 245,124");
            likes.setText("Likes: 1,123");
            dislikes.setText("Dislikes: 124,212");
        }
    }

    public void onButtonReturn_Clicked(View view) { startActivity(new Intent(this, Overview.class)); }

    public void onButtonPin_Clicked(View view) {
        if (pinned) {
            pinned = false;
            String uri = "@android:drawable/btn_star_big_off";
            int imageResource = getResources().getIdentifier(uri, null, getPackageName());
            Drawable res = getResources().getDrawable(imageResource);

            star.setImageDrawable(res);
        }
        else {
            pinned = true;
            String uri = "@android:drawable/btn_star_big_on";
            int imageResource = getResources().getIdentifier(uri, null, getPackageName());
            Drawable res = getResources().getDrawable(imageResource);

            star.setImageDrawable(res);
        }
    }
}