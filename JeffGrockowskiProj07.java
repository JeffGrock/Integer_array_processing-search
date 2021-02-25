import java.util.Scanner;
/**
 * Write a description of class JeffGrockowskiProj07 here.
 *
 * @author Jeff Grockowski
 * @version 10/21/2019
 */
public class JeffGrockowskiProj07
{
    /* input an integer array,
     * program returns the index of the first accurance of the key in the
     * array. if not found, returns -1
     * 
     */
    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == key){
                return i;
            }
        }
        
        return -1;
    }
    
    /*input an integer array, progam sorts the array from smallest to largest.
     * 
     */
    public static void selectSort(int arr[]){
        int n = arr.length; 
  
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
  
            // Swap the found minimum element with the first 
            // element 
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp;
        } 
    }
    
    /*
     * prints all elements in the array, five per line.
     */
    public static void printArray(int arr[]){
       int count = 0;
       for (int i = 0; i < arr.length; i++){
           System.out.print(arr[i] + " : ");
           if (i == 4){
               System.out.println();
            }
        }
        return;
    }
    
    /*
     * assins each elements in the array a number between 1 and 100 inclusive
     */
    public static void initializeArray(int arr[]){
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 100);
        }
    }
    
    /*
     * returns the range of all the elements in the array.
     */
    public static int range(int arr[]){
        int min = arr[0];
        int max = arr[0];
        
        for (int i = 0; i < arr.length; i++){
            
            if (arr[i] < min){
                min = arr[i];
            }
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max - min;
    }
    
    /*
     * returns the largest element in the array
     */
    public static int largest(int arr[]){
        int max = arr[0];
        
        for (int i = 0; i < arr.length; i++){
            
            if (arr[i] > max){
                max = arr[i];
            }
       }
       return max;
    }   
    
    /*
     * returns the smallest element in the array
     */
    public static int smallest(int arr[]){
       int min = arr[0];
        
        for (int i = 0; i < arr.length; i++){
            
            if (arr[i] < min){
                min = arr[i];
            }
       }
       return min;
    }
    
    /*
     * returns the average of all elements in the array
     */
    public static double average(int arr[]){
        double total = 0;
        int count = 0;
        
        for (int i = 0; i < arr.length; i++){
            total += arr[i];
            count++;
        }
        return total / count;
    }

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int[] sample = new int[10];
        char runAgain = 'Y';
        
        System.out.println("This program tests various array processing functions.");
        System.out.println();
        

        System.out.println("after intializtion, the array is: ");
                
        initializeArray(sample);
        printArray(sample);
                
        System.out.println();
        System.out.println("The largest value in the arry is: " + largest(sample));
        System.out.println("The smallest value in the array is: " + smallest(sample));
        System.out.println("The range of the array is: " + range(sample));
        System.out.println("The average of the elements in the array is: " + average(sample));
        System.out.println();
                
        System.out.print("enter a number you would like to search the array for(1 - 100 only): ");
        int index = input.nextInt();
                
        if (linearSearch(sample, index) != -1) {
            System.out.println("The value " + index + " is located at item " + linearSearch(sample, index));
        }
        else {
            System.out.println("The value " + index + " is not in the array");
        }
                
        System.out.println("The array sorted starting the with the smallest element is: ");
        selectSort(sample);
        printArray(sample);
        System.out.println();
        System.out.println();
    }
}
/*Sample program output
  This program tests various array processing functions.

after intializtion, the array is: 
27 : 85 : 70 : 23 : 89 : 
40 : 46 : 87 : 79 : 51 : 
The largest value in the arry is: 89
The smallest value in the array is: 23
The range of the array is: 66
The average of the elements in the array is: 59.7

enter a number you would like to search the array for(1 - 100 only): 23
The value 23 is located at item 3
The array sorted starting the with the smallest element is: 
23 : 27 : 40 : 46 : 51 : 
70 : 79 : 85 : 87 : 89 :

//

 This program tests various array processing functions.

after intializtion, the array is: 
69 : 51 : 97 : 20 : 36 : 
5 : 86 : 24 : 88 : 69 : 
The largest value in the arry is: 97
The smallest value in the array is: 5
The range of the array is: 92
The average of the elements in the array is: 54.5

enter a number you would like to search the array for(1 - 100 only): 21
The value 21 is not in the array
The array sorted starting the with the smallest element is: 
5 : 20 : 24 : 36 : 51 : 
69 : 69 : 86 : 88 : 97 : 
*/
