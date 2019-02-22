package com.parkinglot.multilevelparkinglotsoapwsclient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class WSConfigClient {
    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.parkinglot.vehicles.wsdl");
        return marshaller;
    }
    @Bean
    public VehicleClient vehicleClient(Jaxb2Marshaller marshaller) {
        VehicleClient client = new VehicleClient();
        client.setDefaultUri("http://localhost:8084/ws/vehicles.wsdl");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
