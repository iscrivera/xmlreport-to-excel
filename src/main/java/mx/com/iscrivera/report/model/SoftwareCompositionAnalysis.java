//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.08.17 a las 11:45:46 AM CDT 
//


package mx.com.iscrivera.report.model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 	      The element describe the details of software composition analysis results.
 * 	      * vulnerable_components: Details of the vulnerable components.
 * 	      * third_party_components: Number of vulnerable third party components.
 * 	      * violate_policy: Policy is violated or not
 * 	      * components_violated_policy: Number of components that violate the 
 * 	        policy.
 * 	      * blocklisted_components: Number of blocklisted components.
 * 	      * sca_service_available: true if sca service is available, else set to false
 * 	   
 * 
 * <p>Clase Java para SoftwareCompositionAnalysis complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SoftwareCompositionAnalysis">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vulnerable_components" type="{https://www.veracode.com/schema/reports/export/1.0}VulnerableComponentList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="third_party_components" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="violate_policy" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="components_violated_policy" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="blocklisted_components" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="sca_service_available" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoftwareCompositionAnalysis", propOrder = {
    "vulnerableComponents"
})
public class SoftwareCompositionAnalysis {

    @XmlElement(name = "vulnerable_components")
    protected VulnerableComponentList vulnerableComponents;
    @XmlAttribute(name = "third_party_components", required = true)
    protected BigInteger thirdPartyComponents;
    @XmlAttribute(name = "violate_policy", required = true)
    protected boolean violatePolicy;
    @XmlAttribute(name = "components_violated_policy", required = true)
    protected BigInteger componentsViolatedPolicy;
    @XmlAttribute(name = "blocklisted_components")
    protected BigInteger blocklistedComponents;
    @XmlAttribute(name = "sca_service_available")
    protected Boolean scaServiceAvailable;

    /**
     * Obtiene el valor de la propiedad vulnerableComponents.
     * 
     * @return
     *     possible object is
     *     {@link VulnerableComponentList }
     *     
     */
    public VulnerableComponentList getVulnerableComponents() {
        return vulnerableComponents;
    }

    /**
     * Define el valor de la propiedad vulnerableComponents.
     * 
     * @param value
     *     allowed object is
     *     {@link VulnerableComponentList }
     *     
     */
    public void setVulnerableComponents(VulnerableComponentList value) {
        this.vulnerableComponents = value;
    }

    /**
     * Obtiene el valor de la propiedad thirdPartyComponents.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getThirdPartyComponents() {
        return thirdPartyComponents;
    }

    /**
     * Define el valor de la propiedad thirdPartyComponents.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setThirdPartyComponents(BigInteger value) {
        this.thirdPartyComponents = value;
    }

    /**
     * Obtiene el valor de la propiedad violatePolicy.
     * 
     */
    public boolean isViolatePolicy() {
        return violatePolicy;
    }

    /**
     * Define el valor de la propiedad violatePolicy.
     * 
     */
    public void setViolatePolicy(boolean value) {
        this.violatePolicy = value;
    }

    /**
     * Obtiene el valor de la propiedad componentsViolatedPolicy.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getComponentsViolatedPolicy() {
        return componentsViolatedPolicy;
    }

    /**
     * Define el valor de la propiedad componentsViolatedPolicy.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setComponentsViolatedPolicy(BigInteger value) {
        this.componentsViolatedPolicy = value;
    }

    /**
     * Obtiene el valor de la propiedad blocklistedComponents.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBlocklistedComponents() {
        return blocklistedComponents;
    }

    /**
     * Define el valor de la propiedad blocklistedComponents.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBlocklistedComponents(BigInteger value) {
        this.blocklistedComponents = value;
    }

    /**
     * Obtiene el valor de la propiedad scaServiceAvailable.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isScaServiceAvailable() {
        return scaServiceAvailable;
    }

    /**
     * Define el valor de la propiedad scaServiceAvailable.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScaServiceAvailable(Boolean value) {
        this.scaServiceAvailable = value;
    }

}
