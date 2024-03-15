package pacote;

import com.db4o.ObjectContainer;

import javax.swing.*;

public class Adicionar {

   public static void adicionar(ObjectContainer db){

        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        String idade = JOptionPane.showInputDialog("Digite seu Idade:");
        String curso = JOptionPane.showInputDialog("Digite seu Curso:");
        String matricular = JOptionPane.showInputDialog("Digite seu Matricula:");
        Palavras Palavras = new Palavras(nome, idade, matricular, curso);
        db.store(Palavras);
        JOptionPane.showMessageDialog(null, "Adicionado : ");

    }


}
