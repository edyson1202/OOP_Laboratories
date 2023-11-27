package lab01;

public class Rocket {
    private int fuelCapacity = 100;
    private int stages = 4;
    private boolean thrustersOn = false;

    public Rocket(int fC, int s) {
        fuelCapacity = fC;
        stages = s;
    }
    public void PrintThrustersStatus() {
        if (thrustersOn) System.out.println("Thrusters on");
        else System.out.println("Thrusters off");
    }
    private void TurnThrustersOn() {
        thrustersOn = true;
    }
    private void TurnThrustersOff() {
        thrustersOn = false;
    }
}
