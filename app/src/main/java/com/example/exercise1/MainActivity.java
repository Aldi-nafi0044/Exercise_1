package com.example.exercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    Button blogin, bsignin;
    EditText edemail, edpassword;
    TextInputLayout til_Email, til_Password;
    String email,password;
    String email2 = "admin@mail.com";
    String password2 = "123456";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blogin=findViewById(R.id.blogin);
        bsignin=findViewById(R.id.bsignin);
        edemail=findViewById(R.id.editTextEmail);
        edpassword=findViewById(R.id.editTextpass);
        til_Email = findViewById(R.id.textInputLayoutEmail);
        til_Password = findViewById(R.id.textInputLayoutpass);

        blogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                email = edemail.getText().toString();
                password = edpassword.getText().toString();
                Toast login_sukses = Toast.makeText(getApplicationContext(),"Login Sukses",Toast.LENGTH_LONG);
                Toast salah_semua = Toast.makeText(getApplicationContext(),"Email dan Password salah",Toast.LENGTH_LONG);

                if(email2.equals(email) && password2.equals(password)){
                    login_sukses.show();
                    Bundle b = new Bundle();

                    b.putString("a",email2.trim());
                    b.putString("b",password.trim());

                    Intent i = new Intent(getApplicationContext(),home_activity.class);

                    i.putExtras(b);
                    startActivity(i);
                }
                else{
                    salah_semua.show();
                    til_Email.setError("email salah!!!!");
                    til_Password.setError("password salah!!!!");
                }
                if(!password2.equals(password) && (password.length() > 5)){
                    til_Password.setError("password salah!!!!");
                }
                if(!email2.equals(email)){
                    til_Email.setError("email salah!!!!");
                }
                if(email.isEmpty()){
                    til_Email.setError("email wajib di isi!!!!");
                }
                if(password.isEmpty()){
                    til_Password.setError("password wajib di isi!!!!");
                }
                if(password.length() < 6){
                    til_Password.setError("6 kategori boss!!!!");
                }

            }
        });
    }
}