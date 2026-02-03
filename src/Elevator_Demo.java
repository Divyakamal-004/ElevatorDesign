public class Elevator_Demo {
    public static void main(String[] args) {
        ElevatorSystem elevatorSystem = ElevatorSystem.getElevatorSystem();
        elevatorSystem.initializeElevatorSystem(12, 4);

        elevatorSystem.setElevatorSelectionStrategy(new OddEvenElevatorSelStrategy());

        System.out.println("----------------------------");
        //pressing external button from floor 10 to go down
        elevatorSystem.sendExternalRequest(ElevatorDirection.DOWN, 10);

        System.out.println("----------------------------------");

        elevatorSystem.sendInternalRequest(7, 4);
        System.out.println("-----------------------------------");
    }
}
