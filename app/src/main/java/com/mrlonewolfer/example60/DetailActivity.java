package com.mrlonewolfer.example60;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView txtName,txtEmail,txtAddress,txtPhone;
    UserBean userBeanFile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        userBeanFile= new UserBean();
        Intent intent=getIntent();
        userBeanFile=intent.getParcelableExtra("UserData");
        txtEmail=findViewById(R.id.txtEmail);
        txtName=findViewById(R.id.txtName);
        txtAddress=findViewById(R.id.txtAdress);
        txtPhone=findViewById(R.id.txtPhone);

        txtName.setText(userBeanFile.getName());
        txtPhone.setText(userBeanFile.getPhone()+"");
        txtAddress.setText(userBeanFile.getAddress());
        txtEmail.setText(userBeanFile.getEmail());


    }


}
