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
 * <p>Clase Java para PolicyRuleType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="PolicyRuleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Disallow Vulnerabilities by Severity"/>
 *     &lt;enumeration value="Disallow CVSS Score"/>
 *     &lt;enumeration value="Disallow Component Blocklist"/>
 *     &lt;enumeration value="Disallow Component by License Risk"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PolicyRuleType")
@XmlEnum
public enum PolicyRuleType {

    @XmlEnumValue("Disallow Vulnerabilities by Severity")
    DISALLOW_VULNERABILITIES_BY_SEVERITY("Disallow Vulnerabilities by Severity"),
    @XmlEnumValue("Disallow CVSS Score")
    DISALLOW_CVSS_SCORE("Disallow CVSS Score"),
    @XmlEnumValue("Disallow Component Blocklist")
    DISALLOW_COMPONENT_BLOCKLIST("Disallow Component Blocklist"),
    @XmlEnumValue("Disallow Component by License Risk")
    DISALLOW_COMPONENT_BY_LICENSE_RISK("Disallow Component by License Risk");
    private final String value;

    PolicyRuleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PolicyRuleType fromValue(String v) {
        for (PolicyRuleType c: PolicyRuleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
