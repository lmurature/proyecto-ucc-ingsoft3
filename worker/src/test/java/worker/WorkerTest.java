import static org.junit.Assert.*;
import org.junit.Test;
import java.sql.*;
import worker.Worker;

public class WorkerTest {
    @Test
    public void TestWorker() {
      Worker classUnderTest = new Worker();
      assertNotNull(classUnderTest);
    }

    @Test
    public void TestConnectionString() {
      Worker classUnderTest = new Worker();
      String testConnString = classUnderTest.getConnectionString("myTestHost");
      assertEqual("Testing if connection String is correct", testConnString, "jdbc:postgresql://myTestHost/postgres");
    }
}
