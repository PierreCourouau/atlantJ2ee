package entity;

import entity.Domain;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-27T14:18:20")
@StaticMetamodel(UserEnt.class)
public class UserEnt_ { 

    public static volatile ListAttribute<UserEnt, Domain> domains;
    public static volatile SingularAttribute<UserEnt, Long> id;
    public static volatile SingularAttribute<UserEnt, String> email;
    public static volatile SingularAttribute<UserEnt, String> username;
    public static volatile SingularAttribute<UserEnt, String> token;

}