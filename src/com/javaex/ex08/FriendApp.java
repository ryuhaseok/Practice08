package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("친구를 3명 등록해 주세요");
		String f1 = sc.nextLine();
		String f2 = sc.nextLine();
		String f3 = sc.nextLine();
		
		String[] sArray = new String[3];
		sArray[0] = f1;
		sArray[1] = f2;
		sArray[2] = f3;
		
		for(int i=0; i<sArray.length; i++) {
			String[] dArray = sArray[i].split(" ");
			System.out.println(dArray[i])
		}
		
		
		sc.close();
		
	}

}
