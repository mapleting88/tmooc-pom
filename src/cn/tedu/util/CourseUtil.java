package cn.tedu.util;

public class CourseUtil {
	
	private static String[] course = {"java","big","c++","ui","python","ai"};
	
	public static String getCourse(){
		
		int a=(int)(Math.random()*course.length);
		
		return course[a];
	}

}
