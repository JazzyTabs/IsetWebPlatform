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
@Table(name = "isetrootusers")
@NamedQueries({
    @NamedQuery(name = "Isetrootusers.findAll", query = "SELECT i FROM Isetrootusers i"),
    @NamedQuery(name = "Isetrootusers.findByIsetRootUsersID", query = "SELECT i FROM Isetrootusers i WHERE i.isetRootUsersID = :isetRootUsersID"),
    @NamedQuery(name = "Isetrootusers.findByIsetRootUsersName", query = "SELECT i FROM Isetrootusers i WHERE i.isetRootUsersName = :isetRootUsersName"),
    @NamedQuery(name = "Isetrootusers.findByIsetRootUsersLastName", query = "SELECT i FROM Isetrootusers i WHERE i.isetRootUsersLastName = :isetRootUsersLastName"),
    @NamedQuery(name = "Isetrootusers.findByIsetRootUsersIDNumber", query = "SELECT i FROM Isetrootusers i WHERE i.isetRootUsersIDNumber = :isetRootUsersIDNumber"),
    @NamedQuery(name = "Isetrootusers.findByIsetRootUsersCellNum", query = "SELECT i FROM Isetrootusers i WHERE i.isetRootUsersCellNum = :isetRootUsersCellNum"),
    @NamedQuery(name = "Isetrootusers.findByIsetRootUsersAddress", query = "SELECT i FROM Isetrootusers i WHERE i.isetRootUsersAddress = :isetRootUsersAddress"),
    @NamedQuery(name = "Isetrootusers.findByIsetRootUsersEmail", query = "SELECT i FROM Isetrootusers i WHERE i.isetRootUsersEmail = :isetRootUsersEmail")})
public class Isetrootusers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "isetRootUsersID")
    private Integer isetRootUsersID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "isetRootUsersName")
    private String isetRootUsersName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "isetRootUsersLastName")
    private String isetRootUsersLastName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "isetRootUsersIDNumber")
    private int isetRootUsersIDNumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "isetRootUsersCellNum")
    private int isetRootUsersCellNum;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "isetRootUsersAddress")
    private String isetRootUsersAddress;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "isetRootUsersEmail")
    private String isetRootUsersEmail;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "isetRootUsers")
    private List<Photoupload> photouploadList;
    @JoinColumn(name = "coachMentorId", referencedColumnName = "coachMentorID")
    @ManyToOne(optional = false)
    private Coachmentor coachMentor;
    @JoinColumn(name = "teamID", referencedColumnName = "teamID")
    @ManyToOne(optional = false)
    private Teams team;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "isetRootUsers")
    private List<Videos> videosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "isetRootUsers")
    private List<Events> eventsList;

    public Isetrootusers() {
    }

    public Isetrootusers(Integer isetRootUsersID) {
        this.isetRootUsersID = isetRootUsersID;
    }

    public Isetrootusers(Integer isetRootUsersID, String isetRootUsersName, String isetRootUsersLastName, int isetRootUsersIDNumber, int isetRootUsersCellNum, String isetRootUsersAddress, String isetRootUsersEmail) {
        this.isetRootUsersID = isetRootUsersID;
        this.isetRootUsersName = isetRootUsersName;
        this.isetRootUsersLastName = isetRootUsersLastName;
        this.isetRootUsersIDNumber = isetRootUsersIDNumber;
        this.isetRootUsersCellNum = isetRootUsersCellNum;
        this.isetRootUsersAddress = isetRootUsersAddress;
        this.isetRootUsersEmail = isetRootUsersEmail;
    }

    public Integer getIsetRootUsersID() {
        return isetRootUsersID;
    }

    public void setIsetRootUsersID(Integer isetRootUsersID) {
        this.isetRootUsersID = isetRootUsersID;
    }

    public String getIsetRootUsersName() {
        return isetRootUsersName;
    }

    public void setIsetRootUsersName(String isetRootUsersName) {
        this.isetRootUsersName = isetRootUsersName;
    }

    public String getIsetRootUsersLastName() {
        return isetRootUsersLastName;
    }

    public void setIsetRootUsersLastName(String isetRootUsersLastName) {
        this.isetRootUsersLastName = isetRootUsersLastName;
    }

    public int getIsetRootUsersIDNumber() {
        return isetRootUsersIDNumber;
    }

    public void setIsetRootUsersIDNumber(int isetRootUsersIDNumber) {
        this.isetRootUsersIDNumber = isetRootUsersIDNumber;
    }

    public int getIsetRootUsersCellNum() {
        return isetRootUsersCellNum;
    }

    public void setIsetRootUsersCellNum(int isetRootUsersCellNum) {
        this.isetRootUsersCellNum = isetRootUsersCellNum;
    }

    public String getIsetRootUsersAddress() {
        return isetRootUsersAddress;
    }

    public void setIsetRootUsersAddress(String isetRootUsersAddress) {
        this.isetRootUsersAddress = isetRootUsersAddress;
    }

    public String getIsetRootUsersEmail() {
        return isetRootUsersEmail;
    }

    public void setIsetRootUsersEmail(String isetRootUsersEmail) {
        this.isetRootUsersEmail = isetRootUsersEmail;
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

   

    public Teams getTeam() {
        return team;
    }

    public void setTeam(Teams team) {
        this.team = team;
    }

    public List<Videos> getVideosList() {
        return videosList;
    }

    public void setVideosList(List<Videos> videosList) {
        this.videosList = videosList;
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
        hash += (isetRootUsersID != null ? isetRootUsersID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Isetrootusers)) {
            return false;
        }
        Isetrootusers other = (Isetrootusers) object;
        if ((this.isetRootUsersID == null && other.isetRootUsersID != null) || (this.isetRootUsersID != null && !this.isetRootUsersID.equals(other.isetRootUsersID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.thabang.iset.data.Isetrootusers[ isetRootUsersID=" + isetRootUsersID + " ]";
    }

}
