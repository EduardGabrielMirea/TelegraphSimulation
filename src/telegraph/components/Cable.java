package telegraph.components;

import telegraph.interfaces.SignalComponent;

public class Cable{

    private int lengthKm;
    private double signalLossPerKm;
    private Relay relay;
    private Receiver receiver;

    public Cable(int lengthKm, double signalLossPerKm) {
        this.lengthKm = lengthKm;
        this.signalLossPerKm = signalLossPerKm;
    }

    public void connectRelay(Relay relay) { this.relay = relay; }
    public void connectReceiver(Receiver receiver) { this.receiver = receiver; }

    public void transmit(String signal) {
        double signalStrength = 100.0 - (lengthKm * signalLossPerKm);
        System.out.println("Cable transmitiendo... Fuerza de la señal: " + signalStrength);

        if (signalStrength < 30 && relay != null) {
            System.out.println("Señal débil, activando el relé...");
            relay.amplifySignal(signal, receiver);
        } else if (signalStrength >= 30 && receiver != null) {
            receiver.receiveSignal(signal);
        } else {
            System.out.println("La señal se ha perdido por completo.");
        }
    }
}
