package com.thabang.iset.data;

import com.thabang.iset.data.Coachmentor;
import com.thabang.iset.data.Events;
import com.thabang.iset.data.Isetrootusers;
import com.thabang.iset.data.Kids;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-03-22T15:31:46")
@StaticMetamodel(Photoupload.class)
public class Photoupload_ { 

    public static volatile SingularAttribute<Photoupload, Coachmentor> coachMentor;
    public static volatile SingularAttribute<Photoupload, byte[]> coachMentorPicture;
    public static volatile SingularAttribute<Photoupload, Integer> photoUploadID;
    public static volatile SingularAttribute<Photoupload, byte[]> isetrootusersPicture;
    public static volatile SingularAttribute<Photoupload, byte[]> eventPicture;
    public static volatile SingularAttribute<Photoupload, Kids> kid;
    public static volatile SingularAttribute<Photoupload, Isetrootusers> isetRootUsers;
    public static volatile SingularAttribute<Photoupload, byte[]> kidPicture;
    public static volatile SingularAttribute<Photoupload, Events> event;
    public static volatile SingularAttribute<Photoupload, Date> photoDate;

}