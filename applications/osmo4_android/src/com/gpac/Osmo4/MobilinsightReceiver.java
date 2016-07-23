package com.gpac.Osmo4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MobilinsightReceiver extends BroadcastReceiver {
	
	public static int phy_bandwidth = 0;

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		// key depends mobilinsight side
		phy_bandwidth = intent.getIntExtra("key", 0);
		passPHYBandwidth();	
	}
	
	public int passPHYBandwidth(){
		return phy_bandwidth;
	}

}
