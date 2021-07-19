
import javax.swing.JOptionPane;

public class index {
	public static void main(String[] args)
    {
    int opcao = 0, cont;
     
    String opcoes =
      "Biblioteca: XXX"+
      "\nLocalização: YYY"+
      "\n\n***Opções*** "+
      "\n1. Doar Livro"+
      "\n2. Pesquisar Livro (Código)"+
      "\n3. Pesquisar Livro (Título)"+
      "\n4. Listar Livros"+
      "\n5. finalizar"+
      "\n\nSelecione a opção: ";
       
        while (opcao != 6)
        {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null,opcoes,
            "Biblioteca XXX",JOptionPane.INFORMATION_MESSAGE));
            
            switch(opcao)
            {
                case 1:
                    JOptionPane.showMessageDialog(null, "1-Doar Livro");
                  
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "2-Retirar um livro");
                    break;
        case 3:
                    JOptionPane.showMessageDialog(null, "3-Devolver um livro");
                    break;
        case 4:
                    JOptionPane.showMessageDialog(null, "4-Pesquisar Livros");
                    break;
        case 5:
                    JOptionPane.showMessageDialog(null, "5-Finalizar");
                    break;
            }
    } 
        

} 
	}
	
