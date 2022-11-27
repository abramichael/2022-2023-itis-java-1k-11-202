package ru.kpfu.itis.group202.longarithmetics;

public class NaturalNumber {

    private int[] digits;
    private int size = 0;
    // private int sign; - for integer

    private NaturalNumber(int[] digits, int size) {
        this.digits = digits;
        this.size = size;
    }

    public NaturalNumber(String input) {

        digits = new int[(int) (input.length() * 1.5)];
        for (int i = input.length() - 1; i >= 0; i--) {
            digits[size] = input.charAt(i) - '0';
            size++;
        }

    }

    public String toString() {
        String n = "";
        for (int i = size - 1; i >= 0; i--) {
            n = n + digits[i];
        }
        return n;
    }

    public NaturalNumber add(NaturalNumber x) {
        int maxLen = Math.max(this.digits.length, x.digits.length);
        int[] rez = new int[maxLen];
        int maxSize = Math.max(this.size, x.size);
        int d = 0;
        for(int i = 0; i < maxSize; i++ ) {
            int rez0 = this.digits[i] + x.digits[i] + d;
            rez[i] = rez0 % 10;
            d = rez0 / 10;
        }
        if (d == 1){
            rez[maxSize] = 1;
            maxSize += 1;
        }
        return new NaturalNumber(rez, maxSize);
    }

    public static void main(String[] args) {

        NaturalNumber first =
                new NaturalNumber("12376124687921354652136458623641656132465623416873214");
        NaturalNumber second = new NaturalNumber("12376124687921354652136458623641656132465623416873214");
        System.out.println(first);
        System.out.println(second);
        System.out.println(first.add(second));
    }

}
