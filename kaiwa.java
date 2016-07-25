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
	case 1:System.out.println("1:いつもどおり"); break;
	case 2:System.out.println("2:絶好調"); break;
	case 3:System.out.println("3:体調が悪い"); break;
	case 4:System.out.println("4:チョベリグです。"); break;
	}
	if(n == 1) {
		System.out.println("[何もなかったんですか?]");
		System.out.println("1:何にもない");
		System.out.println("2:そういえばいい事があった"); 
		System.out.println("3:そういえば悪い事があった");
		System.out.println("4:そういえば悲しい事があった");
		System.out.print("選択："); int x = stdIn.nextInt();
	}
		switch (x) {
	case 1:System.out.println("1:何にもない"); break;
	case 2:System.out.println("2:そういえばいい事があった"); break;
	case 3:System.out.println("3:そういえば悪い事があった"); break;
	case 4:System.out.println("4:そういえば悲しい事があった"); break;
	}
	if(x == 1) {
		System.out.println("[なかったんですか?]");
		System.out.println("1:あ、そういえば");
		System.out.println("2:そちらはなんかありました"); 
		System.out.println("3:明日はありますかね？");
		System.out.println("4:暇でした");
		System.out.print("選択:"); int a1 = stdIn.nextInt();
	}
		switch (a1) {
	case 1:System.out.println("1:あ、そういえば"); break;
	case 2:System.out.println("2:そちらはなんかありました？"); break;
	case 3:System.out.println("3:明日はありますかね？"); break;
	case 4:System.out.println("4:暇でした"); break;
	}
	}else if(n == 2) {
		System.out.println("[]");
		System.out.println("1:");
		System.out.println("2:"); 
		System.out.println("3:");
		System.out.print("選択"); int x = stdIn.nextInt();
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
		System.out.print("選択:"); int x = stdIn.nextInt();
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
		System.out.print("選択:"); int x = stdIn.nextInt();
	}
		switch (x) {
	case 1:System.out.println("1"); break;
	case 2:System.out.println("2"); break;
	case 3:System.out.println("3"); break;
	case 4:System.out.println("4"); break;
	}
}
}