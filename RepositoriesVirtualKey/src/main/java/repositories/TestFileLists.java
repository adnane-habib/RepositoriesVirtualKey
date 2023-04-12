package repositories;



public class TestFileLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FilesList list = new FilesList();
		list.append("file8", 80);
		list.append("file6", 160);
		list.append("file7", 270);
		list.append("file5", 50);

		
		list.display();
		

		list.append("file2", 23);
		list.append("file3", 322);
		list.append("file4", 1);
		list.append("file1", 9);
		
		list.display();

		list.delete("file3");

		list.display();

		list.display();
		System.out.println();
		System.out.println();
		list.append("file40");
		list.display();
		System.out.println();
		System.out.println();
		list.append("file18");
		list.display();
		System.out.println();
		System.out.println();
		list.append("file19");
		list.display();
		System.out.println();
		System.out.println();
		list.append("file17");
		list.display();
		System.out.println();
		System.out.println();
		list.append("file16");
		list.display();
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
		
		*/
		
	}

}
