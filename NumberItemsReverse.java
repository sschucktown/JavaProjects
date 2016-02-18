package numberitemsreverse;
import java.util.Scanner;
/**
 *
 * @author Scott
 */
public class NumberItemsReverse 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int arraySize = 0;
        int startIndex = 0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select size of array: ");
        arraySize = scanner.nextInt();
        int list[] = new int[arraySize];
        System.out.println("Enter array elements: ");
            for(int i = 0; i<arraySize; i++)
               {
                list[i] = scanner.nextInt();
               }
            
        System.out.println("Please enter the start index value: ");
        startIndex = scanner.nextInt();
        numberItemsReverse(list, startIndex);
    }
    
    public static int numberItemsReverse(int[] list, int startIndex)
    {
        int counter = 0;
        
        if(startIndex == list.length)
        {
            return 0;
        }
        
        else
        {
            counter = numberItemsReverse(list, startIndex -1) +1;
            System.out.println("the count is:" + counter);
            
        }
        return counter;
    }
    
}
