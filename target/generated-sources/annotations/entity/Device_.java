package entity;

import entity.Domain;
import entity.Metric;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-27T14:18:20")
@StaticMetamodel(Device.class)
public class Device_ { 

    public static volatile SingularAttribute<Device, String> macAddress;
    public static volatile SingularAttribute<Device, Domain> domain;
    public static volatile SingularAttribute<Device, String> name;
    public static volatile SingularAttribute<Device, Long> id;
    public static volatile ListAttribute<Device, Metric> metrics;
    public static volatile SingularAttribute<Device, String> type;

}