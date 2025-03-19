package pl.programujodpodstaw;

public class Main {
    public static void main(String[] args) {

        int[] integersArray = new int[5];

        integersArray[0] = 0;
        integersArray[1] = 2;
        integersArray[2] = 3;
        integersArray[3] = 6;
        integersArray[4] = 5;

        int greatestNumber = 0;
        int smallestNumber = 1000000000;
        for (int numberToCheck : integersArray) {
            if (numberToCheck > greatestNumber) {
                greatestNumber = numberToCheck;
            }
            if (numberToCheck < smallestNumber && numberToCheck > 0) {
                smallestNumber = numberToCheck;
            }
        }


        int missingNumber = 0;
        boolean exists = false;
        for(int i= smallestNumber; i < greatestNumber; i++) {
            exists = false;
            for (int numberToCheck : integersArray) {
                if (numberToCheck >= smallestNumber && numberToCheck <= greatestNumber && numberToCheck == i){
                    exists = true;
                    break;
                }
            }
            if (!exists){
                missingNumber = i;
                break;
            }
        }
        if (missingNumber != 0) {
            System.out.println(missingNumber);
        }else {
            System.out.println("Nie brakuje żadnej liczby w tablicy");
        }
    }
}