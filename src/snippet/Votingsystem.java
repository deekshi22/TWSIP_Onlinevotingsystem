package snippet;
import java.util.Scanner;

public class Votingsystem {
    
      
        int TDP;
        int YSRCP;
        int BJP;
        int NOTA;
        
         static void result(int[] arr, int totalVoters) {
        Votingsystem v = new Votingsystem();
        v.TDP = v.YSRCP = v.BJP = 0;
        float percent = 100 / totalVoters;
        for (int i = 0; i < totalVoters; i++) {
            switch (arr[i]) {
                case 1:
                    (v.TDP)++;
                    break;
                case 2:
                    (v.YSRCP)++;
                    break;
                case 3:
                    (v.BJP)++;
                    break;
                case 4:
                	(v.NOTA)++;
                	break;
            }
        }
        float p = (v.TDP) * percent;
        float q = (v.YSRCP) * percent;
        float r = (v.BJP) * percent;
        float s = (v.NOTA)*percent;
        
        System.out.println("TDP percent: " + p);
        System.out.println("YSRCP percent: " + q);
        System.out.println("BJP percent: " + r);
        System.out.println("NOTA percent: " + s);
        
       
    
   
        if (p > q && p > r) {
            System.out.println("TDP IS WINNER");
        }
        else if (q > p && q > r) {
        	System.out.println("YSRCP IS WINNER");
        }
        else if (r > p && r > q) {
        	System.out.println("BJP IS WINNER");
        }
        else {
        	System.out.println(" NO WINNER");
        }
	
		
		
    }

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO ONLINE VOTING");
        System.out.println("Enter total voters:");
        int totalVoters = sc.nextInt();
        int[] arr = new int[totalVoters];
        for (int i = 0; i < totalVoters; i++) {
        	System.out.println("Enter name: ");
        	String name = sc.next();
        	System.out.println("enter number");
        	String number = sc.next();
        	System.out.println("SELECT ANY ONE OPTION");
            System.out.println("1) TDP PARTY");
            System.out.println("2) YSRCP PARTY");
            System.out.println("3) BJP PARTY");
            System.out.println("4)NOTA");
            arr[i]=sc.nextInt();
            
            
        }
        result(arr, totalVoters);
        
        
    }
}

