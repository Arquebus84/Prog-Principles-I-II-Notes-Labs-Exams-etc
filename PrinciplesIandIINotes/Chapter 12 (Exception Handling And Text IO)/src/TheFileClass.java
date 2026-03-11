
import java.io.File;
public class TheFileClass {
	//The File class contains the methods for obtaining the properties of a file/directory, and for renaming
	//	and deleting a file/directory
	
	/*
	 * NOTE: when copying a file path in Java, the \ will become \\ when utilizing the File class, when instantiating a File object:
	 * e.g.		new File("C:\\users\\matte");	//Without this syntax, there will be compiler errors
	 * */
	
	//Absolute file name (full name):
	
	//Directory path:
	
	//Relative file name:
	
	//File class UML
	/**
			java.io.File
		+File(pathname: String)					//Creates a File object for the specified pathname. The pathname may be directory or a file
		+File(parent: String, child: String)	//Creates a File object for the child under directory parent. The child may be a
													filename or a sub-directory
		+File(parent: File, child: String)		//Creates a File object for the child under directory parent. The parent is a File
													object. *In the preceding constructor, the parent is a String
		+exists(): boolean						//Returns true if the file or the directory represented by the File object exists
		+canRead(): boolean						//Returns true if the file represented by the File object exists and can be read
		+canWrite(): boolean					//Returns true if the file represented by the File object exists and can be written
		+isDirectory(): boolean					//Returns true if the File object represents a directory
		+isFile(): boolean						//Returns true if the File object represents a file
		+isAbsolute(): boolean					//Returns true if the File object is created using an absolute path name.
		+isHidden(): boolean					//Returns true if the file represented in the File object is hidden. The exact definition
													of hidden is system-dependent. On Windows, you can mark a hidden file in the File
													Properties dialog box. On UNIX systems, a file is hidden if its name begin with a 
													period (.) character
		+getAbsolutePath(): String				//Returns the complete absolute file or directory name represented by the File object
		+getCanonicalPath(): String				//Returns the same as getAbsolutePath(), except that it removes redundant names, such
													as "." and "..", from the pathname, resolves symbolic links (on UNIX), and converts
													drive letters to standard uppercase (on Windows)
		+getName(): String						//Returns the last name of the complete directory and file name represented by File 
													object. e.g. new File("c:\\book\\test.dat").getName() 
														**returns test.dat
		+getPath(): String						//Returns the complete directory and file name represented by File object. 
													e.g. new File("c:\\book\\test.dat").getPath() 
														**returns c:\book\test.dat
		+getParent(): String					//Returns the complete parent directory of the current directory or the file represented
													by the File object. e.g. new File("c:\\book\\test.dat").getParent() 
														**returns c:\book
		+lastModified(): long					//Returns the time the file was last modified
		+length(): long							//Returns the size of the file, or 0 if it does not exist or if it is a directory
		
		+listFiles(): File[]					//Returns the files under the directory for a directory File object
		+list(): String[]						//Returns a String of the file names
		
		+delete(): boolean						//Deletes the file or directory represented by this File object. The method 
													returns true if the deletion succeeds
		+renameTo(dest: File): boolean			//Renames the file or directory represented by this File object to the specified name 
													represented in dest. The method returns true if the operation succeeds
		+mkdir(): boolean						//Creates a directory represented in this File object. Returns true if the directory
													is created successfully
		+mkdirs(): boolean						//Same as mkdir(), except that it creates directory along with its parent directories
													if the parent directories do not exist.
	 */
	
	/**NOTE: As an example:
		If a file/directory does not exist (such as C:\temp.txt), then instantiating it by doing new File("C:\\temp.txt") will 
			neither create a new file/directory, nor return null. 
		*There is another example in testFile() method below
	 */
	
	public static void main(String[] args) throws Exception {
		testFile();
		
//		File f = new File("C:\\");		
//		//**More on Scanner object in the ReadingDataUsingScanner.java file
//		@SuppressWarnings({"unused", "resource"})
//		java.util.Scanner in = new java.util.Scanner(f);	//NOTE: This creates a scanner object for a File object f
			/**Could rewrite top code as:	new Scanner(f);	*/
	}
	
	public static void testFile() {
		//java.io.File file = new java.io.File("image/us.gif");	//Original path: new path is for this computer shown below
		
		File file = new File("C:\\Users\\matte\\OneDrive\\Pictures\\ComeAndSeeTitle.png");
	    System.out.println("Does it exist? " + file.exists());
	    System.out.println("The file has " + file.length() + " bytes");
	    System.out.println("Can it be read? " + file.canRead());
	    System.out.println("Can it be written? " + file.canWrite());
	    System.out.println("Is it a directory? " + file.isDirectory());
	    System.out.println("Is it a file? " + file.isFile());
	    System.out.println("Is it absolute? " + file.isAbsolute());
	    System.out.println("Is it hidden? " + file.isHidden());
	    System.out.println("Absolute path is " + file.getAbsolutePath());
	    System.out.println("Last modified on " + new java.util.Date(file.lastModified()));
	}
	
}
