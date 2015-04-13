
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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MokomaneMB
 */
public class ResponseDTO {
    private CoachmentorDTO coachmentor;
    private EventsDTO events;
    private FllteamDTO fllteam;
    private FtcteamDTO ftcteam;
    private IsetrootusersDTO isetrootusers;
    private KidsDTO kids;
    private PhotouploadDTO photoupload;
    private TeamsDTO teams;
    private VideosDTO kideos;
    private WroteamDTO wroteam;
    
    private List<PhotouploadDTO> photouploadList = new ArrayList<>();
    private List<IsetrootusersDTO> isetrootusersList = new ArrayList<>();
    private List<EventsDTO> eventsList = new ArrayList<>();
    private List<VideosDTO> videosList = new ArrayList<>();
    private List<CoachmentorDTO> coachmentorList = new ArrayList<>();
    private List<WroteamDTO> wroteamList = new ArrayList<>();
    private List<FtcteamDTO> ftcteamList = new ArrayList<>();
    private List<FllteamDTO> fllteamList = new ArrayList<>();
    private List<KidsDTO> kidsList = new ArrayList<>();

    public List<VideosDTO> getVideosList() {
        return videosList;
    }

    public void setVideosList(List<VideosDTO> videosList) {
        this.videosList = videosList;
    }

    public List<CoachmentorDTO> getCoachmentorList() {
        return coachmentorList;
    }

    public void setCoachmentorList(List<CoachmentorDTO> coachmentorList) {
        this.coachmentorList = coachmentorList;
    }

    public List<WroteamDTO> getWroteamList() {
        return wroteamList;
    }

    public void setWroteamList(List<WroteamDTO> wroteamList) {
        this.wroteamList = wroteamList;
    }

    public List<FtcteamDTO> getFtcteamList() {
        return ftcteamList;
    }

    public void setFtcteamList(List<FtcteamDTO> ftcteamList) {
        this.ftcteamList = ftcteamList;
    }

    public List<FllteamDTO> getFllteamList() {
        return fllteamList;
    }

    public void setFllteamList(List<FllteamDTO> fllteamList) {
        this.fllteamList = fllteamList;
    }

    public List<KidsDTO> getKidsList() {
        return kidsList;
    }

    public void setKidsList(List<KidsDTO> kidsList) {
        this.kidsList = kidsList;
    }
    
    
    public CoachmentorDTO getCoachmentor() {
        return coachmentor;
    }

    public void setCoachmentor(CoachmentorDTO coachmentor) {
        this.coachmentor = coachmentor;
    }

    public EventsDTO getEvents() {
        return events;
    }

    public void setEvents(EventsDTO events) {
        this.events = events;
    }

    public FllteamDTO getFllteam() {
        return fllteam;
    }

    public void setFllteam(FllteamDTO fllteam) {
        this.fllteam = fllteam;
    }

    public FtcteamDTO getFtcteam() {
        return ftcteam;
    }

    public void setFtcteam(FtcteamDTO ftcteam) {
        this.ftcteam = ftcteam;
    }

    public IsetrootusersDTO getIsetrootusers() {
        return isetrootusers;
    }

    public void setIsetrootusers(IsetrootusersDTO isetrootusers) {
        this.isetrootusers = isetrootusers;
    }

    public KidsDTO getKids() {
        return kids;
    }

    public void setKids(KidsDTO kids) {
        this.kids = kids;
    }

    public PhotouploadDTO getPhotoupload() {
        return photoupload;
    }

    public void setPhotoupload(PhotouploadDTO photoupload) {
        this.photoupload = photoupload;
    }

    public TeamsDTO getTeams() {
        return teams;
    }

    public void setTeams(TeamsDTO teams) {
        this.teams = teams;
    }

    public VideosDTO getKideos() {
        return kideos;
    }

    public void setKideos(VideosDTO kideos) {
        this.kideos = kideos;
    }

    public WroteamDTO getWroteam() {
        return wroteam;
    }

    public void setWroteam(WroteamDTO wroteam) {
        this.wroteam = wroteam;
    }

    public List<PhotouploadDTO> getPhotouploadList() {
        return photouploadList;
    }

    public void setPhotouploadList(List<PhotouploadDTO> photouploadList) {
        this.photouploadList = photouploadList;
    }

    public List<IsetrootusersDTO> getIsetrootusersList() {
        return isetrootusersList;
    }

    public void setIsetrootusersList(List<IsetrootusersDTO> isetrootusersList) {
        this.isetrootusersList = isetrootusersList;
    }

    public List<EventsDTO> getEventsList() {
        return eventsList;
    }

    public void setEventsList(List<EventsDTO> eventsList) {
        this.eventsList = eventsList;
    }

    public void setCoachmentor(List<CoachmentorDTO> dto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
