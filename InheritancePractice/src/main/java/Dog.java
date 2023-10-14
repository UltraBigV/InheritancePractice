import javax.swing.JOptionPane;

public class Dog extends Animal{
    @Override
    public void animalSounds(){
        JOptionPane.showMessageDialog(null, "The Dog Barks");
    }
}
