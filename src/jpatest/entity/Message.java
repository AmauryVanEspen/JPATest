
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package jpatest.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author admin
 */
@Entity
public class Message implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long              id;
    
    @Column(nullable = false,length = 64)
    private String            titre;

    @Column(length = 4096)
    private String            texte;

    @Temporal(TemporalType.DATE)
    private Date              dateDeCreation;
    
    @Override
    public boolean equals(Object object) {

        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Message)) {
            return false;
        }

        Message other = (Message) object;

        if (((this.id == null) && (other.id != null)) || ((this.id != null) &&!this.id.equals(other.id))) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int hash = 0;

        hash += ((id != null)
                 ? id.hashCode()
                 : 0);

        return hash;
    }

    @Override
    public String toString() {
        return "jpatest.entity.message[ id=" + id + " ]";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
