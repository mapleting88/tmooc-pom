package cn.tedu.util;

public class PhoneUtil {
private static String phone = "0123456789";
private static String[] head={"13","15","17","18"};
	
	public static String getPhone(){
		char[] ph=phone.toCharArray();
		StringBuilder tel=new StringBuilder("");
		int b=(int)(Math.random()*head.length);
		
		for(int i=0;i<9;i++){
			int a=(int)(Math.random()*phone.length());
			tel=tel.append(ph[a]);
		}
		return head[b]+tel.toString();
		
		

	}
}
