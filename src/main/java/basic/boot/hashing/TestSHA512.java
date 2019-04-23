package basic.boot.hashing;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class TestSHA512 {
	
	private static String passwordToHash = "aeiou12345รักเธอ";

	public static void main(String[] args) throws NoSuchAlgorithmException {
		SecureRandom random = new SecureRandom();
		byte[] salt = new byte[16];
		random.nextBytes(salt);
		MessageDigest md = MessageDigest.getInstance("SHA-512");
		md.update(salt);
		byte[] hashedPassword = md.digest(passwordToHash.getBytes(StandardCharsets.UTF_8));
		System.out.println(new String(hashedPassword));
	}

}
