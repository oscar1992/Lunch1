
package co.com.lunch.enpoint_client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ingresaCajaPredeterminadaEntityResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ingresaCajaPredeterminadaEntityResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://enpoint.lunch.com.co/}cajaPredeterminadaEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ingresaCajaPredeterminadaEntityResponse", propOrder = {
    "_return"
})
public class IngresaCajaPredeterminadaEntityResponse {

    @XmlElement(name = "return")
    protected CajaPredeterminadaEntity _return;

    /**
     * Obtiene el valor de la propiedad return.
     * 
     * @return
     *     possible object is
     *     {@link CajaPredeterminadaEntity }
     *     
     */
    public CajaPredeterminadaEntity getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     * 
     * @param value
     *     allowed object is
     *     {@link CajaPredeterminadaEntity }
     *     
     */
    public void setReturn(CajaPredeterminadaEntity value) {
        this._return = value;
    }

}
