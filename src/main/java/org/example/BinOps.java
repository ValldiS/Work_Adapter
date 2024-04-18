package org.example;

public class BinOps {
    private String answer;

    public String sum(String a, String b) {
        int result = Integer.parseInt(a, 2) + Integer.parseInt(b, 2);
        return answer = Integer.toString(result);
    }

    public String mult(String a, String b) {
        int result = Integer.parseInt(a, 2) * Integer.parseInt(b, 2);
        return answer = Integer.toString(result);
    }
}
