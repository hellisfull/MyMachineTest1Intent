package com.example.hp.mymachinetest1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    Button bt3;
    TextView tv1,tv2,tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        tv1=(TextView)findViewById(R.id.textView8);
        tv2=(TextView)findViewById(R.id.textView10);
        tv3=(TextView)findViewById(R.id.textView3);
        Intent in=getIntent();
        String na =in.getExtras().getString("name");
        String pla = in.getExtras().getString("place");
        String pass = in.getExtras().getString("password");
        tv1.setText(na);
        tv2.setText(pla);
        tv3.setText(pass);
        bt3=(Button)findViewById(R.id.button);
                bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iii=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(iii);
            }
        });
    }
}
