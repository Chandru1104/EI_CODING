public class RedLightState implements State {
    @Override
    public void handle(TrafficLightContext context) {
        System.out.println("Red Light");
        context.setState(new GreenLightState());
    }
}