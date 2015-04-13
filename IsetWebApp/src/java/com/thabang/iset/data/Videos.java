package com.thabang.iset.data;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "videos")
@NamedQueries({
    @NamedQuery(name = "Videos.findAll", query = "SELECT v FROM Videos v"),
    @NamedQuery(name = "Videos.findByVideoID", query = "SELECT v FROM Videos v WHERE v.videoID = :videoID"),
    @NamedQuery(name = "Videos.findByVideoName", query = "SELECT v FROM Videos v WHERE v.videoName = :videoName"),
    @NamedQuery(name = "Videos.findByVideoDate", query = "SELECT v FROM Videos v WHERE v.videoDate = :videoDate")})
public class Videos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "VideoID")
    private Integer videoID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "VideoName")
    private String videoName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VideoDate")
    @Temporal(TemporalType.DATE)
    private Date videoDate;
    @JoinColumn(name = "isetRootUsersID", referencedColumnName = "isetRootUsersID")
    @ManyToOne(optional = false)
    private Isetrootusers isetRootUsers;

    public Videos() {
    }

    public Videos(Integer videoID) {
        this.videoID = videoID;
    }

    public Videos(Integer videoID, String videoName, Date videoDate) {
        this.videoID = videoID;
        this.videoName = videoName;
        this.videoDate = videoDate;
    }

    public Integer getVideoID() {
        return videoID;
    }

    public void setVideoID(Integer videoID) {
        this.videoID = videoID;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public Date getVideoDate() {
        return videoDate;
    }

    public void setVideoDate(Date videoDate) {
        this.videoDate = videoDate;
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
        hash += (videoID != null ? videoID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Videos)) {
            return false;
        }
        Videos other = (Videos) object;
        if ((this.videoID == null && other.videoID != null) || (this.videoID != null && !this.videoID.equals(other.videoID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.thabang.iset.data.Videos[ videoID=" + videoID + " ]";
    }

}
