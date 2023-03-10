
package com.example.device.model.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Clase Java para dispositivosType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="dispositivosType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dispositivo" type="{http://example/dummyservice/service}dispositivoType" maxOccurs="999"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dispositivosType", propOrder = {
    "dispositivo"
})
public class DispositivosType {

    @XmlElement(required = true)
    protected List<DispositivoType> dispositivo;

    /**
     * Gets the value of the dispositivo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dispositivo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDispositivo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DispositivoType }
     * 
     * 
     */
    public List<DispositivoType> getDispositivo() {
        if (dispositivo == null) {
            dispositivo = new ArrayList<DispositivoType>();
        }
        return this.dispositivo;
    }

}
