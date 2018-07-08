package com.example.Pacasian.pacy;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class MainCall extends AppCompatActivity {
    EditText ed1;
    Button btn;
    String string;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maincall);
        btn=(Button)findViewById(R.id.btn);
        ed1=(EditText)findViewById(R.id.num);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                string=ed1.getText().toString();
                if (string.trim().isEmpty()){
                    Toast.makeText(SimpleCamera.this, "Unable to call a null number", Toast.LENGTH_SHORT).show();
                }else
                {
                    intent.setData(Uri.parse("tel:"+string));
                }
                startActivity(intent);
            }
        });
    }
}

