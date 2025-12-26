enum TrafficLightColor {
        RED, YELLOW, GREEN
}

class TrafficLightColorSimulator{
        
        private TrafficLightColor currentColor;

        public TrafficLightColorSimulator(TrafficLightColor firstColor){
            currentColor = firstColor;
        }

        public void changeTheColor(){

            switch(currentColor){
                case TrafficLightColor.RED:
                    currentColor = TrafficLightColor.GREEN;
                    break;

                case TrafficLightColor.GREEN:
                    currentColor = TrafficLightColor.YELLOW;
                    break;

                case TrafficLightColor.YELLOW:
                    currentColor = TrafficLightColor.RED;
                    break;
                
            }
        }

        @Override
        public String toString() {
            return "The Current Color is: " + currentColor;
        }

        public TrafficLightColor getCurrentColor() {
            return currentColor;
        }
    }

public class enumFile {
    public static void main(String[] arg){
        TrafficLightColorSimulator simulator = new TrafficLightColorSimulator(TrafficLightColor.RED);

        for(int i = 0; i < 9; i++){
            System.out.println(simulator);
            simulator.changeTheColor();
        }
    }
}