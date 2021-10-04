import java.util.*;
public class ListDemo {
	
	public static void populateList(Scanner sc, ArrayList<Integer> al)
	{
        	String str = sc.nextLine();
        	String[] arr = str.split(" ");
        	for(String s: arr)
        	{
            		al.add(Integer.parseInt(s));
        	}
	}

	public static void displayList(String str, ArrayList<Integer> al)
	{
		System.out.print(str + ": ");
		for (int i = 0; i < al.size(); i++) 
            		System.out.print(al.get(i) + " ");
		System.out.println();
	}

	public static void sortListDesc(ArrayList<Integer> al)
	{
		Collections.sort(al, Collections.reverseOrder());
	}

	public static int binSearch(ArrayList<Integer> al, int key)
	{
        	int index = Collections.binarySearch(al, key, Comparator.reverseOrder());
		return index;
	}

	public static void main(String[] args) {
		int key, index;
		
		// Create Scanner objects
		Scanner sc = new Scanner(System.in);  // Handle inputs
		
		// Create a list of Integers
		ArrayList<Integer> al = new ArrayList<Integer>();

		// Enter few numbers in a line and populate the list
		populateList( sc, al );	
		
		// Display list
		displayList( "Original List", al );
		
		// Sort list in descending order
		sortListDesc( al );
		
		// Display sorted list
		displayList( "Sorted List", al );
		
		// Input key
		key = sc.nextInt();
		
		// Perform binary search for key in al
		index = binSearch(al, key);
		if (index >= 0)
			System.out.println("Position: " + index);
		else
			System.out.println("Not found");
	
		// Cleanup
		sc.close();
	}
}