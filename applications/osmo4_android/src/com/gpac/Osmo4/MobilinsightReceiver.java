package com.gpac.Osmo4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MobilinsightReceiver extends BroadcastReceiver {
	
	static {
	    System.loadLibrary("mobileInsight");
	}
	
	@Override
	public void onReceive(Context context, Intent intent) {
		String phy_bandwidth_char = intent.getStringExtra("Bandwidth (Mbps)");
		Toast.makeText(context, phy_bandwidth_char, Toast.LENGTH_LONG).show();
		float phy_bandwidth = Float.parseFloat(phy_bandwidth_char);
		setPHYBandwidth(phy_bandwidth);	
	}
	
	public native void setPHYBandwidth(float bw);

}
