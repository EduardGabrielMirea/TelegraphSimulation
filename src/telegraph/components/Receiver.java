package telegraph.components;

import telegraph.utils.MorseCode;

public class Receiver {
    private String receivedMessage = "";

    public void receiveSignal(String signal) {
        this.receivedMessage = MorseCode.decode(signal);
    }

    public void displayMessage() {
        System.out.println("Mensaje recibido: " + receivedMessage);
    }
}
