package trabalho;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Animais {
     private String nomeDoAnimal;
     private String region;
     private String specialSet;
     public Animais(String especies, String nomedoanimal, String region, String specialSet) {
         this.especies = especies;
         this.NomeDoAnimal = nomedoanimal;
         this.Region = region;
         this.SpecialSet = specialSet;
     }

     public String mostrarEspecie(){
          String resumo;
          resumo = "Nome: " + getnomeDoAnimal() + "\n" + "Regiao: " + getregion() + "\n" + "Caracteristica especial: " + getspecialSet();
          return resumo;
     }

     public void setEspecies() {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Digite qual o nome do animal: ");
         this.NomeDoAnimal = scanner.nextLine();
         System.out.println("Digite a regiao desejada (pais, bioma, etc): ");
         this.Region = scanner.nextLine();
         System.out.println("Digite alguma caracteristica especial: ");
         this.SpecialSet = scanner.nextLine();
     }
 }
