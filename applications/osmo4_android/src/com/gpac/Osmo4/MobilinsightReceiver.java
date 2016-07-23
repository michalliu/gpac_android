package com.gpac.Osmo4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MobilinsightReceiver extends BroadcastReceiver {
	
	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		// key depends mobilinsight side
		int phy_bandwidth = intent.getIntExtra("key", 0);
		setPHYBandwidth(phy_bandwidth);	
	}
	
	public native int setPHYBandwidth(int bw);

}
