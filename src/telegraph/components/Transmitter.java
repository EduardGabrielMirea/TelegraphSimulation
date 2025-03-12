package telegraph.components;

import telegraph.utils.MorseCode;

public class Transmitter {
    private boolean isOn;

    public Transmitter(boolean isOn) {
        this.isOn = isOn;
    }

    public String sendSignal(String message) {
        if (!isOn) return "";
        return MorseCode.encode(message);
    }
}
