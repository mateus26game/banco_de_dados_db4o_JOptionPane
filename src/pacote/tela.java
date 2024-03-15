package pacote;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

import javax.swing.*;
import java.util.Scanner;

public class tela {



        public static void main(String[] args) {
            int choice;

            String[] options = {"Criar", "Ler", "Atualizar", "Excluir", "Sair"};
            ObjectContainer db = Db4o.openFile("meubanco.dbon");
            do {
                choice = JOptionPane.showOptionDialog(null, "Escolha as opções", "Saindo do programa",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

                switch (choice) {
                    case 0: //

                        Adicionar.adicionar(db);


                        break;
                    case 1: // Ler
                        Ler.led(db);
                        break;
                    case 2: // Atualizar

                        Editar.editar(db);

                        break;
                    case 3: // Excluir

                        Delete.delete(db);

                        break;
                    case 4: // Sair


                        JOptionPane.showMessageDialog(null, "Saindo do banco de dados \n orientado  objeto");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "clicar no botão sair");
                }
            } while (choice != 4);
        }





    }

