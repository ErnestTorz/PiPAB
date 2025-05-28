package ATINS.SOS;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

    public AppTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Oryginalny test wygenerowany przez szablon.
     */
    public void testApp() {
        assertTrue(true);
    }

    /**
     * Nowy test: sprawdza połączenie z bazą danych HSQLDB i wykonuje proste zapytanie.
     */
    public void testDatabaseConnection() {
        try (ClassPathXmlApplicationContext context =
                     new ClassPathXmlApplicationContext("WEB-INF/applicationContext.xml")) {

            JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
            Integer result = jdbcTemplate.queryForObject(
                    "SELECT 1 FROM INFORMATION_SCHEMA.SYSTEM_USERS", Integer.class);

            assertEquals("Połączenie z bazą nie działa poprawnie", Integer.valueOf(1), result);

        } catch (Exception e) {
            fail("Błąd połączenia z bazą: " + e.getMessage());
        }
    }
}