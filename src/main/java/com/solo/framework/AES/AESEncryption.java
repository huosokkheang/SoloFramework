package com.solo.framework.AES;

import com.core.util.AES.SCrypto;

public class AESEncryption {
	
	private static String secretKey = "ilovecambodiayouilovecambodiayou";
	
	public static String Encrypt(String dataInput) throws Exception {
		return SCrypto.encryptCode(dataInput, secretKey);
	}
	
	public static String decrypt(String encryptionString) throws Exception {
		return SCrypto.decryptCode(encryptionString, secretKey);
	}
	
	public static void main(String[] args) throws Exception {
		String input = "I Love Cambodia";
		String encrypt = AESEncryption.Encrypt(input);
		String decrypt = AESEncryption.decrypt(encrypt);
		System.out.println("Data Input = " + input);
		System.out.println("Encryption = " + encrypt);
		System.out.println("Decryption = " + decrypt);
	}
}
