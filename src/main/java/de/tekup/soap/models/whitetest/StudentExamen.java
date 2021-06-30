//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.05.20 à 10:21:31 PM CEST 
//


package de.tekup.soap.models.whitetest;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour StudentExamen complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="StudentExamen">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listesStudents" type="{http://www.tekup.de/soap/models/whitetest}Student" maxOccurs="unbounded"/>
 *         &lt;element name="listesExamens" type="{http://www.tekup.de/soap/models/whitetest}Exam" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentExamen", propOrder = {
    "listesStudents",
    "listesExamens"
})
public class StudentExamen {

    @XmlElement(required = true)
    protected List<Student> listesStudents;
    @XmlElement(required = true)
    protected List<Exam> listesExamens;

    /**
     * Gets the value of the listesStudents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listesStudents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListesStudents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Student }
     * 
     * 
     */
    public List<Student> getListesStudents() {
        if (listesStudents == null) {
            listesStudents = new ArrayList<Student>();
        }
        return this.listesStudents;
    }

    /**
     * Gets the value of the listesExamens property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listesExamens property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListesExamens().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Exam }
     * 
     * 
     */
    public List<Exam> getListesExamens() {
        if (listesExamens == null) {
            listesExamens = new ArrayList<Exam>();
        }
        return this.listesExamens;
    }

	public void setListesStudents(List<Student> listesStudents) {
		this.listesStudents = listesStudents;
	}

	public void setListesExamens(List<Exam> listesExamens) {
		this.listesExamens = listesExamens;
	}

}
