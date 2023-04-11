package repositories;



public class FilesList {
	private FileNode head;
	private int fileCounts = 0;
	
	public FileNode getHead() {
		return head;
	}
	public int getListSize() {
		return fileCounts;
	}
	
	public void append(String fileName, int position) {
		FileNode newNode = new FileNode(fileName, position);
		if (head == null) { // Creates a new list if the list is empty
			head = newNode;
			System.out.println(newNode.getFileName()+" sucessfully added");
			return;
		}
		
		FileNode current = head;	
		
		while(current.nextNode !=null && current.getFileName().compareTo(current.nextNode.getFileName())<0) {
			current = current.nextNode;
			System.out.println("I am in the while loop");
					}
		if (current.nextNode ==null) {
			System.out.println("I am in the if ");
			current.nextNode = newNode;
		} else {
			System.out.println("I am in the else");
			current.nextNode = current;
			current = newNode;
		}
		System.out.println(newNode.getFileName()+" sucessfully added");
		}
	
	public void display() {
		FileNode current = head;
		
		while(current!=null) {
			System.out.println(current.getFileName()+" at "+ current.getFileLocation() );
			current = current.nextNode;
		}
		System.out.println("null");
		
	}
	

}
