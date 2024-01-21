package logical;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class c1 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String name ="mam";
		String rev ="";
		
		
		for(int i=name.length()-1; i>=0; i--) {
			
			rev=rev+name.charAt(i);
		}
		
		if(rev.equals(name)) {
			
			System.out.println("given string is pallindrom");
		}
		
		else {
			
			System.out.println("given string is not palindrom");
		}
		
	
	}}

