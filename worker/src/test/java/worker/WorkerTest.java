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
}
