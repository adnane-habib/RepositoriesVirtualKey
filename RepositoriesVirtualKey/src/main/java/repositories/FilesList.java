package repositories;



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
			append(fileName, fileCounts); 
			
			}
	
	public void append(String fileName, int position) 
{
		// appending the elements in ascending order when location is known.
		fileCounts++;
		FileNode newNode = new FileNode(fileName, position);
		if (head == null) { // Creates a new list if the list is empty
			head = newNode;
			System.out.println(newNode.getFileName()+" sucessfully added");
			return;
		}
		

		// checking if the element should be in the beginning.
		if (head.getFileName().compareTo(newNode.getFileName())>0) {
			
			newNode.nextNode = head;
			head = newNode;
			System.out.println(newNode.getFileName()+" sucessfully added");
			return;
		}
		
		
		FileNode current = head;
		

		while(current.nextNode !=null ) {
			// traversing the elements and detecting the right spot where to insert the new element
			
			if (current.nextNode.getFileName().compareTo(newNode.getFileName())>0) {
				
				FileNode temp = current.nextNode;
				
				current.nextNode = newNode;
				newNode.nextNode = temp;
				System.out.println(newNode.getFileName()+" sucessfully added");
				return;
			}

			
			current = current.nextNode;
					}
		
		current.nextNode = newNode;		
		System.out.println(newNode.getFileName()+" sucessfully added");
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
}
