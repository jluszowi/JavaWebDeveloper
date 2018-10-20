public class MarsRobot {
    String status;
    int speed;
    float temperature;

    void checkTemperature() {
        if (temperature < -80) {
            status = "powrót do domu";
            speed = 5;
        }
    }
    void showAttribiutes() {
        System.out.println("status: " + status);
        System.out.println("Prędkość: " + speed);
        System.out.println("Temperature: " + temperature); }
}





