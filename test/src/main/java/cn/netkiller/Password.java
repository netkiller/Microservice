package cn.netkiller;

import org.jasypt.util.text.BasicTextEncryptor;

public class Password {

	public Password() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
		textEncryptor.setPassword("123456");
		String username = textEncryptor.encrypt("root");
		String password = textEncryptor.encrypt("123456");
		System.out.println("username:" + username);
		System.out.println("password:" + password);
	}

}
