package com.example.adg_task1;

import androidx.appcompat.app.AppCompatActivity;
import com.squareup.picasso.Picasso;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    private ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewFlipper = findViewById(R.id.view_flipper);

        ImageView imageView=findViewById(R.id.imageView);
        String url="https://i.pinimg.com/originals/d0/63/1e/d0631e3f92c15e0d514970f3a7ab3b38.jpg";

        Picasso.get().load(url).into(imageView);

        ImageView imageView2=findViewById(R.id.imageView2);
        String url2="https://i.pinimg.com/originals/a4/89/b8/a489b87aeed18a1dd8d742465aaf2326.jpg";

        Picasso.get().load(url2).into(imageView2);

        ImageView imageView3=findViewById(R.id.imageView3);
        String url3="https://www.ecopetit.cat/wpic/mpic/45-454542_zoro-one-piece-art.jpg";

        Picasso.get().load(url3).into(imageView3);

        ImageView imageView4=findViewById(R.id.imageView4);
        String url4="https://www.writeups.org/wp-content/uploads/Ichigo-Kurosaki-Bleach-Shonen-Jump-c.jpg";

        Picasso.get( ).load(url4).into(imageView4);
    }
    public void previousView(View v){
        viewFlipper.setInAnimation(this,R.anim.rotate_in);
        viewFlipper.setOutAnimation(this,R.anim.rotate_out);
        viewFlipper.showPrevious();

    }

    public void nextView(View v){

        viewFlipper.setInAnimation(this,R.anim.fade_in);
        viewFlipper.setOutAnimation(this,R.anim.fade_out);
        viewFlipper.showNext();
    }
}
