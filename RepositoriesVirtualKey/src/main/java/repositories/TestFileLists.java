package repositories;

//This class is mainly used to test the methods of FileList class.

public class TestFileLists {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		FilesList list = new FilesList();
		list.append("file8");list.append("file2");list.append("file40");list.append("file16");
		list.append("file3");list.append("file5");list.append("file18");list.display();
		list.append("file4");list.append("file7");list.append("file19");
		list.append("file1");list.append("file6");list.append("file17");
		list.display();
		
		binarySearch(list.listofNodes(), "file4");
		

		//list.display();
		//list.display();

		//list.delete("file3");
		//list.display();
		//list.display();
		//System.out.println();
		//System.out.println();
		//list.display();
		//System.out.println();
		//System.out.println();
		
		//list.display();
		//System.out.println();
		//System.out.println();
		
		//list.display();
		//System.out.println();
		//System.out.println();
		
		//list.display();
		//System.out.println();
		//System.out.println();
		
		//list.display();
		//list.delete("file16");
		//list.delete("file17");
		//list.delete("file1");
		//list.delete(1);
		
		/*
		for (String file : list.listofFiles()) {
			System.out.println(file);
		}
		
		System.out.println();
		
		for (FileNode file : list.listofNodes()) {
			System.out.println(file.getFileName());
		}
		
		System.out.println();
		
		for (FileNode file : list.listofNodes()) {
			System.out.println(file.getFileLocation());
		}
		
		System.out.println();
		
		for (int location : list.listofLocations()) {
			System.out.println(location);
		}
		
		System.out.println(list.getListofLocations());
		*/
	}

	static void binarySearch(FileNode [] list, String target) 
	{
		int left = 0;
		int right = list.length;		
		while (left <=right) {
			int middle= (left+right)/2;
			if (list[middle].getFileName().compareTo(target)<0) {
				left = middle+1;				
			} else if (list[middle].getFileName().compareTo(target)>0) {
				right = middle-1;
			} else {
				System.out.println("file named "+ target+ " found. "
						+ "It is stored in location "+list[middle].getFileLocation()+".");
				return;
			}
				
				}
		System.out.println("File with name " + target+" not found in the storage." );
		return;
			}
		
	
		
	
}
