package com.hwjoo.sensorsample;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * Created by hwjoo on 2017-01-11.
 */

public class StepService extends IntentService {


    public StepService(String name) {
        super(name);
    }
    public StepService(){
        super("");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    Log.d("TEST", "Service Running");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread.start();
    }
}
