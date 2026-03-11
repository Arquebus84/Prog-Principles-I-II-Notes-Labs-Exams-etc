


public class TextIOvsBinaryIO {
	//Binary I/O does not involve encoding or decoding and thus is more efficient than Text I/O
	
	//Text files are readable by people
	//Binary files store data more efficiently
	
	/**
			The text files use the extension .txt
			The extension .dat is used to name binary files
	 */
	
	/*Encoding and decoding are performed automatically for text I/O. The JVM converts Unicode to a file-specific encoding when
		writing a character, and converts a file-specific encoding to Unicode when reading a character:
			*Ex: converting "199" using text I/O to a file
				- Each character is written to the file:
				- Unicode for 1 is 0x0031 (Note: prefix 0x denotes a hex number); 
				- The ASCII code for 1 is 49 (0x31 in hex); ASCII code for 9 is 57 (0x39 in hex)
				- Thus, three bytes: 0x31, 0x39, and 0x39 are sent to the output 
	 */
	
	//Text I/O requires encoding and decoding
	/**		
		[	Text I/O Program	]<-------------Encoding/Decoding------->	(Encoding of the character is stored)
		[	 The Unicode of 	]											(in the file						)
		[		a character		]											(									)
		[	e.g. '199'			] <--------------------------------------->	(00110001	00111001	00111001	)
																				^			^			^
																			  0x31		  0x39		  0x39
	 */
	
	//Binary I/O does NOT require encoding and decoding
	/**		
	[	Binary I/O Program	]<------------------>	(Encoding of the character is stored)
	[	 A byte is 			]						(in the file						)
	[		written/read	]						(									)
	[	e.g. '199'			] <---------------->	(			11000111				)
																	^
																  0xC7
 */
	
	//**A byte-type value 199 is represented as 0xC7 (199 = 12 * 16^1 + 7)
	
	/**
	 	* Text I/O involves encoding and decoding
	 	* Binary files are independent of the encoding scheme on the host machine and thus are portable.
	 	* Text I/O is built upon Binary I/O to provide a level of abstraction for character encoding and decoding
	 	* Binary I/O does not require conversions
	 */

	public static void main(String[] args) {
		
	}

}
