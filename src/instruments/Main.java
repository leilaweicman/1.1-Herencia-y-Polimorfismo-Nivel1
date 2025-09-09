package instruments;

public class Main {
    public static void main(String[] args) {
        Instrument flute = new WindInstrument("flute", 10);
        flute.play();

        Instrument guitar = new StringInstrument("guitar", 50);
        guitar.play();

        Instrument drum = new PercussionInstrument("drum", 100);
        drum.play();
    }
}
