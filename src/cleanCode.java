public class cleanCode {

    static class Result       //static class
    {

        int smallest_Element;
        int largest_Element;
    }


    //Method to find the largest and smallest number from a given array

    static Result findLargestSmallest(int[] arrayGiven, int sizeOfArray)
    {
        Result objectOfResult = new Result();

        int i;

        if (sizeOfArray == 1)
        {
            objectOfResult.largest_Element = arrayGiven[0];
            objectOfResult.smallest_Element = arrayGiven[0];
            return objectOfResult;
        }

        if (arrayGiven[0] > arrayGiven[1])
        {
            objectOfResult.largest_Element = arrayGiven[0];
            objectOfResult.smallest_Element = arrayGiven[1];
        }

        else
        {
            objectOfResult.largest_Element = arrayGiven[1];
            objectOfResult.smallest_Element = arrayGiven[0];
        }

        for (i = 2; i < sizeOfArray; i++)
        {
            if (arrayGiven[i] > objectOfResult.largest_Element)
            {
                objectOfResult.largest_Element = arrayGiven[i];
            }
            else if (arrayGiven[i] < objectOfResult.smallest_Element)
            {
                objectOfResult.smallest_Element = arrayGiven[i];
            }
        }

        return objectOfResult;
    }

    //Main method
    public static void main(String[] args)
    {
        //Given Array

        int [] arrayGiven = {1000, 11, 445, 1, 330, 3000};
        int sizeOfArray = 6;
        Result objectOfResult = findLargestSmallest(arrayGiven, sizeOfArray); //Calling of the method

        //Printing Given Array
        System.out.print(" Given array is : ");

        for(int i=0;i<sizeOfArray;i++)
        {
            System.out.print(arrayGiven[i]+" ");
        }

        //Printing the smallest and largest number

        System.out.printf("\n Smallest Element of Array is %d", objectOfResult.smallest_Element);

        System.out.printf("\n Largest Element of Array is %d", objectOfResult.largest_Element);
    }
}