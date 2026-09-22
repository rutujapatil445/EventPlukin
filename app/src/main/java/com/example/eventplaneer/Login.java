package com.example.eventplaneer;

        import static com.example.eventplaneer.R.id.login;

        import android.annotation.SuppressLint;
        import android.content.Context;
        import android.content.Intent;
        import android.content.SharedPreferences;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

        import androidx.appcompat.app.AppCompatActivity;

        import com.example.eventplaneer.registration;

public class Login extends AppCompatActivity {
    EditText Username, Password;
    Button loginButton;

    SharedPreferences sharedPreferences;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);


        Username = findViewById(R.id.username);
        Password = findViewById(R.id.password);
        loginButton = findViewById(R.id.login);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String enteredUsername = Username.getText().toString().trim();
                String enteredPassword = Password.getText().toString().trim();

                String savedUsername = sharedPreferences.getString("username", "");
                String savedPassword = sharedPreferences.getString("password", "");


                if (enteredUsername.equals(savedUsername) && enteredPassword.equals(savedPassword)) {

                    Toast.makeText(Login.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(Login.this, BottomNav.class);
                    startActivity(i);
                } else {

                    Toast.makeText(Login.this, "Invalid Username or Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    // Method for handling the "Sign Up" TextView click

   /* public void login(View view) {
        Intent i = new Intent(this, BottomNav.class);
        startActivity(i);
    }*/
    public void register(View view) {

        startActivity(new Intent(Login.this, registration.class));
    }
}