/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thabang.iset.data;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author MokomaneMB
 */
@Entity
@Table(name = "events")
@NamedQueries({
    @NamedQuery(name = "Events.findAll", query = "SELECT e FROM Events e"),
    @NamedQuery(name = "Events.findByEventID", query = "SELECT e FROM Events e WHERE e.eventID = :eventID"),
    @NamedQuery(name = "Events.findByEventName", query = "SELECT e FROM Events e WHERE e.eventName = :eventName"),
    @NamedQuery(name = "Events.findByEventLocation", query = "SELECT e FROM Events e WHERE e.eventLocation = :eventLocation"),
    @NamedQuery(name = "Events.findByEventDate", query = "SELECT e FROM Events e WHERE e.eventDate = :eventDate")})
public class Events implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "eventID")
    private Integer eventID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "eventName")
    private String eventName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "eventLocation")
    private String eventLocation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "eventDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date eventDate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "event")
    private List<Photoupload> photouploadList;
    @JoinColumn(name = "coachMentorID", referencedColumnName = "coachMentor")
    @ManyToOne(optional = false)
    private Coachmentor coachMentor;
    @JoinColumn(name = "isetRootUsersID", referencedColumnName = "isetRootUsersID")
    @ManyToOne(optional = false)
    private Isetrootusers isetRootUsers;

    public Events() {
    }

    public Events(Integer eventID) {
        this.eventID = eventID;
    }

    public Events(Integer eventID, String eventName, String eventLocation, Date eventDate) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.eventDate = eventDate;
    }

    public Integer getEventID() {
        return eventID;
    }

    public void setEventID(Integer eventID) {
        this.eventID = eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public List<Photoupload> getPhotouploadList() {
        return photouploadList;
    }

    public void setPhotouploadList(List<Photoupload> photouploadList) {
        this.photouploadList = photouploadList;
    }

    public Coachmentor getCoachMentor() {
        return coachMentor;
    }

    public void setCoachMentor(Coachmentor coachMentor) {
        this.coachMentor = coachMentor;
    }

    public Isetrootusers getIsetRootUsers() {
        return isetRootUsers;
    }

    public void setIsetRootUsers(Isetrootusers isetRootUsers) {
        this.isetRootUsers = isetRootUsers;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eventID != null ? eventID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Events)) {
            return false;
        }
        Events other = (Events) object;
        if ((this.eventID == null && other.eventID != null) || (this.eventID != null && !this.eventID.equals(other.eventID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.thabang.iset.data.Events[ eventID=" + eventID + " ]";
    }

}
