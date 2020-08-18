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
 * 	      The element describe the details of vulnerable component.
 * 	      * file_paths: File paths of the component.
 * 	      * vulnerabilities : Vulnerabilities of the component.
 * 	      * violated_policy_rules: Violated policy rules of the component.
 * 	      * component_id: The id of the component.
 * 	      * file_name: File name of the component.
 * 	      * vulnerabilities: Number of vulnerabilities available in the component.
 * 	      * max_cvss_score: Max cvss_score of the component.
 * 	      * library: Library name of the component.
 * 	      * version: Version of the component.
 * 	      * vendor: Vendor name of the component.
 * 	      * description: Description about component.
 * 	      * blocklisted: Component's blocklisted status.
 * 	      * new: Component added newly.
 * 	      * added_date: Component's added_date.
 * 	      * component_affects_policy_compliance: COmponent's policy violation status.
 * 	      * licenses: Contains license details of the component.
 * 	      
 * 	   
 * 
 * <p>Clase Java para Component complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Component">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="file_paths" type="{https://www.veracode.com/schema/reports/export/1.0}FilePathList" minOccurs="0"/>
 *         &lt;element name="licenses" type="{https://www.veracode.com/schema/reports/export/1.0}LicenseList" minOccurs="0"/>
 *         &lt;element name="vulnerabilities" type="{https://www.veracode.com/schema/reports/export/1.0}VulnerabilityList" minOccurs="0"/>
 *         &lt;element name="violated_policy_rules" type="{https://www.veracode.com/schema/reports/export/1.0}ViolatedRuleList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="component_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="file_name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sha1" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="vulnerabilitiesNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="max_cvss_score" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="library" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="vendor" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="blocklisted" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="new" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="added_date" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="component_affects_policy_compliance" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Component", propOrder = {
    "filePaths",
    "licenses",
    "vulnerabilities",
    "violatedPolicyRules"
})
public class Component {

    @XmlElement(name = "file_paths")
    protected FilePathList filePaths;
    protected LicenseList licenses;
    protected VulnerabilityList vulnerabilities;
    @XmlElement(name = "violated_policy_rules")
    protected ViolatedRuleList violatedPolicyRules;
    @XmlAttribute(name = "component_id", required = true)
    protected String componentId;
    @XmlAttribute(name = "file_name", required = true)
    protected String fileName;
    @XmlAttribute(name = "sha1", required = true)
    protected String sha1;
    @XmlAttribute(name = "vulnerabilities", required = true)
    protected BigInteger vulnerabilitiesNumber;
    @XmlAttribute(name = "max_cvss_score", required = true)
    protected String maxCvssScore;
    @XmlAttribute(name = "library", required = true)
    protected String library;
    @XmlAttribute(name = "version", required = true)
    protected String version;
    @XmlAttribute(name = "vendor", required = true)
    protected String vendor;
    @XmlAttribute(name = "description", required = true)
    protected String description;
    @XmlAttribute(name = "blocklisted")
    protected String blocklisted;
    @XmlAttribute(name = "new")
    protected String _new;
    @XmlAttribute(name = "added_date")
    protected String addedDate;
    @XmlAttribute(name = "component_affects_policy_compliance")
    protected String componentAffectsPolicyCompliance;

    /**
     * Obtiene el valor de la propiedad filePaths.
     * 
     * @return
     *     possible object is
     *     {@link FilePathList }
     *     
     */
    public FilePathList getFilePaths() {
        return filePaths;
    }

    /**
     * Define el valor de la propiedad filePaths.
     * 
     * @param value
     *     allowed object is
     *     {@link FilePathList }
     *     
     */
    public void setFilePaths(FilePathList value) {
        this.filePaths = value;
    }

    /**
     * Obtiene el valor de la propiedad licenses.
     * 
     * @return
     *     possible object is
     *     {@link LicenseList }
     *     
     */
    public LicenseList getLicenses() {
        return licenses;
    }

    /**
     * Define el valor de la propiedad licenses.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseList }
     *     
     */
    public void setLicenses(LicenseList value) {
        this.licenses = value;
    }

    /**
     * Obtiene el valor de la propiedad vulnerabilities.
     * 
     * @return
     *     possible object is
     *     {@link VulnerabilityList }
     *     
     */
    public VulnerabilityList getVulnerabilities() {
        return vulnerabilities;
    }

    /**
     * Define el valor de la propiedad vulnerabilities.
     * 
     * @param value
     *     allowed object is
     *     {@link VulnerabilityList }
     *     
     */
    public void setVulnerabilities(VulnerabilityList value) {
        this.vulnerabilities = value;
    }

    /**
     * Obtiene el valor de la propiedad violatedPolicyRules.
     * 
     * @return
     *     possible object is
     *     {@link ViolatedRuleList }
     *     
     */
    public ViolatedRuleList getViolatedPolicyRules() {
        return violatedPolicyRules;
    }

    /**
     * Define el valor de la propiedad violatedPolicyRules.
     * 
     * @param value
     *     allowed object is
     *     {@link ViolatedRuleList }
     *     
     */
    public void setViolatedPolicyRules(ViolatedRuleList value) {
        this.violatedPolicyRules = value;
    }

    /**
     * Obtiene el valor de la propiedad componentId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentId() {
        return componentId;
    }

    /**
     * Define el valor de la propiedad componentId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentId(String value) {
        this.componentId = value;
    }

    /**
     * Obtiene el valor de la propiedad fileName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Define el valor de la propiedad fileName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Obtiene el valor de la propiedad sha1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSha1() {
        return sha1;
    }

    /**
     * Define el valor de la propiedad sha1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSha1(String value) {
        this.sha1 = value;
    }

    /**
     * Obtiene el valor de la propiedad vulnerabilitiesNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVulnerabilitiesNumber() {
        return vulnerabilitiesNumber;
    }

    /**
     * Define el valor de la propiedad vulnerabilitiesNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVulnerabilitiesNumber(BigInteger value) {
        this.vulnerabilitiesNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad maxCvssScore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxCvssScore() {
        return maxCvssScore;
    }

    /**
     * Define el valor de la propiedad maxCvssScore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxCvssScore(String value) {
        this.maxCvssScore = value;
    }

    /**
     * Obtiene el valor de la propiedad library.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibrary() {
        return library;
    }

    /**
     * Define el valor de la propiedad library.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibrary(String value) {
        this.library = value;
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
     * Obtiene el valor de la propiedad vendor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * Define el valor de la propiedad vendor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendor(String value) {
        this.vendor = value;
    }

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtiene el valor de la propiedad blocklisted.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlocklisted() {
        return blocklisted;
    }

    /**
     * Define el valor de la propiedad blocklisted.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlocklisted(String value) {
        this.blocklisted = value;
    }

    /**
     * Obtiene el valor de la propiedad new.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNew() {
        return _new;
    }

    /**
     * Define el valor de la propiedad new.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNew(String value) {
        this._new = value;
    }

    /**
     * Obtiene el valor de la propiedad addedDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddedDate() {
        return addedDate;
    }

    /**
     * Define el valor de la propiedad addedDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddedDate(String value) {
        this.addedDate = value;
    }

    /**
     * Obtiene el valor de la propiedad componentAffectsPolicyCompliance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentAffectsPolicyCompliance() {
        return componentAffectsPolicyCompliance;
    }

    /**
     * Define el valor de la propiedad componentAffectsPolicyCompliance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentAffectsPolicyCompliance(String value) {
        this.componentAffectsPolicyCompliance = value;
    }

}
