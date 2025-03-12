package telegraph.components;

import telegraph.interfaces.SignalComponent;

public class Relay implements SignalComponent {
    private boolean isActive;

    public Relay(boolean isActive) {
        this.isActive = isActive;
    }


    @Override
    public String processSignal(String signal) {
         if(!isActive) return "";
         if(signal.equals("WEAK_SIGNAL")){
             System.out.println("Relay detectó señal debil y la amplificó.");
             return "AMPLIFIED_SIGNAL";
         }
         return signal;
    }
}
