package com.example.nick0.debtbuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText nameInput;
    private EditText mailInput;
    private String mName;
    private String mMail;

    public static final String EXTRA_NAME = "a name";
    public static final String EXTRA_MAIL = "a mail";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.start_button);
        nameInput = findViewById(R.id.name_input);
        mailInput = findViewById(R.id.e_mail_input);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mName = nameInput.getText().toString();
                mMail = mailInput.getText().toString();

                Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                intent.putExtra(EXTRA_NAME, mName);
                intent.putExtra(EXTRA_MAIL, mMail);
                startActivity(intent);
            }
        });
    }
}
