package cn.tedu.thread;

import java.util.ArrayList;
import java.util.List;

public class Start {

	static List<String> list = new ArrayList<String>();

	public static void main(String[] args) {

		new Thread(new UserCreate()).start();
		new Thread(new UserCreate()).start();
		new Thread(new UserCreate()).start();
		new Thread(new UserCreate()).start();
		new Thread(new UserCreate()).start();
		new Thread(new UserCreate()).start();
		new Thread(new UserCreate()).start();
		new Thread(new UserCreate()).start();
		new Thread(new UserCreate()).start();
		new Thread(new UserCreate()).start();

	}

}
