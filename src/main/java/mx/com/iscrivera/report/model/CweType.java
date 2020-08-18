//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.08.17 a las 11:45:46 AM CDT 
//


package mx.com.iscrivera.report.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *       For each CWE entry, there are the following attributes:
 *       * cweId:  The CWE ID for the flaw type.
 *       * cwename:  The name of the CWE flaw type.
 *       * owasp:  The OWASP ID for the CWE flaw type if it applies.
 *       * owasp2013:  The Legacy OWASP 2013 ID for the CWE flaw type if it applies.
 *       * sans:  The SANS ID for the CWE flaw type if it applies.
 *       * certc:  The CERTC ID for the CWE flaw type if it applies.
 *       * certcpp:  The CERTCPP ID for the CWE flaw type if it applies.
 *       * certjava:  The CERTJAVA ID for the CWE flaw type if it applies.
 *       * owaspmobile:  The OWASP Mobile 2016 ID for the CWE flaw type if it applies.
 *       
 *       This element has these child elements:
 *       * staticflaws:  If flaws of this type are found through static analysis,
 *         those flaws are grouped under this element.
 *       * dynamicflaws:  If flaws of this type are found through dynamic analysis,
 *         those flaws are grouped under this element.
 *       * pcirelated:  Whether the flaw is PCI related.  (This will be specified in a 
 *         future release of the platform.)
 *     
 * 
 * <p>Clase Java para CweType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CweType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="text" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="text" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="staticflaws" type="{https://www.veracode.com/schema/reports/export/1.0}FlawListType" minOccurs="0"/>
 *         &lt;element name="dynamicflaws" type="{https://www.veracode.com/schema/reports/export/1.0}FlawListType" minOccurs="0"/>
 *         &lt;element name="manualflaws" type="{https://www.veracode.com/schema/reports/export/1.0}FlawListType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="cweid" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="cwename" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pcirelated" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="owasp" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="owasp2013" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="sans" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="certc" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="certcpp" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="certjava" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="owaspmobile" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CweType", propOrder = {
    "description",
    "staticflaws",
    "dynamicflaws",
    "manualflaws"
})
public class CweType {

    @XmlElement(required = true)
    protected CweType.Description description;
    protected FlawListType staticflaws;
    protected FlawListType dynamicflaws;
    protected FlawListType manualflaws;
    @XmlAttribute(name = "cweid", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger cweid;
    @XmlAttribute(name = "cwename", required = true)
    protected String cwename;
    @XmlAttribute(name = "pcirelated")
    protected Boolean pcirelated;
    @XmlAttribute(name = "owasp")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger owasp;
    @XmlAttribute(name = "owasp2013")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger owasp2013;
    @XmlAttribute(name = "sans")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger sans;
    @XmlAttribute(name = "certc")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger certc;
    @XmlAttribute(name = "certcpp")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger certcpp;
    @XmlAttribute(name = "certjava")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger certjava;
    @XmlAttribute(name = "owaspmobile")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger owaspmobile;

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link CweType.Description }
     *     
     */
    public CweType.Description getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link CweType.Description }
     *     
     */
    public void setDescription(CweType.Description value) {
        this.description = value;
    }

    /**
     * Obtiene el valor de la propiedad staticflaws.
     * 
     * @return
     *     possible object is
     *     {@link FlawListType }
     *     
     */
    public FlawListType getStaticflaws() {
        return staticflaws;
    }

    /**
     * Define el valor de la propiedad staticflaws.
     * 
     * @param value
     *     allowed object is
     *     {@link FlawListType }
     *     
     */
    public void setStaticflaws(FlawListType value) {
        this.staticflaws = value;
    }

    /**
     * Obtiene el valor de la propiedad dynamicflaws.
     * 
     * @return
     *     possible object is
     *     {@link FlawListType }
     *     
     */
    public FlawListType getDynamicflaws() {
        return dynamicflaws;
    }

    /**
     * Define el valor de la propiedad dynamicflaws.
     * 
     * @param value
     *     allowed object is
     *     {@link FlawListType }
     *     
     */
    public void setDynamicflaws(FlawListType value) {
        this.dynamicflaws = value;
    }

    /**
     * Obtiene el valor de la propiedad manualflaws.
     * 
     * @return
     *     possible object is
     *     {@link FlawListType }
     *     
     */
    public FlawListType getManualflaws() {
        return manualflaws;
    }

    /**
     * Define el valor de la propiedad manualflaws.
     * 
     * @param value
     *     allowed object is
     *     {@link FlawListType }
     *     
     */
    public void setManualflaws(FlawListType value) {
        this.manualflaws = value;
    }

    /**
     * Obtiene el valor de la propiedad cweid.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCweid() {
        return cweid;
    }

    /**
     * Define el valor de la propiedad cweid.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCweid(BigInteger value) {
        this.cweid = value;
    }

    /**
     * Obtiene el valor de la propiedad cwename.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCwename() {
        return cwename;
    }

    /**
     * Define el valor de la propiedad cwename.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCwename(String value) {
        this.cwename = value;
    }

    /**
     * Obtiene el valor de la propiedad pcirelated.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPcirelated() {
        return pcirelated;
    }

    /**
     * Define el valor de la propiedad pcirelated.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPcirelated(Boolean value) {
        this.pcirelated = value;
    }

    /**
     * Obtiene el valor de la propiedad owasp.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOwasp() {
        return owasp;
    }

    /**
     * Define el valor de la propiedad owasp.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOwasp(BigInteger value) {
        this.owasp = value;
    }

    /**
     * Obtiene el valor de la propiedad owasp2013.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOwasp2013() {
        return owasp2013;
    }

    /**
     * Define el valor de la propiedad owasp2013.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOwasp2013(BigInteger value) {
        this.owasp2013 = value;
    }

    /**
     * Obtiene el valor de la propiedad sans.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSans() {
        return sans;
    }

    /**
     * Define el valor de la propiedad sans.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSans(BigInteger value) {
        this.sans = value;
    }

    /**
     * Obtiene el valor de la propiedad certc.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCertc() {
        return certc;
    }

    /**
     * Define el valor de la propiedad certc.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCertc(BigInteger value) {
        this.certc = value;
    }

    /**
     * Obtiene el valor de la propiedad certcpp.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCertcpp() {
        return certcpp;
    }

    /**
     * Define el valor de la propiedad certcpp.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCertcpp(BigInteger value) {
        this.certcpp = value;
    }

    /**
     * Obtiene el valor de la propiedad certjava.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCertjava() {
        return certjava;
    }

    /**
     * Define el valor de la propiedad certjava.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCertjava(BigInteger value) {
        this.certjava = value;
    }

    /**
     * Obtiene el valor de la propiedad owaspmobile.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOwaspmobile() {
        return owaspmobile;
    }

    /**
     * Define el valor de la propiedad owaspmobile.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOwaspmobile(BigInteger value) {
        this.owaspmobile = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="text" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="text" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "text"
    })
    public static class Description {

        protected List<CweType.Description.Text> text;

        /**
         * Gets the value of the text property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the text property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getText().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CweType.Description.Text }
         * 
         * 
         */
        public List<CweType.Description.Text> getText() {
            if (text == null) {
                text = new ArrayList<>();
            }
            return this.text;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="text" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Text {

            @XmlAttribute(name = "text", required = true)
            protected String valueText;

            /**
             * Obtiene el valor de la propiedad text.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getText() {
                return valueText;
            }

            /**
             * Define el valor de la propiedad text.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setText(String value) {
                this.valueText = value;
            }

        }

    }

}
