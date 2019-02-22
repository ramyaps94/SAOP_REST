package com.parkinglot.multilevelparkinglotsoapwsclient;

import com.parkinglot.vehicles.wsdl.*;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class VehicleClient extends WebServiceGatewaySupport {

//    public GetVehicleDetailsByIdResponse getVehicleById(Long id) {
//        GetVehicleDetailsByIdRequest request = new GetVehicleDetailsByIdRequest();
//        request.setId(id);
//
//
//        return (GetVehicleDetailsByIdResponse) getWebServiceTemplate().marshalSendAndReceive(request);
//
//    }

    public GetVehicleDetailsByIdResponse getVehicleById(Long VehicleId) {
        GetVehicleDetailsByIdRequest request = new GetVehicleDetailsByIdRequest();
        request.setId(VehicleId);
        GetVehicleDetailsByIdResponse response = (GetVehicleDetailsByIdResponse) getWebServiceTemplate().marshalSendAndReceive(
                request, new SoapActionCallback("http://localhost:8084/ws/GetVehicleDetailsByIdRequest"));
        return response;

    }
    public GetVehicleDetailsByLicenseResponse getVehicleByLicense(String licenseNumber) {
        GetVehicleDetailsByLicenseRequest request = new GetVehicleDetailsByLicenseRequest();
        request.setLicense(licenseNumber);
        GetVehicleDetailsByLicenseResponse response = (GetVehicleDetailsByLicenseResponse) getWebServiceTemplate().marshalSendAndReceive(
                request, new SoapActionCallback("http://localhost:8084/ws/GetVehicleDetailsByLicenseRequest"));
        return response;
    }
    public GetAllVehiclesResponse getAllVehicles() {
        GetAllVehiclesRequest request = new GetAllVehiclesRequest();
        GetAllVehiclesResponse response = (GetAllVehiclesResponse) getWebServiceTemplate().marshalSendAndReceive(
                request, new SoapActionCallback("http://localhost:8084/ws/GetAllVehiclesRequest"));
        return response;
    }
    public AddVehicleResponse addVehicle(VehicleDetails vehicleDetails) {
        AddVehicleRequest request = new AddVehicleRequest();
        request.setId(vehicleDetails.getId());
        request.setVehicleLicenseNumber(vehicleDetails.getVehicleLicenseNumber());
        request.setName(vehicleDetails.getName());
        request.setColor(vehicleDetails.getColor());
        request.setVehicleType(vehicleDetails.getVehicleType());
        AddVehicleResponse response = (AddVehicleResponse) getWebServiceTemplate().marshalSendAndReceive(
                request, new SoapActionCallback("http://localhost:8084/ws/AddVehicleRequest"));
        return response;
    }
    public UpdateVehicleResponse updateVehicle(VehicleDetails VehicleInfo) {
        UpdateVehicleRequest request = new UpdateVehicleRequest();
        request.setVehicleDetails(VehicleInfo);
        UpdateVehicleResponse response = (UpdateVehicleResponse) getWebServiceTemplate().marshalSendAndReceive(
                request, new SoapActionCallback("http://localhost:8084/ws/UpdateVehicleRequest"));
        return response;
    }
    public DeleteVehicleResponse deleteVehicle(String licenseNumber) {
        DeleteVehicleRequest request = new DeleteVehicleRequest();
        request.setLicenseNumber(licenseNumber);
        DeleteVehicleResponse response = (DeleteVehicleResponse) getWebServiceTemplate().marshalSendAndReceive(
                request, new SoapActionCallback("http://localhost:8084/ws/DeleteVehicleRequest"));
        return response;
    }
}
