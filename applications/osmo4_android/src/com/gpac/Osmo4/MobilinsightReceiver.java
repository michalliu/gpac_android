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
		String pred_phy_bandwidth_char = intent.getStringExtra("Predicted Bandwidth (Mbps)");
		String prompt = "phy bandwidth = ";
		String unit = "Mbps";
		String toast = prompt + phy_bandwidth_char + unit;
		//Toast.makeText(context, toast, Toast.LENGTH_LONG).show();
		
		float phy_bandwidth = Float.parseFloat(phy_bandwidth_char);
		float pred_phy_bandwidth = Float.parseFloat(pred_phy_bandwidth_char);

		setPHYBandwidth(phy_bandwidth);	
		// setPHYBandwidth(pred_phy_bandwidth);	// predicted bandwidth 
	}
	
	public native void setPHYBandwidth(float bw);

}
