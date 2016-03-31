
package co.com.lunch.enpoint_client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para actualizaGrupoAlimenticioProductoEntityResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="actualizaGrupoAlimenticioProductoEntityResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://enpoint.lunch.com.co/}grupoAlimenticioProductoEntity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actualizaGrupoAlimenticioProductoEntityResponse", propOrder = {
    "_return"
})
public class ActualizaGrupoAlimenticioProductoEntityResponse {

    @XmlElement(name = "return")
    protected GrupoAlimenticioProductoEntity _return;

    /**
     * Obtiene el valor de la propiedad return.
     * 
     * @return
     *     possible object is
     *     {@link GrupoAlimenticioProductoEntity }
     *     
     */
    public GrupoAlimenticioProductoEntity getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     * 
     * @param value
     *     allowed object is
     *     {@link GrupoAlimenticioProductoEntity }
     *     
     */
    public void setReturn(GrupoAlimenticioProductoEntity value) {
        this._return = value;
    }

}
