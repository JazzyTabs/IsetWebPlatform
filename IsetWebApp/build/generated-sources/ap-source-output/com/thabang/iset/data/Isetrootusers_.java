package com.thabang.iset.data;

import com.thabang.iset.data.Coachmentor;
import com.thabang.iset.data.Events;
import com.thabang.iset.data.Photoupload;
import com.thabang.iset.data.Teams;
import com.thabang.iset.data.Videos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-03-22T15:31:46")
@StaticMetamodel(Isetrootusers.class)
public class Isetrootusers_ { 

    public static volatile SingularAttribute<Isetrootusers, Coachmentor> coachMentor;
    public static volatile SingularAttribute<Isetrootusers, String> isetRootUsersName;
    public static volatile ListAttribute<Isetrootusers, Events> eventsList;
    public static volatile SingularAttribute<Isetrootusers, Integer> isetRootUsersIDNumber;
    public static volatile SingularAttribute<Isetrootusers, String> isetRootUsersEmail;
    public static volatile SingularAttribute<Isetrootusers, Integer> isetRootUsersID;
    public static volatile SingularAttribute<Isetrootusers, Teams> team;
    public static volatile SingularAttribute<Isetrootusers, String> isetRootUsersLastName;
    public static volatile SingularAttribute<Isetrootusers, String> isetRootUsersAddress;
    public static volatile ListAttribute<Isetrootusers, Photoupload> photouploadList;
    public static volatile ListAttribute<Isetrootusers, Videos> videosList;
    public static volatile SingularAttribute<Isetrootusers, Integer> isetRootUsersCellNum;

}