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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *       For each analysis (static or dynamic), there is a list of modules.  If this
 *       element is for static analysis, there is one module element per module 
 *       analyzed.  If this element is for dynamic analysis, there is exactly one 
 *       module element.  
 *       
 *       Each static or dynamic analysis has these attribute values:
 *       * rating: A letter grade.
 *       * score: A numeric score.
 *       * mitigated_rating: A letter grade, taking into account flaws that are mitigated.
 *       * mitigated_score: A numeric score, taking into account flaws that are mitigated.
 * 	  * submitted_date: The date that this analysis was submitted to Veracode.
 * 	  * published_date: The date that this analysis was published by Veracode.
 * 	  * next_scan_due: The date that the active policy for this application requests the next scan by.
 * 	  * analysis_size_bytes: Optional (Static Analysis Only) size of modules scanned in bytes.
 * 	  * engine_version: The version of the engine that this scan was run against. Static only.
 * 	  * dynamic_scan_type: Optional (Dynamic Analysis Only) indicates whether the build is MP or DS.
 * 	  * scan_exit_status_id: Optional (Dynamic Analysis Only) A numeric code for scan exit status.
 * 	  * scan_exit_status_desc: Optional (Dynamic Analysis Only) The description corresponds to the status id.
 * 	  * version: Optional scan name.
 *     
 * 
 * <p>Clase Java para AnalysisType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AnalysisType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
 *       &lt;attribute name="analysis_size_bytes" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="engine_version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dynamic_scan_type" type="{https://www.veracode.com/schema/reports/export/1.0}DynamicScanType" />
 *       &lt;attribute name="scan_exit_status_id" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="scan_exit_status_desc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnalysisType", propOrder = {
    "modules"
})
public class AnalysisType {

    @XmlElement(required = true)
    protected AnalysisType.Modules modules;
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
    @XmlAttribute(name = "analysis_size_bytes")
    protected Long analysisSizeBytes;
    @XmlAttribute(name = "engine_version")
    protected String engineVersion;
    @XmlAttribute(name = "dynamic_scan_type")
    protected DynamicScanType dynamicScanType;
    @XmlAttribute(name = "scan_exit_status_id")
    protected BigInteger scanExitStatusId;
    @XmlAttribute(name = "scan_exit_status_desc")
    protected String scanExitStatusDesc;
    @XmlAttribute(name = "version")
    protected String version;

    /**
     * Obtiene el valor de la propiedad modules.
     * 
     * @return
     *     possible object is
     *     {@link AnalysisType.Modules }
     *     
     */
    public AnalysisType.Modules getModules() {
        return modules;
    }

    /**
     * Define el valor de la propiedad modules.
     * 
     * @param value
     *     allowed object is
     *     {@link AnalysisType.Modules }
     *     
     */
    public void setModules(AnalysisType.Modules value) {
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
     * Obtiene el valor de la propiedad analysisSizeBytes.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAnalysisSizeBytes() {
        return analysisSizeBytes;
    }

    /**
     * Define el valor de la propiedad analysisSizeBytes.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAnalysisSizeBytes(Long value) {
        this.analysisSizeBytes = value;
    }

    /**
     * Obtiene el valor de la propiedad engineVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    /**
     * Define el valor de la propiedad engineVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineVersion(String value) {
        this.engineVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad dynamicScanType.
     * 
     * @return
     *     possible object is
     *     {@link DynamicScanType }
     *     
     */
    public DynamicScanType getDynamicScanType() {
        return dynamicScanType;
    }

    /**
     * Define el valor de la propiedad dynamicScanType.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicScanType }
     *     
     */
    public void setDynamicScanType(DynamicScanType value) {
        this.dynamicScanType = value;
    }

    /**
     * Obtiene el valor de la propiedad scanExitStatusId.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getScanExitStatusId() {
        return scanExitStatusId;
    }

    /**
     * Define el valor de la propiedad scanExitStatusId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setScanExitStatusId(BigInteger value) {
        this.scanExitStatusId = value;
    }

    /**
     * Obtiene el valor de la propiedad scanExitStatusDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScanExitStatusDesc() {
        return scanExitStatusDesc;
    }

    /**
     * Define el valor de la propiedad scanExitStatusDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScanExitStatusDesc(String value) {
        this.scanExitStatusDesc = value;
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
