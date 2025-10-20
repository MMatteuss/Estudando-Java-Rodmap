public class Main{
    public static void main(String[] args){
        // Usando switch case operadores:
        Float nota1 = 4.5f;
        Float nota2 = 4.5f;
        Float nota3 = 4.5f;
        Float nota4 = 4.5f;
        Float mediaa = ((nota1 + nota2 + nota3 + nota4)/4);
        
        System.out.println("Media do aluno: "+mediaa);
        
        int media = (int) Math.round(mediaa);
    
        switch (media){
            case 5:
                System.out.println("Aluno Reprovado");
                break;
            
            case 7:
                System.out.println("Aluno em Recuperacao");
                break;
            
            default:
                System.out.println("Aluno Aprovado");
        }
    }
}