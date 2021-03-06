
package com.tibco.bw.palette.zendesk.runtime.pojo.gettickets;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollaboratorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollaboratorsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CC" type="{http://www.example.org/GetTickets}CCType" maxOccurs="unbounded" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollaboratorsType", namespace = "http://www.example.org/GetTickets", propOrder = {
    "cc"
})
public class CollaboratorsType {

    @XmlElement(name = "CC", nillable = true)
    protected List<CCType> cc;

    /**
     * Gets the value of the cc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CCType }
     * 
     * 
     */
    public List<CCType> getCC() {
        if (cc == null) {
            cc = new ArrayList<CCType>();
        }
        return this.cc;
    }

}
