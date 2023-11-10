/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sortexample;

/**
 *
 * @author GaLa
 */
public class SortExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ascending sorting 1,000 data from unordered, ascend-ordered, and descend-ordered
        System.out.println("Sorting unsorted 1,000 unique data between 1 to 100,000");
        sortData(Data.unsortedData());
        System.out.println("Sorting sorted 1,000 unique data between 1 to 100,000");
        sortData(Data.ascendingSortedData());
        System.out.println("Sorting reverse-sorted 1,000 unique data between 1 to 100,000");
        sortData(Data.descendingSortedData());
        
        //Ascending sorting 100 data from unordered, ascend-ordered, and descend-ordered
        System.out.println("Sorting unsorted 100 unique data between 1 to 100,000");
        sortData(Data.unsorted10Data());
        System.out.println("Sorting sorted 100 unique data between 1 to 100,000");
        sortData(Data.ascendingSorted10Data());
        System.out.println("Sorting reverse-sorted 100 unique data between 1 to 100,000");
        sortData(Data.descendingSorted10Data());
        
        //Search data
        System.out.println("Searching from unsorted 1,000 unique data between 1 to 100,000");
        searchData(Data.unsortedData(),2016);
        searchData(Data.unsortedData(),2212);
        System.out.println("\nSearching from sorted 1,000 unique data between 1 to 100,000");
        searchData(Data.ascendingSortedData(),2016);
        searchData(Data.ascendingSortedData(),2212);
        System.out.println("\nSearching from reverse-sorted 1,000 unique data between 1 to 100,000");
        searchData(Data.descendingSortedData(),2016);
        searchData(Data.descendingSortedData(),2212);
        
    }//end method main
    
    static void searchData(int[] ref, int value){
        binarySearch(ref,value);   
        sequentialSearch(ref,value);
    }
    
    static void sortData(int[] ref){
        long time;
        
        int[] numbers = ref;
        displayValues(numbers);
        
        time = System.currentTimeMillis();
        selectionSort(numbers);
        time = System.currentTimeMillis()-time;
        printTime(time,"Selection Sort");
        displayValues(numbers);
        
        numbers = ref;
             
        time = System.currentTimeMillis();
        optimizedBubbleSort(numbers);
        time = System.currentTimeMillis()-time;
        printTime(time,"Optimized Bubble Sort");
        displayValues(numbers);
        
        numbers = ref;
        
        time = System.currentTimeMillis();
        bubbleSort(numbers);
        time = System.currentTimeMillis()-time;
        printTime(time,"Bubble Sort");
        displayValues(numbers);
        
        numbers = ref;
        
        binarySearchTree(numbers);
    }
    
    //Searching Algorithm
    static public void binarySearch(int[] numbers, int value){
        int low = 0;
        int high = numbers.length - 1;
        while(high >= low){
            int middle = (low + high)/2; // Middle index
            if(numbers[middle] == value){
                System.out.println("The number "+ value + " is at position "
                + middle + " in the list (Binary Search)");
                return; //Target value was found
            }//endif
            if(numbers[middle] < value){
                low = middle + 1;
            }//endif
            if(numbers[middle] > value){
                high = middle - 1;  
            }//endif
        }//endwhile //The value was not found
        System.out.println("The number "+ value + " is not in the list (Binary Search)");
    }//end method binarySearch

    
    static void sequentialSearch(int[] numbers, int value){
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == value) {
                System.out.println("The number "+ value + " is at position " + i + " in the list (Sequential Search)");
                return;
            }//endif
        }//endfor
        System.out.println("The number "+ value + " is not in the list (Sequential Search)");
    }
    //end of Searching Algorithm
    
    static void printTime(long time, String algorithmName){
        System.out.println(algorithmName + ": " + time + " ms");
    }

    // Sorting Algorithm
    static void binarySearchTree(int[] numbers){
        long time1,time2,timeAfter;
        time1 = System.currentTimeMillis();
        BinarySearchTree binarySearchTree = new BinarySearchTree(numbers[0]);
        time2 = System.currentTimeMillis();
        for (int data : numbers) {
            binarySearchTree.insert(binarySearchTree.node, data);
	}
        timeAfter = System.currentTimeMillis();
        printTime(timeAfter-time2,"Binary Search Tree");
        printTime(timeAfter-time1,"(object initialization included)");
        binarySearchTree.inOrder(binarySearchTree.node);
        System.out.println("\n");
    }
    
    static void bubbleSort(int[] numbers) {
        for(int i =0 ; i < numbers.length; i++){
            for(int j = 0; j < numbers.length-1; j ++){
                //if the numbers are not in order
                if(numbers[j] > numbers[j +1]){
                    //swap the numbers
                    int temp = numbers[j];
                    numbers[j] = numbers[j +1];
                    numbers[j +1] = temp;
                }//endif
            }//endfor
        }//endfor
    }//end method bubbleSort
    
    static void optimizedBubbleSort(int[] numbers) {
        boolean flag = false; //Swapping flag for BubbleSort
        for(int i =0 ; i < numbers.length; i++){
            for(int j = 0; j < numbers.length-1; j ++){
                if(numbers[j] > numbers[j +1]){
                    flag = true; //Continue swapping
                    
                    int temp = numbers[j];
                    numbers[j] = numbers[j +1];
                    numbers[j +1] = temp;
                }//endif
            }//endfor
            if(!flag){//No Swapping happened, array is sorted. Exit.
            return;
            }//endif
        }//endfor
    }//end method bubbleSort
    
    static void selectionSort(int[] numbers) {
        int indexMin = 0; //the index of the smallest number
        for(int i = 0; i< numbers.length; i++){
            indexMin = i;
            for(int j = i + 1; j < numbers.length; j++){
                if(numbers[j] < numbers[indexMin]){//if we find a smaller int,
                indexMin = j; //set it as the min
                }//endif
            }//endfor
            //we have the index of the smallest int and can swap the values
            int temp = numbers[i]; //use temp to store the value
            numbers[i] = numbers[indexMin];
            numbers[indexMin] = temp;
        }//endfor
    }//end method selectionSort
    // end of Sorting Algorithm
    
    static void displayValues(int[] numbers) {
        for(int i = 0; i< numbers.length; i++){
            System.out.print(numbers[i] + ", ");
        }//endfor
        System.out.println("\n");
    }//end method displayValues

    
}
