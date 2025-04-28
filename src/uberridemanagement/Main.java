package uberridemanagement;



import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RideBookingSystem bookingSystem = new RideBookingSystem();
        bookingSystem.setCustomers(new ArrayList<>());
        bookingSystem.setDrivers(new ArrayList<>());
        bookingSystem.setRides(new ArrayList<>());
        
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Load drivers from file
            bookingSystem.loadDriversFromFile();
        } catch (IOException e) {
            System.out.println("Error loading drivers: " + e.getMessage());
        }
        
        // Create an admin
        Admin admin = new Admin("ADM001", "Admin User");
        
        while (true) {
            System.out.println("\nUber Ride Management System");
            System.out.println("1. Register Customer");
            System.out.println("2. Register Driver");
            System.out.println("3. Book a Ride");
            System.out.println("4. Complete a Ride");
            System.out.println("5. Show All Drivers");
            System.out.println("6. Remove Driver (Admin Only)");
            System.out.println("7. Show All Rides");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter customer ID: ");
                    String customerId = scanner.nextLine();
                    System.out.print("Enter customer name: ");
                    String customerName = scanner.nextLine();
                    Customer customer = new Customer(customerId, customerName);
                    bookingSystem.registerCustomer(customer);
                    System.out.println("Customer registered successfully!");
                    break;
                    
                case 2:
                    System.out.print("Enter driver ID: ");
                    String driverId = scanner.nextLine();
                    System.out.print("Enter driver name: ");
                    String driverName = scanner.nextLine();
                    Driver driver = new Driver(driverId, driverName);
                    bookingSystem.registerDriver(driver);
                    try {
                        bookingSystem.saveDriversToFile();
                    } catch (IOException e) {
                        System.out.println("Error saving drivers: " + e.getMessage());
                    }
                    System.out.println("Driver registered successfully!");
                    break;
                    
                case 3:
                    if (bookingSystem.getCustomers().isEmpty()) {
                        System.out.println("No customers registered. Please register a customer first.");
                        break;
                    }
                    System.out.println("Available customers:");
                    for (Customer c : bookingSystem.getCustomers()) {
                        c.showProfile();
                    }
                    System.out.print("Enter customer ID to book ride: ");
                    String bookCustomerId = scanner.nextLine();
                    
                    Customer selectedCustomer = null;
                    for (Customer c : bookingSystem.getCustomers()) {
                        if (c.id.equals(bookCustomerId)) {
                            selectedCustomer = c;
                            break;
                        }
                    }
                    
                    if (selectedCustomer != null) {
                        try {
                            Ride ride = bookingSystem.bookRide(selectedCustomer);
                            System.out.println("Ride booked successfully!");
                            System.out.println(ride.RideDetails());
                        } catch (InvalidRideException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    } else {
                        System.out.println("Customer not found!");
                    }
                    break;
                    
                case 4:
                    if (bookingSystem.getRides().isEmpty()) {
                        System.out.println("No active rides.");
                        break;
                    }
                    
                    System.out.println("Active rides:");
                    for (Ride ride : bookingSystem.getRides()) {
                        if (ride.getStatus().equals("Booked")) {
                            System.out.println(ride.RideDetails());
                        }
                    }
                    
                    System.out.print("Enter customer ID to complete ride: ");
                    String completeCustomerId = scanner.nextLine();
                    
                    for (Ride ride : bookingSystem.getRides()) {
                        if (ride.getCustomer().id.equals(completeCustomerId) && ride.getStatus().equals("Booked")) {
                            ride.completeRide();
                            System.out.println("Ride completed successfully!");
                            try {
                                bookingSystem.saveRides();
                            } catch (IOException e) {
                                System.out.println("Error saving rides: " + e.getMessage());
                            }
                            break;
                        }
                    }
                    break;
                    
                case 5:
                    System.out.println("All Drivers:");
                    bookingSystem.showAllDrivers();
                    break;
                    
                case 6:
                    System.out.print("Enter driver ID to remove: ");
                    String removeDriverId = scanner.nextLine();
                    admin.removeDriver(bookingSystem.getDrivers(), removeDriverId);
                    try {
                        bookingSystem.saveDriversToFile();
                    } catch (IOException e) {
                        System.out.println("Error saving drivers: " + e.getMessage());
                    }
                    break;
                    
                case 7:
                    System.out.println("All Rides:");
                    for (Ride ride : bookingSystem.getRides()) {
                        System.out.println(ride.RideDetails());
                    }
                    break;
                    
                case 8:
                    try {
                        bookingSystem.saveRides();
                        bookingSystem.saveDriversToFile();
                    } catch (IOException e) {
                        System.out.println("Error saving data: " + e.getMessage());
                    }
                    System.out.println("Exiting system. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
