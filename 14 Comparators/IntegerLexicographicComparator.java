import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class IntegerLexicographicComparator implements Comparator<Integer> {

    public static int [] getNumberOfDigits(int n) {
        if (n == 0) {
            return new int [] {1, 1};
        }
        int tens = 1;
        int nDigits = 1;
        while (n >= tens) {
            tens *= 10;
            nDigits += 1;
        }
        return new int[]{nDigits - 1, tens / 10};
    }

    @Override
    public int compare(Integer n1, Integer n2) {
        // узнать количество цифр в каждом числе
        int [] result = getNumberOfDigits(n1);
        int nDigits1 = result[0];
        int tenPower1 = result[1];
        result = getNumberOfDigits(n2);
        int nDigits2 = result[0];
        int tenPower2 = result[1];



        int minDigits = nDigits1 > nDigits2 ? nDigits2 : nDigits1;


        int i = 1;
        while (i <= minDigits) {
            int digit1 = n1 / tenPower1;
            int digit2 = n2 / tenPower2;
            if (digit1 != digit2) {
                return digit1 - digit2;
            } else {
                i++;
                n1 = n1 % tenPower1;
                n2 = n2 % tenPower2;
                tenPower1 /= 10;
                tenPower2 /= 10;
            }
        }
        if (nDigits1 == nDigits2) {
            return 0;
        } else {
            return nDigits1 - nDigits2;
        }


    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(105);
        a.add(2);
        a.add(1);
        a.add(13);
        a.add(25);
        a.add(6);
        System.out.println(a);
        Collections.sort(a, new IntegerLexicographicComparator());
        System.out.println(a);
    }

}
