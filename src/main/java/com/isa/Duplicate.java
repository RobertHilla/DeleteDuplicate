package com.isa;


public class Duplicate {

    public static String removeDuplicateWords(String s) {

        String[] words = s.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i] != null) {
                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].equals(words[j])) {
                        words[j] = null;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String stringExample : words) {
            if (stringExample != null) {
                sb.append(stringExample);
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }
}
