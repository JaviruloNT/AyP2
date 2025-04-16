package test.database;

public class Encoder {
    private static final int MULT = 93;
    private static final int SUMA = 33;
    public String createKey() {
        char[] key = new char[64];
        for (int i = 0; i < 64; i++) {
            key[i] = (char)((int)(Math.random()*MULT) + SUMA);
        }
        return key.toString();
    }
    public char addChars(char a,char b) {
        char c = (char)((int)a + (int)b);
        while (c > 126) {
            c -= 127;
        }
        return c;
    }
    public String encrypt(String string,String key) {
        char[] encoded = new char[64];
        //
        for (int i = 0; i < 64; i++) {
            for (int j = 0; j < string.length(); j++) {
                encoded[(string.length()*i)+j] = addChars(string.charAt(j),key.charAt((string.length()*i)+j));
            }
        }
        return encoded.toString();
    }
}
