package repositories;



public class TestFileLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FilesList list = new FilesList();
		list.append("file8", 80);
		list.append("file6", 60);
		list.append("file7", 70);
		list.append("file5", 50);

		
		list.display();
		

		list.append("file2", 20);
		list.append("file3", 30);
		list.append("file4", 40);
		list.append("file1", 10);
		
		list.display();
		list.delete("file3");
		list.display();
		list.append("file3");
		list.display();
	}

}
