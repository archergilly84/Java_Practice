import javax.sound.midi.*;

//1) Need a Sequencer => Plays the Music
//2) Need a Sequence => Music to be played
//3) Track => Holds Music Instrument Information
//4) Events => Actual events of changing instruments or tones etc.
public class MiniMiniMusicApp {
    public static void main(String[] args) {
        MiniMiniMusicApp mini = new MiniMiniMusicApp();
        mini.play();
    }

    private void play() {
        try{
            //Get a sequencer
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            //Get sequence
            Sequence seq = new Sequence(Sequence.PPQ, 4);

            //Make a Track
            Track track = seq.createTrack();

            //Events

            ShortMessage first = new ShortMessage();
            first.setMessage(192,1,102,0);
            MidiEvent changeInstrument = new MidiEvent(first, 1);
            track.add(changeInstrument);

            ShortMessage a = new ShortMessage();
            a.setMessage(144,1,20,100);// First Arg => NoteOn; Second Arg => Channel; Third Arg => Note(0 - 127); Forth Arg => How hard or soft pushed
            MidiEvent noteOn = new MidiEvent(a,1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128,1,20,100);// First Arg => NoteOff; Second Arg => Channel; Third Arg => Note(0 - 127); Forth Arg => How hard or soft pushed
            MidiEvent noteOff = new MidiEvent(b,16);
            track.add(noteOff);

            player.setSequence(seq);
            player.start();

        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
