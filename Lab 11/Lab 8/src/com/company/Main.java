package com.company;
import java.io.*;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws IOException {
		try {
			Scanner in = new Scanner(System.in);
			StringBuffer data = new StringBuffer();
				while ((!(data=.readLine()).equals("ESC")){
				System.out.println("Введите число");
				String str = in.nextLine();
				data.append(in.nextLine()).append("\n");
				System.out.println(data.toString());
				boolean answer = str.matches("(((1[0-9][0-9])|(2[0-5][0-5]))\\.){3}((1[0-9][0-9])|(2[0-5][0-5]))");
				if (answer) {
					System.out.println("OK");
				} else {
					System.out.println("Error");
				}
			}
		}
	}
}