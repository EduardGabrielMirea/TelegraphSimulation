package telegraph.core;

import telegraph.components.Cable;
import telegraph.components.Receiver;
import telegraph.components.Relay;
import telegraph.components.Transmitter;
import telegraph.interfaces.SignalComponent;

import java.util.List;

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
