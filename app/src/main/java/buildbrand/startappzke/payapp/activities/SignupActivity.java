package buildbrand.startappzke.payapp.activities;



import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import buildbrand.startappzke.payapp.R;


public class SignupActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        Button login = (Button) findViewById(R.id.btn_signup);
         login.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
                 startActivity(intent);
             }
         });

    }





}