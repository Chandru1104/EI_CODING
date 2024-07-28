public class GreenLightState implements State {
    //@Override
    public void handle(TrafficLightContext context) {
        System.out.println("Green Light");
        context.setState(new YellowLightState());
    }
}