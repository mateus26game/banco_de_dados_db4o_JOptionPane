package pacote;

import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

import javax.swing.*;

public class Ler {

    public static void led(ObjectContainer db) {

        ObjectSet<Palavras> resultados = db.queryByExample(Palavras.class);

        while (resultados.hasNext()) {
            Palavras palavras = resultados.next();
            JOptionPane.showMessageDialog(null,"==============================="+"\nNome: "+palavras.getNome()+ " \nIdade: "+palavras.getIdade()+" \nMatricula: "+palavras.getCurso()+" \nCurso: "+palavras.getMatricular()+ "\n===============================");
        }
    }

}
