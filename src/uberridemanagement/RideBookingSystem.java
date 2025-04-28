package uberridemanagement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class RideBookingSystem {
	List<Customer> customers;
	List<Driver> drivers;
	List<Ride> rides;

	void registerCustomer(Customer customer) {
		this.customers.add(customer);
	}

	void registerDriver(Driver driver) {
		this.drivers.add(driver);
	}

	Ride bookRide(Customer customer) throws InvalidRideException {
		List<Driver> AvailableDrivers = drivers.stream().filter(driver -> driver.isAvailable()).toList();
//    Iterator<Driver> itr1= AvailableDrivers.iterator();
//    while(itr1.hasNext())
//    {
//    	
//    }
		if (AvailableDrivers.isEmpty()) {
			throw new InvalidRideException("No driver is available");

		} else {
			System.out.println("Adding this ride");
			rides.add(new Ride(customer, AvailableDrivers.getFirst(), "Booked"));
			AvailableDrivers.getFirst().setAvailable(false);
		}
		return new Ride(customer, AvailableDrivers.getFirst(), "Unavailable");
	}

	void saveRides() throws IOException {
		try {
			BufferedWriter bis = new BufferedWriter(new FileWriter("C:\\Users\\User\\Desktop\\Uber\\rides.txt"));
			for (Ride ride : rides) {
				bis.write(ride.RideDetails());
				bis.newLine();
			}
		} catch (Exception e) {
			System.out.println("Error " + e.getMessage());
		}

	}

	void loadDriversFromFile() throws IOException {
		try (BufferedReader reader = new BufferedReader(
				new FileReader("C:\\Users\\User\\Desktop\\Uber\\drivers.txt"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] parts = line.split(",");
				if (parts.length >= 2) {
					String id = parts[0].trim();
					String name = parts[1].trim();
					Driver driver = new Driver(id, name);
					registerDriver(driver);
				}
			}
		}
	}

	public void saveDriversToFile() throws IOException {
		try (BufferedWriter writer = new BufferedWriter(
				new FileWriter("C:\\Users\\User\\Desktop\\Uber\\drivers.txt"))) {
			for (Driver driver : drivers) {
				writer.write(driver.id + "," + driver.name);
				writer.newLine();
			}
		}
	}

	public void showAllDrivers() {
		for (Driver driver : drivers) {
			driver.showProfile();
		}
	}

// Getter and Setter methods
	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public List<Driver> getDrivers() {
		return drivers;
	}

	public void setDrivers(List<Driver> drivers) {
		this.drivers = drivers;
	}

	public List<Ride> getRides() {
		return rides;
	}

	public void setRides(List<Ride> rides) {
		this.rides = rides;
	}

}
