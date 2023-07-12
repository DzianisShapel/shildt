import baeldung.jdbc.DBConnection;
import baeldung.utils.Log;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatabaseTest {

    @BeforeTest
    public void setUp()  {
        Log.info("------- Started test: ");
        DBConnection.connectToDB();
        //Assertions.assertNotNull(DBConnection.connectToDB());
    }

    @AfterTest
    public void tearDown() {
        DBConnection.closeConnection();
        Log.info("------- Finished test:");
    }

    @Test
    public void createTableForTest(){
        String query = "create table auto_aircrafts" +
                "(" +
                "aircraft_code char(3) NOT NULL," +
                "model text not null," +
                "range integer not null," +
                "check (range > 0)," +
                "PRIMARY KEY (aircraft_code)" +
                ");";
        DBConnection.createTable(query);
    }

    @Test
    public void insertRecordsIntoTable(){
        String query = "INSERT INTO my_aircrafts (aircraft_code, model, range)" +
                "VALUES ('773', 'Boeing 777-300', 11100)," +
                "('763', 'Boeing 767-300', 7900)," +
                "('733', 'Boeing 737-300', 4200)," +
                "('320', 'Airbus A320-200', 5700)," +
                "('321', 'Airbus A321-200', 5600)," +
                "('319', 'Airbus A319-100', 6700)," +
                "('SU9', 'Sukhoi SuperJet-100', 3000);";
        DBConnection.insertIntoTable(query);
    }

}
