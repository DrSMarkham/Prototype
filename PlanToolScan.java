/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author DrSMarkham
 */
public class PlanToolScan {
    
	public static void main(String[] args)
	{	Scanner s = new Scanner(System.in);
		System.out.print( "Enter Tasking Expression: "  );
		String name = s.nextLine();
		System.out.println( "Tasking Expression: " + name);
                
                System.out.print( "Enter (Role, Number in Role) List: "  );
                String name1 = s.nextLine();
		System.out.println( "Roles: " + name1);
                
                
                System.out.print( "Enter (Resource, Number in Resource) List: "  );
                String name2 = s.nextLine();
		System.out.println( "Resources: " + name2);
                
                System.out.print( "Enter Hazard List: "  );
                String name3 = s.nextLine();
		System.out.println( "Hazards: " + name3);
                
                System.out.print( "Enter Environmental Factor: "  );
                String name4 = s.nextLine();
		System.out.println( "Environmental Factors: " + name4);
	}
}