public class Main{
    public static void main(String[] args){
        // Usando IF e Else operadores:
        Float nota1 = 10f;
        Float nota2 = 10f;
        Float nota3 = 10f;
        Float nota4 = 10f;
        Float media = ((nota1 + nota2 + nota3 + nota4)/4);
        
        System.out.println("Media do aluno: "+media);
        
        if (media < 5f){
            System.out.println("Aluno Reprovado");
        } else if (media > 5f || media < 7){
            System.out.println("Aluno em Recuperacao");
        } else {
            System.out.println("Aluno Aprovado");
        }
    }
}





