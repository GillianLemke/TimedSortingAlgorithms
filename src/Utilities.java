import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Utilities {
	
	static int[] readFile(String filename, int arraySize) {
		Scanner infile;
		
	    int currentArrayIndex = 0;
	    int[] newArray = new int[arraySize];
	    
	    try {
	        infile = new Scanner(new FileInputStream("/Users/gillian/Dropbox/Fall2017/STAT360/FinalProject/src/" + filename));
	        
	        for (int i = 0; i < arraySize; i++) {
	        		newArray[currentArrayIndex] = infile.nextInt();
	        }
	        
	        infile.close();
	    } catch (Exception e) {
	        System.out.println(e);
	    }
	    return newArray;
	}
	
	static long timeInsertion(int[] arr) {
		long startTimeInsertion = System.nanoTime();
	    InsertionSort.sort(arr);
	    long endTimeInsertion = System.nanoTime();
	    return (endTimeInsertion - startTimeInsertion);
	}

	static long timeMerge(int[] arr, int size) {
		long startTimeInsertion = System.nanoTime();
	    MergeSort.sort(arr, 0, size - 1);
	    long endTimeInsertion = System.nanoTime();
	    return (endTimeInsertion - startTimeInsertion);
	}

	static long timeSelection(int[] arr) {
		long startTimeInsertion = System.nanoTime();
	    SelectionSort.sort(arr);
	    long endTimeInsertion = System.nanoTime();
	    return (endTimeInsertion - startTimeInsertion);
	}
	
	static void writeNumToFile(String filename, long time) {
		PrintWriter writeToFile;
		try {
            writeToFile = new PrintWriter(new FileOutputStream(filename, true));
            writeToFile.print(time + "\n");
            writeToFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("Input file not found. Quitting.");
        }
	}
}
