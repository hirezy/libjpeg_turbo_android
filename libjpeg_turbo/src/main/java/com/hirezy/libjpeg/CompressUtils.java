package com.hirezy.libjpeg;

import android.graphics.Bitmap;

public class CompressUtils {
    static {
        System.loadLibrary("jpeg-compress");
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native static void native_compress(Bitmap bitmap, int q, String path);

}
