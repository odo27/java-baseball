package baseball;

public class Result {
    private int ball;
    private int strike;

    Result() {
        ball = 0;
        strike = 0;
    }

    public int getBall() {
        return ball;
    }

    public int getStrike() {
        return strike;
    }

    public void addBall() {
        ball++;
    }

    public void addStrike() {
        strike++;
    }

    public String ballToString() {
        if (ball == 0) {
            return null;
        }
        return ball + "볼";
    }
}
