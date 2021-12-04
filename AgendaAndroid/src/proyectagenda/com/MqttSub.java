package proyectagenda.com;

public class MqttSub {
    String topic = "foo/bar";
    int qos = 1;
try {
        IMqttToken subToken = client.subscribe(topic, qos);
        subToken.setActionCallback(new IMqttActionListener() {
            @Override
            public void onSuccess(IMqttToken asyncActionToken) {
                // The message was published
            }

            @Override
            public void onFailure(IMqttToken asyncActionToken,
                                  Throwable exception) {
                // The subscription could not be performed, maybe the user was not
                // authorized to subscribe on the specified topic e.g. using wildcards

            }
        });
    } catch (MqttException e) {
        e.printStackTrace();
    }
}
