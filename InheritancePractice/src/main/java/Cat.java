import javax.swing.JOptionPane;

public class Cat extends Animal{
    @Override
    public void animalSounds(){
        JOptionPane.showMessageDialog(null, "The Cat Meows");
    }
}
