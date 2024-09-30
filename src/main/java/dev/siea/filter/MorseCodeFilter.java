package dev.siea.filter;

import java.util.HashMap;
import java.util.Map;

public class MorseCodeFilter {
    private final String targetMorse;

    private static final Map<Character, String> morseCodeMap = new HashMap<>() {{
        put('a', ".-");
        put('b', "-...");
        put('c', "-.-.");
        put('d', "-..");
        put('e', ".");
        put('f', "..-.");
        put('g', "--.");
        put('h', "....");
        put('i', "..");
        put('j', ".---");
        put('k', "-.-");
        put('l', ".-..");
        put('m', "--");
        put('n', "-.");
        put('o', "---");
        put('p', ".--.");
        put('q', "--.-");
        put('r', ".-.");
        put('s', "...");
        put('t', "-");
        put('u', "..-");
        put('v', "...-");
        put('w', ".--");
        put('x', "-..-");
        put('y', "-.--");
        put('z', "--..");
        put('1', ".----");
        put('2', "..---");
        put('3', "...--");
        put('4', "....-");
        put('5', ".....");
        put('6', "-....");
        put('7', "--...");
        put('8', "---..");
        put('9', "----.");
        put('0', "-----");
    }};

    public MorseCodeFilter(String target) {
        this.targetMorse = toMorseCode(target);
    }

    public boolean contains(String input) {
        return input.contains(targetMorse);
    }

    private String toMorseCode(String input) {
        StringBuilder morseStringBuilder = new StringBuilder();
        for (char c : input.toLowerCase().toCharArray()) {
            String morseCode = morseCodeMap.get(c);
            if (morseCode != null) {
                morseStringBuilder.append(morseCode).append(" ");
            }
        }

        return morseStringBuilder.toString().trim();
    }
}