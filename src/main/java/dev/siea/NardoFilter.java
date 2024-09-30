package dev.siea;

import dev.siea.filter.*;

public class NardoFilter {
    private final BasicFilter basicFilter;
    private final SpaceFilter spaceFilter;
    private final VocalFilter vocalFilter;
    private final LeetFilter leetFilter;
    private final MorseCodeFilter morseCodeFilter;

    public NardoFilter(String target) {
        this.basicFilter = new BasicFilter(target);
        this.spaceFilter = new SpaceFilter(target);
        this.vocalFilter = new VocalFilter(target);
        this.leetFilter = new LeetFilter(target);
        this.morseCodeFilter = new MorseCodeFilter(target);
    }

    public boolean filter(String input) {
        return (basicFilter.contains(input) || spaceFilter.contains(input) || vocalFilter.contains(input) || leetFilter.contains(input) || morseCodeFilter.contains(input));
    }

    public String filterWithFeedback(String input) {

        if (basicFilter.contains(input)) {
            return "Detected by BasicFilter";
        } else if (spaceFilter.contains(input)) {
            return "Detected by SpaceFilter";
        } else if (vocalFilter.contains(input)) {
            return "Detected by VocalFilter";
        } else if (leetFilter.contains(input)) {
            return "Detected by LeetFilter";
        } else if (morseCodeFilter.contains(input)) {
            return "Detected by MorseCodeFilter";
        }

        return "Nothing found";
    }

}
