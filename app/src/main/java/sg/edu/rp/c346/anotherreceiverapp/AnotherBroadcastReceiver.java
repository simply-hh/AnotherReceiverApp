package sg.edu.rp.c346.anotherreceiverapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by 16039009 on 13/8/2018.
 */

public class AnotherBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Received in AnotherBroadcastReceiver", Toast.LENGTH_LONG).show();
    }
}
