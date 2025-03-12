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
        TelegraphSystem system = new TelegraphSystem();
        system.run("SOS"); // Enviar SOS en Morse
    }
}