package ke.co.safaricom;

import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

public class dao {
    private static Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5432/javatwo", "postgres", "Ngethe1010");

    public static List<hero> getALLHeroes() {
        String query = "SELECT * FROM heroes;";
        List<hero> response = null;
        try(Connection connection = sql2o.open()) {
            System.out.println("Trying to run");
            response = connection.createQuery(query).executeAndFetch(hero.class);

        } catch (Exception exception) {
            System.out.println(exception.getMessage());

        }
        return response;
    }
}
