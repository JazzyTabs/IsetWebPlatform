package com.thabang.iset.data;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author MokomaneMB
 */
@Entity
@Table(name = "photoupload")
@NamedQueries({
    @NamedQuery(name = "Photoupload.findAll", query = "SELECT p FROM Photoupload p"),
    @NamedQuery(name = "Photoupload.findByPhotoUploadID", query = "SELECT p FROM Photoupload p WHERE p.photoUploadID = :photoUploadID"),
    @NamedQuery(name = "Photoupload.findByPhotoDate", query = "SELECT p FROM Photoupload p WHERE p.photoDate = :photoDate")})
public class Photoupload implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "photoUploadID")
    private Integer photoUploadID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "photoDate")
    @Temporal(TemporalType.DATE)
    private Date photoDate;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "kidPicture")
    private byte[] kidPicture;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "CoachMentorPicture")
    private byte[] coachMentorPicture;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "eventPicture")
    private byte[] eventPicture;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "isetrootusersPicture")
    private byte[] isetrootusersPicture;
    @JoinColumn(name = "coachMentorID", referencedColumnName = "coachMentorID")
    @ManyToOne(optional = false)
    private Coachmentor coachMentor;
    @JoinColumn(name = "eventID", referencedColumnName = "eventID")
    @ManyToOne(optional = false)
    private Events event;
    @JoinColumn(name = "isetRootUsersID", referencedColumnName = "isetRootUsersID")
    @ManyToOne(optional = false)
    private Isetrootusers isetRootUsers;
    @JoinColumn(name = "kidID", referencedColumnName = "kidID")
    @ManyToOne(optional = false)
    private Kids kid;

    public Photoupload() {
    }

    public Photoupload(Integer photoUploadID) {
        this.photoUploadID = photoUploadID;
    }

    public Photoupload(Integer photoUploadID, Date photoDate, byte[] kidPicture, byte[] coachMentorPicture, byte[] eventPicture, byte[] isetrootusersPicture) {
        this.photoUploadID = photoUploadID;
        this.photoDate = photoDate;
        this.kidPicture = kidPicture;
        this.coachMentorPicture = coachMentorPicture;
        this.eventPicture = eventPicture;
        this.isetrootusersPicture = isetrootusersPicture;
    }

    public Integer getPhotoUploadID() {
        return photoUploadID;
    }

    public void setPhotoUploadID(Integer photoUploadID) {
        this.photoUploadID = photoUploadID;
    }

    public Date getPhotoDate() {
        return photoDate;
    }

    public void setPhotoDate(Date photoDate) {
        this.photoDate = photoDate;
    }

    public byte[] getKidPicture() {
        return kidPicture;
    }

    public void setKidPicture(byte[] kidPicture) {
        this.kidPicture = kidPicture;
    }

    public byte[] getCoachMentorPicture() {
        return coachMentorPicture;
    }

    public void setCoachMentorPicture(byte[] coachMentorPicture) {
        this.coachMentorPicture = coachMentorPicture;
    }

    public byte[] getEventPicture() {
        return eventPicture;
    }

    public void setEventPicture(byte[] eventPicture) {
        this.eventPicture = eventPicture;
    }

    public byte[] getIsetrootusersPicture() {
        return isetrootusersPicture;
    }

    public void setIsetrootusersPicture(byte[] isetrootusersPicture) {
        this.isetrootusersPicture = isetrootusersPicture;
    }

    public Coachmentor getCoachMentor() {
        return coachMentor;
    }

    public void setCoachMentor(Coachmentor coachMentor) {
        this.coachMentor = coachMentor;
    }

    public Events getEvent() {
        return event;
    }

    public void setEvent(Events event) {
        this.event = event;
    }

    public Isetrootusers getIsetRootUsers() {
        return isetRootUsers;
    }

    public void setIsetRootUsers(Isetrootusers isetRootUsers) {
        this.isetRootUsers = isetRootUsers;
    }

    public Kids getKid() {
        return kid;
    }

    public void setKid(Kids kid) {
        this.kid = kid;
    }


   

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (photoUploadID != null ? photoUploadID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Photoupload)) {
            return false;
        }
        Photoupload other = (Photoupload) object;
        if ((this.photoUploadID == null && other.photoUploadID != null) || (this.photoUploadID != null && !this.photoUploadID.equals(other.photoUploadID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.thabang.iset.data.Photoupload[ photoUploadID=" + photoUploadID + " ]";
    }
    
}
