public class Main {
    public static void main(String[] args) {
        // Integer has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;

        int myTotal = (myMinValue / 2);
        System.out.println("Max value " + myMaxValue);

        // Byte has a width of 8
        // -128 to 127
        byte myByteValue = 10;
        byte myNewByteValue = (byte) (myByteValue / 2);
        // Short has a width of 16
        // -32768 to 32767
        short myShortValue = 32767;

        // Long has a width of 16
        // -2^63 to 2^63
        long myLongValue = 100L;

        System.out.println(myTotal);

        // Challenge
        byte aByteNumber = 100;

        short aShortNumber = 32767;

        int aIntNumber = 42;

        long aLongNumber = 50_000L + (10L * (aByteNumber + aShortNumber + aIntNumber));
        short shortTotal= (short) (1000L + 10 * (aByteNumber + aShortNumber + aIntNumber));
        System.out.println("A long number " + aLongNumber);
        System.out.println("A short total " + shortTotal);
    }
}
