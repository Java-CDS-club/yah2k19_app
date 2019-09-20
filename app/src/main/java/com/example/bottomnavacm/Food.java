package com.example.bottomnavacm;

import android.Manifest;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentActivity;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;
import com.journeyapps.barcodescanner.CaptureActivity;

public class Food extends Fragment {
    View v;
    static int i=1;
    Button lunch;
    String resulttext;
    TextView text;
    Fragment fragment = this;
    static String food_name_text;
    TextView teamsize_text;
    String user_food,team_size;
    Food_user fm;
    static String [] food_names = new String[]{"Snack1","Dinner","Snack2","Breakfast","Lunch2","Snack3"};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

         v = inflater.inflate(R.layout.food,null);
  //      FirebaseDatabase database =
      //  FirebaseDatabase database = FirebaseDatabase.getInstance();
        lunch = v.findViewById(R.id.scan);
        text = v.findViewById(R.id.result);
        teamsize_text = v.findViewById(R.id.team_size);
         try {
             Toast.makeText(getActivity(), fm.user_f, Toast.LENGTH_LONG).show();
         } catch (Exception e) {
             e.printStackTrace();
         }
        //     Food_user f_var = (Food_user) getActivity().getApplicationContext();
     //      user_food = f_var.getName();
     //       team_size = f_var.getNum();
        try {

                user_food = fm.user_f;
                team_size = fm.number;
            } catch (Exception e) {
            e.printStackTrace();
        }
        //Check Camera permission
        if ((ContextCompat.checkSelfPermission(getActivity(),
                Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) && (ContextCompat.checkSelfPermission(getActivity(),
                Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED)) {
        }

        else {
            //Requests permission from user
            ActivityCompat.requestPermissions(getActivity(),
                    new String[] {Manifest.permission.CALL_PHONE, Manifest.permission.READ_EXTERNAL_STORAGE}, 1);
        }


         lunch.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 //redirects to scan page
                 IntentIntegrator intentIntegrator = new IntentIntegrator(getActivity());
                 intentIntegrator.setOrientationLocked(true);
                 //sets orientation to portrait
                 intentIntegrator.setCaptureActivity(CaptureActivity.class);
                 IntentIntegrator.forSupportFragment(fragment).initiateScan();
             }
         });

           // Toast.makeText(getActivity(),resulttext,Toast.LENGTH_LONG).show();

        return v;

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if(result != null) {
            if (result.getContents() == null) {
                Toast.makeText(getActivity(), "Cancelled", Toast.LENGTH_LONG).show();
            } else {
                //stores obtained result to textview
                resulttext = result.getContents();
                text.setText(resulttext);
                teamsize_text.setText(team_size);
                Toast.makeText(getActivity(), "Enjoy your food!", Toast.LENGTH_LONG).show();
                food_name_text = food_names[++i];


                //retrieving data

               /* DatabaseReference myRef = database.getReference("Teams").child(user_food);
                myRef.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                            int number = Integer.parseInt(dataSnapshot.child("number").getValue(String.class));
                            Toast.makeText(getActivity(),number,Toast.LENGTH_LONG).show();
                            // Toast.makeText(getApplicationContext(),"Successs",Toast.LENGTH_LONG).show();
                           /* Toast.makeText(getActivity(), "Login Successful!", Toast.LENGTH_SHORT).show();
                            Intent intent =new Intent(getActivity(),MainActivity.class );
                            startActivity(intent);
                            finish();*/

            }

/*
                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                }); */

          //  Toast.makeText(getActivity(), "Enjoy your food!", Toast.LENGTH_LONG).show();
      //  }


        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }


/*
    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }*/
}
