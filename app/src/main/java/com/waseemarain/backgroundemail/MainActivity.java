package com.waseemarain.backgroundemail;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.waseemarain.backgroundemaillibrary.BackgroundMail;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button= findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendTestEmail();
            }
        });
    }

    private void sendTestEmail(){
        BackgroundMail.newBuilder(this)
                .withUsername("user@gmail.com")
                .withPassword("Password12345")
                .withMailto("to@gmail.com")
                .withMailCc("cc@gmail.com")
                .withMailBcc("bcc@gmail.com")
                .withSubject("this is the subject")
                .withAttachments("filePath")
                .withBody("this is the body")
                .withOnSuccessCallback(new BackgroundMail.OnSuccessCallback() {
                    @Override
                    public void onSuccess() {
                        //do some magic
                    }
                })
                .withOnFailCallback(new BackgroundMail.OnFailCallback() {
                    @Override
                    public void onFail() {
                        //do some magic
                    }
                })
                .send();
    }
}
