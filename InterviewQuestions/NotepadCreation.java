package InterviewQuestions;

import java.io.File;
import java.io.FileWriter;
import java.io.RandomAccessFile;

public class NotepadCreation {
	
	public static String CreateFile(String extension)
	{
		//Path of the Directory
		String path=System.getProperty("user.dir");
		String fname=path+File.separator+"fileNamenew."+extension;
		
		File file=new File(fname);
		boolean exists=file.exists();
				{
			if(exists)
			{
				boolean result=file.delete();
						System.out.println(file.getName()+ "deleted");
				
			}
			exists=file.exists();
			if(!exists)
			{
				System.out.println("not exists");
				
				try {
					file.createNewFile();
					FileWriter fw=new FileWriter(file);
					fw.write("How are you doing you are today?");
					fw.close();
					//RandomAccessFile f=new RandomAccessFile(file, "rw");
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
				}
		
		return fname;
	}
	public static void main(String[] args) {
		String fname=CreateFile("txt");
	}

}
