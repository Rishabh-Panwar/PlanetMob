package com.example.rishabh.planetmob;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Article_Dynamic extends AppCompatActivity {
    private Bundle extras;
    private TextView article;

    public void buttonClick1(View view) {
        Intent myIntent = new Intent(Article_Dynamic.this, Home.class);
        Article_Dynamic.this.startActivity(myIntent);
    }

    public void buttonClick6(View view) {
        Intent myIntent = new Intent(Article_Dynamic.this, Notifications.class);
        Article_Dynamic.this.startActivity(myIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article__dynamic);

        ImageView imageView = (ImageView) findViewById(R.id.change);
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            }
        });
        extras = getIntent().getExtras();
        article = findViewById(R.id.art1);
        switch (extras.getInt("article")){
            case 1:
                article.setText(getResources().getString(R.string.article1));
                imageView.setImageResource(R.drawable.article_1);
                break;
            case 2:
                article.setText(getResources().getString(R.string.article2));
                imageView.setImageResource(R.drawable.article_2);
                break;
            case 3:
                article.setText(getResources().getString(R.string.article3));
                imageView.setImageResource(R.drawable.article_3);
                break;
            case 4:
                article.setText(getResources().getString(R.string.article4));
                imageView.setImageResource(R.drawable.article_4);
                break;
            case 5:
                article.setText(getResources().getString(R.string.article5));
                imageView.setImageResource(R.drawable.article_5);
                break;

        }

    }
}
