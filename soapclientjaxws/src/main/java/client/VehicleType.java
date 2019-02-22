
package client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MOTORBIKE"/>
 *     &lt;enumeration value="CAR"/>
 *     &lt;enumeration value="BUS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VehicleType")
@XmlEnum
public enum VehicleType {

    MOTORBIKE,
    CAR,
    BUS;

    public String value() {
        return name();
    }

    public static VehicleType fromValue(String v) {
        return valueOf(v);
    }

}
