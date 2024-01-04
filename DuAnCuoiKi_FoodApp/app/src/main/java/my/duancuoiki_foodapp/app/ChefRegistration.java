package my.duancuoiki_foodapp.app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class ChefRegistration extends AppCompatActivity {
    private EditText emailedit,passedit;
    private Button btnregis;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chef_registration);

        mAuth = FirebaseAuth.getInstance();

        emailedit = findViewById(R.id.Email);
        passedit = findViewById(R.id.Pwd);
        btnregis = findViewById(R.id.Signup);

        btnregis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register();
            }
        });
    }
    private void register(){
        String email,pass;
        email = emailedit.getText().toString();
        pass = passedit.getText().toString();

        if(TextUtils.isEmpty(email)){
            Toast.makeText(this,"Vui long nhap email!!",Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(pass)){
            Toast.makeText(this,"Vui long nhap pass!!",Toast.LENGTH_SHORT).show();
            return;
        }

        mAuth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(getApplicationContext(),"Tao tai khoan thanh cong",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(ChefRegistration.this,MainActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(),"Tao tai khoan ko thanh cong",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}