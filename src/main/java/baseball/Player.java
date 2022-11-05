package baseball;

import camp.nextstep.edu.missionutils.Console;

public class Player {
    public String getNumber() {
        System.out.print("숫자를 입력해주세요 : ");
        return Console.readLine();
    }

    public boolean isDigit(char digit) {
        return digit >= '1' && digit <= '9';
    }

    public boolean isNumber(String number) {
        boolean allDigit = true;
        int index = 0;
        while (allDigit && index < number.length()) {
            char digit = number.charAt(index);
            allDigit = isDigit(digit);
            index++;
        }
        return allDigit;
    }

    public boolean isThreeLetter(String number) {
        return number.length() == 3;
    }

    public boolean isAllDifferent(String number) {
        char first = number.charAt(0);
        char second = number.charAt(1);
        char third = number.charAt(2);
        if (first == second) {
            return false;
        }
        if (second == third) {
            return false;
        }
        return third != first;
    }
}
