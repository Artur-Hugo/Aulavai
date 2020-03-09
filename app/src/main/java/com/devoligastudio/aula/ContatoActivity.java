package com.devoligastudio.aula;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ContatoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contato);
    }

    public void enviarEmail(View view) {
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO,
                Uri.fromParts("Mailton", "abc@gmail.com", null));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Assunto fo email");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Corpo do Email");
        startActivity(Intent.createChooser(emailIntent, "send email..."));

    }

    public void efetuarligação(View view) {
        Intent intent = new Intent(Intent.ACTION_CALL,
                Uri.parse("tel:" + "11951542697"));

        if (checkSelfPermission(Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    Activity#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for Activity#requestPermissions for more details.
            return;
        }
        startActivity(intent);
    }
}
