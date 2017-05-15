package SQL;

import SQL.Users;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-05-19T01:30:04")
@StaticMetamodel(City.class)
public class City_ { 

    public static volatile SingularAttribute<City, String> city;
    public static volatile SingularAttribute<City, Integer> id;
    public static volatile CollectionAttribute<City, Users> usersCollection;

}