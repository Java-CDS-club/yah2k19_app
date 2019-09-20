package com.example.bottomnavacm;

import android.content.Intent;
import android.os.Handler;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Front extends AppCompatActivity  {
        Handler handler;
    EditText email;
    EditText password1,num;
    Button login;
    //FirebaseDatabase database;
    String username;
    String number;
    Food_user fml;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);
      //  final Food_user f_var = (Food_user)getApplicationContext();
        email =  findViewById(R.id.mEmailId);
        password1 =  findViewById(R.id.mPassword);
        num = findViewById(R.id.number);
        login =  findViewById(R.id.mLOginSubmit);

         //   f_var.setName(username);
         //   f_var.setNum(number);
        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference myRef = database.getReference("Teams");

        login.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            username = email.getText().toString().trim();
            number = num.getText().toString().trim();
            fml = new Food_user(username,number);

            if(email.getText().toString().isEmpty())
            {
                Toast.makeText(Front.this, "Email not entered!", Toast.LENGTH_LONG).show();
            }
            else if(password1.getText().toString().isEmpty()){
                Toast.makeText(Front.this, "Password not entered!", Toast.LENGTH_LONG).show();
            }

            else {

//                Toast.makeText(Front.this, "Hello",Toast.LENGTH_LONG).show();

                myRef.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        if(dataSnapshot.hasChild(username)){
                                Toast.makeText(Front.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(Front.this,MainActivity.class );
                                startActivity(intent);
                                finish();
                        }
                        }
                        @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
                Toast.makeText(Front.this,"bye",Toast.LENGTH_LONG).show();
            }
        }
        });

    }
}

