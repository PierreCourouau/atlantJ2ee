package entity;

import entity.Device;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-27T14:18:20")
@StaticMetamodel(Metric.class)
public class Metric_ { 

    public static volatile SingularAttribute<Metric, Date> createdAt;
    public static volatile SingularAttribute<Metric, Long> id;
    public static volatile SingularAttribute<Metric, Float> value;
    public static volatile SingularAttribute<Metric, Device> device;

}