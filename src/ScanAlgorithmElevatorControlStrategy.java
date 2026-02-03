public class ScanAlgorithmElevatorControlStrategy implements ElevatorControlStrategy{
    @Override
    public int determineNextStop(int floorNum){
        System.out.println("Applying scan algorithm and moving elevator to floor " + floorNum);
        return 1;

    }
}
