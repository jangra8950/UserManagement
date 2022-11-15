package com.locked;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws IOException {
		FileWork fw = new FileWork();
		int ch;
		do {
			System.out.println("1. Add File");
			System.out.println("2. Delete File");
			System.out.println("3. Display File");
			System.out.println("4. Search File");
			System.out.println("5. Exit");
			System.out.println("Enter your choice");
			Scanner sc = new Scanner(System.in);
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				String name;
				System.out.println("Enter File Name");
				name = sc.next();
				fw.addFile(name);
				System.out.println(name + " added sucessfully");
				break;
			case 2:
				String nam;
				System.out.println("Enter File Name");
				nam = sc.next();
				boolean value = fw.deleteFile(nam);
				if (value)
					System.out.println(nam + " File deleted");
				else
					System.out.println(nam + " Not deleted");
				break;
			case 3:
				List<FileName> fs = fw.getFiles();
				for (FileName s : fs)
					System.out.println(s.getFileName());
				break;
			case 4:
				String nam1;
				System.out.println("Enter File Name");
				nam1 = sc.next();
				boolean value1 = fw.searchFile(nam1);
				if (value1)
					System.out.println(" File existed");
				else
					System.out.println("file not existed ");
				break;
			default:
					return;
			}
		} while (ch != 5);

	}

}
