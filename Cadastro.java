import java.io.BufferedReader;  

public class Cadastro1 {
 public static void main(String[]args){
 
  int resp=0;
  
  while (resp != 999){
  System.out.println ("    Digite o comando a ser Usado     ");
  System.out.println ("    1- adicionr User           ");
  System.out.println("     2- Mostrar os User Cadastrados    ");
  System.out.println("     3- Remover User          ");
  System.out.println("     4-Exportar Cadastro      ");
  System.out.prinln("      5-Importar Cadastro      ");
  try {
      BufferedReader is = new BufferedReader (new InputStreamReader (System.in));
      inputLine = is.readLine();
        if (inputLine.length() == 0) return null;
    } catch (IOException e) {
      System.out.println("IOException:"+ e);
    }

    //adicionar switch case
  
  if (resp > 5){
  System.out.printl("Comando Invalido,Digite Outro Comando ");

  if (resp = 1) {
    User User = new User();
    User.nome ;
    User.email ;
    User.id = id++;
    }

    if (resp = 2) {
      User 
    }
  }
  }
}