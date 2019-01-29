package cn.tedu.util;

import org.junit.Test;

public class EmailUtil {
	private static String[] addr = {"163","qq","gmail","yahoo"};
	private static String[] str = {"apple","fruit","banana","water"};
	@Test
	public static String getEmail(){
		String email = "";
		int a = (int)(Math.random()*4);
		int b = (int)(Math.random()*4);
		email = str[a] + "@" + addr[b] + ".com";
		return email;
	}

}
