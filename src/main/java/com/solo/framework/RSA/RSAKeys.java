package com.solo.framework.RSA;

import com.RSA.key.RSAGeneratorUtil;
import com.RSA.key.RSAUtil;

public class RSAKeys {
	
	public static void main(String[] args) throws Exception {  
		// Generate private and public key
		RSAGeneratorUtil.generateKeys();
		String publicKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC3bbgNFEh84UBQZZyjrIYnXCM7PDDq81KK8frmB6D8CpPPpP+7ovMCECWQ60i0TuOFMAoKPJNw1bKOTmTCmWkbxSnqQLLwx5+IHVdKYYJakoklnJzXHQ8oiUv9Gjxt4PQjQWkm+aokW50e6I5WMK7va7miuDMa6e3rIk/aga7sCwIDAQAB";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
		String privateKey = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBALdtuA0USHzhQFBlnKOshidcIzs8MOrzUorx+uYHoPwKk8+k/7ui8wIQJZDrSLRO44UwCgo8k3DVso5OZMKZaRvFKepAsvDHn4gdV0phglqSiSWcnNcdDyiJS/0aPG3g9CNBaSb5qiRbnR7ojlYwru9ruaK4Mxrp7esiT9qBruwLAgMBAAECgYAcCORu91Em6QR75TPeHjG41U+7L3Voi3zrqJVI0BSuQO2beGPvqTWL9KzRK+zGRiJnClMWgnCkd7zdHCUxSuIx7eOQdV1dWJ0HdveFAXpv1891B3Ddzsg7AYUxjEGqfXaPWifUb/JYej2fLTwe5f/RO6Mtoilk1H30R5AKYzJ/RQJBALqrDsjSVr4cN1gxh7T8GpeFSN4I3rs+3VnNQKzQT5I0sA3kk5pZ2i2bJOLRkZfN4i9bFrU5wahpj0VjsfYz440CQQD7jqFgjC3GVl680Oi+C7esnx4PYbrflS8QxPrhF3OnmS6PaAm5O0vDGMa+idcv+/iPiWnLNMVUgxLyMPLUOJv3AkAH/gb2Bjt8jEy6U/SRhTHGRwilqQ+QSNLFY4pfW9PsWKEpFx5Sv4Id7cSYiYyISWJj0KyaOczW3x4pRGl8NyCJAkBNTyc/UbVbp/2Tj6yHg3heP8RwO7u/rMx7Hd5wQNHVZxlND081swh0m++wbRJJ9+kKy9NMlRoz/9hZwDtQh1k/AkEAiIcmHN+iSCZ1AzuLm5rJjQJNDZIGV/32CVXFY3HjTS79C34fflxeCk+cmZ/DrdVx8iYRuyfXR+BqOltcXh524g==";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
		// Encrypt Text
		String encrypt = RSAUtil.encryption("hello", publicKey);
		System.out.println("encrypt text : " + encrypt);
		// Decrypt Text
		String decrypt = RSAUtil.decryption(encrypt, privateKey);
		System.out.println("decrypt text : " + decrypt);
	}
	
}
