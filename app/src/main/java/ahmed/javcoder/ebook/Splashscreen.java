package ahmed.javcoder.ebook;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class Splashscreen extends AppCompatActivity implements Animation.AnimationListener {

    private ImageView imageViewSplash ;
    private TextView textViewSplash ;
    private Animation animation ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        imageViewSplash = findViewById(R.id.splashImage_ID) ;
        textViewSplash = findViewById(R.id.textSplash_ID) ;

        animation = AnimationUtils.loadAnimation(getApplicationContext() , R.anim.translate) ;
        animation.setAnimationListener(this);
        imageViewSplash.setVisibility(View.VISIBLE);
        textViewSplash.setVisibility(View.VISIBLE);
        imageViewSplash.startAnimation(animation);
        textViewSplash.startAnimation(animation);

        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext() , MainActivity.class));
                finish();
            }
        };

        new Timer().schedule(timerTask , 4000);




    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }

}
