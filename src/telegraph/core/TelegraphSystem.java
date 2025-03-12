package telegraph.core;

import telegraph.components.Cable;
import telegraph.components.Receiver;
import telegraph.components.Relay;
import telegraph.components.Transmitter;
import telegraph.interfaces.SignalComponent;

import java.util.List;

public class TelegraphSystem {
    private Transmitter transmitter;
    private List<SignalComponent> components;
    private Receiver receiver;

    public TelegraphSystem(Transmitter transmitter, List<SignalComponent> components, Receiver receiver) {
        this.transmitter = transmitter;
        this.components = components;
        this.receiver = receiver;
    }

    public void run(String message) {
        try {
            String signal = transmitter.sendSignal(message);
            for (SignalComponent component : components) {
                if (signal.isEmpty()) {
                    throw new Exception("¡Fallo en la transmisión! La señal se perdió.");
                }
                signal = component.processSignal(signal);
            }
            receiver.receiveSignal(signal);
            receiver.displayMessage();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
