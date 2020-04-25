public class NumberToWords {
    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            int lastDigit = 0;
            int reversed = reverse(number);
            while (reversed > 0) {
                lastDigit = reversed % 10;
                switch (lastDigit) {
                    case 0: {
                        System.out.println("Zero");
                        break;
                    }
                    case 1: {
                        System.out.println("One");
                        break;
                    }
                    case 2: {
                        System.out.println("Two");
                        break;
                    }
                    case 3: {
                        System.out.println("Three");
                        break;
                    }
                    case 4: {
                        System.out.println("Four");
                        break;
                    }
                    case 5: {
                        System.out.println("Five");
                        break;
                    }
                    case 6: {
                        System.out.println("Six");
                        break;
                    }
                    case 7: {
                        System.out.println("Seven");
                        break;
                    }
                    case 8: {
                        System.out.println("Eight");
                        break;
                    }
                    case 9: {
                        System.out.println("Nine");
                        break;
                    }
                }
                reversed /= 10;

            }
            int zeros = getDigitCount(number) - getDigitCount(reverse(number));
            while (zeros > 0) {
                System.out.println("Zero");
                zeros--;
            }
        }
    }

    public static int reverse(int numb) {
        int lastDigit = 0;
        int reverse = 0;
        while (numb != 0) {
            lastDigit = numb % 10;
            reverse *= 10;
            reverse += lastDigit;
            numb /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        } else {
            int digitCount = 0;
            while (number > 0) {
                digitCount++;
                number /= 10;
            }
            return digitCount;
        }
    }
}
