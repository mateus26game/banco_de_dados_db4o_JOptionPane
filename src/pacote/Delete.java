package pacote;

import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

import javax.swing.*;

public class Delete {

    public static void delete (ObjectContainer db) {

            String nomeDelete = JOptionPane.showInputDialog("Digite o nome a ser deletado");

            deletarPessoa(db, nomeDelete);
            JOptionPane.showMessageDialog(null, "Usuario deletado : ");
        }

        private static void deletarPessoa(ObjectContainer db, String nome) {
            ObjectSet<Palavras> resultados = db.queryByExample(new Palavras(nome, null, null, null));


            while (resultados.hasNext()) {
                Palavras palavras = resultados.next();
                db.delete(palavras);

            }


            db.commit();
        }
    }


