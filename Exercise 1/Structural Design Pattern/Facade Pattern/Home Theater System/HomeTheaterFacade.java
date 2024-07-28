public class HomeTheaterFacade {
    private Amplifier amp;
    private DvdPlayer dvd;
    private Projector projector;

    public HomeTheaterFacade(Amplifier amp, DvdPlayer dvd, Projector projector) {
        this.amp = amp;
        this.dvd = dvd;
        this.projector = projector;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        amp.on();
        dvd.on();
        projector.on();
        System.out.println("Playing movie: " + movie);
    }

    public void endMovie() {
        System.out.println("Shutting down the home theater...");
        amp.off();
        dvd.off();
        projector.off();
    }
}