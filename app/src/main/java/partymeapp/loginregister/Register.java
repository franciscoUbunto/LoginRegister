package partymeapp.loginregister;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Register extends AppCompatActivity implements View.OnClickListener{

    EditText nameVar, emalVar, pwdVar, pwdVar2;
    Button registerButton;
    TextView backToLogin;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        nameVar = (EditText) findViewById(R.id.nameVar);
        emalVar = (EditText) findViewById(R.id.emailVar);
        pwdVar = (EditText) findViewById(R.id.pwdVar);
        pwdVar2 = (EditText) findViewById(R.id.pwdVar2);

        registerButton = (Button) findViewById(R.id.registerButton);
        backToLogin = (TextView) findViewById(R.id.backToLogin);

        backToLogin.setOnClickListener(this);
        registerButton.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.registerButton:
                startActivity(new Intent(this, Login.class));
                break;
            case R.id.backToLogin:
                startActivity(new Intent(this, Login.class));
        }

    }

}
