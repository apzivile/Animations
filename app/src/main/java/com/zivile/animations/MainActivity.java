package com.zivile.animations;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView jake;
//    ImageView finn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jake = findViewById(R.id.jake);
        jake.setScaleX(0.5f);
        jake.setScaleY(0.5f);
        jake.setAlpha(0.5f);
        jake.setRotation(180f);
//        jake.setTranslationX(-1000);
//        finn = findViewById(R.id.finn);
    }

    public void fade(View view) {
//        if (jake.getAlpha() == 1) {
        jake.animate()
                .rotation(-360f)
                .scaleX(1f)
                .scaleY(1f)
                .alpha(1f)
                .setDuration(3000);
//            finn.animate().alpha(1f).setDuration(3000);
//        }else{
//            finn.animate().alpha(0f).setDuration(3000);
//            jake.animate().alpha(1f).setDuration(3000);
//        }

    }

//    public void fade2(View view) {
//        finn.animate().alpha(0f).setDuration(3000);
//        jake.animate().alpha(1f).setDuration(3000);
//    }
}
