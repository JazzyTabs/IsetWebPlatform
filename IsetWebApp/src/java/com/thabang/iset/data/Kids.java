
package com.thabang.iset.data;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author CodeTribe1
 */
@Entity
@Table(name = "kids")
@NamedQueries({
    @NamedQuery(name = "Kids.findAll", query = "SELECT k FROM Kids k"),
    @NamedQuery(name = "Kids.findByKidID", query = "SELECT k FROM Kids k WHERE k.kidID = :kidID"),
    @NamedQuery(name = "Kids.findByKidName", query = "SELECT k FROM Kids k WHERE k.kidName = :kidName"),
    @NamedQuery(name = "Kids.findByKidLastName", query = "SELECT k FROM Kids k WHERE k.kidLastName = :kidLastName"),
    @NamedQuery(name = "Kids.findByKidIDNumber", query = "SELECT k FROM Kids k WHERE k.kidIDNumber = :kidIDNumber"),
    @NamedQuery(name = "Kids.findByKidCellNumber", query = "SELECT k FROM Kids k WHERE k.kidCellNumber = :kidCellNumber"),
    @NamedQuery(name = "Kids.findByKidAddress", query = "SELECT k FROM Kids k WHERE k.kidAddress = :kidAddress")})
public class Kids implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "kidID")
    private Integer kidID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "kidName")
    private String kidName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "kidLastName")
    private String kidLastName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "kidIDNumber")
    private int kidIDNumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "kidCellNumber")
    private int kidCellNumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "kidAddress")
    private String kidAddress;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "kidsProfilePicture")
    private byte[] kidsProfilePicture;
    //Start
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "kid")
    private List<Photoupload> photouploadList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "kid")
    //start
    @JoinColumn(name = "teamID", referencedColumnName = "teamID")
    @ManyToOne(optional = false)
    private Teams team;

    public Kids() {
    }

    public Kids(Integer kidID) {
        this.kidID = kidID;
    }

    public Kids(Integer kidID, String kidName, String kidLastName, int kidIDNumber, int kidCellNumber, String kidAddress, byte[] kidsProfilePicture) {
        this.kidID = kidID;
        this.kidName = kidName;
        this.kidLastName = kidLastName;
        this.kidIDNumber = kidIDNumber;
        this.kidCellNumber = kidCellNumber;
        this.kidAddress = kidAddress;
        this.kidsProfilePicture = kidsProfilePicture;
    }

    public Integer getKidID() {
        return kidID;
    }

    public void setKidID(Integer kidID) {
        this.kidID = kidID;
    }

    public String getKidName() {
        return kidName;
    }

    public void setKidName(String kidName) {
        this.kidName = kidName;
    }

    public String getKidLastName() {
        return kidLastName;
    }

    public void setKidLastName(String kidLastName) {
        this.kidLastName = kidLastName;
    }

    public int getKidIDNumber() {
        return kidIDNumber;
    }

    public void setKidIDNumber(int kidIDNumber) {
        this.kidIDNumber = kidIDNumber;
    }

    public int getKidCellNumber() {
        return kidCellNumber;
    }

    public void setKidCellNumber(int kidCellNumber) {
        this.kidCellNumber = kidCellNumber;
    }

    public String getKidAddress() {
        return kidAddress;
    }

    public void setKidAddress(String kidAddress) {
        this.kidAddress = kidAddress;
    }

    public byte[] getKidsProfilePicture() {
        return kidsProfilePicture;
    }

    public void setKidsProfilePicture(byte[] kidsProfilePicture) {
        this.kidsProfilePicture = kidsProfilePicture;
    }

   

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kidID != null ? kidID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kids)) {
            return false;
        }
        Kids other = (Kids) object;
        if ((this.kidID == null && other.kidID != null) || (this.kidID != null && !this.kidID.equals(other.kidID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.thabang.iset.data.Kids[ kidID=" + kidID + " ]";
    }
    
}
