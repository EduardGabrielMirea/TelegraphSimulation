package telegraph.components;

import telegraph.utils.MorseCode;

public class Receiver {
    private String receivedMessage;

    public void receiveSignal(String signal) {
        if (signal.equals("AMPLIFIED_SIGNAL")) {
            receivedMessage = MorseCode.decode(signal);
        } else {
            receivedMessage = MorseCode.decode(signal);
        }
    }

    public void displayMessage() {
        System.out.println("Mensaje recibido: " + receivedMessage);
    }
}
