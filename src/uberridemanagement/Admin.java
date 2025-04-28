package uberridemanagement;

import java.util.Iterator;
import java.util.List;

@SecurityCheck(role = "Admin")
public class Admin extends User {
	protected String name;
	protected String id;

	Admin(String id, String name) {
		super(id, name);

	}
	  Class<SecurityCheck> cls = SecurityCheck.class;
	   SecurityCheck s= cls.getDeclaredAnnotation(SecurityCheck.class);

	void showProfile() {

		System.out.println("Admin name " + this.name + "Role: "+ s.role());
	}
	public void removeDriver(List<Driver> drivers, String driverId)
	{
	   try
	   {
		   if(!(s.role().equals("Admin")))
		   {
			   throw new SecurityException("Access Denied: Role not Admin");
		   }
		   else
		   {
			   boolean removedDriver = false;
			   Iterator<Driver> itr = drivers.iterator();
			   while(itr.hasNext())
			   {
				   Driver driv = itr.next();
				   if(driv.id.equals(driverId))
				   {
					   itr.remove();
					   removedDriver = true;
					   System.out.println("Driver " + driv.name + " "+ "with driver id"+ driverId+ " has beeen removed");
					   break;
				   }
				   
			   }
			   if(!removedDriver)
			   {
				   System.out.println("Driver with this id has not been found");
			   }
		   }
	   }
		   
	   catch(SecurityException e)
	   {
		   System.out.println("Security error "+ e.getMessage());
	   }
	}
}
