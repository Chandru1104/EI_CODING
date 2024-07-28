public class StatePattern
{
    public static void main(String[] args) {
        TrafficLightContext trafficLight = new TrafficLightContext();

        for (int i = 0; i < 6; i++) {
            trafficLight.change();
        }
    }
}
