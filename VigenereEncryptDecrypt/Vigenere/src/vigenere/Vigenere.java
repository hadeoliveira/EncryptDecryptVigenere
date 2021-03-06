package vigenere;

import java.util.Scanner;
import decrypt.Decrypt;
import encrypt.Encrypt;

public class Vigenere {

	public static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Vigenere Cipher");
		System.out.println("Type 1 if you want encrypy the message ou 2 to decrypt: ");
		byte option = scan.nextByte();
		
		if(option == 1) {
			encryptMessage();
		} else if(option == 2) {
			decryptMessage(); 
		} else {
			System.out.println("Invalid option!");
		}
	}
	
	public static void encryptMessage() {
		System.out.println("Type a message to encrypt: ");
		
		scan.nextLine();
		String message = scan.nextLine();
		
		Encrypt encrypt = new Encrypt(message);
		System.out.println("Encrypted message: " + encrypt.getMessageEncrypted());
				
	}
	
	public static void decryptMessage() {
		System.out.println("Type a message to decrypt: ");
		
		scan.nextLine();
		String message = scan.nextLine();
		
		Decrypt decrypt = new Decrypt(message);
		System.out.println("Decrypted message: " + decrypt.getMessageDecrypted());
				
	}
}
