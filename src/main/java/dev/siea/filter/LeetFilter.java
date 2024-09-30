package dev.siea.filter;

public class LeetFilter {
    private final String target;

    public LeetFilter(String target) {
        this.target = breakDown(target);
    }

    public boolean contains(String input) {
        String bd = breakDown(input);
        return bd.contains(target);
    }

    private String breakDown(String input) {
        input = input.toLowerCase();
        input = input.replaceAll(" ", "");
        StringBuilder result = new StringBuilder();
        char previousChar = '\0';

        for (char currentChar : input.toCharArray()) {
            char normalizedChar = normalizeVowel(normalizeLeet(currentChar));

            if (normalizedChar != previousChar) {
                result.append(normalizedChar);
            }
            previousChar = normalizedChar;
        }
        return result.toString();
    }

    private char normalizeLeet(char c) {
        return switch (c) {
            case 'Д', '4', '@' -> 'a';
            case 'ß' -> 'b';
            case '3', '€', 'Ɨ', 'є', '乇', 'ё', 'Σ' -> 'e';
            case '6', '9', '&', 'Ꮆ', 'ﻮ', 'G' -> 'g';
            case '1', '|', '!', 'ι', '丨', 'ї', 'I' -> 'i';
            case 'ท', '^', 'И', 'ⓝ', 'η', '几', 'Й', 'П' -> 'n';
            case '0' -> 'o';
            case 'я', '尺', 'Я' -> 'r';
            case '5' -> 's';
            case '7' -> 't';
            case '2' -> 'z';
            default -> c;
        };
    }

    private char normalizeVowel(char c) {
        if (isVowel(c)) {
            return 'a';
        }
        return c;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
