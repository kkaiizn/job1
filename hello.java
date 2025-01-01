public class ReplaceString {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("I love Java programming!");
        int start = sb.indexOf("Java");
        if (start != -1) {
            sb.replace(start, start + 4, "Python");
        }
        System.out.println(sb);
    }
}

public class MinMaxArray {
    public static void main(String[] args) {
        int[] arr = {10, 25, 3, 55, 8, 42};
        int min = arr[0], max = arr[0];

        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}

public class VowelConsonantCount {
    public static void main(String[] args) {
        String input = "Hello World";
        input = input.toLowerCase();
        int vowels = 0, consonants = 0;

        for (char c : input.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if ("aeiou".indexOf(c) != -1) vowels++;
                else consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}


import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (areAnagrams(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }

    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}


public class BreakStatementExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int stopAt = 30;

        for (int num : numbers) {
            if (num == stopAt) {
                System.out.println("Stopping at: " + num);
                break;
            }
            System.out.println("Number: " + num);
        }
    }
}
