package com.thabang.iset.dto;

import com.thabang.iset.data.*;

/**
 *
 * @author MokomaneMB
 */
public class FllteamDTO {

    private Integer fllTeamId;
    private String fllTeamLocation;
    private String fllTeamAwards;
    private Integer teamID;

    public FllteamDTO() {
    }

    public FllteamDTO(Fllteam f) {
        this.fllTeamId = f.getFllTeamId();
        this.fllTeamLocation = f.getFllTeamLocation();
        this.fllTeamAwards = f.getFllTeamAwards();
        this.teamID = f.getTeam().getTeamID();

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

    public Integer getTeamID() {
        return teamID;
    }

    public void setTeamID(Integer teamID) {
        this.teamID = teamID;
    }

}
