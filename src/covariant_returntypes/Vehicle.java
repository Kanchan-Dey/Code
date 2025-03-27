package covariant_returntypes;

public class Vehicle {
 public Vehicle getObject() {
	 return new Bike();//this is getting compiled because it is getting upcasted so we can return a child object from a parent return type method.
 }
}
