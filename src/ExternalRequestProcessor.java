public class ExternalRequestProcessor {
    private ElevatorSelectionStrategy elevatorSelectionStrategy;

    public ExternalRequestProcessor() {
        elevatorSelectionStrategy = new OddEvenElevatorSelStrategy();
    }
    public void setElevatorSelectionStrategy(ElevatorSelectionStrategy selectionStrategy){
        elevatorSelectionStrategy = selectionStrategy;
    }
    public void processExtRequest(ExternalRequest extReq){
        int assignedElevatorId = elevatorSelectionStrategy.selectElevator(extReq);
        ElevatorMgr elevatorMgr = ElevatorMgr.getElevatorMgr();
        Elevator assignedElevator = elevatorMgr.getElevator(assignedElevatorId);
        assignedElevator.moveToFloor(extReq.getSrcFloor());
    }
}
