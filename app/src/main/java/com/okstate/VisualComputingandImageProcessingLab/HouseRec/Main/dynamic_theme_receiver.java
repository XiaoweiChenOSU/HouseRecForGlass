package com.okstate.VisualComputingandImageProcessingLab.HouseRec.Main;

import android.appwidget.AppWidgetManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class dynamic_theme_receiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        Intent updateIntent = new Intent();
        updateIntent.setAction(AppWidgetManager.ACTION_APPWIDGET_UPDATE);
        context.sendBroadcast(updateIntent);    }
}
