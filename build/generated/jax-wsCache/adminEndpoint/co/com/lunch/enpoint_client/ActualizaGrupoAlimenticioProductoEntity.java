
package co.com.lunch.enpoint_client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para actualizaGrupoAlimenticioProductoEntity complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="actualizaGrupoAlimenticioProductoEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="info" type="{http://enpoint.lunch.com.co/}grupoAlimenticioProductoEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actualizaGrupoAlimenticioProductoEntity", propOrder = {
    "info"
})
public class ActualizaGrupoAlimenticioProductoEntity {

    protected GrupoAlimenticioProductoEntity info;

    /**
     * Obtiene el valor de la propiedad info.
     * 
     * @return
     *     possible object is
     *     {@link GrupoAlimenticioProductoEntity }
     *     
     */
    public GrupoAlimenticioProductoEntity getInfo() {
        return info;
    }

    /**
     * Define el valor de la propiedad info.
     * 
     * @param value
     *     allowed object is
     *     {@link GrupoAlimenticioProductoEntity }
     *     
     */
    public void setInfo(GrupoAlimenticioProductoEntity value) {
        this.info = value;
    }

}
