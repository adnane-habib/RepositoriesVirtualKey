package repositories;

import java.util.Arrays;

public class FilesList {
	private FileNode head;
	private int fileCounts = 0;
	
	public FileNode getHead() 
{
		return head;
	}
	
	public int getListSize() 
{
		return fileCounts;
	}
	
	public void append(String fileName) 
	{
			// appending the elements in ascending order when location is known.						
		int[] listLocation = this.listofLocations();
		
		int location = 2;
		//System.out.println("Im outside the while loop"+ Arrays.asList(listLocation).contains(location));
		while (!(Arrays.binarySearch(listLocation, location)< 0)) {
			System.out.println("Im in the while loop"+ Arrays.asList(listLocation).contains(location));
			location++;
		}
		System.out.println("Im outside the while loop "+ Arrays.asList(listLocation).contains(location));
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
	
	public void display() 
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
			head = head.nextNode;
		}
		
		FileNode current = head;
		FileNode previous = null;
		
		while(current!=null && current.getFileName()!=fileName) {
			
				previous = current;
				current = current.nextNode;	

		}
				if 	(current!=null) {
					previous.nextNode = current.nextNode;
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
			head = head.nextNode;
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
					return current;
				} else {
					System.out.println("File not found, nothing to delete");
					return null;
				}		
					
		}
	
	public FileNode[] listofNodes()
	{
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
	{
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
	{
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
