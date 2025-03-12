package telegraph;

import telegraph.components.Cable;
import telegraph.components.Receiver;
import telegraph.components.Relay;
import telegraph.components.Transmitter;
import telegraph.core.TelegraphSystem;
import telegraph.interfaces.SignalComponent;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Transmitter transmitter = new Transmitter(true);
        Cable cable1 = new Cable(50);
        Relay relay = new Relay(true);
        Cable cable2 = new Cable(50);
        Receiver receiver = new Receiver();

        List<SignalComponent> components = Arrays.asList(cable1, relay, cable2);
        TelegraphSystem system = new TelegraphSystem(transmitter, components, receiver);

        system.run("HOLA");
    }
}