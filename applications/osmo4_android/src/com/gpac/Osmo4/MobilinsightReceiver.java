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
		String prompt = "phy bandwidth = ";
		String unit = "Mbps";
		String toast = prompt + phy_bandwidth_char + unit;
		float phy_bandwidth = Float.parseFloat(phy_bandwidth_char);
		
		Toast.makeText(context, Float.toString(phy_bandwidth), Toast.LENGTH_LONG).show();
		
		setPHYBandwidth(phy_bandwidth);	
	}
	
	public native void setPHYBandwidth(float bw);

}
