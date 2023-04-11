package repositories;

public class FileNode {
	int fileLocation = 0;
	String fileName;
	FileNode nextNode;
	FileNode previousNode;
	public FileNode(String fileName, int fileLocation) {
		
		this.fileLocation = fileLocation;
		this.fileName = fileName;
		this.nextNode = null;
		this.previousNode = null;
	}
	public int getFileLocation() {
		return fileLocation;
	}
	public void setFileLocation(int fileLocation) {
		this.fileLocation = fileLocation;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public FileNode getNextNode() {
		return nextNode;
	}
	public void setNextNode(FileNode nextNode) {
		this.nextNode = nextNode;
	}
	public FileNode getPreviousNode() {
		return previousNode;
	}
	public void setPreviousNode(FileNode previousNode) {
		this.previousNode = previousNode;
	}
		
	

}
