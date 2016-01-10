package com.example.manuelalejandro.sensoresldhgrupo3;

import android.app.Application;
import android.test.ApplicationTestCase;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {

    ProximidadActivity proxi = new ProximidadActivity();
    AcelerometroActivity acel = new AcelerometroActivity();
    GiroscopioActivity giro = new GiroscopioActivity();
    HumedadActivity hum = new HumedadActivity();
    LuzActivity luz = new LuzActivity();
    MagnometroActivity magno = new MagnometroActivity();
    PodometroActivity podo = new PodometroActivity();
    PulsometroActivity pulso = new PulsometroActivity();
    TermometroActivity termo = new TermometroActivity();


    public ApplicationTest() {

        super(Application.class);
    }


    public void testProximidad() throws Exception {
        assertNotNull("Existe Sensor", proxi.sensores != null);

    }

    public void testHumedad() throws Exception {
        assertNotNull("Existe Sensor", hum.sensores != null);

    }

    public void testMagnometro() throws Exception {
        assertNotNull("Existe Sensor", magno.sensores != null);

    }
}