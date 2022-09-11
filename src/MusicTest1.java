import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

public class MusicTest1 {

    public void play() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.err.println("We got syntheser!");    
        } catch (MidiUnavailableException ex) {
            System.out.println("Failed to call sequencer.");
            ex.printStackTrace();
        }
        finally {
            System.out.println("We are in finally anyway!");
        }        
    }

    public static void main(String[] args) throws Exception, BadException {
        MusicTest1 mt = new MusicTest1();
        mt.play();    

    }
}
