package pacote;

import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

import javax.swing.*;

public class Editar {

    public static void editar(ObjectContainer db) {

        String nomePerfil = JOptionPane.showInputDialog(null,"Digite o nome do perfil que você deseja editar:");

        String novoCurso = JOptionPane.showInputDialog(null,"Digitar o nome do curso que vc que  editar");

        ObjectSet<Palavras> result = db.queryByExample(new Palavras(nomePerfil, null, null, null));

        if (result.hasNext()) {
            Palavras perfil = result.next();

            perfil.setMatricular(novoCurso);

            db.store(perfil);

            JOptionPane.showMessageDialog(null,"Perfil atualizado com sucesso.");

        } else {

            JOptionPane.showMessageDialog(null,"Perfil não encontrado no banco de dados.");
            JOptionPane.showMessageDialog(null, "Atualizado : ");
        }

    }

}
