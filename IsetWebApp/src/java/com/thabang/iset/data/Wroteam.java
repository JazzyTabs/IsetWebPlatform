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
@Table(name = "wroteam")
@NamedQueries({
    @NamedQuery(name = "Wroteam.findAll", query = "SELECT w FROM Wroteam w"),
    @NamedQuery(name = "Wroteam.findByWroTeamID", query = "SELECT w FROM Wroteam w WHERE w.wroTeamID = :wroTeamID"),
    @NamedQuery(name = "Wroteam.findByWroTeamLocation", query = "SELECT w FROM Wroteam w WHERE w.wroTeamLocation = :wroTeamLocation"),
    @NamedQuery(name = "Wroteam.findByWroTeamCompetition", query = "SELECT w FROM Wroteam w WHERE w.wroTeamCompetition = :wroTeamCompetition")})
public class Wroteam implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "wroTeamID")
    private Integer wroTeamID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "wroTeamLocation")
    private String wroTeamLocation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "wroTeamCompetition")
    private String wroTeamCompetition;
    @JoinColumn(name = "teamID", referencedColumnName = "teamID")
    @ManyToOne(optional = false)
    private Teams team;

    public Wroteam() {
    }

    public Wroteam(Integer wroTeamID) {
        this.wroTeamID = wroTeamID;
    }

    public Wroteam(Integer wroTeamID, String wroTeamLocation, String wroTeamCompetition) {
        this.wroTeamID = wroTeamID;
        this.wroTeamLocation = wroTeamLocation;
        this.wroTeamCompetition = wroTeamCompetition;
    }

    public Integer getWroTeamID() {
        return wroTeamID;
    }

    public void setWroTeamID(Integer wroTeamID) {
        this.wroTeamID = wroTeamID;
    }

    public String getWroTeamLocation() {
        return wroTeamLocation;
    }

    public void setWroTeamLocation(String wroTeamLocation) {
        this.wroTeamLocation = wroTeamLocation;
    }

    public String getWroTeamCompetition() {
        return wroTeamCompetition;
    }

    public void setWroTeamCompetition(String wroTeamCompetition) {
        this.wroTeamCompetition = wroTeamCompetition;
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
        hash += (wroTeamID != null ? wroTeamID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Wroteam)) {
            return false;
        }
        Wroteam other = (Wroteam) object;
        if ((this.wroTeamID == null && other.wroTeamID != null) || (this.wroTeamID != null && !this.wroTeamID.equals(other.wroTeamID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.thabang.iset.data.Wroteam[ wroTeamID=" + wroTeamID + " ]";
    }

}
