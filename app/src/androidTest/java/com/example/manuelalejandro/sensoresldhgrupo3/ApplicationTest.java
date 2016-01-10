package com.example.manuelalejandro.sensoresldhgrupo3;

import android.app.Application;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.test.ApplicationTestCase;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {

    /**
     * Se declaran las instancias para cada uno de los activity que representaran a los sensores.
     *
     */
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

    /**
     * Se usa la variable de tipo sensores para hacer las comprobaciones.Cuando se instancia un objeto, se llama al metodo onCreate, que es donde
     * se realiza la propia comprobacion mediante la sentencia por ejemplo: sensorM.getSensorList(Sensor.TYPE_PROXIMITY) siendo sensorM de tipo
     * sensorManager, de que el sensor esta disponible, esto varia en cada dispositivo.
     */

    /**
     * Se crea el test para el sensor Proximidad
     * @throws Exception
     */
    public void testProximidad() throws Exception {
        assertNotNull("Existe Sensor", proxi.sensores != null);

    }

    /**
     * Se crea el test para el sensor Humedad
     * @throws Exception
     */
    public void testHumedad() throws Exception {
        assertNotNull("Existe Sensor", hum.sensores != null);

    }

    /**
     * Se crea el test para el sensor Magnometro
     * @throws Exception
     */
    public void testMagnometro() throws Exception {
        assertNotNull("Existe Sensor", magno.sensores != null);

    }
}