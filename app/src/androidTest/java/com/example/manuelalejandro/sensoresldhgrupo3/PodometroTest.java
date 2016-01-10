package com.example.manuelalejandro.sensoresldhgrupo3;

import android.hardware.Sensor;
import android.hardware.SensorManager;

import junit.framework.TestCase;

import java.util.List;

/**
     * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */

public class PodometroTest extends TestCase {

    protected Sensor s;
    protected SensorManager sensorM;
    protected List<Sensor> sensores1;
    protected List<Sensor> sensores2;

    protected void setUp()
    {
        sensores1 = sensorM.getSensorList(Sensor.TYPE_STEP_COUNTER);
        sensores1 = sensorM.getSensorList(Sensor.TYPE_STEP_DETECTOR);
    }

    public void testAdd() {

        assertTrue("Existe los sensores referentes al podometro",(sensores1!=null)&&(sensores2!=null));
    }

}
