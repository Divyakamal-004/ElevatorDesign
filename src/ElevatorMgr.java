import java.util.HashMap;
import java.util.Map;

public class ElevatorMgr {
    private static ElevatorMgr elevatorMgrInstance = null;
    private Map<Integer, Elevator> elevators;

    private ElevatorMgr (){
        elevators = new HashMap<>();
    }
    public static ElevatorMgr getElevatorMgr(){
        if(elevatorMgrInstance == null){
            elevatorMgrInstance = new ElevatorMgr();
        }
        return elevatorMgrInstance;
    }

    public void initializeElevators(int noOfElevators){
        for(int i = 1; i<= noOfElevators; i++){
            elevators.put(i, new Elevator());
        }
    }
    public Elevator getElevator(int elevatorId){
        return elevators.get(elevatorId);
    }
}
