package manytomanyprac;

public class Driver {
public static void main(String[] args) {
	User u1 = new User(1,"lanchan");
	User u2= new User(2,"aritra");
	User u3 = new User(3,"turjo");
	Group g1= new Group(12,"KUKUR");
	Group g2 = new Group(15,"HATI");
	Group g3 = new Group(19,"TUNG TUNg");
	u1.addFriend(u3);
	u1.addFriend(u2);
	u1.removeFriend(u3);
	u1.joinGroup(g3);
	u2.joinGroup(g2);
	u2.joinGroup(g1);
	u2.leaveGroup(g3);
	u1.addFriend(u2);
	u1.displayFriends();
}
}
