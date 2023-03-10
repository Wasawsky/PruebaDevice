
package com.example.device.model.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para dispositivosResponseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="dispositivosResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dispositivos" type="{http://example/dummyservice/service}dispositivosType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dispositivosResponseType", propOrder = {
    "dispositivos"
})
public class DispositivosResponseType {

    @XmlElement(required = true)
    protected DispositivosType dispositivos;

    /**
     * Obtiene el valor de la propiedad dispositivos.
     * 
     * @return
     *     possible object is
     *     {@link DispositivosType }
     *     
     */
    public DispositivosType getDispositivos() {
        return dispositivos;
    }

    /**
     * Define el valor de la propiedad dispositivos.
     * 
     * @param value
     *     allowed object is
     *     {@link DispositivosType }
     *     
     */
    public void setDispositivos(DispositivosType value) {
        this.dispositivos = value;
    }

}
