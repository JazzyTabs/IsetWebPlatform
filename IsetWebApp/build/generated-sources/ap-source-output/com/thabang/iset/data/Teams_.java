package com.thabang.iset.data;

import com.thabang.iset.data.Fllteam;
import com.thabang.iset.data.Ftcteam;
import com.thabang.iset.data.Isetrootusers;
import com.thabang.iset.data.Kids;
import com.thabang.iset.data.Wroteam;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-03-22T15:31:46")
@StaticMetamodel(Teams.class)
public class Teams_ { 

    public static volatile SingularAttribute<Teams, String> teamName;
    public static volatile ListAttribute<Teams, Fllteam> fllteamList;
    public static volatile ListAttribute<Teams, Kids> kidsList;
    public static volatile SingularAttribute<Teams, byte[]> teamImage;
    public static volatile SingularAttribute<Teams, String> teamAwards;
    public static volatile ListAttribute<Teams, Ftcteam> ftcteamList;
    public static volatile SingularAttribute<Teams, Integer> teamID;
    public static volatile SingularAttribute<Teams, String> teamLocation;
    public static volatile ListAttribute<Teams, Wroteam> wroteamList;
    public static volatile ListAttribute<Teams, Isetrootusers> isetrootusersList;
    public static volatile SingularAttribute<Teams, String> teamRegistration;

}