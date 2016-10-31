package com.example.siddharth.christmas;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Csethreeonein extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csethreeonein);
        final Toolbar toolbar = (Toolbar)findViewById(R.id.Mytool);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout)findViewById(R.id.collapsebar);



        Context context = this;
        collapsingToolbarLayout.setContentScrimColor(ContextCompat.getColor(context, R.color.colorAccent));

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Use Apps and Save Papers", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        ListView view_of_list = (ListView) findViewById(R.id.listview);
        ArrayAdapter<String> adapter_of_titles = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);

        for (Csethreeonein_List enum_of_csethreeonein : Csethreeonein_List.values()) {
            adapter_of_titles.add(getString(enum_of_csethreeonein.title));
        }

        view_of_list.setAdapter(adapter_of_titles);


        view_of_list.setOnItemClickListener(this);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item_option1:
                Toast.makeText(getApplicationContext(), item.toString(), Toast.LENGTH_LONG).show();
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Csethreeonein_List item_of_list = Csethreeonein_List.values()[position];
        switch (item_of_list) {
            case choice_65:
                Intent intent_sai1 = new Intent(Csethreeonein.this, sai1.class);
                startActivity(intent_sai1);
                break;
            case choice_66:
                Intent intent_sai2 = new Intent(Csethreeonein.this, sai2.class);
                startActivity(intent_sai2);
                break;

            case choice_67:
                Intent intent_sai3 = new Intent(Csethreeonein.this, sai3.class);
                startActivity(intent_sai3);
                break;
            case choice_68:
                Intent intent_sai4 = new Intent(Csethreeonein.this, sai4.class);
                startActivity(intent_sai4);
                break;
            case choice_69:
                Intent intent_sai5 = new Intent(Csethreeonein.this, sai5.class);
                startActivity(intent_sai5);
                break;
            case choice_70:
                Intent intent_sai6 = new Intent(Csethreeonein.this, sai6.class);
                startActivity(intent_sai6);
                break;
            case choice_71:
                Intent intent_sai7 = new Intent(Csethreeonein.this, sai7.class);
                startActivity(intent_sai7);
                break;
            case choice_72:
                Intent intent_sai8 = new Intent(Csethreeonein.this, sai8.class);
                startActivity(intent_sai8);
                break;
            case choice_73:
                Intent intent_sai9 = new Intent(Csethreeonein.this, sai9.class);
                startActivity(intent_sai9);
                break;
        }
    }

}