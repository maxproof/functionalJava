package collections02;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.UUID;

public class Collections02 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		//encode basic
		String str64 = Base64.getEncoder().encodeToString("max proof".getBytes("utf-8"));
		System.out.println(str64);
		//decode basic
		byte[] octets = Base64.getDecoder().decode(str64);
		System.out.println(new String(octets, "utf-8"));
		
		//encode URL
		String strURL64 = Base64.getUrlEncoder().encodeToString("server/data?param".getBytes("utf-8"));
		System.out.println(strURL64);
		
		//MIME
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 10; i++) {
			sb.append(UUID.randomUUID().toString());
		}
		byte[] data = sb.toString().getBytes("utf-8");
		String strMIME64 = Base64.getMimeEncoder().encodeToString(data);
		System.out.println(strMIME64);
		
	}

}
