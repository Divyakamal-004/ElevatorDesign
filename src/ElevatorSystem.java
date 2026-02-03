public class ElevatorSystem {
    private static ElevatorSystem elevatorSystemInstance = null;
    private int noOfFloors;
    private int noOfElevators;
    private ExternalRequestProcessor extReqProcessor;
    private InternalRequestProcessor intReqProcessor;

    private ElevatorSystem() {}

    public static ElevatorSystem getElevatorSystem() {
        if(elevatorSystemInstance == null) {
            elevatorSystemInstance = new ElevatorSystem();
        }
        return elevatorSystemInstance;
    }

    public void initializeElevatorSystem(int pNoOfFloors, int pNoOfElevators) {
        noOfElevators = pNoOfElevators;
        noOfFloors = pNoOfFloors;

        System.out.println("Initializing elevator system with" + noOfFloors + " floors and " + noOfElevators + " elevators");
        System.out.println("----------------------------------");

        ElevatorMgr elevatorMgr = ElevatorMgr.getElevatorMgr();
        elevatorMgr.initializeElevators(noOfElevators);

        extReqProcessor = new ExternalRequestProcessor();
    }
    public void setElevatorSelectionStrategy(ElevatorSelectionStrategy selectionStrategy){
        extReqProcessor.setElevatorSelectionStrategy(selectionStrategy);
    }
    public void sendExternalRequest(ElevatorDirection direction, int srcFloor){
        extReqProcessor.processExtRequest(new ExternalRequest(direction, srcFloor));
    }
    public void sendInternalRequest(int destFloor, int srcElevatorId){
        intReqProcessor.processInternalRequest(new InternalRequest(destFloor, srcElevatorId));
    }
}
