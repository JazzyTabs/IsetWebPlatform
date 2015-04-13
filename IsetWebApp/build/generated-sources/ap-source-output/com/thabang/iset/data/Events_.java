package com.thabang.iset.data;

import com.thabang.iset.data.Coachmentor;
import com.thabang.iset.data.Isetrootusers;
import com.thabang.iset.data.Photoupload;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-03-22T15:31:46")
@StaticMetamodel(Events.class)
public class Events_ { 

    public static volatile SingularAttribute<Events, Coachmentor> coachMentor;
    public static volatile SingularAttribute<Events, Integer> eventID;
    public static volatile SingularAttribute<Events, String> eventLocation;
    public static volatile SingularAttribute<Events, String> eventName;
    public static volatile SingularAttribute<Events, Isetrootusers> isetRootUsers;
    public static volatile ListAttribute<Events, Photoupload> photouploadList;
    public static volatile SingularAttribute<Events, Date> eventDate;

}