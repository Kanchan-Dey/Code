package manytomanyprac;

import java.util.ArrayList;
import java.util.List;

public class User {
	private int userId;
	private String name;
	List<User> friends;
	List<Group> groups;
	User(int userId,String name)
	{
		this.userId=userId;
		this.name=name;
		this.friends= new ArrayList<User>();
		this.groups= new ArrayList<Group>();
	}
	public void addFriend(User friend)
	{
		if(this.friends.contains(friend))
		{
			System.out.println("friend already exists");
		}
		else
		{
			this.friends.add(friend);
			System.out.println(friend.name + " "+ "has been added to"+ " "+this.name);
			friend.friends.add(this);
			System.out.println(this.name+ " "+"has been added to"+ " "+friend.name);
		}
	}
	
	public void joinGroup(Group group)
	{
		if(group.members.contains(this))
		{
			System.out.println("Already in the group" + " "+group.getName());
		}
		else
		{
			group.members.add(this);
			System.out.println(this.name+" is added to the group");
			this.groups.add(group);
			System.out.println("You have joined"+" " + group.getName());
		}
	}
	public void leaveGroup(Group group)
	{
		if(group.members.contains(this))
		{
			groups.remove(group);
			System.out.println("You are no longer in this group"+ " "+group.getName());
			group.members.remove(this);
			System.out.println(this.name+  " is removed from group");
			
		}
		else
		{
			System.out.println("User is not in the group");
		}
	}
	public void removeFriend(User friend)
	{
		if(this.friends.contains(friend))
		{
			this.friends.remove(friend);
			System.out.println(this.name + " " + "is now not a friend of"+ " "+friend.name);
		    friend.friends.remove(this);
		    System.out.println(friend.name + " "+"is now not a friend of"+ " "+this.name);
		}
	}
	public void displayFriends()
	{
		for(User f:friends)
		{
			System.out.println(f);
		}
	}
	public String toString()
	{
		return this.name+" "+this.userId;
	}
}
