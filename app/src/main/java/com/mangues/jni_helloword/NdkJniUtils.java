package com.mangues.jni_helloword;

/**
 * Created by mangues on 16/8/3.
 */

public class NdkJniUtils {
    static {
        System.loadLibrary("YanboberJniLibName");   //defaultConfig.ndk.moduleName
    }
    public native String getCLanguageString();
    public native String generateKey(String name);
}
