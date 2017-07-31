package com.example.hp.mymachinetest1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button bt1,bt2;
    EditText ed1,ed2,ed3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1=(Button)findViewById(R.id.button2);
        bt2=(Button)findViewById(R.id.bu);
        ed1=(EditText)findViewById(R.id.editText);
        ed2=(EditText)findViewById(R.id.editText2);
        ed3=(EditText)findViewById(R.id.editText4);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.in/"));
                startActivity(i);

            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent ii = new Intent(getApplicationContext(),Login.class);
                ii.putExtra("name",ed2.getText().toString());
                ii.putExtra("place",ed3.getText().toString());
                ii.putExtra("password",ed1.getText().toString());
                startActivity(ii);

            }
        });
    }
}
