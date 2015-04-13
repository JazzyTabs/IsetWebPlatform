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
@Table(name = "fllteam")
@NamedQueries({
    @NamedQuery(name = "Fllteam.findAll", query = "SELECT f FROM Fllteam f"),
    @NamedQuery(name = "Fllteam.findByFllTeamId", query = "SELECT f FROM Fllteam f WHERE f.fllTeamId = :fllTeamId"),
    @NamedQuery(name = "Fllteam.findByFllTeamLocation", query = "SELECT f FROM Fllteam f WHERE f.fllTeamLocation = :fllTeamLocation"),
    @NamedQuery(name = "Fllteam.findByFllTeamAwards", query = "SELECT f FROM Fllteam f WHERE f.fllTeamAwards = :fllTeamAwards")})
public class Fllteam implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "fllTeamId")
    private Integer fllTeamId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "fllTeamLocation")
    private String fllTeamLocation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "fllTeamAwards")
    private String fllTeamAwards;
    @JoinColumn(name = "teamID", referencedColumnName = "teamID")
    @ManyToOne(optional = false)
    private Teams team;

    public Fllteam() {
    }

    public Fllteam(Integer fllTeamId) {
        this.fllTeamId = fllTeamId;
    }

    public Fllteam(Integer fllTeamId, String fllTeamLocation, String fllTeamAwards) {
        this.fllTeamId = fllTeamId;
        this.fllTeamLocation = fllTeamLocation;
        this.fllTeamAwards = fllTeamAwards;
    }

    public Integer getFllTeamId() {
        return fllTeamId;
    }

    public void setFllTeamId(Integer fllTeamId) {
        this.fllTeamId = fllTeamId;
    }

    public String getFllTeamLocation() {
        return fllTeamLocation;
    }

    public void setFllTeamLocation(String fllTeamLocation) {
        this.fllTeamLocation = fllTeamLocation;
    }

    public String getFllTeamAwards() {
        return fllTeamAwards;
    }

    public void setFllTeamAwards(String fllTeamAwards) {
        this.fllTeamAwards = fllTeamAwards;
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
        hash += (fllTeamId != null ? fllTeamId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fllteam)) {
            return false;
        }
        Fllteam other = (Fllteam) object;
        if ((this.fllTeamId == null && other.fllTeamId != null) || (this.fllTeamId != null && !this.fllTeamId.equals(other.fllTeamId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.thabang.iset.data.Fllteam[ fllTeamId=" + fllTeamId + " ]";
    }

}
