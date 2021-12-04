/*___Generated_by_IDEA___*/

package proyectagenda.com;

/* This stub is only used by the IDE. It is NOT the BuildConfig class actually packed into the APK */
public final class BuildConfig {
  public final static boolean DEBUG = Boolean.parseBoolean(null);
}
  String topic = "users/last/will";
  byte[] payload = "some payload".getBytes();
options.setWill(topic, payload ,1,false);
        IMqttToken token = client.connect(options);