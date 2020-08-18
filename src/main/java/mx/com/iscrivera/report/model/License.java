//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.08.17 a las 11:45:46 AM CDT 
//


package mx.com.iscrivera.report.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para License complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="License">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="spdx_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="license_url" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="risk_rating" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "License")
public class License {

    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "spdx_id", required = true)
    protected String spdxId;
    @XmlAttribute(name = "license_url", required = true)
    protected String licenseUrl;
    @XmlAttribute(name = "risk_rating", required = true)
    protected String riskRating;

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad spdxId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpdxId() {
        return spdxId;
    }

    /**
     * Define el valor de la propiedad spdxId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpdxId(String value) {
        this.spdxId = value;
    }

    /**
     * Obtiene el valor de la propiedad licenseUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseUrl() {
        return licenseUrl;
    }

    /**
     * Define el valor de la propiedad licenseUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseUrl(String value) {
        this.licenseUrl = value;
    }

    /**
     * Obtiene el valor de la propiedad riskRating.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskRating() {
        return riskRating;
    }

    /**
     * Define el valor de la propiedad riskRating.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskRating(String value) {
        this.riskRating = value;
    }

}
