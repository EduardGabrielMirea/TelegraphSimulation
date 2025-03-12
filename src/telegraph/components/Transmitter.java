package telegraph.components;

import telegraph.utils.MorseCode;

public class Transmitter {
    private boolean isOn;
    private String message;

    public Transmitter(boolean isOn) {
        this.isOn = isOn;
    }

    public void sendSignal(String message, Cable cable) {
        if (isOn) {
            this.message = MorseCode.encode(message);
            System.out.println("Emisor enviando mensaje: " + this.message);
            cable.transmit(this.message);
        } else {
            System.out.println("El emisor está apagado.");
        }
    }

    public void turnOn() { this.isOn = true; }
    public void turnOff() { this.isOn = false; }
}
