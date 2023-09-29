package com.solo.framework.RSA;

import com.RSA.files.RSAGeneratorUtil;
import com.RSA.files.RSAUtil;

public class RSAFiles {
	
	public static void main(String[] args) throws Exception {  
		// Generate private and public key
		RSAGeneratorUtil.generateFiles("RSA");
		// Encrypt Text
		String encrypt = RSAUtil.encrypt("hello", "RSA");
		System.out.println("encrypt text : " + encrypt);
		// Decrypt Text
		String decrypt = RSAUtil.decrypt(encrypt, "RSA");
		System.out.println("decrypt text : " + decrypt);
	}
	
}
