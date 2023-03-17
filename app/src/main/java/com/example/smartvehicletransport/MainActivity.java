package com.example.smartvehicletransport;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainGrid= (GridLayout)findViewById(R.id.mainGrid);
        setSingleEvent(mainGrid);
    }

    private void setSingleEvent(GridLayout mainGrid) {
        for (int i =0; i<mainGrid.getChildCount();i++){
            CardView cardView= (CardView)mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (finalI==0)
                    {
                        Intent intent= new Intent(MainActivity.this, ProfileActivity.class);
                        startActivity(intent);
                        Toast.makeText(MainActivity.this, "User Profile", Toast.LENGTH_SHORT).show();
                    }

                    else if (finalI==1)
                    {
                        Intent intent= new Intent(MainActivity.this, MapActivity.class);
                        startActivity(intent);
                        Toast.makeText(MainActivity.this, "User Location", Toast.LENGTH_SHORT).show();
                    }
                    else if (finalI==2)
                    {
                        Intent intent= new Intent(MainActivity.this, BusLocActivity.class);
                        startActivity(intent);
                        Toast.makeText(MainActivity.this, "Vehicle Location", Toast.LENGTH_SHORT).show();
                    }

                }
            });
        }
    }
}
