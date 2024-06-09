package com.example.chohanfurniture;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Fill_Profile extends AppCompatActivity {

    ImageView profile;
    EditText editPersonName,editPersonName2,editDate,editEmailAddress,editphoneno;
    Button save;
    ImageView upload;
    Uri uri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill_profile);
        profile = findViewById(R.id.profile);
        save = findViewById(R.id.save);
        upload = findViewById(R.id.upload);
        editPersonName = findViewById(R.id.editPersonName);
        editPersonName2 = findViewById(R.id.editPersonName2);
        editDate = findViewById(R.id.editDate);
        editEmailAddress = findViewById(R.id.editEmailAddress);
        editphoneno = findViewById(R.id.editphoneno);

        getSupportActionBar().hide();



        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_GET_CONTENT);
                i.setType("image/*");
                startActivityForResult(i,1);
            }
        });
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent i = new Intent(Fill_Profile.this,HomeAndMenu.class);
                //startActivity(i);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1 && data!=null){
            uri = data.getData();
            profile.setImageURI(uri);
        }
    }
}