package main.telegraph.components;

import main.telegraph.utils.MorseCode;

public class Receiver {
    private String receivedMessage = "";

    public void receiveSignal(String signal) {
        receivedMessage = MorseCode.decode(signal);
        displayMessage();
    }
    /*
    *
    private String decodeMorse(String morseSignal) {
        // Simulación de decodificación simple (se podría expandir con un diccionario Morse)
        return morseSignal.replace(".", "E").replace("-", "T"); // Ejemplo simplificado
    }
    * */

    public void displayMessage() {
        System.out.println("Mensaje recibido: " + receivedMessage);
    }
}
