# NardoFilter
NardoFilter is an advanced tool to detect specific patterns in Strings. It provides several filters to handle different types of text transformations and encodings making it a powerful tool for moderation of user-generated content.

## Filters
NardoFilter consists of 5 layers. Each layer becoming more and more sensitive. The `NardoFilter` class serves as a central hub that integrates all the individual filters into a single interface.

1. Basic Filter
   - Description: The Basic Filter detects duplicate letters and handles casing variations.
   - Functionality:
     Removes consecutive duplicate letters in words (e.g., "hiiii" becomes "hi").  
     Ignores casing, making it case-insensitive (e.g., "Hello" and "hello" are treated as the same).

2. Space Filter
   - Description: The Space Filter focuses on detecting spaces in strings.
   - Functionality:
     Identifies and filters out spaces to normalize spacing (e.g., "He ll o" becomes "Hello").

3. Vocal Filter
   - Description: The Vocal Filter normalizes vowels and handles variations in their representations.
   - Functionality:
     Replaces all vowels with a standard character (e.g., 'a') to normalize variations (e.g., "Hase" becomes "Hasa").

4. Leet Filter
   - Description: The Leet Filter detects variations of words represented in [leet (1337) speak](https://en.wikipedia.org/wiki/Leet).
   - Functionality:
     Converts common leet characters to their alphabetic counterparts (e.g., '1' to 'I', '3' to 'E').  
     Identifies leet variations of words (e.g., "l33t" is detected as "leet").

5. Morse Code Filter
   - Description: The Morse Code Filter detects words and phrases represented in Morse code.
   - Functionality:
     Detects the to be filtered String even if only present in Morse Code (e.g., ".... . .-.. .-.. ---" is detected as "Hello")  
     Supports both letters and digits in the Morse code format, making it capable of detecting a variety of encoded messages.


## Contributing
Contributions are welcome! If you have suggestions for improvements or additional filters, feel free to create an issue or submit a pull request.