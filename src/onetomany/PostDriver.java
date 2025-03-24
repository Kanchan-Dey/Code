package onetomany;

import java.util.Scanner;

public class PostDriver {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter array size");
	int size = sc.nextInt();
	User user= new User(size,"honu");
	
    boolean flag =true;
    while(flag) {
    	System.out.println("enter 1 for addition");
    	System.out.println("enter 2 for display");
    	System.out.println("enter 3 to exit");
        int choice =sc.nextInt();
    switch(choice)
    {
    case 1:
    	System.out.println("enter postid");
    	int id=sc.nextInt();
    	sc.nextLine();
    	System.out.println("enter postdsc");
    	String postdsc=sc.nextLine();
    	Post post = new Post(postdsc,id);
    	user.addPosts(post);
    	break;
     case 2:
    	user.displayPosts();
    	break;
    case 3:
    	flag=false;
    	break;
    }
    }
}
}
