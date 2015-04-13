package com.thabang.iset.dto;

import com.thabang.iset.data.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MokomaneMB
 */
public class IsetrootusersDTO {

    private Integer isetRootUsersID;
    private String isetRootUsersName;
    private String isetRootUsersLastName;
    private int isetRootUsersIDNumber;
    private int isetRootUsersCellNum;
    private String isetRootUsersAddress;
    private String isetRootUsersEmail;
    private Integer coachMentorID;
    private Integer teamID;
    private List<PhotouploadDTO> photouploadList = new ArrayList<>();
    private List<VideosDTO> videosList = new ArrayList<>();
    private List<EventsDTO> eventsList = new ArrayList<>();

    public IsetrootusersDTO() {
    }

    public IsetrootusersDTO(Isetrootusers i) {
        this.isetRootUsersID = i.getIsetRootUsersID();
        this.isetRootUsersName = i.getIsetRootUsersName();
        this.isetRootUsersLastName = i.getIsetRootUsersLastName();
        this.isetRootUsersIDNumber = i.getIsetRootUsersIDNumber();
        this.isetRootUsersCellNum = i.getIsetRootUsersCellNum();
        this.isetRootUsersAddress = i.getIsetRootUsersAddress();
        this.isetRootUsersEmail = i.getIsetRootUsersEmail();
        this.coachMentorID = i.getCoachMentor().getCoachMentorID();
        this.teamID = i.getTeam().getTeamID();

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

    public Integer getCoachMentorID() {
        return coachMentorID;
    }

    public void setCoachMentorID(Integer coachMentorID) {
        this.coachMentorID = coachMentorID;
    }

    public Integer getTeamID() {
        return teamID;
    }

    public void setTeamID(Integer teamID) {
        this.teamID = teamID;
    }

    public List<PhotouploadDTO> getPhotouploadList() {
        return photouploadList;
    }

    public void setPhotouploadList(List<PhotouploadDTO> photouploadList) {
        this.photouploadList = photouploadList;
    }

    public List<VideosDTO> getVideosList() {
        return videosList;
    }

    public void setVideosList(List<VideosDTO> videosList) {
        this.videosList = videosList;
    }

    public List<EventsDTO> getEventsList() {
        return eventsList;
    }

    public void setEventsList(List<EventsDTO> eventsList) {
        this.eventsList = eventsList;
    }
}
