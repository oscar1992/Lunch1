
package co.com.lunch.enpoint_client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para grupoAlimenticioProductoEntity complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="grupoAlimenticioProductoEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="grpoAlimenticio" type="{http://enpoint.lunch.com.co/}grupoAlimenticioEntity" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="pruducto" type="{http://enpoint.lunch.com.co/}productoEntity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "grupoAlimenticioProductoEntity", propOrder = {
    "grpoAlimenticio",
    "id",
    "pruducto"
})
public class GrupoAlimenticioProductoEntity {

    protected GrupoAlimenticioEntity grpoAlimenticio;
    protected Integer id;
    protected ProductoEntity pruducto;

    /**
     * Obtiene el valor de la propiedad grpoAlimenticio.
     * 
     * @return
     *     possible object is
     *     {@link GrupoAlimenticioEntity }
     *     
     */
    public GrupoAlimenticioEntity getGrpoAlimenticio() {
        return grpoAlimenticio;
    }

    /**
     * Define el valor de la propiedad grpoAlimenticio.
     * 
     * @param value
     *     allowed object is
     *     {@link GrupoAlimenticioEntity }
     *     
     */
    public void setGrpoAlimenticio(GrupoAlimenticioEntity value) {
        this.grpoAlimenticio = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad pruducto.
     * 
     * @return
     *     possible object is
     *     {@link ProductoEntity }
     *     
     */
    public ProductoEntity getPruducto() {
        return pruducto;
    }

    /**
     * Define el valor de la propiedad pruducto.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductoEntity }
     *     
     */
    public void setPruducto(ProductoEntity value) {
        this.pruducto = value;
    }

}
