package SQL;

import SQL.City;
import SQL.Orders;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-19T01:30:04")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile SingularAttribute<Users, String> password;
    public static volatile SingularAttribute<Users, String> address;
    public static volatile SingularAttribute<Users, String> mail;
    public static volatile SingularAttribute<Users, String> surname;
    public static volatile SingularAttribute<Users, Integer> id;
    public static volatile CollectionAttribute<Users, Orders> ordersCollection;
    public static volatile SingularAttribute<Users, City> cityid;
    public static volatile SingularAttribute<Users, String> nameof;

}