package com.solo.framework.digitalSignature;

import com.core.util.file.SFileIOUtil;
import com.core.util.signature.DigitalSignature;

public class JavaDigitalSignature {

	public static void main(String[] args) throws Exception {

		String path = "C:\\Users\\SokkheangHUO\\Downloads\\Telegram Desktop\\IMG_0531.HEIC";
		String digitalSignaturePathFile = System.getProperty("user.dir");
		
		// Check file existing public and signature files
		if( !SFileIOUtil.checkFileExists(digitalSignaturePathFile + "/signature/publickey") &&
				!SFileIOUtil.checkFileExists(digitalSignaturePathFile + "/signature/signature") ) {
			// Generate JavaDigitalSignature
			DigitalSignature.GenerateDigitalSignature(digitalSignaturePathFile, path);			
		}
		//TODO Verify DigitalSignature
		boolean verify = DigitalSignature.VerifyDigitalSignature(digitalSignaturePathFile + "/signature/publickey",
				digitalSignaturePathFile + "/signature/signature", path);
		if(verify) {
			System.out.println("Verify successfully !");
		}else {
			System.out.println("Verify failed !");
		}
	}

}
