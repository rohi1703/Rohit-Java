package org.Practice.DesignPattern;

public class AdapterPattern {

	public class FileUtil
	{
		public boolean openFile()
		{
			System.out.println("opening the file");
			return true;
		}
		public boolean closeFile()
		{
			System.out.println("closing the file");
			return true;
		}
		public String readFromFile()
		{
			System.out.println("reading the file");
			return "read the file";
		}
		public boolean writeToFile()
		{
			System.out.println("writing to the file");
			return true;
		}
	}
	
	//client interface
	public interface FileManager
	{
		public boolean open();
		
		public boolean close();
		
		public String read();
		
		public boolean write();
		
	}
	
	//adaptor class
	public class FileManagerImpl extends FileUtil implements FileManager
	{
		public boolean open()
		{
			return openFile();
		}
		
		public boolean close()
		{
			return closeFile();
		}
		
		public String read()
		{
			return readFromFile();
		}
		
		public boolean write(){
			return writeToFile();
		}
		
	}
	
	public static void main(String[] args)
	{
		AdapterPattern ap = new AdapterPattern();
		FileManager fileManager= ap.new FileManagerImpl();
		fileManager.open();
		fileManager.read();
		fileManager.write();
		fileManager.close();
	}
	
}


