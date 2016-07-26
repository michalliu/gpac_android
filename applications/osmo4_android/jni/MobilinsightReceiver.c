#include "MobilinsightReceiver.h"
#include <gpac/phy_bandwidth.h>

JNIEXPORT void JNICALL Java_com_gpac_Osmo4_MobilinsightReceiver_setPHYBandwidth(JNIEnv * env, jobject obj, jfloat bw)
{
	float tmp = (float)bw;
	predict_bandwidth(tmp);
}

