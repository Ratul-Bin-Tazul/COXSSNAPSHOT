package com.coxsproject.coxssnapshot.coxssnapshot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CardView contactList,jrp,fourWs,maps,bcp,fundingStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactList = findViewById(R.id.contactListCard);
        jrp = findViewById(R.id.jrpCard);
        fourWs = findViewById(R.id.fourWsCard);
        maps = findViewById(R.id.mapsCard);
        bcp = findViewById(R.id.bcpCard);
        fundingStatus = findViewById(R.id.fundingStatusCard);

        contactList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ContactListActivity.class));
            }
        });
        jrp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,JrpOpsActivity.class));
            }
        });
        fourWs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,FourWsActivity.class));
            }
        });
        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,MapsActivity.class));
            }
        });
        bcp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Coming soon",Toast.LENGTH_SHORT).show();
                //startActivity(new Intent(MainActivity.this,ContactListActivity.class));
            }
        });
        fundingStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Coming soon",Toast.LENGTH_SHORT).show();
                //startActivity(new Intent(MainActivity.this,ContactListActivity.class));
            }
        });

    }
}
