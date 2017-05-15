package SQL;

import SQL.OrdersPK;
import SQL.Product;
import SQL.Users;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-19T01:30:04")
@StaticMetamodel(Orders.class)
public class Orders_ { 

    public static volatile SingularAttribute<Orders, OrdersPK> ordersPK;
    public static volatile SingularAttribute<Orders, Product> product;
    public static volatile SingularAttribute<Orders, String> odate;
    public static volatile SingularAttribute<Orders, Users> userid;

}