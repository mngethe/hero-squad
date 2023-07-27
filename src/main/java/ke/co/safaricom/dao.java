package ke.co.safaricom;

import org.sql2o.Connection;
import org.sql2o.Sql2o;

public class dao {
    private static Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5432/java two","postgres", "Ngethe1010");
    public void  getALLHeroes(){
        String query = "SELECT * FROM heroes;";

       try(Connection connection = Sql2o.open()){

       }
       }catch ()
}
