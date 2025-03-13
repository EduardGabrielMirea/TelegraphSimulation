package main.telegraph.utils;

import java.util.*;

public class MorseCode {
    private static final Map<Character, String> MORSE_MAP = Map.ofEntries(
            Map.entry('A', ".-"), Map.entry('B', "-..."), Map.entry('C', "-.-."),
            Map.entry('D', "-.."), Map.entry('E', "."), Map.entry('F', "..-."),
            Map.entry('G', "--."), Map.entry('H', "...."), Map.entry('I', ".."),
            Map.entry('J', ".---"), Map.entry('K', "-.-"), Map.entry('L', ".-.."),
            Map.entry('M', "--"), Map.entry('N', "-."), Map.entry('Ñ', "--.--"),
            Map.entry('O', "---"), Map.entry('P', ".--."), Map.entry('Q', "--.-"),
            Map.entry('R', ".-."), Map.entry('S', "..."), Map.entry('T', "-"),
            Map.entry('U', "..-"), Map.entry('V', "...-"), Map.entry('W', ".--"),
            Map.entry('X', "-..-"), Map.entry('Y', "-.--"), Map.entry('0', "-----"),
            Map.entry('1', ".----"), Map.entry('2', "..---"), Map.entry('3', "...--"),
            Map.entry('4', "....-"), Map.entry('5', "....."), Map.entry('6', "-...."),
            Map.entry('7', "--..."), Map.entry('8', "---.."), Map.entry('9', "----."),
            Map.entry('?', "..--.."), Map.entry('!', "-.-.--"), Map.entry('+', ".-.-."),
            Map.entry('-', "..--.-"), Map.entry('$', "...-..-"), Map.entry('.', ".-.-.-"),
            Map.entry('=', "-...-"),Map.entry('_', "..---.")
            );

    // Invertir el MAP para crear el MORSE_REVERSE_MAP
    private static final Map<String, Character> MORSE_REVERSE_MAP = new HashMap<>();

    static {
        for (Map.Entry<Character, String> entry : MORSE_MAP.entrySet()) {
            MORSE_REVERSE_MAP.put(entry.getValue(), entry.getKey());
        }
    }

    public static String encode(String message) {
        StringBuilder encoded = new StringBuilder();
        for (char c : message.toUpperCase().toCharArray()) {
            encoded.append(MORSE_MAP.getOrDefault(c, "?")).append(" ");
        }
        return encoded.toString().trim();
    }

    public static String decode(String signal) {
        StringBuilder decoded = new StringBuilder();
        for (String part : signal.split(" ")) {
            decoded.append(MORSE_REVERSE_MAP.getOrDefault(part, '?')).append(" ");
        }
        return decoded.toString();
    }
}
