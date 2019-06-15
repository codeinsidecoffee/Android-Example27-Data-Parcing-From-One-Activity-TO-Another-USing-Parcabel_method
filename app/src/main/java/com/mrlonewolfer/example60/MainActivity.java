package com.mrlonewolfer.example60;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/*
 Create a program of transferring the object 1 activity to another activity
 using paracable
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edtName,edtPhone,edtEmail,edtAddress;
    Button btnView;
    UserBean userBeanFile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName=findViewById(R.id.edtName);
        edtEmail=findViewById(R.id.edtEmail);
        edtAddress=findViewById(R.id.edtAddress);
        edtPhone=findViewById(R.id.edtPhone);

        btnView=findViewById(R.id.btnView);
        btnView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btnView){
            userBeanFile=new UserBean();
            userBeanFile.setName(edtName.getText().toString());
            userBeanFile.setAddress(edtAddress.getText().toString());
            userBeanFile.setEmail(edtEmail.getText().toString());
            userBeanFile.setPhone(Long.valueOf(edtPhone.getText().toString()));

            Intent intent = new Intent(this,DetailActivity.class);
            intent.putExtra("UserData",userBeanFile);
            startActivity(intent);
            finish();

        }
    }
}
