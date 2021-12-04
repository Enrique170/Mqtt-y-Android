public class MQTTConect {
    String clientId = MqttClient.generateClientId();
    MqttAndroidClient client =
            new MqttAndroidClient(this.getApplicationContext(), "tcp://broker.hivemq.com:1883",
                    clientId);

try {
        IMqttToken token = client.connect();
        token.setActionCallback(new IMqttActionListener() {
            @Override
            public void onSuccess(IMqttToken asyncActionToken) {
                // We are connected
                Log.d(TAG, "onSuccess");
            }

            @Override
            public void onFailure(IMqttToken asyncActionToken, Throwable exception) {
                // Something went wrong e.g. connection timeout or firewall problems
                Log.d(TAG, "onFailure");

            }
        });
    } catch (MqttException e) {
        e.printStackTrace();
    }
}
