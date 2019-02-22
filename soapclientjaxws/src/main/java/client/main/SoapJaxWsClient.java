package client.main;

import client.*;

public class SoapJaxWsClient {
    public static void main(String[] args){
        VehiclePortService service = new VehiclePortService();
        VehiclePort vehiclePort = service.getVehiclePortSoap11();

        //get All vehicles
        GetAllVehiclesRequest req = new GetAllVehiclesRequest();
        GetAllVehiclesResponse allVehiclesResponse = vehiclePort.getAllVehicles(req);

        for (VehicleDetails e: allVehiclesResponse.getVehicleDetails()
             ) {
            System.out.println(e.getId() + ", " + e.getName() + ", " + e.getVehicleLicenseNumber()
                    + ", " + e.getColor() + ", " + e.getVehicleType());

        }

        VehicleDetails vehicleDetails = new VehicleDetails();
        vehicleDetails.setId(103);
        vehicleDetails.setVehicleLicenseNumber("KA55ML908");
        vehicleDetails.setName("Suzuki");
        vehicleDetails.setColor("Black");
        vehicleDetails.setVehicleType(VehicleType.valueOf("MOTORBIKE"));


        //Add vehicle
        AddVehicleRequest addVehicleRequest = new AddVehicleRequest();
        addVehicleRequest.setId(103);
        addVehicleRequest.setVehicleLicenseNumber("KA55ML908");
        addVehicleRequest.setName("Suzuki");
        addVehicleRequest.setColor("Black");
        addVehicleRequest.setVehicleType(VehicleType.valueOf("MOTORBIKE"));

        AddVehicleResponse addVehicleResponse = vehiclePort.addVehicle(addVehicleRequest);

        System.out.println(addVehicleResponse.getServiceStatus().getMessage() + ", "+ addVehicleResponse.getServiceStatus().getStatusCode());


        //Get Vehicle By Id
        GetVehicleDetailsByIdRequest idReq = new GetVehicleDetailsByIdRequest();
        idReq.setId(101);
        GetVehicleDetailsByIdResponse idResponse ;
        idResponse = vehiclePort.getVehicleDetailsById(idReq);
        System.out.println(idResponse.getVehicleDetails().getId() + ", " + idResponse.getVehicleDetails().getName() + ", "+ idResponse.getVehicleDetails().getColor()
        +", "+idResponse.getVehicleDetails().getVehicleLicenseNumber()+", "+idResponse.getVehicleDetails().getVehicleType());

        //Get Vehicle By License
        GetVehicleDetailsByLicenseRequest licenseReq = new GetVehicleDetailsByLicenseRequest();
        licenseReq.setLicense("KA55ML908");
        GetVehicleDetailsByLicenseResponse licenseResponse ;
        licenseResponse = vehiclePort.getVehicleDetailsByLicense(licenseReq);
        System.out.println(licenseResponse.getVehicleDetailsByLicense().getId() + ", " + licenseResponse.getVehicleDetailsByLicense().getName() + ", "+ licenseResponse.getVehicleDetailsByLicense().getColor()
                +", "+licenseResponse.getVehicleDetailsByLicense().getVehicleLicenseNumber()+", "+licenseResponse.getVehicleDetailsByLicense().getVehicleType());



    }
}
