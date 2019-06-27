package entity;

import entity.Device;
import entity.UserEnt;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-27T14:18:20")
@StaticMetamodel(Domain.class)
public class Domain_ { 

    public static volatile SingularAttribute<Domain, String> macAddress;
    public static volatile ListAttribute<Domain, Device> devices;
    public static volatile SingularAttribute<Domain, Date> lastUpdate;
    public static volatile SingularAttribute<Domain, String> name;
    public static volatile SingularAttribute<Domain, Long> id;
    public static volatile SingularAttribute<Domain, UserEnt> user;

}