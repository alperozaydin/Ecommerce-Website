package SQL;

import SQL.Category;
import SQL.Color;
import SQL.InfoPK;
import SQL.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-19T01:30:04")
@StaticMetamodel(Info.class)
public class Info_ { 

    public static volatile SingularAttribute<Info, Product> product;
    public static volatile SingularAttribute<Info, InfoPK> infoPK;
    public static volatile SingularAttribute<Info, String> sizeof;
    public static volatile SingularAttribute<Info, Color> colorid;
    public static volatile SingularAttribute<Info, String> speck;
    public static volatile SingularAttribute<Info, Integer> stock;
    public static volatile SingularAttribute<Info, Category> category;

}