package telegraph.components;

import telegraph.interfaces.SignalComponent;

public class Cable implements SignalComponent {

    private int lengthKm;
    private double signalStrength = 1.0;

    public Cable(int lengthKm) {
        this.lengthKm = lengthKm;
    }

    @Override
    public String processSignal(String signal) {
        double degradation = 0.1 * lengthKm;
        signalStrength -= degradation;
        return (signalStrength > 0.2) ? signal : "WEAK_SIGNAL"; // Señal demasiado débil
    }
}
