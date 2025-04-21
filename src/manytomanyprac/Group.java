package manytomanyprac;

import java.util.ArrayList;
import java.util.List;

public class Group {
  private int groupId;
  private String name;
 List<User>members;
 Group(int groupId,String name)
 {
	 this.groupId=groupId;
	 this.name=name;
	 this.members= new ArrayList<User>();
 }
 public void setName(String name)
 {
	 this.name=name;
 }
 public String getName()
 {
	 return this.name;
 }
}
