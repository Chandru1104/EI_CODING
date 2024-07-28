public class YellowLightState implements State {
    @Override
    public void handle(TrafficLightContext context) {
        System.out.println("Yellow Light");
        context.setState(new RedLightState());
    }
}