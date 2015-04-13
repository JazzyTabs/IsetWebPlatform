package com.thabang.iset.data;

import com.thabang.iset.data.Photoupload;
import com.thabang.iset.data.Teams;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-03-22T15:31:46")
@StaticMetamodel(Kids.class)
public class Kids_ { 

    public static volatile SingularAttribute<Kids, Integer> kidID;
    public static volatile SingularAttribute<Kids, Integer> kidIDNumber;
    public static volatile SingularAttribute<Kids, String> kidAddress;
    public static volatile SingularAttribute<Kids, String> kidLastName;
    public static volatile SingularAttribute<Kids, Teams> team;
    public static volatile SingularAttribute<Kids, String> kidName;
    public static volatile SingularAttribute<Kids, Integer> kidCellNumber;
    public static volatile SingularAttribute<Kids, byte[]> kidsProfilePicture;
    public static volatile ListAttribute<Kids, Photoupload> photouploadList;

}