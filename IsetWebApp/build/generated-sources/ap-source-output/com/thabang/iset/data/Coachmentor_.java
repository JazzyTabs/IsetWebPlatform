package com.thabang.iset.data;

import com.thabang.iset.data.Events;
import com.thabang.iset.data.Isetrootusers;
import com.thabang.iset.data.Kids;
import com.thabang.iset.data.Photoupload;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-03-22T15:31:46")
@StaticMetamodel(Coachmentor.class)
public class Coachmentor_ { 

    public static volatile SingularAttribute<Coachmentor, String> coachMentorAddress;
    public static volatile SingularAttribute<Coachmentor, String> coachMentorName;
    public static volatile ListAttribute<Coachmentor, Events> eventsList;
    public static volatile SingularAttribute<Coachmentor, Integer> coachMentorIDNumber;
    public static volatile SingularAttribute<Coachmentor, String> coachMentorLastName;
    public static volatile SingularAttribute<Coachmentor, String> coachMentorEmail;
    public static volatile ListAttribute<Coachmentor, Isetrootusers> isetrootusersList;
    public static volatile SingularAttribute<Coachmentor, Integer> coachMentorCellNum;
    public static volatile ListAttribute<Coachmentor, Photoupload> photouploadList;
    public static volatile SingularAttribute<Coachmentor, Integer> coachMentorID;
    public static volatile SingularAttribute<Coachmentor, Kids> kids;

}