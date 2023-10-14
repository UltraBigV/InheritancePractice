import javax.swing.JOptionPane;

public class Bird extends Animal{
    @Override
    public void animalSounds(){
        JOptionPane.showMessageDialog(null, "The Bird Chirps");
    }
}
