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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="static-analysis" type="{https://www.veracode.com/schema/reports/export/1.0}AnalysisType" minOccurs="0"/>
 *         &lt;element name="dynamic-analysis" type="{https://www.veracode.com/schema/reports/export/1.0}AnalysisType" minOccurs="0"/>
 *         &lt;element name="manual-analysis" type="{https://www.veracode.com/schema/reports/export/1.0}ManualAnalysisType" minOccurs="0"/>
 *         &lt;element name="severity" type="{https://www.veracode.com/schema/reports/export/1.0}SeverityType" maxOccurs="6" minOccurs="6"/>
 *         &lt;element name="flaw-status" type="{https://www.veracode.com/schema/reports/export/1.0}FlawStatusType"/>
 *         &lt;element name="customfields" type="{https://www.veracode.com/schema/reports/export/1.0}CustomFieldsType" minOccurs="0"/>
 *         &lt;element name="software_composition_analysis" type="{https://www.veracode.com/schema/reports/export/1.0}SoftwareCompositionAnalysis" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="report_format_version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="account_id" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="app_name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="app_id" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="analysis_id" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="static_analysis_unit_id" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="sandbox_name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sandbox_id" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="first_build_submitted_date" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="build_id" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="vendor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="submitter" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="platform" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="assurance_level" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="business_criticality" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="generation_date" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="veracode_level" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="total_flaws" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="flaws_not_mitigated" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="teams" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="life_cycle_stage" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="planned_deployment_date" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="last_update_time" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="is_latest_build" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="policy_name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="policy_version" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="policy_compliance_status" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="policy_rules_status" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="grace_period_expired" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="scan_overdue" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="any_type_scan_due" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="business_owner" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="business_unit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tags" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="legacy_scan_engine" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "staticAnalysis",
    "dynamicAnalysis",
    "manualAnalysis",
    "severity",
    "flawStatus",
    "customfields",
    "softwareCompositionAnalysis"
})
@XmlRootElement(name = "detailedreport")
public class Detailedreport {

    @XmlElement(name = "static-analysis")
    protected AnalysisType staticAnalysis;
    @XmlElement(name = "dynamic-analysis")
    protected AnalysisType dynamicAnalysis;
    @XmlElement(name = "manual-analysis")
    protected ManualAnalysisType manualAnalysis;
    @XmlElement(required = true)
    protected List<SeverityType> severity;
    @XmlElement(name = "flaw-status", required = true)
    protected FlawStatusType flawStatus;
    protected CustomFieldsType customfields;
    @XmlElement(name = "software_composition_analysis")
    protected SoftwareCompositionAnalysis softwareCompositionAnalysis;
    @XmlAttribute(name = "report_format_version", required = true)
    protected String reportFormatVersion;
    @XmlAttribute(name = "account_id", required = true)
    protected long accountId;
    @XmlAttribute(name = "app_name", required = true)
    protected String appName;
    @XmlAttribute(name = "app_id", required = true)
    protected long appId;
    @XmlAttribute(name = "analysis_id", required = true)
    protected long analysisId;
    @XmlAttribute(name = "static_analysis_unit_id", required = true)
    protected long staticAnalysisUnitId;
    @XmlAttribute(name = "sandbox_name")
    protected String sandboxName;
    @XmlAttribute(name = "sandbox_id", required = true)
    protected long sandboxId;
    @XmlAttribute(name = "first_build_submitted_date")
    protected String firstBuildSubmittedDate;
    @XmlAttribute(name = "version", required = true)
    protected String version;
    @XmlAttribute(name = "build_id", required = true)
    protected long buildId;
    @XmlAttribute(name = "vendor")
    protected String vendor;
    @XmlAttribute(name = "submitter", required = true)
    protected String submitter;
    @XmlAttribute(name = "platform", required = true)
    protected String platform;
    @XmlAttribute(name = "assurance_level")
    protected BigInteger assuranceLevel;
    @XmlAttribute(name = "business_criticality")
    protected BigInteger businessCriticality;
    @XmlAttribute(name = "generation_date", required = true)
    protected String generationDate;
    @XmlAttribute(name = "veracode_level", required = true)
    protected String veracodeLevel;
    @XmlAttribute(name = "total_flaws")
    protected BigInteger totalFlaws;
    @XmlAttribute(name = "flaws_not_mitigated")
    protected BigInteger flawsNotMitigated;
    @XmlAttribute(name = "teams", required = true)
    protected String teams;
    @XmlAttribute(name = "life_cycle_stage", required = true)
    protected String lifeCycleStage;
    @XmlAttribute(name = "planned_deployment_date")
    protected String plannedDeploymentDate;
    @XmlAttribute(name = "last_update_time", required = true)
    protected String lastUpdateTime;
    @XmlAttribute(name = "is_latest_build", required = true)
    protected boolean isLatestBuild;
    @XmlAttribute(name = "policy_name", required = true)
    protected String policyName;
    @XmlAttribute(name = "policy_version", required = true)
    protected BigInteger policyVersion;
    @XmlAttribute(name = "policy_compliance_status", required = true)
    protected String policyComplianceStatus;
    @XmlAttribute(name = "policy_rules_status", required = true)
    protected String policyRulesStatus;
    @XmlAttribute(name = "grace_period_expired", required = true)
    protected boolean gracePeriodExpired;
    @XmlAttribute(name = "scan_overdue", required = true)
    protected String scanOverdue;
    @XmlAttribute(name = "any_type_scan_due")
    protected String anyTypeScanDue;
    @XmlAttribute(name = "business_owner")
    protected String businessOwner;
    @XmlAttribute(name = "business_unit")
    protected String businessUnit;
    @XmlAttribute(name = "tags")
    protected String tags;
    @XmlAttribute(name = "legacy_scan_engine")
    protected Boolean legacyScanEngine;

    /**
     * Obtiene el valor de la propiedad staticAnalysis.
     * 
     * @return
     *     possible object is
     *     {@link AnalysisType }
     *     
     */
    public AnalysisType getStaticAnalysis() {
        return staticAnalysis;
    }

    /**
     * Define el valor de la propiedad staticAnalysis.
     * 
     * @param value
     *     allowed object is
     *     {@link AnalysisType }
     *     
     */
    public void setStaticAnalysis(AnalysisType value) {
        this.staticAnalysis = value;
    }

    /**
     * Obtiene el valor de la propiedad dynamicAnalysis.
     * 
     * @return
     *     possible object is
     *     {@link AnalysisType }
     *     
     */
    public AnalysisType getDynamicAnalysis() {
        return dynamicAnalysis;
    }

    /**
     * Define el valor de la propiedad dynamicAnalysis.
     * 
     * @param value
     *     allowed object is
     *     {@link AnalysisType }
     *     
     */
    public void setDynamicAnalysis(AnalysisType value) {
        this.dynamicAnalysis = value;
    }

    /**
     * Obtiene el valor de la propiedad manualAnalysis.
     * 
     * @return
     *     possible object is
     *     {@link ManualAnalysisType }
     *     
     */
    public ManualAnalysisType getManualAnalysis() {
        return manualAnalysis;
    }

    /**
     * Define el valor de la propiedad manualAnalysis.
     * 
     * @param value
     *     allowed object is
     *     {@link ManualAnalysisType }
     *     
     */
    public void setManualAnalysis(ManualAnalysisType value) {
        this.manualAnalysis = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the severity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeverity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeverityType }
     * 
     * 
     */
    public List<SeverityType> getSeverity() {
        if (severity == null) {
            severity = new ArrayList<SeverityType>();
        }
        return this.severity;
    }

    /**
     * Obtiene el valor de la propiedad flawStatus.
     * 
     * @return
     *     possible object is
     *     {@link FlawStatusType }
     *     
     */
    public FlawStatusType getFlawStatus() {
        return flawStatus;
    }

    /**
     * Define el valor de la propiedad flawStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link FlawStatusType }
     *     
     */
    public void setFlawStatus(FlawStatusType value) {
        this.flawStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad customfields.
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldsType }
     *     
     */
    public CustomFieldsType getCustomfields() {
        return customfields;
    }

    /**
     * Define el valor de la propiedad customfields.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldsType }
     *     
     */
    public void setCustomfields(CustomFieldsType value) {
        this.customfields = value;
    }

    /**
     * Obtiene el valor de la propiedad softwareCompositionAnalysis.
     * 
     * @return
     *     possible object is
     *     {@link SoftwareCompositionAnalysis }
     *     
     */
    public SoftwareCompositionAnalysis getSoftwareCompositionAnalysis() {
        return softwareCompositionAnalysis;
    }

    /**
     * Define el valor de la propiedad softwareCompositionAnalysis.
     * 
     * @param value
     *     allowed object is
     *     {@link SoftwareCompositionAnalysis }
     *     
     */
    public void setSoftwareCompositionAnalysis(SoftwareCompositionAnalysis value) {
        this.softwareCompositionAnalysis = value;
    }

    /**
     * Obtiene el valor de la propiedad reportFormatVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportFormatVersion() {
        return reportFormatVersion;
    }

    /**
     * Define el valor de la propiedad reportFormatVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportFormatVersion(String value) {
        this.reportFormatVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad accountId.
     * 
     */
    public long getAccountId() {
        return accountId;
    }

    /**
     * Define el valor de la propiedad accountId.
     * 
     */
    public void setAccountId(long value) {
        this.accountId = value;
    }

    /**
     * Obtiene el valor de la propiedad appName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppName() {
        return appName;
    }

    /**
     * Define el valor de la propiedad appName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppName(String value) {
        this.appName = value;
    }

    /**
     * Obtiene el valor de la propiedad appId.
     * 
     */
    public long getAppId() {
        return appId;
    }

    /**
     * Define el valor de la propiedad appId.
     * 
     */
    public void setAppId(long value) {
        this.appId = value;
    }

    /**
     * Obtiene el valor de la propiedad analysisId.
     * 
     */
    public long getAnalysisId() {
        return analysisId;
    }

    /**
     * Define el valor de la propiedad analysisId.
     * 
     */
    public void setAnalysisId(long value) {
        this.analysisId = value;
    }

    /**
     * Obtiene el valor de la propiedad staticAnalysisUnitId.
     * 
     */
    public long getStaticAnalysisUnitId() {
        return staticAnalysisUnitId;
    }

    /**
     * Define el valor de la propiedad staticAnalysisUnitId.
     * 
     */
    public void setStaticAnalysisUnitId(long value) {
        this.staticAnalysisUnitId = value;
    }

    /**
     * Obtiene el valor de la propiedad sandboxName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSandboxName() {
        return sandboxName;
    }

    /**
     * Define el valor de la propiedad sandboxName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSandboxName(String value) {
        this.sandboxName = value;
    }

    /**
     * Obtiene el valor de la propiedad sandboxId.
     * 
     */
    public long getSandboxId() {
        return sandboxId;
    }

    /**
     * Define el valor de la propiedad sandboxId.
     * 
     */
    public void setSandboxId(long value) {
        this.sandboxId = value;
    }

    /**
     * Obtiene el valor de la propiedad firstBuildSubmittedDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstBuildSubmittedDate() {
        return firstBuildSubmittedDate;
    }

    /**
     * Define el valor de la propiedad firstBuildSubmittedDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstBuildSubmittedDate(String value) {
        this.firstBuildSubmittedDate = value;
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
     * Obtiene el valor de la propiedad buildId.
     * 
     */
    public long getBuildId() {
        return buildId;
    }

    /**
     * Define el valor de la propiedad buildId.
     * 
     */
    public void setBuildId(long value) {
        this.buildId = value;
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
     * Obtiene el valor de la propiedad submitter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmitter() {
        return submitter;
    }

    /**
     * Define el valor de la propiedad submitter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmitter(String value) {
        this.submitter = value;
    }

    /**
     * Obtiene el valor de la propiedad platform.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * Define el valor de la propiedad platform.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatform(String value) {
        this.platform = value;
    }

    /**
     * Obtiene el valor de la propiedad assuranceLevel.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAssuranceLevel() {
        return assuranceLevel;
    }

    /**
     * Define el valor de la propiedad assuranceLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAssuranceLevel(BigInteger value) {
        this.assuranceLevel = value;
    }

    /**
     * Obtiene el valor de la propiedad businessCriticality.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBusinessCriticality() {
        return businessCriticality;
    }

    /**
     * Define el valor de la propiedad businessCriticality.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBusinessCriticality(BigInteger value) {
        this.businessCriticality = value;
    }

    /**
     * Obtiene el valor de la propiedad generationDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenerationDate() {
        return generationDate;
    }

    /**
     * Define el valor de la propiedad generationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenerationDate(String value) {
        this.generationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad veracodeLevel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVeracodeLevel() {
        return veracodeLevel;
    }

    /**
     * Define el valor de la propiedad veracodeLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVeracodeLevel(String value) {
        this.veracodeLevel = value;
    }

    /**
     * Obtiene el valor de la propiedad totalFlaws.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalFlaws() {
        return totalFlaws;
    }

    /**
     * Define el valor de la propiedad totalFlaws.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalFlaws(BigInteger value) {
        this.totalFlaws = value;
    }

    /**
     * Obtiene el valor de la propiedad flawsNotMitigated.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFlawsNotMitigated() {
        return flawsNotMitigated;
    }

    /**
     * Define el valor de la propiedad flawsNotMitigated.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFlawsNotMitigated(BigInteger value) {
        this.flawsNotMitigated = value;
    }

    /**
     * Obtiene el valor de la propiedad teams.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeams() {
        return teams;
    }

    /**
     * Define el valor de la propiedad teams.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeams(String value) {
        this.teams = value;
    }

    /**
     * Obtiene el valor de la propiedad lifeCycleStage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifeCycleStage() {
        return lifeCycleStage;
    }

    /**
     * Define el valor de la propiedad lifeCycleStage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLifeCycleStage(String value) {
        this.lifeCycleStage = value;
    }

    /**
     * Obtiene el valor de la propiedad plannedDeploymentDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlannedDeploymentDate() {
        return plannedDeploymentDate;
    }

    /**
     * Define el valor de la propiedad plannedDeploymentDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlannedDeploymentDate(String value) {
        this.plannedDeploymentDate = value;
    }

    /**
     * Obtiene el valor de la propiedad lastUpdateTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * Define el valor de la propiedad lastUpdateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdateTime(String value) {
        this.lastUpdateTime = value;
    }

    /**
     * Obtiene el valor de la propiedad isLatestBuild.
     * 
     */
    public boolean isIsLatestBuild() {
        return isLatestBuild;
    }

    /**
     * Define el valor de la propiedad isLatestBuild.
     * 
     */
    public void setIsLatestBuild(boolean value) {
        this.isLatestBuild = value;
    }

    /**
     * Obtiene el valor de la propiedad policyName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyName() {
        return policyName;
    }

    /**
     * Define el valor de la propiedad policyName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyName(String value) {
        this.policyName = value;
    }

    /**
     * Obtiene el valor de la propiedad policyVersion.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPolicyVersion() {
        return policyVersion;
    }

    /**
     * Define el valor de la propiedad policyVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPolicyVersion(BigInteger value) {
        this.policyVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad policyComplianceStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyComplianceStatus() {
        return policyComplianceStatus;
    }

    /**
     * Define el valor de la propiedad policyComplianceStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyComplianceStatus(String value) {
        this.policyComplianceStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad policyRulesStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyRulesStatus() {
        return policyRulesStatus;
    }

    /**
     * Define el valor de la propiedad policyRulesStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyRulesStatus(String value) {
        this.policyRulesStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad gracePeriodExpired.
     * 
     */
    public boolean isGracePeriodExpired() {
        return gracePeriodExpired;
    }

    /**
     * Define el valor de la propiedad gracePeriodExpired.
     * 
     */
    public void setGracePeriodExpired(boolean value) {
        this.gracePeriodExpired = value;
    }

    /**
     * Obtiene el valor de la propiedad scanOverdue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScanOverdue() {
        return scanOverdue;
    }

    /**
     * Define el valor de la propiedad scanOverdue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScanOverdue(String value) {
        this.scanOverdue = value;
    }

    /**
     * Obtiene el valor de la propiedad anyTypeScanDue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnyTypeScanDue() {
        return anyTypeScanDue;
    }

    /**
     * Define el valor de la propiedad anyTypeScanDue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnyTypeScanDue(String value) {
        this.anyTypeScanDue = value;
    }

    /**
     * Obtiene el valor de la propiedad businessOwner.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessOwner() {
        return businessOwner;
    }

    /**
     * Define el valor de la propiedad businessOwner.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessOwner(String value) {
        this.businessOwner = value;
    }

    /**
     * Obtiene el valor de la propiedad businessUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessUnit() {
        return businessUnit;
    }

    /**
     * Define el valor de la propiedad businessUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessUnit(String value) {
        this.businessUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad tags.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTags() {
        return tags;
    }

    /**
     * Define el valor de la propiedad tags.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTags(String value) {
        this.tags = value;
    }

    /**
     * Obtiene el valor de la propiedad legacyScanEngine.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLegacyScanEngine() {
        return legacyScanEngine;
    }

    /**
     * Define el valor de la propiedad legacyScanEngine.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLegacyScanEngine(Boolean value) {
        this.legacyScanEngine = value;
    }

}
