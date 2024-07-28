public class TrafficLightContext {
    private State state;

    public TrafficLightContext() {
        state = new RedLightState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void change() {
        state.handle(this);
    }
}