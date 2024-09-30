package dev.siea.filter;

public class BasicFilter {
    private final String target;

    public BasicFilter(String target) {
        this.target = breakDown(target);
    }

    public boolean contains(String input) {
        String bd = breakDown(input);
        return bd.contains(target);
    }

    private String breakDown(String input) {
        input = input.toLowerCase();
        StringBuilder result = new StringBuilder();
        char previousChar = '\0';
        for (char currentChar : input.toCharArray()) {
            if (currentChar != previousChar) {
                result.append(currentChar);
            }
            previousChar = currentChar;
        }
        return result.toString();
    }
}
