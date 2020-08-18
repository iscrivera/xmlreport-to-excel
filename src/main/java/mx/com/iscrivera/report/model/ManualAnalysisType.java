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
 *       For manual analysis, there is global data associated with the scan.
 *       The CIA adjustment factor is used to generate the final numeric score for
 *       the scan. The delivery consultants, if any, are listed, followed by the
 *       rest of the analysis for the scan.
 * 
 *       Each manual analysis has these attribute values:
 *       * rating: A letter grade.
 *       * score: A numeric score.
 *       * mitigated_rating: A letter grade, taking into account flaws that are mitigated.
 *       * mitigated_score: A numeric score, taking into account flaws that are mitigated.
 * 	  * submitted_date: The date that this analysis was submitted to Veracode.
 * 	  * published_date: The date that this analysis was published by Veracode.
 * 	  * next_scan_due: The date that the active policy for this application requests the next scan by.
 * 	  * version: Optional scan name.
 *     
 * 
 * <p>Clase Java para ManualAnalysisType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ManualAnalysisType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cia_adjustment" type="{https://www.veracode.com/schema/reports/export/1.0}negativeInteger" minOccurs="0"/>
 *         &lt;element name="delivery_consultant" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="modules">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="module" type="{https://www.veracode.com/schema/reports/export/1.0}ModuleType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="rating" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="score" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="mitigated_rating" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mitigated_score" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="submitted_date" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="published_date" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="next_scan_due" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManualAnalysisType", propOrder = {
    "ciaAdjustment",
    "deliveryConsultant",
    "modules"
})
public class ManualAnalysisType {

    @XmlElement(name = "cia_adjustment")
    @XmlSchemaType(name = "nonPositiveInteger")
    protected Integer ciaAdjustment;
    @XmlElement(name = "delivery_consultant")
    protected List<String> deliveryConsultant;
    @XmlElement(required = true)
    protected ManualAnalysisType.Modules modules;
    @XmlAttribute(name = "rating", required = true)
    protected String rating;
    @XmlAttribute(name = "score", required = true)
    protected BigInteger score;
    @XmlAttribute(name = "mitigated_rating")
    protected String mitigatedRating;
    @XmlAttribute(name = "mitigated_score")
    protected BigInteger mitigatedScore;
    @XmlAttribute(name = "submitted_date", required = true)
    protected String submittedDate;
    @XmlAttribute(name = "published_date")
    protected String publishedDate;
    @XmlAttribute(name = "next_scan_due")
    protected String nextScanDue;
    @XmlAttribute(name = "version")
    protected String version;

    /**
     * Obtiene el valor de la propiedad ciaAdjustment.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCiaAdjustment() {
        return ciaAdjustment;
    }

    /**
     * Define el valor de la propiedad ciaAdjustment.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCiaAdjustment(Integer value) {
        this.ciaAdjustment = value;
    }

    /**
     * Gets the value of the deliveryConsultant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryConsultant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryConsultant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDeliveryConsultant() {
        if (deliveryConsultant == null) {
            deliveryConsultant = new ArrayList<String>();
        }
        return this.deliveryConsultant;
    }

    /**
     * Obtiene el valor de la propiedad modules.
     * 
     * @return
     *     possible object is
     *     {@link ManualAnalysisType.Modules }
     *     
     */
    public ManualAnalysisType.Modules getModules() {
        return modules;
    }

    /**
     * Define el valor de la propiedad modules.
     * 
     * @param value
     *     allowed object is
     *     {@link ManualAnalysisType.Modules }
     *     
     */
    public void setModules(ManualAnalysisType.Modules value) {
        this.modules = value;
    }

    /**
     * Obtiene el valor de la propiedad rating.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRating() {
        return rating;
    }

    /**
     * Define el valor de la propiedad rating.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRating(String value) {
        this.rating = value;
    }

    /**
     * Obtiene el valor de la propiedad score.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getScore() {
        return score;
    }

    /**
     * Define el valor de la propiedad score.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setScore(BigInteger value) {
        this.score = value;
    }

    /**
     * Obtiene el valor de la propiedad mitigatedRating.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMitigatedRating() {
        return mitigatedRating;
    }

    /**
     * Define el valor de la propiedad mitigatedRating.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMitigatedRating(String value) {
        this.mitigatedRating = value;
    }

    /**
     * Obtiene el valor de la propiedad mitigatedScore.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMitigatedScore() {
        return mitigatedScore;
    }

    /**
     * Define el valor de la propiedad mitigatedScore.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMitigatedScore(BigInteger value) {
        this.mitigatedScore = value;
    }

    /**
     * Obtiene el valor de la propiedad submittedDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmittedDate() {
        return submittedDate;
    }

    /**
     * Define el valor de la propiedad submittedDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmittedDate(String value) {
        this.submittedDate = value;
    }

    /**
     * Obtiene el valor de la propiedad publishedDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublishedDate() {
        return publishedDate;
    }

    /**
     * Define el valor de la propiedad publishedDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublishedDate(String value) {
        this.publishedDate = value;
    }

    /**
     * Obtiene el valor de la propiedad nextScanDue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextScanDue() {
        return nextScanDue;
    }

    /**
     * Define el valor de la propiedad nextScanDue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextScanDue(String value) {
        this.nextScanDue = value;
    }

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Define el valor de la propiedad version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
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
     *         &lt;element name="module" type="{https://www.veracode.com/schema/reports/export/1.0}ModuleType" maxOccurs="unbounded" minOccurs="0"/>
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
        "module"
    })
    public static class Modules {

        protected List<ModuleType> module;

        /**
         * Gets the value of the module property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the module property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getModule().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ModuleType }
         * 
         * 
         */
        public List<ModuleType> getModule() {
            if (module == null) {
                module = new ArrayList<ModuleType>();
            }
            return this.module;
        }

    }

}
