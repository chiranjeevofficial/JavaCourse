package Assignment_20;
public class Main {
    public static int greatestNumber(int []intArray){
        int greatestValue=0;
        for (int j : intArray)
            if (greatestValue < j)
                greatestValue = j;
        return greatestValue;
    }

    public static int smallestNumber(int []intArray){
        int smallestValue=Main.greatestNumber(intArray);
        for(int j : intArray)
            if(smallestValue > j)
                smallestValue = j;
        return smallestValue;
    }

    public static double sumIntNumber(int []numArray){
        int sum=0;
        for ( int j : numArray)
            sum+=j;
        return sum;
    }

    public static int frequencyOfNumber(int []numArray, int targetNumber){
        int frequency=0;
        for(int i : numArray)
            if(i == targetNumber)
                frequency++;
        return frequency;
    }

    public static void main(String[] args) {
        System.out.println("Namaste Java");
        System.out.println("GreatestNumber is: "+Main.greatestNumber(new int[]{23,44,56,76,88,6}));
        System.out.println("GreatestNumber is: "+Main.smallestNumber(new int[]{23,44,56,76,88,6}));
        System.out.println("GreatestNumber is: "+Main.sumIntNumber(new int[]{23,44,56,76,88,6}));
        System.out.println(Main.frequencyOfNumber(new int[]{2,3,1,2,3,2,1,2,3},2));
    }
}
