package com.example.menuemp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

    }
    public void button_about_us(View view) {

        Intent intent = new Intent(this,AboutUs.class);
        startActivity(intent);
    }
    public void button_our_products(View view){

        Intent intent = new Intent(this,OurProducts.class);
        startActivity(intent);
    }
    public void products(View view){
        Intent intent  = new Intent(this,ProductActivity.class);
        startActivity(intent);
    }
    public void perfil(View view){
        Intent intent = new Intent(this, TelaPrincipal.class);
        startActivity(intent);
    }
}