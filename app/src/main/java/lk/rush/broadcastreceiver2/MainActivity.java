package lk.rush.broadcastreceiver2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button send = findViewById(R.id.button);

        LocalBroadcastManager lbm = LocalBroadcastManager.getInstance(getApplicationContext());

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setAction("lk.example.rush.CUSTOM_INTENT");
                lbm.sendBroadcast(i);
            }
        });

    }
}