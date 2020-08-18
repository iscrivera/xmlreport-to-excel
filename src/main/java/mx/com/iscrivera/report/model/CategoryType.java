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
 *       For each category, there are the following attributes:
 *       * categoryid:  A numeric identifier for the category.
 *       * categoryname:  The name of the category.
 *       * pcirelated:  Whether the flaw is PCI related.  (This will be specified in a 
 *         future release of the platform.)
 *       
 *       Each category also has the following child elements:
 *       * desc:  A list of paragraphs describing the category.
 *       * recommendations:  A list of paragraphs describing how to manage flaws within 
 *         that category.
 *       * cwe:  For each distinct CWE ID for which there is at least one flaw within this
 *         category, there is a cwe element.
 *     
 * 
 * <p>Clase Java para CategoryType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CategoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="desc" type="{https://www.veracode.com/schema/reports/export/1.0}ParaListType"/>
 *         &lt;element name="recommendations" type="{https://www.veracode.com/schema/reports/export/1.0}ParaListType"/>
 *         &lt;element name="cwe" type="{https://www.veracode.com/schema/reports/export/1.0}CweType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="categoryid" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="categoryname" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pcirelated" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategoryType", propOrder = {
    "desc",
    "recommendations",
    "cwe"
})
public class CategoryType {

    @XmlElement(required = true)
    protected ParaListType desc;
    @XmlElement(required = true)
    protected ParaListType recommendations;
    @XmlElement(required = true)
    protected List<CweType> cwe;
    @XmlAttribute(name = "categoryid", required = true)
    protected BigInteger categoryid;
    @XmlAttribute(name = "categoryname", required = true)
    protected String categoryname;
    @XmlAttribute(name = "pcirelated")
    protected Boolean pcirelated;

    /**
     * Obtiene el valor de la propiedad desc.
     * 
     * @return
     *     possible object is
     *     {@link ParaListType }
     *     
     */
    public ParaListType getDesc() {
        return desc;
    }

    /**
     * Define el valor de la propiedad desc.
     * 
     * @param value
     *     allowed object is
     *     {@link ParaListType }
     *     
     */
    public void setDesc(ParaListType value) {
        this.desc = value;
    }

    /**
     * Obtiene el valor de la propiedad recommendations.
     * 
     * @return
     *     possible object is
     *     {@link ParaListType }
     *     
     */
    public ParaListType getRecommendations() {
        return recommendations;
    }

    /**
     * Define el valor de la propiedad recommendations.
     * 
     * @param value
     *     allowed object is
     *     {@link ParaListType }
     *     
     */
    public void setRecommendations(ParaListType value) {
        this.recommendations = value;
    }

    /**
     * Gets the value of the cwe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cwe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCwe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CweType }
     * 
     * 
     */
    public List<CweType> getCwe() {
        if (cwe == null) {
            cwe = new ArrayList<CweType>();
        }
        return this.cwe;
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

}
