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
import javax.persistence.Lob;
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
@Table(name = "teams")
@NamedQueries({
    @NamedQuery(name = "Teams.findAll", query = "SELECT t FROM Teams t"),
    @NamedQuery(name = "Teams.findByTeamID", query = "SELECT t FROM Teams t WHERE t.teamID = :teamID"),
    @NamedQuery(name = "Teams.findByTeamName", query = "SELECT t FROM Teams t WHERE t.teamName = :teamName"),
    @NamedQuery(name = "Teams.findByTeamLocation", query = "SELECT t FROM Teams t WHERE t.teamLocation = :teamLocation"),
    @NamedQuery(name = "Teams.findByTeamAwards", query = "SELECT t FROM Teams t WHERE t.teamAwards = :teamAwards"),
    @NamedQuery(name = "Teams.findByTeamRegistration", query = "SELECT t FROM Teams t WHERE t.teamRegistration = :teamRegistration")})
public class Teams implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "teamImage")
    private byte[] teamImage;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "teamID")
    private Integer teamID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "teamName")
    private String teamName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "teamLocation")
    private String teamLocation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "teamAwards")
    private String teamAwards;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "teamRegistration")
    private String teamRegistration;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "team")
    private List<Wroteam> wroteamList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "team")
    private List<Ftcteam> ftcteamList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "team")
    private List<Isetrootusers> isetrootusersList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "team")
    private List<Fllteam> fllteamList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "team")
    private List<Kids> kidsList;

    public Teams() {
    }

    public Teams(Integer teamID) {
        this.teamID = teamID;
    }

    public Teams(Integer teamID, String teamName, String teamLocation, String teamAwards, String teamRegistration, byte[] teamImage) {
        this.teamID = teamID;
        this.teamName = teamName;
        this.teamLocation = teamLocation;
        this.teamAwards = teamAwards;
        this.teamRegistration = teamRegistration;
        this.teamImage = teamImage;
    }

    public Integer getTeamID() {
        return teamID;
    }

    public void setTeamID(Integer teamID) {
        this.teamID = teamID;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamLocation() {
        return teamLocation;
    }

    public void setTeamLocation(String teamLocation) {
        this.teamLocation = teamLocation;
    }

    public String getTeamAwards() {
        return teamAwards;
    }

    public void setTeamAwards(String teamAwards) {
        this.teamAwards = teamAwards;
    }

    public String getTeamRegistration() {
        return teamRegistration;
    }

    public void setTeamRegistration(String teamRegistration) {
        this.teamRegistration = teamRegistration;
    }


    public List<Wroteam> getWroteamList() {
        return wroteamList;
    }

    public void setWroteamList(List<Wroteam> wroteamList) {
        this.wroteamList = wroteamList;
    }

    public List<Ftcteam> getFtcteamList() {
        return ftcteamList;
    }

    public void setFtcteamList(List<Ftcteam> ftcteamList) {
        this.ftcteamList = ftcteamList;
    }

    public List<Isetrootusers> getIsetrootusersList() {
        return isetrootusersList;
    }

    public void setIsetrootusersList(List<Isetrootusers> isetrootusersList) {
        this.isetrootusersList = isetrootusersList;
    }

    public List<Fllteam> getFllteamList() {
        return fllteamList;
    }

    public void setFllteamList(List<Fllteam> fllteamList) {
        this.fllteamList = fllteamList;
    }

    public List<Kids> getKidsList() {
        return kidsList;
    }

    public void setKidsList(List<Kids> kidsList) {
        this.kidsList = kidsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (teamID != null ? teamID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Teams)) {
            return false;
        }
        Teams other = (Teams) object;
        if ((this.teamID == null && other.teamID != null) || (this.teamID != null && !this.teamID.equals(other.teamID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.thabang.iset.data.Teams[ teamID=" + teamID + " ]";
    }

    public byte[] getTeamImage() {
        return teamImage;
    }

    public void setTeamImage(byte[] teamImage) {
        this.teamImage = teamImage;
    }
    
}
