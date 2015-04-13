package com.thabang.iset.data;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author MokomaneMB
 */
@Entity
@Table(name = "ftcteam")
@NamedQueries({
    @NamedQuery(name = "Ftcteam.findAll", query = "SELECT f FROM Ftcteam f"),
    @NamedQuery(name = "Ftcteam.findByFtcTeamId", query = "SELECT f FROM Ftcteam f WHERE f.ftcTeamId = :ftcTeamId"),
    @NamedQuery(name = "Ftcteam.findByFtcTeamLocation", query = "SELECT f FROM Ftcteam f WHERE f.ftcTeamLocation = :ftcTeamLocation"),
    @NamedQuery(name = "Ftcteam.findByFtcTeamAwards", query = "SELECT f FROM Ftcteam f WHERE f.ftcTeamAwards = :ftcTeamAwards")})
public class Ftcteam implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ftcTeamId")
    private Integer ftcTeamId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "ftcTeamLocation")
    private String ftcTeamLocation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "ftcTeamAwards")
    private String ftcTeamAwards;
    @JoinColumn(name = "teamID", referencedColumnName = "teamID")
    @ManyToOne(optional = false)
    private Teams team;

    public Ftcteam() {
    }

    public Ftcteam(Integer ftcTeamId) {
        this.ftcTeamId = ftcTeamId;
    }

    public Ftcteam(Integer ftcTeamId, String ftcTeamLocation, String ftcTeamAwards) {
        this.ftcTeamId = ftcTeamId;
        this.ftcTeamLocation = ftcTeamLocation;
        this.ftcTeamAwards = ftcTeamAwards;
    }

    public Integer getFtcTeamId() {
        return ftcTeamId;
    }

    public void setFtcTeamId(Integer ftcTeamId) {
        this.ftcTeamId = ftcTeamId;
    }

    public String getFtcTeamLocation() {
        return ftcTeamLocation;
    }

    public void setFtcTeamLocation(String ftcTeamLocation) {
        this.ftcTeamLocation = ftcTeamLocation;
    }

    public String getFtcTeamAwards() {
        return ftcTeamAwards;
    }

    public void setFtcTeamAwards(String ftcTeamAwards) {
        this.ftcTeamAwards = ftcTeamAwards;
    }

    public Teams getTeam() {
        return team;
    }

    public void setTeam(Teams team) {
        this.team = team;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ftcTeamId != null ? ftcTeamId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ftcteam)) {
            return false;
        }
        Ftcteam other = (Ftcteam) object;
        if ((this.ftcTeamId == null && other.ftcTeamId != null) || (this.ftcTeamId != null && !this.ftcTeamId.equals(other.ftcTeamId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.thabang.iset.data.Ftcteam[ ftcTeamId=" + ftcTeamId + " ]";
    }

}
