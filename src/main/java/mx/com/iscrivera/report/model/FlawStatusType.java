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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *       The element describes summary data for the flaws in the build.
 *       Each adjustment will have the following attributes:
 *       * new:  The number of flaws first found in this build of the application.
 *       * reopen:  The number of flaws found in a prior build of the application 
 *         that were not new, but were not found in the build immediately prior to
 *         this build.
 *       * open:  The number of flaws found in this build that were also found in the
 *         build immediately prior to this build.
 *       * cannot-reproduce: The number of dynamic vulnerabilities reported in a previous 
 *       	dynamic scan that could not be verified as fixed.
 *       * fixed:  The number of flaws found in the prior build that were not found 
 *       	in the current build. Dynamic vulnerabilities are verified as fixed.
 *       * total:  The total number of flaws found in this build.
 *       * not_mitigated:  The total number of flaws found in this build that are 
 *         not mitigated.
 *       * sev-1-change: The number of Severity 1 flaws found in this build, 
 *         minus the number of Severity 1 flaws found in the build immediately prior
 *         to this build.
 *       * sev-2-change: The number of Severity 2 flaws found in this build, 
 *         minus the number of Severity 2 flaws found in the build immediately prior
 *         to this build.
 *       * sev-3-change: The number of Severity 3 flaws found in this build, 
 *         minus the number of Severity 3 flaws found in the build immediately prior
 *         to this build.
 *       * sev-4-change: The number of Severity 4 flaws found in this build, 
 *         minus the number of Severity 4 flaws found in the build immediately prior
 *         to this build.
 *       * sev-5-change: The number of Severity 5 flaws found in this build, 
 *         minus the number of Severity 5 flaws found in the build immediately prior
 *         to this build.
 *       * conforms-to-guidelines: The total number of mitigations reviewed by Veracode 
 *         that adhere to the risk tolerance guidelines you established.
 *       * deviates-from-guidelines: The total number of mitigations reviewed by Veracode
 *         that either do not provide enough information, or do not adhere to the risk
 *         tolerance guidelines you established.
 *       * total-reviewed-mitigations: The total number of mitigations reviewed by Veracode.
 *         This may not add up to the total number of all proposed or accepted mitigations.
 *     
 * 
 * <p>Clase Java para FlawStatusType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FlawStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="new" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="reopen" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="open" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="cannot-reproduce" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="fixed" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="total" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="not_mitigated" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="sev-1-change" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="sev-2-change" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="sev-3-change" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="sev-4-change" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="sev-5-change" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="conforms-to-guidelines" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="deviates-from-guidelines" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="defer-to-security-team" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="total-reviewed-mitigations" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlawStatusType")
public class FlawStatusType {

    @XmlAttribute(name = "new", required = true)
    protected BigInteger valueNew;
    @XmlAttribute(name = "reopen", required = true)
    protected BigInteger reopen;
    @XmlAttribute(name = "open", required = true)
    protected BigInteger open;
    @XmlAttribute(name = "cannot-reproduce")
    protected BigInteger cannotReproduce;
    @XmlAttribute(name = "fixed", required = true)
    protected BigInteger fixed;
    @XmlAttribute(name = "total", required = true)
    protected BigInteger total;
    @XmlAttribute(name = "not_mitigated", required = true)
    protected BigInteger notMitigated;
    @XmlAttribute(name = "sev-1-change", required = true)
    protected BigInteger sev1Change;
    @XmlAttribute(name = "sev-2-change", required = true)
    protected BigInteger sev2Change;
    @XmlAttribute(name = "sev-3-change", required = true)
    protected BigInteger sev3Change;
    @XmlAttribute(name = "sev-4-change", required = true)
    protected BigInteger sev4Change;
    @XmlAttribute(name = "sev-5-change", required = true)
    protected BigInteger sev5Change;
    @XmlAttribute(name = "conforms-to-guidelines")
    protected BigInteger conformsToGuidelines;
    @XmlAttribute(name = "deviates-from-guidelines")
    protected BigInteger deviatesFromGuidelines;
    @XmlAttribute(name = "defer-to-security-team")
    protected BigInteger deferToSecurityTeam;
    @XmlAttribute(name = "total-reviewed-mitigations")
    protected BigInteger totalReviewedMitigations;

    /**
     * Obtiene el valor de la propiedad new.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNew() {
        return valueNew;
    }

    /**
     * Define el valor de la propiedad new.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNew(BigInteger value) {
        this.valueNew = value;
    }

    /**
     * Obtiene el valor de la propiedad reopen.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReopen() {
        return reopen;
    }

    /**
     * Define el valor de la propiedad reopen.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReopen(BigInteger value) {
        this.reopen = value;
    }

    /**
     * Obtiene el valor de la propiedad open.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOpen() {
        return open;
    }

    /**
     * Define el valor de la propiedad open.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOpen(BigInteger value) {
        this.open = value;
    }

    /**
     * Obtiene el valor de la propiedad cannotReproduce.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCannotReproduce() {
        return cannotReproduce;
    }

    /**
     * Define el valor de la propiedad cannotReproduce.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCannotReproduce(BigInteger value) {
        this.cannotReproduce = value;
    }

    /**
     * Obtiene el valor de la propiedad fixed.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFixed() {
        return fixed;
    }

    /**
     * Define el valor de la propiedad fixed.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFixed(BigInteger value) {
        this.fixed = value;
    }

    /**
     * Obtiene el valor de la propiedad total.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotal() {
        return total;
    }

    /**
     * Define el valor de la propiedad total.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotal(BigInteger value) {
        this.total = value;
    }

    /**
     * Obtiene el valor de la propiedad notMitigated.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNotMitigated() {
        return notMitigated;
    }

    /**
     * Define el valor de la propiedad notMitigated.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNotMitigated(BigInteger value) {
        this.notMitigated = value;
    }

    /**
     * Obtiene el valor de la propiedad sev1Change.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSev1Change() {
        return sev1Change;
    }

    /**
     * Define el valor de la propiedad sev1Change.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSev1Change(BigInteger value) {
        this.sev1Change = value;
    }

    /**
     * Obtiene el valor de la propiedad sev2Change.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSev2Change() {
        return sev2Change;
    }

    /**
     * Define el valor de la propiedad sev2Change.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSev2Change(BigInteger value) {
        this.sev2Change = value;
    }

    /**
     * Obtiene el valor de la propiedad sev3Change.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSev3Change() {
        return sev3Change;
    }

    /**
     * Define el valor de la propiedad sev3Change.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSev3Change(BigInteger value) {
        this.sev3Change = value;
    }

    /**
     * Obtiene el valor de la propiedad sev4Change.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSev4Change() {
        return sev4Change;
    }

    /**
     * Define el valor de la propiedad sev4Change.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSev4Change(BigInteger value) {
        this.sev4Change = value;
    }

    /**
     * Obtiene el valor de la propiedad sev5Change.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSev5Change() {
        return sev5Change;
    }

    /**
     * Define el valor de la propiedad sev5Change.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSev5Change(BigInteger value) {
        this.sev5Change = value;
    }

    /**
     * Obtiene el valor de la propiedad conformsToGuidelines.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConformsToGuidelines() {
        return conformsToGuidelines;
    }

    /**
     * Define el valor de la propiedad conformsToGuidelines.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConformsToGuidelines(BigInteger value) {
        this.conformsToGuidelines = value;
    }

    /**
     * Obtiene el valor de la propiedad deviatesFromGuidelines.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeviatesFromGuidelines() {
        return deviatesFromGuidelines;
    }

    /**
     * Define el valor de la propiedad deviatesFromGuidelines.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeviatesFromGuidelines(BigInteger value) {
        this.deviatesFromGuidelines = value;
    }

    /**
     * Obtiene el valor de la propiedad deferToSecurityTeam.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeferToSecurityTeam() {
        return deferToSecurityTeam;
    }

    /**
     * Define el valor de la propiedad deferToSecurityTeam.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeferToSecurityTeam(BigInteger value) {
        this.deferToSecurityTeam = value;
    }

    /**
     * Obtiene el valor de la propiedad totalReviewedMitigations.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalReviewedMitigations() {
        return totalReviewedMitigations;
    }

    /**
     * Define el valor de la propiedad totalReviewedMitigations.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalReviewedMitigations(BigInteger value) {
        this.totalReviewedMitigations = value;
    }

}
