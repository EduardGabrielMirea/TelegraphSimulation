package telegraph.components;

import telegraph.interfaces.SignalComponent;

public class Relay {
    private boolean isActive;

    public Relay(boolean isActive) {
        this.isActive = isActive;
    }

    public void amplifySignal(String signal, Receiver receiver) {
        if (isActive) {
            System.out.println("Relé amplificando la señal...");
            receiver.receiveSignal(signal);
        } else {
            System.out.println("El relé está inactivo. La señal se pierde.");
        }
    }
}
