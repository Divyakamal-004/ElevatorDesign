public class Elevator {

    private int elevatorId;

    private ElevatorController controller;

    public Elevator(){
        controller = new ElevatorController();
    }

    public int getElevatorId(){
        return elevatorId;
    }
    public void moveToFloor(int floorNum){
        controller.moveElevatorToFloor(floorNum);
    }
    public void notifyFloorNumUpdate(int floorNum){
        controller.setCurrFloor(floorNum);
    }
}
