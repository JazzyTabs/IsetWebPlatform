/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author MokomaneMB
 */
@Entity
@Table(name = "coachmentor")
@NamedQueries({
    @NamedQuery(name = "Coachmentor.findAll", query = "SELECT c FROM Coachmentor c"),
    @NamedQuery(name = "Coachmentor.findByCoachMentorID", query = "SELECT c FROM Coachmentor c WHERE c.coachMentorID = :coachMentorID"),
    @NamedQuery(name = "Coachmentor.findByCoachMentorName", query = "SELECT c FROM Coachmentor c WHERE c.coachMentorName = :coachMentorName"),
    @NamedQuery(name = "Coachmentor.findByCoachMentorLastName", query = "SELECT c FROM Coachmentor c WHERE c.coachMentorLastName = :coachMentorLastName"),
    @NamedQuery(name = "Coachmentor.findByCoachMentorIDNumber", query = "SELECT c FROM Coachmentor c WHERE c.coachMentorIDNumber = :coachMentorIDNumber"),
    @NamedQuery(name = "Coachmentor.findByCoachMentorCellNum", query = "SELECT c FROM Coachmentor c WHERE c.coachMentorCellNum = :coachMentorCellNum"),
    @NamedQuery(name = "Coachmentor.findByCoachMentorAddress", query = "SELECT c FROM Coachmentor c WHERE c.coachMentorAddress = :coachMentorAddress"),
    @NamedQuery(name = "Coachmentor.findByCoachMentorEmail", query = "SELECT c FROM Coachmentor c WHERE c.coachMentorEmail = :coachMentorEmail")})
public class Coachmentor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "coachMentorID")
    private Integer coachMentorID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "coachMentorName")
    private String coachMentorName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "coachMentorLastName")
    private String coachMentorLastName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "coachMentorIDNumber")
    private int coachMentorIDNumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "coachMentorCellNum")
    private int coachMentorCellNum;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "coachMentorAddress")
    private String coachMentorAddress;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "coachMentorEmail")
    private String coachMentorEmail;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "coachMentor")
    private List<Photoupload> photouploadList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "coachMentor")
    private List<Isetrootusers> isetrootusersList;
    @JoinColumn(name = "kidID", referencedColumnName = "kidID")
    @ManyToOne(optional = false)
    private Kids kids;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "coachMentor")
    private List<Events> eventsList;

    public Coachmentor() {
    }

    public Kids getKids() {
        return kids;
    }

    public void setKids(Kids kids) {
        this.kids = kids;
    }

    public Coachmentor(Integer coachMentorID) {
        this.coachMentorID = coachMentorID;
    }

    public Coachmentor(Integer coachMentorID, String coachMentorName, String coachMentorLastName, int coachMentorIDNumber, int coachMentorCellNum, String coachMentorAddress, String coachMentorEmail) {
        this.coachMentorID = coachMentorID;
        this.coachMentorName = coachMentorName;
        this.coachMentorLastName = coachMentorLastName;
        this.coachMentorIDNumber = coachMentorIDNumber;
        this.coachMentorCellNum = coachMentorCellNum;
        this.coachMentorAddress = coachMentorAddress;
        this.coachMentorEmail = coachMentorEmail;
    }

    public Integer getCoachMentorID() {
        return coachMentorID;
    }

    public void setCoachMentorID(Integer coachMentorID) {
        this.coachMentorID = coachMentorID;
    }

    public String getCoachMentorName() {
        return coachMentorName;
    }

    public void setCoachMentorName(String coachMentorName) {
        this.coachMentorName = coachMentorName;
    }

    public String getCoachMentorLastName() {
        return coachMentorLastName;
    }

    public void setCoachMentorLastName(String coachMentorLastName) {
        this.coachMentorLastName = coachMentorLastName;
    }

    public int getCoachMentorIDNumber() {
        return coachMentorIDNumber;
    }

    public void setCoachMentorIDNumber(int coachMentorIDNumber) {
        this.coachMentorIDNumber = coachMentorIDNumber;
    }

    public int getCoachMentorCellNum() {
        return coachMentorCellNum;
    }

    public void setCoachMentorCellNum(int coachMentorCellNum) {
        this.coachMentorCellNum = coachMentorCellNum;
    }

    public String getCoachMentorAddress() {
        return coachMentorAddress;
    }

    public void setCoachMentorAddress(String coachMentorAddress) {
        this.coachMentorAddress = coachMentorAddress;
    }

    public String getCoachMentorEmail() {
        return coachMentorEmail;
    }

    public void setCoachMentorEmail(String coachMentorEmail) {
        this.coachMentorEmail = coachMentorEmail;
    }

    public List<Photoupload> getPhotouploadList() {
        return photouploadList;
    }

    public void setPhotouploadList(List<Photoupload> photouploadList) {
        this.photouploadList = photouploadList;
    }

    public List<Isetrootusers> getIsetrootusersList() {
        return isetrootusersList;
    }

    public void setIsetrootusersList(List<Isetrootusers> isetrootusersList) {
        this.isetrootusersList = isetrootusersList;
    }

    public List<Events> getEventsList() {
        return eventsList;
    }

    public void setEventsList(List<Events> eventsList) {
        this.eventsList = eventsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (coachMentorID != null ? coachMentorID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Coachmentor)) {
            return false;
        }
        Coachmentor other = (Coachmentor) object;
        if ((this.coachMentorID == null && other.coachMentorID != null) || (this.coachMentorID != null && !this.coachMentorID.equals(other.coachMentorID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.thabang.iset.data.Coachmentor[ coachMentorID=" + coachMentorID + " ]";
    }

}
