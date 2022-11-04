package baseball;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ComputerTest {
    @Test
    void constructorTest() {
        Computer computer = new Computer();
        List<Integer> answer = computer.getAnswer();
        int result = 3;
        assertThat(answer.size()).isEqualTo(result);
        int number1 = answer.get(0);
        int number2 = answer.get(1);
        int number3 = answer.get(2);
        assertThat(number1).isNotEqualTo(number2);
        assertThat(number2).isNotEqualTo(number3);
        assertThat(number3).isNotEqualTo(number1);
    }

    @Test
    void isBallTest() {
        Computer computer = new Computer();
        List<Integer> answer = List.of(5, 3, 7);
        computer.setAnswer(answer);
        boolean result = true;
        assertThat(computer.isBall(7)).isEqualTo(result);
        assertThat(computer.isBall(3)).isEqualTo(result);
        result = false;
        assertThat(computer.isBall(4)).isEqualTo(result);
        assertThat(computer.isBall(9)).isEqualTo(result);
    }

    @Test
    void isStrikeTest() {
        Computer computer = new Computer();
        List<Integer> answer = List.of(2, 8, 5);
        computer.setAnswer(answer);
        boolean result = true;
        assertThat(computer.isStrike(1, 8)).isEqualTo(result);
        assertThat(computer.isStrike(2, 5)).isEqualTo(result);
        result = false;
        assertThat(computer.isStrike(1, 7)).isEqualTo(result);
        assertThat(computer.isStrike(0, 5)).isEqualTo(result);
        assertThat(computer.isStrike(2, 2)).isEqualTo(result);
    }

    @Test
    void judgeDigitTest() {
        Computer computer = new Computer();
        List<Integer> answer = List.of(3, 6, 1);
        computer.setAnswer(answer);
        int result = 0;
        assertThat(computer.judgeDigit(1, 2)).isEqualTo(result);
        assertThat(computer.judgeDigit(2, 4)).isEqualTo(result);
        assertThat(computer.judgeDigit(0, 8)).isEqualTo(result);
        result = 1;
        assertThat(computer.judgeDigit(0, 6)).isEqualTo(result);
        assertThat(computer.judgeDigit(1, 1)).isEqualTo(result);
        assertThat(computer.judgeDigit(2, 3)).isEqualTo(result);
        result = 2;
        assertThat(computer.judgeDigit(0, 3)).isEqualTo(result);
        assertThat(computer.judgeDigit(1, 6)).isEqualTo(result);
        assertThat(computer.judgeDigit(2, 1)).isEqualTo(result);
    }
}