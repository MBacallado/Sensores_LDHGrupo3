package com.example.manuelalejandro.sensoresldhgrupo3;

import android.hardware.Sensor;
import android.hardware.SensorManager;

import junit.framework.TestCase;

import java.util.List;

/**
     * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */

public class MagnometroTest extends TestCase {

    protected Sensor s;
    protected SensorManager sensorM;
    protected List<Sensor> sensores;

    protected void setUp()
    {
        sensores = sensorM.getSensorList(Sensor.TYPE_MAGNETIC_FIELD);
    }

    public void testAdd() {

        assertTrue("Existe el Sensor Magnometro",sensores!=null);
    }

}
