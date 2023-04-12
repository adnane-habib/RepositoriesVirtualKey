package repositories;
import java.util.LinkedList;
import java.util.Queue;
//import java.util.Arrays;

public class FilesList {
	private FileNode head;
	private int fileCounts = 0; // for counting the list size
	private Queue <Integer> listofLocations = new LinkedList<>();//storing empty spots
	//getters 
	public FileNode getHead() 
{
		return head;
	}
	
	public int getListSize() 
{
		return fileCounts;
	}
	
	public Queue<Integer> getListofLocations() {
		return listofLocations;
	}	
	
	public void append(String fileName) 
	{
			// appending the elements in ascending order.						
		int location = fileCounts+1;
		try {
			location = listofLocations.remove(); // detecting if empty spots are available to maximize utilization of space
		}
		catch(Exception e) {
			
		}
		
		append(fileName, location); 
			
			}
	


	public void append(String fileName, int position) 
	{
		// appending the elements in ascending order when location is known.
		fileCounts++;
		FileNode newNode = new FileNode(fileName, position);
		if (head == null) { // Creates a new list if the list is empty
			head = newNode;
			System.out.println(newNode.getFileName()+" successfully added");
			return;
		}
		

		// checking if the element should be in the beginning.
		if (head.getFileName().compareTo(newNode.getFileName())>0) {
			
			newNode.nextNode = head;
			head = newNode;
			System.out.println(newNode.getFileName()+" successfully added");
			return;
		}
		
		
		FileNode current = head;
		

		while(current.nextNode !=null ) {
			// traversing the elements and detecting the right spot where to insert the new element
			
			if (current.nextNode.getFileName().compareTo(newNode.getFileName())>0) {
				
				FileNode temp = current.nextNode;
				
				current.nextNode = newNode;
				newNode.nextNode = temp;
				System.out.println(newNode.getFileName()+" successfully added");
				return;
			}

			
			current = current.nextNode;
					}
		
		current.nextNode = newNode;		
		System.out.println(newNode.getFileName()+" successfully added");
		}
	
	public void display() // for displaying list content
	{
		System.out.println("There are "+ getListSize() + " in the list.");
		FileNode current = head;
		
		while(current!=null) {
			System.out.println(current.getFileName()+" at "+ current.getFileLocation() );
			current = current.nextNode;
		}
		System.out.println();
		
	}

	public FileNode delete(String fileName) 
	// deleting file with file name
	{
		if (head==null) {
			System.out.println("Linked list is empty, nothing to delete");
			return null;
		}
		
		if (head.getFileName()==fileName) {
			FileNode temp = head;
			head = head.nextNode;
			listofLocations.offer(head.getFileLocation()); // recording empty location 
			fileCounts--; // decrement counter
			return temp;
		}
		
		FileNode current = head;
		FileNode previous = null;
		
		while(current!=null && current.getFileName()!=fileName) {
			
				previous = current;
				current = current.nextNode;	

		}
				if 	(current!=null) {
					previous.nextNode = current.nextNode;
					listofLocations.offer(current.getFileLocation());
					System.out.println(fileName + " has been succesffully deleted.");
					fileCounts--;
					return current;
				} else {
					System.out.println("File not found, nothing to delete");
					return null;
				}		
					
		}
	
	public FileNode delete(int fileLocation)
	// deleting file with file location
	{
		if (head==null) {
			System.out.println("Linked list is empty, nothing to delete");
			return null;
		}
		
		if (head.getFileLocation()==fileLocation) {
			FileNode temp = head;
			head = head.nextNode;
			fileCounts--;// updating counter
			listofLocations.offer(head.getFileLocation());//recording empty location
			return temp;
			
		}
		
		FileNode current = head;
		FileNode previous = null;
		
		while(current!=null && current.getFileLocation()!=fileLocation) {
			
				previous = current;
				current = current.nextNode;	

		}
				if 	(current!=null) {
					previous.nextNode = current.nextNode;
					System.out.println(current.getFileName() + " at "+ current.getFileLocation() +" location has been succesffully deleted.");
					fileCounts--;
					listofLocations.offer(current.getFileLocation());
					return current;
				} else {
					System.out.println("File not found, nothing to delete");
					return null;
				}		
					
		}
	
	public FileNode[] listofNodes()
	{ // for troubleshooting, to display the list of nodes
		FileNode[] listofNodes ;
		
		if (head == null) {
			return null;
		}
		
		listofNodes = new FileNode[fileCounts];
		
		FileNode current = head;
		int i = 0;
		while (current!= null) {
			listofNodes[i] = current;
			i++;
			current = current.nextNode;
		}
		
		return listofNodes;		
	}
	
	public String[] listofFiles()
	{// for troubleshooting, to display the list of files
		String[] listofFiles ;
		
		if (head == null) {
			return null;
		}
		
		listofFiles = new String[fileCounts];
		
		FileNode current = head;
		int i = 0;
		while (current!= null) {
			listofFiles[i] = current.getFileName();
			i++;
			current = current.nextNode;
		}
		
		return listofFiles;		
	}
	
	public int[] listofLocations()
	{// for troubleshooting, to display the list of occupied locations
		int[] listofLocations ;
		
		if (head == null) {
			return null;
		}
		
		listofLocations = new int[fileCounts];
		
		FileNode current = head;
		int i = 0;
		while (current!= null) {
			listofLocations[i] = current.getFileLocation();
			i++;
			current = current.nextNode;
		}
		
		return listofLocations;		
	}
	
}
