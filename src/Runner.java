import java.util.ArrayList;

/**
 * Created by Brice on 9/21/16.
 */
public class Runner {

    public static void main(String[] args) {

    }

//    public boolean closeFar(int a, int b, int c) {
//        int aDifferenceB = Math.abs(a-b);
//        int aDifferenceC = Math.abs(a-c);
//        int bDifferenceC = Math.abs(b-c);
//        boolean resultCloseFar = false;
//
//        if (aDifferenceB < 2) {
//            if (aDifferenceC >= 2 && bDifferenceC >= 2) {
//                resultCloseFar = true;
//            } else {
//                resultCloseFar = false;
//            }
//        }
//
//        if (aDifferenceC < 2) {
//            if (aDifferenceB >= 2 && bDifferenceC >= 2) {
//                resultCloseFar = true;
//            } else {
//                resultCloseFar = false;
//            }
//        }
//
//        return resultCloseFar;
//    }

    public boolean closeFar(int a, int b, int c) {
        int aDifferenceB = Math.abs(a-b);
        int aDifferenceC = Math.abs(a-c);
        int bDifferenceC = Math.abs(b-c);
        boolean resultCloseFar = false;

        if (aDifferenceB < 2 || aDifferenceC < 2) {
            if (aDifferenceB >= 2 && bDifferenceC >= 2) {
                resultCloseFar = true;
            } else if (aDifferenceC >= 2 && bDifferenceC >= 2) {
                resultCloseFar = true;
            }
        }

        return resultCloseFar;
    }

    public int luckySum(int a, int b, int c) {
        int myA = 0;
        int myB = 0;
        int myC = 0;

        if (a != 13) {
            myA = a;
            if (b != 13) {
                myB = b;
                if (c != 13) {
                    myC = c;
                }
            }
        }
        int resultLuckySum = myA + myB + myC;

        return resultLuckySum;
    }

    public int maxBlock(String str) {

        int counter = 0;
        int sameLetterCounter = 0;
        int largestLetterCounted = 0;
        String currentLetter = "";


        if (str.isEmpty()) {
            return 0;
        } else {
            while (counter < str.length()) {
                String comparor = str.substring(counter, counter + 1);
                if (largestLetterCounted == 0) {
                    currentLetter = comparor;
                }
                if (currentLetter.equals(comparor)) {
                    sameLetterCounter += 1;
                    if (sameLetterCounter > largestLetterCounted) {
                        largestLetterCounted = sameLetterCounter;
                    }
                } else {
                    sameLetterCounter = 1;
                }
                currentLetter = comparor;
                counter ++;
            }
        }

        return largestLetterCounted;
    }

    public String mirrorEnds(String string) {
        int counter = 0;
        ArrayList<String> myString = new ArrayList<>();

        while (counter < string.length()) {
            if (counter != string.length()) {
                myString.add(string.substring(counter, counter + 1));
            }
            counter ++;
        }

        String resultString = "";

        for (String currentLetter : myString) {
            if (currentLetter.equals(myString.get(counter - 1))) {
                resultString += currentLetter;
                counter --;
            } else {
                break;
            }
        }

        return resultString;
    }

    public int sumNumbers(String str) {
        int counter = 0;
        int resultSum = 0;
        Integer intHolder = 0;
        String stringIntHolder = "";

        char[] myString = str.toCharArray();

        for (char currentChar : myString) {
            if (Character.isDigit(currentChar)) {
                stringIntHolder += currentChar;

            } else if (!stringIntHolder.isEmpty()) {
                intHolder = Integer.valueOf(stringIntHolder);
                stringIntHolder = "";
                resultSum += intHolder;
            }
        }
        if (!stringIntHolder.isEmpty()) {
            intHolder = Integer.valueOf(stringIntHolder);
            resultSum += intHolder;
        }

        return resultSum;
    }
}
