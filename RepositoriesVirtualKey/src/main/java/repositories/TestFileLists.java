package repositories;



public class TestFileLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FilesList list = new FilesList();
		list.append("file8");
		list.append("file6");
		list.append("file7");
		list.append("file5");

		
		//list.display();
		

		list.append("file2");
		list.append("file3");
		list.append("file4");
		list.append("file1");
		
		//list.display();

		//list.delete("file3");

		//list.display();

		//list.display();
		//System.out.println();
		//System.out.println();
		list.append("file40");
		list.display();
		//System.out.println();
		//System.out.println();
		list.append("file18");
		//list.display();
		//System.out.println();
		//System.out.println();
		list.append("file19");
		//list.display();
		//System.out.println();
		//System.out.println();
		list.append("file17");
		//list.display();
		//System.out.println();
		//System.out.println();
		list.append("file16");
		//list.display();
		//list.delete("file16");
		//list.delete("file17");
		//list.delete("file1");
		//list.delete(1);
		//list.display();
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

}
