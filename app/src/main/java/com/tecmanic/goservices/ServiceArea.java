package com.tecmanic.goservices;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.tecmanic.goservices.ServiceInternal.Doorstep1;

public class ServiceArea extends AppCompatActivity {
    TextView doorstep,shoap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_area);
        shoap = findViewById(R.id.shoap);
        doorstep=findViewById(R.id.doorstep);

        doorstep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Doorstep1.class);
                startActivity(intent);


            }
        });
        shoap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext() , CategoryScreeen.class);
                startActivity(intent);

            }
        });



    }
}