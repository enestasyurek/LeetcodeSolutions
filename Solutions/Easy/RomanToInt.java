package Easy;

public class RomanToInt {
    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && getValue(s.charAt(i)) > getValue(s.charAt(i - 1))) {
                result += getValue(s.charAt(i)) - 2 * getValue(s.charAt(i - 1));
            } else {
                result += getValue(s.charAt(i));
            }
        }
        return result;
    }

    public int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

}

