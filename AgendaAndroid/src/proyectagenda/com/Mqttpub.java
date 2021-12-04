package proyectagenda.com;

public class Mqttpub {
    String topic = "foo/bar";
    String payload = "the payload";
    byte[] encodedPayload = new byte[0];
try {
        encodedPayload = payload.getBytes("UTF-8");
        MqttMessage message = new MqttMessage(encodedPayload);
        client.publish(topic, message);
    } catch (UnsupportedEncodingException | MqttException e) {
        e.printStackTrace();
    }
}
