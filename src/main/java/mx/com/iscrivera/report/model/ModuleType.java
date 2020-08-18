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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *       Each module element has the following attributes:
 *       
 *       * name:  The name of the module.  If the module represents dynamic
 *         analysis, the name is blank.
 *       * compiler:  The compiler that compiled the module.  This value is
 *         blank for dynamic analysis module elements.
 *       * os:  The name of the operating system for which the module is
 *         targeted.  This value is blank for dynamic analysis module elements.
 *       * architecture:  The name of the architecture for which the module is
 *         targeted.  This value is blank for dynamic analysis module elements.
 *       * loc:  The lines of codes. This value is blank for dynamic analysis or non-debug modules.
 *       * score:  A module-specific score, which contributes toward the analysis scores.
 *       * numflawssev0:  The number of severity-0 flaws.  (This is the lowest
 *         flaw severity and usually referred to as informational.)
 *       * numflawssev1:  The number of severity-1 flaws.
 *       * numflawssev2:  The number of severity-2 flaws.
 *       * numflawssev3:  The number of severity-3 flaws.
 *       * numflawssev4:  The number of severity-4 flaws.
 *       * numflawssev5:  The number of severity-5 flaws.  (This is the highest
 *         flaw severity.)
 *     
 * 
 * <p>Clase Java para ModuleType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ModuleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="compiler" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="os" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="architecture" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loc" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="score" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="numflawssev0" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="numflawssev1" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="numflawssev2" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="numflawssev3" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="numflawssev4" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="numflawssev5" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="target_url" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="domain" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="approxlinecount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModuleType")
public class ModuleType {

    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "compiler", required = true)
    protected String compiler;
    @XmlAttribute(name = "os", required = true)
    protected String os;
    @XmlAttribute(name = "architecture", required = true)
    protected String architecture;
    @XmlAttribute(name = "loc")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger loc;
    @XmlAttribute(name = "score", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger score;
    @XmlAttribute(name = "numflawssev0", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numflawssev0;
    @XmlAttribute(name = "numflawssev1", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numflawssev1;
    @XmlAttribute(name = "numflawssev2", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numflawssev2;
    @XmlAttribute(name = "numflawssev3", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numflawssev3;
    @XmlAttribute(name = "numflawssev4", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numflawssev4;
    @XmlAttribute(name = "numflawssev5", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numflawssev5;
    @XmlAttribute(name = "target_url")
    protected String targetUrl;
    @XmlAttribute(name = "domain")
    protected String domain;
    @XmlAttribute(name = "approxlinecount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger approxlinecount;

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
     * Obtiene el valor de la propiedad compiler.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompiler() {
        return compiler;
    }

    /**
     * Define el valor de la propiedad compiler.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompiler(String value) {
        this.compiler = value;
    }

    /**
     * Obtiene el valor de la propiedad os.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOs() {
        return os;
    }

    /**
     * Define el valor de la propiedad os.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOs(String value) {
        this.os = value;
    }

    /**
     * Obtiene el valor de la propiedad architecture.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchitecture() {
        return architecture;
    }

    /**
     * Define el valor de la propiedad architecture.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchitecture(String value) {
        this.architecture = value;
    }

    /**
     * Obtiene el valor de la propiedad loc.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLoc() {
        return loc;
    }

    /**
     * Define el valor de la propiedad loc.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLoc(BigInteger value) {
        this.loc = value;
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
     * Obtiene el valor de la propiedad numflawssev0.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumflawssev0() {
        return numflawssev0;
    }

    /**
     * Define el valor de la propiedad numflawssev0.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumflawssev0(BigInteger value) {
        this.numflawssev0 = value;
    }

    /**
     * Obtiene el valor de la propiedad numflawssev1.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumflawssev1() {
        return numflawssev1;
    }

    /**
     * Define el valor de la propiedad numflawssev1.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumflawssev1(BigInteger value) {
        this.numflawssev1 = value;
    }

    /**
     * Obtiene el valor de la propiedad numflawssev2.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumflawssev2() {
        return numflawssev2;
    }

    /**
     * Define el valor de la propiedad numflawssev2.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumflawssev2(BigInteger value) {
        this.numflawssev2 = value;
    }

    /**
     * Obtiene el valor de la propiedad numflawssev3.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumflawssev3() {
        return numflawssev3;
    }

    /**
     * Define el valor de la propiedad numflawssev3.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumflawssev3(BigInteger value) {
        this.numflawssev3 = value;
    }

    /**
     * Obtiene el valor de la propiedad numflawssev4.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumflawssev4() {
        return numflawssev4;
    }

    /**
     * Define el valor de la propiedad numflawssev4.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumflawssev4(BigInteger value) {
        this.numflawssev4 = value;
    }

    /**
     * Obtiene el valor de la propiedad numflawssev5.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumflawssev5() {
        return numflawssev5;
    }

    /**
     * Define el valor de la propiedad numflawssev5.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumflawssev5(BigInteger value) {
        this.numflawssev5 = value;
    }

    /**
     * Obtiene el valor de la propiedad targetUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetUrl() {
        return targetUrl;
    }

    /**
     * Define el valor de la propiedad targetUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetUrl(String value) {
        this.targetUrl = value;
    }

    /**
     * Obtiene el valor de la propiedad domain.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Define el valor de la propiedad domain.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomain(String value) {
        this.domain = value;
    }

    /**
     * Obtiene el valor de la propiedad approxlinecount.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getApproxlinecount() {
        return approxlinecount;
    }

    /**
     * Define el valor de la propiedad approxlinecount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setApproxlinecount(BigInteger value) {
        this.approxlinecount = value;
    }

}
