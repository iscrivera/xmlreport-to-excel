//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.08.17 a las 11:45:46 AM CDT 
//


package mx.com.iscrivera.report.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DynamicScanType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="DynamicScanType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="mp"/>
 *     &lt;enumeration value="ds"/>
 *     &lt;enumeration value="da"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DynamicScanType")
@XmlEnum
public enum DynamicScanType {

    @XmlEnumValue("mp")
    MP("mp"),
    @XmlEnumValue("ds")
    DS("ds"),
    @XmlEnumValue("da")
    DA("da");
    private final String value;

    DynamicScanType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DynamicScanType fromValue(String v) {
        for (DynamicScanType c: DynamicScanType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
