package SQL;

import SQL.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-19T01:30:04")
@StaticMetamodel(Manuf.class)
public class Manuf_ { 

    public static volatile CollectionAttribute<Manuf, Product> productCollection;
    public static volatile SingularAttribute<Manuf, String> manuf;
    public static volatile SingularAttribute<Manuf, Integer> id;

}