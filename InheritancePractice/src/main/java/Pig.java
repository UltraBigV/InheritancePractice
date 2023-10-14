import javax.swing.JOptionPane;

public class Pig extends Animal{
    @Override
    public void animalSounds(){
        JOptionPane.showMessageDialog(null, "The Pig Oinks");
    }
}