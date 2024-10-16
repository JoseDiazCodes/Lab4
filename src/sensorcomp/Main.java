package sensorcomp;

/**
 * Demonstrates the functionality of the WaterSensor class.
 * This class contains the main method which creates a WaterSensor instance
 * and simulates taking multiple readings, displaying the water level and
 * flooding status for each reading.
 */
public class Main {

  /**
   * The entry point of the program.
   * Creates a WaterSensor, takes 10 readings, and prints each reading
   * along with the corresponding flooding status.
   */

  public static void main(String[] args) {
    IDiscreteSensor sensor = new WaterSensor();
    for (int i = 0; i < 10; i++) {
      System.out.println("Water reading = " + sensor.takeNewReading()
              + " inches");
      System.out.println("Our basement is flooding (True/False): "
              + sensor.status());
    }
  }
}