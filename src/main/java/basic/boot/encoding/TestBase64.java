package basic.boot.encoding;

import java.util.Base64;

public class TestBase64 {

	public static void main(String[] args) {
		String originalUrl = "https://www.google.co.nz/?gfe_rd=cr&ei=dzbFV&gws_rd=ssl#q=java";
		String encodedUrl = Base64.getUrlEncoder().encodeToString(originalUrl.getBytes());
		System.out.println(encodedUrl);
		byte[] decodedBytes = Base64.getUrlDecoder().decode(encodedUrl);
		String decodedUrl = new String(decodedBytes);
		System.out.println(decodedUrl);
	}

}