public class MarsAplication {
    public static void main(String[] args) {
        MarsRobot spirit = new MarsRobot();

        spirit.status = "eksploracja";
        spirit.speed = 2;
        spirit.temperature = -60;

        spirit.showAttribiutes();

        System.out.println("Zwiększaamy prędkość do 3.");
        spirit.speed = 3;
        spirit.showAttribiutes();

        System.out.println("Zmiana temperatury na -90.");
        spirit.temperature = -90;
        spirit.showAttribiutes();

        System.out.println("Sprawdzanie tempeatury.");
        spirit.checkTemperature();
        spirit.showAttribiutes();

    }

    {
        MarsRobot opportunity = new MarsRobot();

        opportunity.status = "eksploracja";
        opportunity.speed = 20;
        opportunity.temperature = -600;

        opportunity.showAttribiutes();

        System.out.println("Zwiększaamy prędkość do 30.");
        opportunity.speed = 30;
        opportunity.showAttribiutes();

        System.out.println("Zmiana temperatury na -900.");
        opportunity.temperature = -900;
        opportunity.showAttribiutes();

        System.out.println("Sprawdzanie tempeatury.");
        opportunity.checkTemperature();
        opportunity.showAttribiutes();

    }
}

