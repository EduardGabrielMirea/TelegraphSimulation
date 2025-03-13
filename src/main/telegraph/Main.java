package main.telegraph;

import main.telegraph.core.TelegraphSystem;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TelegraphSystem system = new TelegraphSystem();
        system.run("SOS"); // Enviar SOS en Morse
    }
}