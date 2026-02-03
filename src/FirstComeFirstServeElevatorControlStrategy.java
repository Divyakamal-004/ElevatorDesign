public class FirstComeFirstServeElevatorControlStrategy implements ElevatorControlStrategy{
    public int determineNextStop(int floorNum){
        System.out.println("Applying first come first serve algorithm and moving elevator to floor " + floorNum);
        return 1;
        //returning 1 for demo purposes, should be determining next stop and returning that
    }
}
