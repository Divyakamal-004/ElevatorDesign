public class ElevatorController {
    private ElevatorCurrState state;
    private ElevatorControlStrategy controlStrategy;

    public ElevatorController(){
        state = new ElevatorCurrState();
    }
    void setCurrFloor(int floorNum){
        //controller should check if this is stopping point
        //if yes, should stop using stop method
        state.setCurrFloor(floorNum);
    }

    public void moveElevatorToFloor(int floorNum){
        controlStrategy = new FirstComeFirstServeElevatorControlStrategy();

        int nextStop = controlStrategy.determineNextStop(floorNum);
        if(nextStop > state.getCurrFloor())
            state.setCurrDirection(ElevatorDirection.UP);
        else if(nextStop < state.getCurrFloor())
            state.setCurrDirection(ElevatorDirection.DOWN);
        if(nextStop != state.getCurrFloor())
            state.setCurrStatus(ElevatorStatus.MOVING);
    }
}
