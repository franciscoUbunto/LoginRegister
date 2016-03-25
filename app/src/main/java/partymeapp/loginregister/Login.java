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

public class Login extends AppCompatActivity implements View.OnClickListener{

    Button loginButton;
    EditText uName, pwd;
    TextView regLink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginButton = (Button) findViewById(R.id.loginButton);
        uName = (EditText) findViewById(R.id.uName);
        pwd = (EditText) findViewById(R.id.pwd);
        regLink = (TextView) findViewById(R.id.regLink);

        loginButton.setOnClickListener(this);
        regLink.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.loginButton:
                startActivity(new Intent(this, logged.class));
                break;
            case R.id.regLink:
                startActivity(new Intent(this, Register.class));
                break;
        }
    }
}
