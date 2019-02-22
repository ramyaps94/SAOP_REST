
package client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VehicleDetailsByLicense" type="{http://parkinglot.com/vehicles}VehicleDetailsByLicense"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "vehicleDetailsByLicense"
})
@XmlRootElement(name = "GetVehicleDetailsByLicenseResponse")
public class GetVehicleDetailsByLicenseResponse {

    @XmlElement(name = "VehicleDetailsByLicense", required = true)
    protected VehicleDetailsByLicense vehicleDetailsByLicense;

    /**
     * Gets the value of the vehicleDetailsByLicense property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleDetailsByLicense }
     *     
     */
    public VehicleDetailsByLicense getVehicleDetailsByLicense() {
        return vehicleDetailsByLicense;
    }

    /**
     * Sets the value of the vehicleDetailsByLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleDetailsByLicense }
     *     
     */
    public void setVehicleDetailsByLicense(VehicleDetailsByLicense value) {
        this.vehicleDetailsByLicense = value;
    }

}
