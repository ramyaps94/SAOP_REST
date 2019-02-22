package com.parkinglot.multilevelparkinglotsoapwsclient;

import com.parkinglot.vehicles.wsdl.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MultilevelParkinglotSoapWsClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultilevelParkinglotSoapWsClientApplication.class, args);
	}


	@Bean
	CommandLineRunner lookup(VehicleClient vehicleClient) {
		return args -> {
			System.out.println("--- Get Vehicle by Id ---");
			GetVehicleDetailsByIdResponse vehicleByIdResponse = vehicleClient.getVehicleById(1L);
			VehicleDetails vehicleInfo = vehicleByIdResponse.getVehicleDetails();
			System.out.println(vehicleInfo.getId() + ", " + vehicleInfo.getName() + ", " + vehicleInfo.getVehicleLicenseNumber()
					+ ", " + vehicleInfo.getColor() + ", " + vehicleInfo.getVehicleType());

			System.out.println("--- Get Vehicle by Id ---");
			GetVehicleDetailsByLicenseResponse vehicleByLicenseResponse = vehicleClient.getVehicleByLicense("KA01M9098");
			VehicleDetailsByLicense vehicleInfo1 = vehicleByLicenseResponse.getVehicleDetailsByLicense();
			System.out.println(vehicleInfo1.getId() + ", " + vehicleInfo1.getName() + ", " + vehicleInfo1.getVehicleLicenseNumber()
					+ ", " + vehicleInfo1.getColor() + ", " + vehicleInfo1.getVehicleType());

			System.out.println("--- Get all Vehicles ---");
			GetAllVehiclesResponse allVehiclesResponse = vehicleClient.getAllVehicles();
			allVehiclesResponse.getVehicleDetails().stream()
					.forEach(e -> System.out.println(e.getId() + ", " + e.getName() + ", " + e.getVehicleLicenseNumber()
							+ ", " + e.getColor() + ", " + e.getVehicleType()));

			System.out.println("--- Add Vehicle ---");
			VehicleDetails newVehicleInfo = new VehicleDetails();
			newVehicleInfo.setId(89);
			newVehicleInfo.setName("BMW");
			newVehicleInfo.setColor("MAROON");
			newVehicleInfo.setVehicleType(VehicleType.CAR);
			newVehicleInfo.setVehicleLicenseNumber("KA01MP09");
			AddVehicleResponse addVehicleResponse = vehicleClient.addVehicle(newVehicleInfo);
			vehicleInfo = addVehicleResponse.getVehicleDetails();
			if (vehicleInfo != null) {
				System.out.println(vehicleInfo.getId() + ", " + vehicleInfo.getName() + ", " + vehicleInfo.getVehicleLicenseNumber()
						+ ", " + vehicleInfo.getColor() + ", " + vehicleInfo.getVehicleType());
			}
			ServiceStatus serviceStatus = addVehicleResponse.getServiceStatus();
			System.out.println("StatusCode: " + serviceStatus.getStatusCode() +
					", Message: " + serviceStatus.getMessage());

			System.out.println("--- Update Vehicle ---");
			vehicleInfo = new VehicleDetails();
			vehicleInfo.setId(1);
			vehicleInfo.setColor("Blue");
			vehicleInfo.setName("Ford");
			vehicleInfo.setVehicleLicenseNumber("KA01MP09");
			vehicleInfo.setVehicleType(VehicleType.CAR);
			UpdateVehicleResponse updateVehicleResponse = vehicleClient.updateVehicle(vehicleInfo);
			serviceStatus = updateVehicleResponse.getServiceStatus();
			System.out.println("StatusCode: " + serviceStatus.getStatusCode() +
					", Message: " + serviceStatus.getMessage());
			System.out.println("--- Delete Vehicle ---");
			String vehicleLicense = "KA01MP09";
			DeleteVehicleResponse deleteVehicleResponse = vehicleClient.deleteVehicle(vehicleLicense);
			serviceStatus = deleteVehicleResponse.getServiceStatus();
			System.out.println("StatusCode: " + serviceStatus.getStatusCode() +
					", Message: " + serviceStatus.getMessage());
		};
	}
}
