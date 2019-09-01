package com.example.babysteps;

/**
 * @author Karl-Dieter Zimmer-Bentin
 */
class FizzBuzz {

    static String transform(int n) throws IllegalArgumentException {

        var s = new StringBuilder();

        if (n <= 0) {
            throw new IllegalArgumentException("arg must be positive");
        }
        if (n % 3 == 0) {
            s.append("Fizz");
        }
        if (n % 5 == 0) {
            s.append("Buzz");
        }
        if (s.length() > 0) {
            return s.toString();
        }
        else{
            return String.valueOf(n);
        }
    }

}
