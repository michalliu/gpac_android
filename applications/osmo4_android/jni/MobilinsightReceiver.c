#include <jni.h>
#include <MobilinsightReceiver.h>
#include <gpac/phy_bandwidth.h>

JNIEXPORT jint JNICALL Java_com_gpac_Osmo4_MobilinsightReceiver_setPHYBandwidth(JNIEnv * env, jobject obj, jint bw)
{
	predict_bandwidth((int)bw);
	return bw;
}
