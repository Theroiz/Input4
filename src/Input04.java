import java.util.Scanner;

public class Input04 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(Input04.class.getResourceAsStream("input04text.txt"));      
        
        //Edit these lines to advance the scanner
        entrada.nextLine();
        System.out.println(entrada.nextLine());
        String resultado = entrada.findInLine("blueBumper");
        
        
        //Does this line contain "BlueBumper"?
        System.out.println(entrada.findInLine("BlueBumper"));
        //Store the next two numbers as xPosition and yPosition
        //Print these positions
        
        
        System.out.println("X: "        +", Y: "        );
        entrada.close();
    }    
}
