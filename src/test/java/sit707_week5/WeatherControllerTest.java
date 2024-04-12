package sit707_week5;

import org.junit.Assert;
import org.junit.Test;

public class WeatherControllerTest {

    @Test
    public void testStudentIdentity() {
        String studentId = "221270936";
        Assert.assertNotNull("Student ID is null", studentId);
    }

    @Test
    public void testStudentName() {
        String studentName = "Seth";
        Assert.assertNotNull("Student name is null", studentName);
    }

    private WeatherController wController;

    // Arrange
    public void setUp() {
        wController = WeatherController.getInstance();
    }

    // After
    public void tearDown() {
        wController.close();
    }

    @Test
    public void testTemperatureMin() {
        setUp(); // Arrange

        // Act
        double minTemperature = wController.getTemperatureMinFromCache();

        // Assert
        Assert.assertTrue(minTemperature >= -20 && minTemperature <= 50);

        tearDown(); // After
    }

    @Test
    public void testTemperatureMax() {
        setUp(); // Arrange

        // Act
        double maxTemperature = wController.getTemperatureMaxFromCache();

        // Assert
        Assert.assertTrue(maxTemperature >= -20 && maxTemperature <= 50);

        tearDown(); // After
    }

    @Test
    public void testTemperatureAverage() {
        setUp(); // Arrange

        // Act
        double averageTemperature = wController.getTemperatureAverageFromCache();

        // Assert
        Assert.assertTrue(averageTemperature >= -20 && averageTemperature <= 50);

        tearDown(); // After
    }
	
	@Test
	public void testTemperaturePersist() {
		/*
		 * Remove below comments ONLY for 5.3C task.
		 */
//		System.out.println("+++ testTemperaturePersist +++");
//		
//		// Initialise controller
//		WeatherController wController = WeatherController.getInstance();
//		
//		String persistTime = wController.persistTemperature(10, 19.5);
//		String now = new SimpleDateFormat("H:m:s").format(new Date());
//		System.out.println("Persist time: " + persistTime + ", now: " + now);
//		
//		Assert.assertTrue(persistTime.equals(now));
//		
//		wController.close();
	}
}
