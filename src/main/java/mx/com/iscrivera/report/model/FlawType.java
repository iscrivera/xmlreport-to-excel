//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.08.17 a las 11:45:46 AM CDT 
//


package mx.com.iscrivera.report.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *       There is one flaw element per flaw. A flaw element has these elements:
 *       * mitigations: An optional list of any mitigation annotations associated with the flaw.
 *       * annotations: An optional list of any annotations or comments associated with the flaw.
 *       * exploitability_adjustments: An optional list of any exploitability adjustments associated with the flaw.
 *       * exploit_desc: For manual flaws, an optional description of the flaw.
 *       * severity_desc: For manual flaws, an optional description of the severity.
 *       * remediation_desc: For manual flaws, an optional description for remediation.
 *       * appendix: For manual flaws, if there are any screenshots associated with the flaw.
 * 
 *       A flaw element has these attributes:
 *       * severity:  The severity level of the flaw, with 5 being the most severe
 *       * categoryname:  The name of the category.
 *       * count: The number of times this flaw appears.
 *       * issueid:  A unique identifier for the flaw across all builds of this application.
 *         Note that single instances of a flaw found in multiple builds of an application
 *         will have the same issueid value.
 *       * module:  The name of the module in which the flaw is found.
 *       * type:  A very short description of the type of flaw.
 *       * description:  A more detailed description of the type of flaw.
 *       * note:  Any additional information added by our security analysts.
 *       * cweid:  The CWE ID of the flaw.
 *       * remediationeffort: The effort to fix the flaw, with 5 
 *         requiring the most effort and 1 requiring the least.
 *       * exploitLevel: Indication of the intrinsic likelihood that the flaw may be exploited by an attacker.
 *         Ratings range from -2 (very unlikely to be exploited) to 2 (very likely to be exploited).
 *         Rating of 0 means that the likelihood is unspecified.
 *       * categoryid:  A numeric identifier for the category.
 *       * pcirelated:  Whether the flaw is PCI related.  (This will be specified in a 
 *         future release of the platform.)
 *       * date_first_occurrence:  The date of submission of the build where Veracode first identified the
 *         flaw.
 *       * remediation_status:  One of the following values:  Cannot Reproduce, Fixed,
 *         Mitigated, New, Open, Potential False Positive, Remediated by User,
 *         Reopened (Re-Open for V4 of the API and earlier), Reviewed - No Action Taken
 *       * sourcefile:  For flaws found through static analysis, the name of the
 *         source file at which the flaw was found.
 *       * line:  For flaws found through static analysis, the line number on which
 *         the flaw was found.
 *       * sourcefilepath:  For flaws found through static analysis, the name of
 *         the source file path at which the flaw was found. It does not include
 *         the file name.
 *       * scope: An approximate classpath containing the flaw. Useful when more 
 *         specific source information is unavailable	  
 *       * functionprototype: A prototype of the function containing the flaw
 *       * functionrelativelocation: A percent estimate of the way through the function
 *         a flaw was found
 *       * url:  For flaws found through dynamic analysis, the URL at which the flaw
 *         was found.
 *       * location: The location of the flaw, whether a url or the name of the
 *         page the flaw was found on.
 *       * cvss: A scaling factor for each flaws score weight.
 *       * capecid: A category id for the flaw.
 *       * exploitdifficulty: an enumeration.
 *       * inputvector: Where the attack originates.
 *       * affects_policy_compliance: True if the presence of the flaw violates rules associated
 *         with the policy of the application.
 *       * grace_period_expires: If the flaw affects policy compliance, the date by which the flaw
 *         must be fixed in order to remain in compliance with the policy.
 *       * mitigation_status:  One of the following values:  none, proposed, accepted, rejected
 *       * mitigation_status_desc:  Mitigation Status description
 *       * tag: Optional categorization of the module containing the flaw.
 *     
 * 
 * <p>Clase Java para FlawType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FlawType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mitigations" type="{https://www.veracode.com/schema/reports/export/1.0}MitigationListType" minOccurs="0"/>
 *         &lt;element name="exploitability_adjustments" type="{https://www.veracode.com/schema/reports/export/1.0}ExploitAdjustmentListType" minOccurs="0"/>
 *         &lt;element name="annotations" type="{https://www.veracode.com/schema/reports/export/1.0}AnnotationListType" minOccurs="0"/>
 *         &lt;element name="exploit_desc" type="{https://www.veracode.com/schema/reports/export/1.0}LongTextType" minOccurs="0"/>
 *         &lt;element name="severity_desc" type="{https://www.veracode.com/schema/reports/export/1.0}LongTextType" minOccurs="0"/>
 *         &lt;element name="remediation_desc" type="{https://www.veracode.com/schema/reports/export/1.0}LongTextType" minOccurs="0"/>
 *         &lt;element name="appendix" type="{https://www.veracode.com/schema/reports/export/1.0}AppendixType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="severity" use="required" type="{https://www.veracode.com/schema/reports/export/1.0}SeverityValueType" />
 *       &lt;attribute name="categoryname" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="count" type="{https://www.veracode.com/schema/reports/export/1.0}positiveInteger" />
 *       &lt;attribute name="issueid" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="module" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="note" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cweid" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="remediationeffort" use="required" type="{https://www.veracode.com/schema/reports/export/1.0}RemediationEffortValueType" />
 *       &lt;attribute name="exploitLevel" type="{https://www.veracode.com/schema/reports/export/1.0}ExploitabilityValueType" />
 *       &lt;attribute name="categoryid" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="pcirelated" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="date_first_occurrence" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="remediation_status" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sourcefile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="line" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="sourcefilepath" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="scope" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="functionprototype" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="functionrelativelocation" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="vuln_parameter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="procedure_name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="procedure_hash" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="prototype_hash" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="statement_hash" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="statement_hash_count" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="statement_hash_ordinal" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="location" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cvss" type="{https://www.veracode.com/schema/reports/export/1.0}cvssType" />
 *       &lt;attribute name="capecid" type="{https://www.veracode.com/schema/reports/export/1.0}positiveInteger" />
 *       &lt;attribute name="exploitdifficulty" type="{https://www.veracode.com/schema/reports/export/1.0}ExploitDifficultyValueType" />
 *       &lt;attribute name="inputvector" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cia_impact" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="grace_period_expires" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="affects_policy_compliance" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="mitigation_status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mitigation_status_desc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tag" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlawType", propOrder = {
    "mitigations",
    "exploitabilityAdjustments",
    "annotations",
    "exploitDesc",
    "severityDesc",
    "remediationDesc",
    "appendix"
})
public class FlawType {

    protected MitigationListType mitigations;
    @XmlElement(name = "exploitability_adjustments")
    protected ExploitAdjustmentListType exploitabilityAdjustments;
    protected AnnotationListType annotations;
    @XmlElement(name = "exploit_desc")
    protected String exploitDesc;
    @XmlElement(name = "severity_desc")
    protected String severityDesc;
    @XmlElement(name = "remediation_desc")
    protected String remediationDesc;
    protected AppendixType appendix;
    @XmlAttribute(name = "severity", required = true)
    protected int severity;
    @XmlAttribute(name = "categoryname", required = true)
    protected String categoryname;
    @XmlAttribute(name = "count")
    protected Integer count;
    @XmlAttribute(name = "issueid", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger issueid;
    @XmlAttribute(name = "module", required = true)
    protected String module;
    @XmlAttribute(name = "type", required = true)
    protected String type;
    @XmlAttribute(name = "description", required = true)
    protected String description;
    @XmlAttribute(name = "note", required = true)
    protected String note;
    @XmlAttribute(name = "cweid", required = true)
    protected BigInteger cweid;
    @XmlAttribute(name = "remediationeffort", required = true)
    protected int remediationeffort;
    @XmlAttribute(name = "exploitLevel")
    protected Integer exploitLevel;
    @XmlAttribute(name = "categoryid", required = true)
    protected BigInteger categoryid;
    @XmlAttribute(name = "pcirelated")
    protected Boolean pcirelated;
    @XmlAttribute(name = "date_first_occurrence", required = true)
    protected String dateFirstOccurrence;
    @XmlAttribute(name = "remediation_status", required = true)
    protected String remediationStatus;
    @XmlAttribute(name = "sourcefile")
    protected String sourcefile;
    @XmlAttribute(name = "line")
    protected BigInteger line;
    @XmlAttribute(name = "sourcefilepath")
    protected String sourcefilepath;
    @XmlAttribute(name = "scope")
    protected String scope;
    @XmlAttribute(name = "functionprototype")
    protected String functionprototype;
    @XmlAttribute(name = "functionrelativelocation")
    protected BigInteger functionrelativelocation;
    @XmlAttribute(name = "url")
    protected String url;
    @XmlAttribute(name = "vuln_parameter")
    protected String vulnParameter;
    @XmlAttribute(name = "procedure_name")
    protected String procedureName;
    @XmlAttribute(name = "procedure_hash")
    protected String procedureHash;
    @XmlAttribute(name = "prototype_hash")
    protected String prototypeHash;
    @XmlAttribute(name = "statement_hash")
    protected String statementHash;
    @XmlAttribute(name = "statement_hash_count")
    protected BigInteger statementHashCount;
    @XmlAttribute(name = "statement_hash_ordinal")
    protected BigInteger statementHashOrdinal;
    @XmlAttribute(name = "location")
    protected String location;
    @XmlAttribute(name = "cvss")
    protected BigDecimal cvss;
    @XmlAttribute(name = "capecid")
    protected Integer capecid;
    @XmlAttribute(name = "exploitdifficulty")
    protected Integer exploitdifficulty;
    @XmlAttribute(name = "inputvector")
    protected String inputvector;
    @XmlAttribute(name = "cia_impact", required = true)
    protected String ciaImpact;
    @XmlAttribute(name = "grace_period_expires", required = true)
    protected String gracePeriodExpires;
    @XmlAttribute(name = "affects_policy_compliance", required = true)
    protected boolean affectsPolicyCompliance;
    @XmlAttribute(name = "mitigation_status")
    protected String mitigationStatus;
    @XmlAttribute(name = "mitigation_status_desc")
    protected String mitigationStatusDesc;
    @XmlAttribute(name = "tag")
    protected String tag;

    /**
     * Obtiene el valor de la propiedad mitigations.
     * 
     * @return
     *     possible object is
     *     {@link MitigationListType }
     *     
     */
    public MitigationListType getMitigations() {
        return mitigations;
    }

    /**
     * Define el valor de la propiedad mitigations.
     * 
     * @param value
     *     allowed object is
     *     {@link MitigationListType }
     *     
     */
    public void setMitigations(MitigationListType value) {
        this.mitigations = value;
    }

    /**
     * Obtiene el valor de la propiedad exploitabilityAdjustments.
     * 
     * @return
     *     possible object is
     *     {@link ExploitAdjustmentListType }
     *     
     */
    public ExploitAdjustmentListType getExploitabilityAdjustments() {
        return exploitabilityAdjustments;
    }

    /**
     * Define el valor de la propiedad exploitabilityAdjustments.
     * 
     * @param value
     *     allowed object is
     *     {@link ExploitAdjustmentListType }
     *     
     */
    public void setExploitabilityAdjustments(ExploitAdjustmentListType value) {
        this.exploitabilityAdjustments = value;
    }

    /**
     * Obtiene el valor de la propiedad annotations.
     * 
     * @return
     *     possible object is
     *     {@link AnnotationListType }
     *     
     */
    public AnnotationListType getAnnotations() {
        return annotations;
    }

    /**
     * Define el valor de la propiedad annotations.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnotationListType }
     *     
     */
    public void setAnnotations(AnnotationListType value) {
        this.annotations = value;
    }

    /**
     * Obtiene el valor de la propiedad exploitDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExploitDesc() {
        return exploitDesc;
    }

    /**
     * Define el valor de la propiedad exploitDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExploitDesc(String value) {
        this.exploitDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad severityDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeverityDesc() {
        return severityDesc;
    }

    /**
     * Define el valor de la propiedad severityDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeverityDesc(String value) {
        this.severityDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad remediationDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemediationDesc() {
        return remediationDesc;
    }

    /**
     * Define el valor de la propiedad remediationDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemediationDesc(String value) {
        this.remediationDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad appendix.
     * 
     * @return
     *     possible object is
     *     {@link AppendixType }
     *     
     */
    public AppendixType getAppendix() {
        return appendix;
    }

    /**
     * Define el valor de la propiedad appendix.
     * 
     * @param value
     *     allowed object is
     *     {@link AppendixType }
     *     
     */
    public void setAppendix(AppendixType value) {
        this.appendix = value;
    }

    /**
     * Obtiene el valor de la propiedad severity.
     * 
     */
    public int getSeverity() {
        return severity;
    }

    /**
     * Define el valor de la propiedad severity.
     * 
     */
    public void setSeverity(int value) {
        this.severity = value;
    }

    /**
     * Obtiene el valor de la propiedad categoryname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryname() {
        return categoryname;
    }

    /**
     * Define el valor de la propiedad categoryname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryname(String value) {
        this.categoryname = value;
    }

    /**
     * Obtiene el valor de la propiedad count.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCount() {
        return count;
    }

    /**
     * Define el valor de la propiedad count.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCount(Integer value) {
        this.count = value;
    }

    /**
     * Obtiene el valor de la propiedad issueid.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIssueid() {
        return issueid;
    }

    /**
     * Define el valor de la propiedad issueid.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIssueid(BigInteger value) {
        this.issueid = value;
    }

    /**
     * Obtiene el valor de la propiedad module.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModule() {
        return module;
    }

    /**
     * Define el valor de la propiedad module.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModule(String value) {
        this.module = value;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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
     * Obtiene el valor de la propiedad note.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Define el valor de la propiedad note.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
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
     * Obtiene el valor de la propiedad remediationeffort.
     * 
     */
    public int getRemediationeffort() {
        return remediationeffort;
    }

    /**
     * Define el valor de la propiedad remediationeffort.
     * 
     */
    public void setRemediationeffort(int value) {
        this.remediationeffort = value;
    }

    /**
     * Obtiene el valor de la propiedad exploitLevel.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExploitLevel() {
        return exploitLevel;
    }

    /**
     * Define el valor de la propiedad exploitLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExploitLevel(Integer value) {
        this.exploitLevel = value;
    }

    /**
     * Obtiene el valor de la propiedad categoryid.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCategoryid() {
        return categoryid;
    }

    /**
     * Define el valor de la propiedad categoryid.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCategoryid(BigInteger value) {
        this.categoryid = value;
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
     * Obtiene el valor de la propiedad dateFirstOccurrence.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFirstOccurrence() {
        return dateFirstOccurrence;
    }

    /**
     * Define el valor de la propiedad dateFirstOccurrence.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFirstOccurrence(String value) {
        this.dateFirstOccurrence = value;
    }

    /**
     * Obtiene el valor de la propiedad remediationStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemediationStatus() {
        return remediationStatus;
    }

    /**
     * Define el valor de la propiedad remediationStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemediationStatus(String value) {
        this.remediationStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad sourcefile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourcefile() {
        return sourcefile;
    }

    /**
     * Define el valor de la propiedad sourcefile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourcefile(String value) {
        this.sourcefile = value;
    }

    /**
     * Obtiene el valor de la propiedad line.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLine() {
        return line;
    }

    /**
     * Define el valor de la propiedad line.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLine(BigInteger value) {
        this.line = value;
    }

    /**
     * Obtiene el valor de la propiedad sourcefilepath.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourcefilepath() {
        return sourcefilepath;
    }

    /**
     * Define el valor de la propiedad sourcefilepath.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourcefilepath(String value) {
        this.sourcefilepath = value;
    }

    /**
     * Obtiene el valor de la propiedad scope.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScope() {
        return scope;
    }

    /**
     * Define el valor de la propiedad scope.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScope(String value) {
        this.scope = value;
    }

    /**
     * Obtiene el valor de la propiedad functionprototype.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionprototype() {
        return functionprototype;
    }

    /**
     * Define el valor de la propiedad functionprototype.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionprototype(String value) {
        this.functionprototype = value;
    }

    /**
     * Obtiene el valor de la propiedad functionrelativelocation.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFunctionrelativelocation() {
        return functionrelativelocation;
    }

    /**
     * Define el valor de la propiedad functionrelativelocation.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFunctionrelativelocation(BigInteger value) {
        this.functionrelativelocation = value;
    }

    /**
     * Obtiene el valor de la propiedad url.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Define el valor de la propiedad url.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Obtiene el valor de la propiedad vulnParameter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVulnParameter() {
        return vulnParameter;
    }

    /**
     * Define el valor de la propiedad vulnParameter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVulnParameter(String value) {
        this.vulnParameter = value;
    }

    /**
     * Obtiene el valor de la propiedad procedureName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcedureName() {
        return procedureName;
    }

    /**
     * Define el valor de la propiedad procedureName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcedureName(String value) {
        this.procedureName = value;
    }

    /**
     * Obtiene el valor de la propiedad procedureHash.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcedureHash() {
        return procedureHash;
    }

    /**
     * Define el valor de la propiedad procedureHash.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcedureHash(String value) {
        this.procedureHash = value;
    }

    /**
     * Obtiene el valor de la propiedad prototypeHash.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrototypeHash() {
        return prototypeHash;
    }

    /**
     * Define el valor de la propiedad prototypeHash.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrototypeHash(String value) {
        this.prototypeHash = value;
    }

    /**
     * Obtiene el valor de la propiedad statementHash.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatementHash() {
        return statementHash;
    }

    /**
     * Define el valor de la propiedad statementHash.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatementHash(String value) {
        this.statementHash = value;
    }

    /**
     * Obtiene el valor de la propiedad statementHashCount.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStatementHashCount() {
        return statementHashCount;
    }

    /**
     * Define el valor de la propiedad statementHashCount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStatementHashCount(BigInteger value) {
        this.statementHashCount = value;
    }

    /**
     * Obtiene el valor de la propiedad statementHashOrdinal.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStatementHashOrdinal() {
        return statementHashOrdinal;
    }

    /**
     * Define el valor de la propiedad statementHashOrdinal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStatementHashOrdinal(BigInteger value) {
        this.statementHashOrdinal = value;
    }

    /**
     * Obtiene el valor de la propiedad location.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Define el valor de la propiedad location.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Obtiene el valor de la propiedad cvss.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCvss() {
        return cvss;
    }

    /**
     * Define el valor de la propiedad cvss.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCvss(BigDecimal value) {
        this.cvss = value;
    }

    /**
     * Obtiene el valor de la propiedad capecid.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCapecid() {
        return capecid;
    }

    /**
     * Define el valor de la propiedad capecid.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCapecid(Integer value) {
        this.capecid = value;
    }

    /**
     * Obtiene el valor de la propiedad exploitdifficulty.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExploitdifficulty() {
        return exploitdifficulty;
    }

    /**
     * Define el valor de la propiedad exploitdifficulty.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExploitdifficulty(Integer value) {
        this.exploitdifficulty = value;
    }

    /**
     * Obtiene el valor de la propiedad inputvector.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputvector() {
        return inputvector;
    }

    /**
     * Define el valor de la propiedad inputvector.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputvector(String value) {
        this.inputvector = value;
    }

    /**
     * Obtiene el valor de la propiedad ciaImpact.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiaImpact() {
        return ciaImpact;
    }

    /**
     * Define el valor de la propiedad ciaImpact.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiaImpact(String value) {
        this.ciaImpact = value;
    }

    /**
     * Obtiene el valor de la propiedad gracePeriodExpires.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGracePeriodExpires() {
        return gracePeriodExpires;
    }

    /**
     * Define el valor de la propiedad gracePeriodExpires.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGracePeriodExpires(String value) {
        this.gracePeriodExpires = value;
    }

    /**
     * Obtiene el valor de la propiedad affectsPolicyCompliance.
     * 
     */
    public boolean isAffectsPolicyCompliance() {
        return affectsPolicyCompliance;
    }

    /**
     * Define el valor de la propiedad affectsPolicyCompliance.
     * 
     */
    public void setAffectsPolicyCompliance(boolean value) {
        this.affectsPolicyCompliance = value;
    }

    /**
     * Obtiene el valor de la propiedad mitigationStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMitigationStatus() {
        return mitigationStatus;
    }

    /**
     * Define el valor de la propiedad mitigationStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMitigationStatus(String value) {
        this.mitigationStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad mitigationStatusDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMitigationStatusDesc() {
        return mitigationStatusDesc;
    }

    /**
     * Define el valor de la propiedad mitigationStatusDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMitigationStatusDesc(String value) {
        this.mitigationStatusDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad tag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag() {
        return tag;
    }

    /**
     * Define el valor de la propiedad tag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag(String value) {
        this.tag = value;
    }

}
