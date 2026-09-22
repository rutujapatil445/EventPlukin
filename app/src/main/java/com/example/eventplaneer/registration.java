package com.example.eventplaneer;

        import android.annotation.SuppressLint;
        import android.content.Context;
        import android.content.Intent;
        import android.content.SharedPreferences;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.widget.Toast;

        import androidx.appcompat.app.AppCompatActivity;

public class registration extends AppCompatActivity {
    EditText username, password, mobile, address;
    Button signUpButton;
    TextView loginR;
    SharedPreferences sharedPreferences;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        // Initialize SharedPreferences
        sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);

        // Obtain references to EditText fields and the Button
        username = findViewById(R.id.user);
        password = findViewById(R.id.pass);
        mobile = findViewById(R.id.mobile);
        address = findViewById(R.id.address);
        signUpButton = findViewById(R.id.btn);
        loginR = findViewById(R.id.loginR);

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Username = username.getText().toString().trim();
                String Password = password.getText().toString().trim();
                String Mobile = mobile.getText().toString().trim();
                String Address = address.getText().toString().trim();

                // Optional: Validation logic
                if (Username.isEmpty() || Password.isEmpty() || Mobile.isEmpty() || Address.isEmpty()) {
                    Toast.makeText(registration.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Store data using SharedPreferences
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("username", Username);
                editor.putString("password", Password);
                editor.putString("mobile", Mobile);
                editor.putString("address", Address);
                editor.apply();

                // Display a message to the user
                Toast.makeText(registration.this, "Sign up successful", Toast.LENGTH_SHORT).show();

                // Optionally, you can navigate to another activity here
                // For example:
                // startActivity(new Intent(SignUpActivity.this, AnotherActivity.class));
            }
        });


   }
    public void loginR(View view) {
        Intent i = new Intent(this, Login.class);
        startActivity(i);
        finish();
    }
}