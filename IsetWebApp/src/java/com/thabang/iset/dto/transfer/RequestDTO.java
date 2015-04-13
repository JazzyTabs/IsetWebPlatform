package com.thabang.iset.dto.transfer;

import com.thabang.iset.dto.CoachmentorDTO;
import com.thabang.iset.dto.EventsDTO;
import com.thabang.iset.dto.FllteamDTO;
import com.thabang.iset.dto.FtcteamDTO;
import com.thabang.iset.dto.IsetrootusersDTO;
import com.thabang.iset.dto.KidsDTO;
import com.thabang.iset.dto.PhotouploadDTO;
import com.thabang.iset.dto.TeamsDTO;
import com.thabang.iset.dto.VideosDTO;
import com.thabang.iset.dto.WroteamDTO;

/**
 *
 * @author MokomaneMB
 */
public class RequestDTO {

    private Integer requestType,
            coachMentorID,
            eventID,
            fllTeamId,
            ftcTeamId,
            isetRootUsersID,
            kidID,
            photoUploadID,
            teamID,
            videoID,
            wroTeamID;
    private CoachmentorDTO Coachmentor;
    private EventsDTO Events;
    private FllteamDTO Fllteam;
    private FtcteamDTO Ftcteam;
    private IsetrootusersDTO Isetrootusers;
    private KidsDTO Kids;
    private PhotouploadDTO Photoupload;
    private TeamsDTO Teams;
    private VideosDTO Videos;
    private WroteamDTO Wroteam;

    public static final int GETCOACH_BY_CLASS = 300;

    public static int getGETCOACH_BY_CLASS() {
        return GETCOACH_BY_CLASS;

    }

    public Integer getRequestType() {
        return requestType;
    }

    public void setRequestType(Integer requestType) {
        this.requestType = requestType;
    }

    public Integer getCoachMentorID() {
        return coachMentorID;
    }

    public void setCoachMentorID(Integer coachMentorID) {
        this.coachMentorID = coachMentorID;
    }

    public Integer getEventID() {
        return eventID;
    }

    public void setEventID(Integer eventID) {
        this.eventID = eventID;
    }

    public Integer getFllTeamId() {
        return fllTeamId;
    }

    public void setFllTeamId(Integer fllTeamId) {
        this.fllTeamId = fllTeamId;
    }

    public Integer getFtcTeamId() {
        return ftcTeamId;
    }

    public void setFtcTeamId(Integer ftcTeamId) {
        this.ftcTeamId = ftcTeamId;
    }

    public Integer getIsetRootUsersID() {
        return isetRootUsersID;
    }

    public void setIsetRootUsersID(Integer isetRootUsersID) {
        this.isetRootUsersID = isetRootUsersID;
    }

    public Integer getKidID() {
        return kidID;
    }

    public void setKidID(Integer kidID) {
        this.kidID = kidID;
    }

    public Integer getPhotoUploadID() {
        return photoUploadID;
    }

    public void setPhotoUploadID(Integer photoUploadID) {
        this.photoUploadID = photoUploadID;
    }

    public Integer getTeamID() {
        return teamID;
    }

    public void setTeamID(Integer teamID) {
        this.teamID = teamID;
    }

    public Integer getVideoID() {
        return videoID;
    }

    public void setVideoID(Integer videoID) {
        this.videoID = videoID;
    }

    public Integer getWroTeamID() {
        return wroTeamID;
    }

    public void setWroTeamID(Integer wroTeamID) {
        this.wroTeamID = wroTeamID;
    }

    public CoachmentorDTO getCoachmentor() {
        return Coachmentor;
    }

    public void setCoachmentor(CoachmentorDTO Coachmentor) {
        this.Coachmentor = Coachmentor;
    }

    public EventsDTO getEvents() {
        return Events;
    }

    public void setEvents(EventsDTO Events) {
        this.Events = Events;
    }

    public FllteamDTO getFllteam() {
        return Fllteam;
    }

    public void setFllteam(FllteamDTO Fllteam) {
        this.Fllteam = Fllteam;
    }

    public FtcteamDTO getFtcteam() {
        return Ftcteam;
    }

    public void setFtcteam(FtcteamDTO Ftcteam) {
        this.Ftcteam = Ftcteam;
    }

    public IsetrootusersDTO getIsetrootusers() {
        return Isetrootusers;
    }

    public void setIsetrootusers(IsetrootusersDTO Isetrootusers) {
        this.Isetrootusers = Isetrootusers;
    }

    public KidsDTO getKids() {
        return Kids;
    }

    public void setKids(KidsDTO Kids) {
        this.Kids = Kids;
    }

    public PhotouploadDTO getPhotoupload() {
        return Photoupload;
    }

    public void setPhotoupload(PhotouploadDTO Photoupload) {
        this.Photoupload = Photoupload;
    }

    public TeamsDTO getTeams() {
        return Teams;
    }

    public void setTeams(TeamsDTO Teams) {
        this.Teams = Teams;
    }

    public VideosDTO getVideos() {
        return Videos;
    }

    public void setVideos(VideosDTO Videos) {
        this.Videos = Videos;
    }

    public WroteamDTO getWroteam() {
        return Wroteam;
    }

    public void setWroteam(WroteamDTO Wroteam) {
        this.Wroteam = Wroteam;
    }

}
