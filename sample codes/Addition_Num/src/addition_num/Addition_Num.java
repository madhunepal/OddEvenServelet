package addition_num;

import java.util.Scanner;

public class Addition_Num {

    public Addition_Num(int a, int b) {
        
        
        int c= a+b;
        System.out.println("Addition = "+c);
    }
    
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 nos");
        int no1= sc.nextInt();
        int no2= sc.nextInt();
        
        Addition_Num obj=new Addition_Num(no1, no2);
        
        
    }
    
}
