package main.telegraph.core;

import main.telegraph.components.Cable;
import main.telegraph.components.Receiver;
import main.telegraph.components.Relay;
import main.telegraph.components.Transmitter;

public class TelegraphSystem {
    private Transmitter transmitter;
    private Cable cable;
    private Relay relay;
    private Receiver receiver;

    public TelegraphSystem() {
        transmitter = new Transmitter(true);
        cable = new Cable(50, 1.5); // 50 km con 1.5% de pérdida por km
        relay = new Relay(true);
        receiver = new Receiver();

        cable.connectRelay(relay);
        cable.connectReceiver(receiver);
    }

    public void run(String mensaje) {
        transmitter.sendSignal(mensaje, cable);
    }
}
