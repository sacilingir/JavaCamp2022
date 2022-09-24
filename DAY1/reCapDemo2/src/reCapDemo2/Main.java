package reCapDemo2;

public class Main {
    public static void main(String[] args) {
        double[] myList = {1.5 , 2.7 , 3.6 , 4.3 , 7.5 , 9.9};
        double total = 0;
        double maxNumber  = myList[0];

        for (double number : myList) {
            if(maxNumber < number) {
                maxNumber = number;
            }
            total += number;
        }

        System.out.println("Total: " + total);
        System.out.println("The largest number is: " + maxNumber);
    }
}


