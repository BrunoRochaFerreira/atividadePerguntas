
package atividadeperguntas;

import javax.swing.JOptionPane;

/**
 *
 * @author Bruno
 */
public class AtividadePerguntas {

   
    public static void main(String[] args) {
      int acertos = 0;
      String nomeUsuario, RA, perguntas;
      
      
      nomeUsuario = JOptionPane.showInputDialog("Nome do aluno: ");
      RA = JOptionPane.showInputDialog("Informe a senha do aluno: ");
      
      if(("usuario".equals(RA))){
          JOptionPane.showMessageDialog(null, "Aluno autenticado");
      } else{
          JOptionPane.showMessageDialog(null, "Senha incorreta!");
          System.exit(0);
      }
      
      
      JOptionPane.showMessageDialog(null, " Seja bem vindo(a)" + " " + nomeUsuario);
      
      perguntas = JOptionPane.showInputDialog( nomeUsuario + " o seu total de acertos é " + acertos + "\n" 
              + "1) Sobre sistemas distribuidos podemos afirmar que:" + "\n" + "\n" 
              +" A) Um sistema distribuıdo pode ser definido como um conjunto de computadores\n" +
"independentes que se apresenta a seus usuarios como um sistema unico e coerente." + "\n" + "\n" 
              +" B) Um sistema distribuıdo pode ser definido como computadores individuais\n" +
" que se apresenta a seus usuarios como um sistema unico e coerente." + "\n" + "\n" 
              +" C) Um sistema distribuıdo pode ser definido por apenas um computador,\n" +
"que se apresenta a seus usuarios como um sistema unico." + "\n" + "\n" 
              +" D) Um sistema distribuıdo pode ser definido apenas por uma quantidade exata de computadores.");
      
      if (("A".equals(perguntas) || "a".equals(perguntas))){
          JOptionPane.showMessageDialog(null, "Parabens " + nomeUsuario + " voce acertou!");
          acertos = acertos + 1;
          
      } else {
          JOptionPane.showMessageDialog(null, "Que pena " + nomeUsuario + " Resposta incorreta!");
      }
      
       perguntas = JOptionPane.showInputDialog( nomeUsuario + " o seu total de acertos é " + acertos + "\n" 
              + "2) Baseando na arquitetura em camadas é correto afirmar que:" + "\n" + "\n" 
              +" A) Componentes sao organizados em camadas de modo que um componente da Camada N\n" +
"não precise de outro componente." + "\n" + "\n" 
              +" B) Componentes sao organizados em camadas de modo que um componente da Camada N\n" +
"precise de outro componente de outra camada." + "\n" + "\n" 
              +" C) Componentes sao organizados em camadas de modo que um componente da Camada N\n" +
"invoque componentes da Camada N + 1, mas nao outro fora desta ordem." + "\n" + "\n" 
              +" D) Componentes não sao organizados em camadas.");
      
      if (("C".equals(perguntas) || "c".equals(perguntas))){
          JOptionPane.showMessageDialog(null, "Parabens " + nomeUsuario + " voce acertou!");
          acertos = acertos + 1;
          
      } else {
          JOptionPane.showMessageDialog(null, "Que pena " + nomeUsuario + " Resposta incorreta!");
      }
      
      perguntas = JOptionPane.showInputDialog( nomeUsuario + " o seu total de acertos é " + acertos + "\n" 
             + "3) Sobre o protocolo de rede de computadores e correto afirmar que: " + "\n" + "\n" 
              +" A) O termo protocolo e usado apenas para designar um conjunto de regras." + "\n" + "\n" 
              +" B) O termo protocolo e usado para designar um conjunto bem conhecido de regras e formatos a\n" +
"serem usados na comunicaçao entre processos a fim de realizar uma determinada tarefa" + "\n" + "\n" 
              +" C) O termo protocolo e usado apenas para designar um conjunto de regras e formatos" + "\n" + "\n" 
              +" D) O termo protocolo e usado apenas para designar um conjunto de formatos.");
      if (("B".equals(perguntas) || "b".equals(perguntas))){
          JOptionPane.showMessageDialog(null, "Parabens " + nomeUsuario + " voce acertou!");
          acertos = acertos + 1;
          
      } else {
          JOptionPane.showMessageDialog(null, "Que pena " + nomeUsuario + " Resposta incorreta!");
      }
      
         perguntas = JOptionPane.showInputDialog( nomeUsuario + " o seu total de acertos é " + acertos + "\n" 
              + "4) O que e o protocolo TCP? " + "\n" + "\n" 
              +" A) E um conjunto de regras utilizado para criptografar mensagens." + "\n" + "\n" 
              +" B) E um conjunto de regras utilizado pelos softwares que permitem fazer acesso remoto." + "\n" + "\n" 
              +" C) E um conjunto de regras utilizado para a comunicação entre servidor e os computadores dependente." + "\n" + "\n" 
              +" D)  E um conjunto de regras padronizadas que permitem que os computadores se comuniquem por meio de uma rede como a internet.");
      
      if (("D".equals(perguntas) || "d".equals(perguntas))){
          JOptionPane.showMessageDialog(null, "Parabens " + nomeUsuario + " voce acertou!");
          acertos = acertos + 1;
          
          JOptionPane.showMessageDialog(null, " Voce acertou " + acertos + " de 4 perguntas.");
          
          
          
      } else {
          JOptionPane.showMessageDialog(null, "Que pena " + nomeUsuario + " Resposta incorreta!");
          JOptionPane.showMessageDialog(null, " Voce acertou " + acertos + " de 4 perguntas.");
      }
      
      
    }  
}
