import java.util.Scanner;

public class exercicioTab2 {
  public static void main(String[] args) {
    int valor_inicial, valor_final, contador_inicial, contador_final;
    
    Scanner leitor_dados = new Scanner(System.in);
    
    System.out.println("Por favor, digite um valor inicial a ser calculado:");
     valor_inicial = leitor_dados.nextInt();
    
     System.out.println("Favor digitar uma contador a ser calculado:");
     contador_inicial = leitor_dados.nextInt();
    
     System.out.println("Por favor, digite um valor final a ser calculado:");
    valor_final = leitor_dados.nextInt();
    
    
    System.out.println("Favor digitar uma contador final a ser calculado:");
    contador_final = leitor_dados.nextInt();
    
    calculo_dados(valor_inicial, valor_final, contador_inicial, contador_final);
  }		

public static void calculo_dados(int valor_inicial, int valor_final, int contador_inicial, int contador_final) {
  int cont1 = contador_inicial, cont_tab1 = contador_inicial;
  int cont2 = contador_final, cont_tab2 = contador_final;
  int resultado1, resultado2 = 0;

  if(valor_inicial <2 || valor_inicial >100 || valor_final <2 || valor_final >100) {
    System.out.println("O valor digitado não pode ser menor que 2, nem maior que 100");
    
    return;
  }
    
  if(cont1 <0 || cont1 >50 || cont2 <0 || cont2 >50) {
    System.out.println("O valor digitado não pode ser menor que 0 e nem maior que 50");
    return;
  }
  
  
  while (cont1 <= cont2) {
      resultado1 = valor_inicial * cont1;
      System.out.println(valor_inicial + " x " + cont1 +  " = " + resultado1);
      cont1 ++;
  
  }
  
    System.out.println("\n");
  while (cont_tab1 <= cont_tab2) {
    resultado2 = valor_final * cont_tab1;
    System.out.println(valor_final + " x " + cont_tab1 +  " = " + resultado2);
    cont_tab1 ++;

}
}
}


