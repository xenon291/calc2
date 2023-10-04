import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String a;
        a = getInt();
        String res;
        res = calc(a);
        System.out.println(res);
    }

    public static String getInt() {
        String num;
        num = scanner.nextLine();

        return num;
    }

    public static String calc(String a) {
        String[] p;
        String res;
        int num1;
        int num2;
        char c;
        int r;
        p = a.split(" ");
        int pL = p.length;
        c = p[1].charAt(0);
        if (pL!=3) {
            throw new ArithmeticException("throws Exception");
        }
        if ((a.charAt(0)=='X')|(a.charAt(0)=='I')|(a.charAt(0)=='V')) {
            if ((p[2].charAt(0) == '1') | (p[2].charAt(0) == '2') | (p[2].charAt(0) == '3') | (p[2].charAt(0) == '4') | (p[2].charAt(0) == '5') | (p[2].charAt(0) == '6') | (p[2].charAt(0) == '7') | (p[2].charAt(0) == '8') | (p[2].charAt(0) == '9')) {
             throw new ArithmeticException("throws Exception");
            }
            num1 = romanNumeral(p[0]);
            num2 = romanNumeral(p[2]);
            r = oper(num1, num2, c);
            if (r <= 0) {
                throw new ArithmeticException("throws Exception");
            }
                res = romanSolution(r);
        }
        else if ((a.charAt(0)=='1')|(a.charAt(0)=='2')|(a.charAt(0)=='3')|(a.charAt(0)=='4')|(a.charAt(0)=='5')|(a.charAt(0)=='6')|(a.charAt(0)=='7')|(a.charAt(0)=='8')|(a.charAt(0)=='9'))
        {
            if ((p[2].charAt(0) == 'X') | (p[2].charAt(0) == 'I') | (p[2].charAt(0) == 'V')) {
            throw new ArithmeticException("throws Exception");
            }
            num1 = Integer.parseInt(String.valueOf(p[0]));
            num2 = Integer.parseInt(String.valueOf(p[2]));
            if((num1>10)|(num2>10)|(num1<1)|(num2<1)) {
            throw new ArithmeticException("throws Exception");
            }
            r = oper(num1, num2, c);
            res = Integer.toString(r);
        }
        else {
            throw new ArithmeticException("throws Exception");
        }

        return res;
    }
    public static int oper(int num1, int num2, char d) {
        int r;
        Integer itr = null;
        switch (d){
            case '+':
                r = num1+num2;
                break;
            case '-':
                r = num1-num2;
                break;
            case '*':
                r = num1*num2;
                break;
            case '/':
                r = num1/num2;
                break;
            default:
                throw new ArithmeticException("throws Exception");
        }
        return r;
    }
    public static int romanNumeral(String roman) {
        if (roman.equals("I")) {
            return 1;
        } else if (roman.equals("II")) {
            return 2;
        } else if (roman.equals("III")) {
            return 3;
        } else if (roman.equals("IV")) {
            return 4;
        } else if (roman.equals("V")) {
            return 5;
        } else if (roman.equals("VI")) {
            return 6;
        } else if (roman.equals("VII")) {
            return 7;
        } else if (roman.equals("VIII")) {
            return 8;
        } else if (roman.equals("IX")) {
            return 9;
        } else if (roman.equals("X")) {
            return 10;
        } else {
            return 0;
        }
    }
    public static String romanSolution(int arabNumeral) {
        String[] romanAll = {"0","I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX",
                "*****", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII",
                "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII",
                "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX",
                "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII",
                "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };
        String q = romanAll[arabNumeral];
        return q;

    }
}