package kaiwa;

import java.util.Scanner;

public class kaiwa {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("[$B:#F|$ND4;R$O$I$&$G$9$+!)(B]");
		System.out.println("1:$B$$$D$b$I$&$j!#(B");
		System.out.println("2:$B@d9%D4(B"); 
		System.out.println("3:$BBND4$,0-$$(B");
		System.out.println("4:$B%A%g%Y%j%0$G$9!#(B");
		System.out.print("$BA*Br!'(B"); int n = stdIn.nextInt();
		 
		
	switch (n) {
	case 1:System.out.println("1:$B$$$D$b$I$*$j(B"); break;
	case 2:System.out.println("2:$B@d9%D4(B"); break;
	case 3:System.out.println("3:$BBND4$,0-$$(B"); break;
	case 4:System.out.println("4:$B%A%g%Y%j%0$G$9!#(B"); break;
	}
	if(n == 1) {
		System.out.println("[$B2?$b$J$+$C$?$s$G$9$+(B?]");
		System.out.println("1:$B2?$K$b$J$$(B");
		System.out.println("2:$B$=$&$$$($P$$$$;v$,$"$C$?(B"); 
		System.out.println("3:$B$=$&$$$($P0-$$;v$,$"$C$?(B");
		System.out.println("4:$B$=$&$$$($PHa$7$$;v$,$"$C$?(B");
		System.out.print("$BA*Br!'(B"); int x = stdIn.nextInt();
	}
		switch (x) {
	case 1:System.out.println("1:$B2?$K$b$J$$(B"); break;
	case 2:System.out.println("2:$B$=$&$$$($P$$$$;v$,$"$C$?(B"); break;
	case 3:System.out.println("3:$B$=$&$$$($P0-$$;v$,$"$C$?(B"); break;
	case 4:System.out.println("4:$B$=$&$$$($PHa$7$$;v$,$"$C$?(B"); break;
	}
	if(x == 1) {
		System.out.println("[$B$J$+$C$?$s$G$9$+(B?]");
		System.out.println("1:$B$"!"$=$&$$$($P(B");
		System.out.println("2:$B$=$A$i$O$J$s$+$"$j$^$7$?(B"); 
		System.out.println("3:$BL@F|$O$"$j$^$9$+$M!)(B");
		System.out.println("4:$B2K$G$7$?(B");
		System.out.print("$BA*Br(B:"); int a1 = stdIn.nextInt();
	}
		switch (a1) {
	case 1:System.out.println("1:$B$"!"$=$&$$$($P(B"); break;
	case 2:System.out.println("2:$B$=$A$i$O$J$s$+$"$j$^$7$?!)(B"); break;
	case 3:System.out.println("3:$BL@F|$O$"$j$^$9$+$M!)(B"); break;
	case 4:System.out.println("4:$B2K$G$7$?(B"); break;
	}
	}else if(n == 2) {
		System.out.println("[]");
		System.out.println("1:");
		System.out.println("2:"); 
		System.out.println("3:");
		System.out.print("$BA*Br(B"); int x = stdIn.nextInt();
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
		System.out.print("$BA*Br(B:"); int x = stdIn.nextInt();
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
		System.out.print("$BA*Br(B:"); int x = stdIn.nextInt();
	}
		switch (x) {
	case 1:System.out.println("1"); break;
	case 2:System.out.println("2"); break;
	case 3:System.out.println("3"); break;
	case 4:System.out.println("4"); break;
	}
}
}