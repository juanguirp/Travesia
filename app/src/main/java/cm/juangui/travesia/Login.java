package cm.juangui.travesia;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Dell 3443 on 1/06/2017.
 */

public class Login extends AppCompatActivity {

    Button button;
    EditText email;
    EditText pass;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        button = (Button) findViewById(R.id.btn_login);
        email =  (EditText) findViewById(R.id.input_email);
        pass = (EditText) findViewById(R.id.input_password);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateData(email.getText().toString(), pass.getText().toString());
            }
        });
    }

    private void validateData(String email, String pass) {
        if(pass.isEmpty() || email.isEmpty()){
            Toast.makeText(Login.this, "Usuario invalido", Toast.LENGTH_SHORT).show();
        }
        else{
            Intent intent = new Intent(this, MenuPrincipal.class);
            this.startActivity(intent);
        }
    }
}
