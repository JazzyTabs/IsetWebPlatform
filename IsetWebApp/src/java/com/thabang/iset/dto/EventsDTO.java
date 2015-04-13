package com.thabang.iset.dto;

import com.thabang.iset.data.Events;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author MokomaneMB
 */
public class EventsDTO  {

    private Integer eventID;
    private String eventName;
    private String eventLocation;
    private Date eventDate;
    private Integer coachMentorID;
    private Integer isetRootUsersID;
    private List<PhotouploadDTO> photouploadList = new ArrayList<>();

    public EventsDTO() {
    }

    public EventsDTO(Events e) {
        this.eventID = e.getEventID();
        this.eventName = e.getEventName();
        this.eventLocation = e.getEventLocation();
        this.eventDate = e.getEventDate();
        this.coachMentorID = e.getCoachMentor().getCoachMentorID();
        this.isetRootUsersID = e.getIsetRootUsers().getIsetRootUsersID();

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

    public Integer getCoachMentorID() {
        return coachMentorID;
    }

    public void setCoachMentorID(Integer coachMentorID) {
        this.coachMentorID = coachMentorID;
    }

    public Integer getIsetRootUsersID() {
        return isetRootUsersID;
    }

    public void setIsetRootUsersID(Integer isetRootUsersID) {
        this.isetRootUsersID = isetRootUsersID;
    }

    public List<PhotouploadDTO> getPhotouploadList() {
        return photouploadList;
    }

    public void setPhotouploadList(List<PhotouploadDTO> photouploadList) {
        this.photouploadList = photouploadList;
    }
}
