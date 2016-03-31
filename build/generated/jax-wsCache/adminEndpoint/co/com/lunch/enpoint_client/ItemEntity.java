
package co.com.lunch.enpoint_client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para itemEntity complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="itemEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="combinacion" type="{http://enpoint.lunch.com.co/}combinacionesEntity" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="producto" type="{http://enpoint.lunch.com.co/}productoEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemEntity", propOrder = {
    "combinacion",
    "id",
    "producto"
})
public class ItemEntity {

    protected CombinacionesEntity combinacion;
    protected Integer id;
    protected ProductoEntity producto;

    /**
     * Obtiene el valor de la propiedad combinacion.
     * 
     * @return
     *     possible object is
     *     {@link CombinacionesEntity }
     *     
     */
    public CombinacionesEntity getCombinacion() {
        return combinacion;
    }

    /**
     * Define el valor de la propiedad combinacion.
     * 
     * @param value
     *     allowed object is
     *     {@link CombinacionesEntity }
     *     
     */
    public void setCombinacion(CombinacionesEntity value) {
        this.combinacion = value;
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
     * Obtiene el valor de la propiedad producto.
     * 
     * @return
     *     possible object is
     *     {@link ProductoEntity }
     *     
     */
    public ProductoEntity getProducto() {
        return producto;
    }

    /**
     * Define el valor de la propiedad producto.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductoEntity }
     *     
     */
    public void setProducto(ProductoEntity value) {
        this.producto = value;
    }

}
