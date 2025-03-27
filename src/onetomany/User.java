package onetomany;

public class User {
 String userName;
 Post[] posts;
 static int count=0;
 public User(int size,String userName)
 {
	 this.userName = userName;
	 this.posts=new Post[size];
 }
 public void addPosts(Post post)
 {
	 if(count< posts.length)
		 
	 {
		 posts[count++]= post;
		 System.out.println("post added successfully");
	 }
	 else
	 {
		 System.out.println("post cant be added ");
		 
	 }
 }
 public void displayPosts()
 {
	 for(int i=0;i<count;i++)
	 {
		 System.out.println(posts[i].postdesc+ " "+ posts[i].postid +" " + this.userName);
	 }
 }
}
