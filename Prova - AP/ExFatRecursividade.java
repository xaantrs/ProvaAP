import javax.swing.JOptionPane;

public class ExFatRecursividade {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
        Fatorial b = new Fatorial();
        n = b.fatorialRecursivo(n);
        JOptionPane.showMessageDialog(null, "O fatorial é: " + n);
    }
}

class Fatorial {
    public int fatorialRecursivo(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fatorialRecursivo(n - 1);
        }
    }
}