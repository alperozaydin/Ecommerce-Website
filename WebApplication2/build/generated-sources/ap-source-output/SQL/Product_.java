package SQL;

import SQL.Info;
import SQL.Manuf;
import SQL.Orders;
import SQL.Typeof;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-19T01:30:04")
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile CollectionAttribute<Product, Info> infoCollection;
    public static volatile SingularAttribute<Product, Manuf> manufid;
    public static volatile SingularAttribute<Product, Double> price;
    public static volatile SingularAttribute<Product, String> photo;
    public static volatile SingularAttribute<Product, Typeof> typeid;
    public static volatile SingularAttribute<Product, Integer> id;
    public static volatile CollectionAttribute<Product, Orders> ordersCollection;
    public static volatile SingularAttribute<Product, String> nameof;

}