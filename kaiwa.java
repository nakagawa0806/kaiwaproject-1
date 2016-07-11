package kaiwa;

import java.util.Scanner;

public class kaiwa {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("[今日の調子はどうですか？]");
		System.out.println("1:いつもどうり。");
		System.out.println("2:絶好調"); 
		System.out.println("3:体調が悪い");
		System.out.println("4:チョベリグです。");
		System.out.print("選択："); int n = stdIn.nextInt();
		 
		
	switch (n) {
	case 1:System.out.println("1"); break;
	case 2:System.out.println("2"); break;
	case 3:System.out.println("3"); break;
	case 4:System.out.println("4"); break;
	}
	if(n == 1) {
		System.out.println("[]");
		System.out.println("1:");
		System.out.println("2:"); 
		System.out.println("3:");
		System.out.print("選択："); int x = stdIn.nextInt();
	}
		switch (x) {
	case 1:System.out.println("1"); break;
	case 2:System.out.println("2"); break;
	case 3:System.out.println("3"); break;
	case 4:System.out.println("4"); break;
	}
	}else if(n == 2) {
		System.out.println("[]");
		System.out.println("1:");
		System.out.println("2:"); 
		System.out.println("3:");
		System.out.print("選択："); int x = stdIn.nextInt();
	}
		switch (x) {
	case 1:System.out.println("1"); break;
	case 2:System.out.println("2"); break;
	case 3:System.out.println("3"); break;
	case 4:System.out.println("4"); break;
	}
	}else if(n == 3) {
		System.out.println("[]");
		System.out.println("1:");
		System.out.println("2:"); 
		System.out.println("3:");
		System.out.print("選択："); int x = stdIn.nextInt();
	}
		switch (x) {
	case 1:System.out.println("1"); break;
	case 2:System.out.println("2"); break;
	case 3:System.out.println("3"); break;
	case 4:System.out.println("4"); break;
	}
	
	}else if(n == 4) {
		System.out.println("[]");
		System.out.println("1:");
		System.out.println("2:"); 
		System.out.println("3:");
		System.out.print("選択："); int x = stdIn.nextInt();
	}
		switch (x) {
	case 1:System.out.println("1"); break;
	case 2:System.out.println("2"); break;
	case 3:System.out.println("3"); break;
	case 4:System.out.println("4"); break;
	}
	
}
}