package JavaPractice;

import java.util.Scanner;

public class Q12_ifStatements {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String jobTitle=scan.nextLine().toLowerCase();
        System.out.println("jobTitle = " + jobTitle);
        
        if(jobTitle.equals("qa")){
            System.out.println("Quality Analyst");
        }else if(jobTitle.equals("dev")){
            System.out.println("Developer");
        }else if(jobTitle.equals("ba")){
            System.out.println("Business Analyst");
        }else if(jobTitle.equals("pm")){
            System.out.println("Project Manager");
        }
    }
}
