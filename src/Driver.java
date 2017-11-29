public class Driver {
	public static void main(String args[]) {
		
		for (int numTrials = 1; numTrials <= 30; numTrials++) {
			int arraySize = 1000;
		    int[] size1000 = Utilities.readFile("test_data_size_1000", arraySize);
		    
		    int array2Size = 5000;
		    int[] size5000 = Utilities.readFile("test_data_size_5000", array2Size);
		    
		    int array3Size = 10000;
		    int[] size10 = Utilities.readFile("test_data_size_10", array3Size);
		    
		    long insertionDuration1000 = Utilities.timeInsertion(size1000);
		    long mergeDuration1000 = Utilities.timeMerge(size1000, arraySize);
		    long selectionDuration1000 = Utilities.timeSelection(size1000);
		    
		    long insertionDuration5000 = Utilities.timeInsertion(size5000);
		    long mergeDuration5000 = Utilities.timeMerge(size5000, array2Size);
		    long selectionDuration5000 = Utilities.timeSelection(size5000);
		    
		    long insertionDuration10 = Utilities.timeInsertion(size10);
		    long mergeDuration10 = Utilities.timeMerge(size10, array3Size);
		    long selectionDuration10 = Utilities.timeSelection(size10);
		    
		    Utilities.writeNumToFile("insertion_times_1000", insertionDuration1000);
		    Utilities.writeNumToFile("merge_times_1000", mergeDuration1000);
		    Utilities.writeNumToFile("selection_times_1000", selectionDuration1000);
		    
		    Utilities.writeNumToFile("insertion_times_5000", insertionDuration5000);
		    Utilities.writeNumToFile("merge_times_5000", mergeDuration5000);
		    Utilities.writeNumToFile("selection_times_5000", selectionDuration5000);
		    
		    Utilities.writeNumToFile("insertion_times_10", insertionDuration10);
		    Utilities.writeNumToFile("merge_times_10", mergeDuration10);
		    Utilities.writeNumToFile("selection_times_10", selectionDuration10);
		    
		}
	}
}
