package dev.siea.filter;

public class VocalFilter {
    private final String target;

    public VocalFilter(String target) {
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
            char normalizedChar = normalizeVowel(currentChar);

            if (normalizedChar != previousChar) {
                result.append(normalizedChar);
            }
            previousChar = normalizedChar;
        }
        return result.toString();
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

