package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    private static final int NUMBER = 12;
    private static final int EMPTY_VALUE = -1;
    private int[] numbers = new int[NUMBER];

    public int getTotal() {
        return total;
    }

    private int total = EMPTY_VALUE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_VALUE;
    }

    public boolean isFull() {
        return total == NUMBER - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_VALUE;
        return numbers[total--];
    }

}
