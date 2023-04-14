package zipcode;

public class Hamming {

    String s = "";
    String s1 = "";

    public Hamming (String s, String s1) {
        if (s.length() != s1.length()){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        this.s = s;
        this.s1 = s1;
    }

    public int getHammingDistance() {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s1.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}