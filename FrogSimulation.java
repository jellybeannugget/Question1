public class FrogSimulation {
    
    //distance, in inches, from the starting point to the goal
    private int goalDistance;
    
    //max number of hops allowed to reach the goal
    private int maxHops;

    //returns an int representing the dinstance, in inchs to be moved when the frog jumps
    private int hopDistance(){
      int dis = (int) (10*Math.random())+1 - (int)(10* Math.random())+1;
      return dis;
    }
    //constructs a FrogSimulation where dist and maxhops are the above
    public FrogSimulation (int dist, int numHops){
        goalDistance = dist;
        maxHops = numHops;
    }


public static void main(String[] args) {
    FrogSimulation f = new FrogSimulation(30, 20);
    System.out.println(f.simulate());
    System.out.println(f.runSimulations(10));
   
}


//simulates a frog attempting to reach the goal as described
//returns true if the frog successfully reached or passed the goal during the sim, false otherwise
    public boolean simulate(){
        int finalPos = 0;
        for(int i = 0; i <= maxHops; i++){
            finalPos += hopDistance();
        }
        if(finalPos >= goalDistance){
            return true;
        }
        else{
            return false;
        }
    }


//runs num simulations and returns the proportion of simulations in which the frog reached or passed the goal
public double runSimulations(int num){
    int good = 0;
    int bad = 0;
    for (int i = 0; i <= num; i++){
        boolean check = simulate();
        if (check == true){
            good++;
        }
        else{
            bad++;
        }
    }
return (double) good/bad;
}

}
