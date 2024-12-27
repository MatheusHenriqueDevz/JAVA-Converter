import java.util.Scanner;

public class Convertor{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int opcao = 0;
        double num = 0;
        boolean valid = true;
        
        System.out.println("WELCOME TO CONVERTER PROGRAM WITH JAVA!");
        
        while(valid){
            System.out.println("");
            System.out.println("1 - CELSIUS TO FAHRENHEIT");
            System.out.println("2 - CELSIUS TO KELVIN");
            System.out.println("3 - FAHRENHEIT TO CELSIUS");
            System.out.println("4 - FAHRENHEIT TO KELVIN");
            System.out.println("5 - KELVIN TO CELSIUS");
            System.out.println("6 - KELVIN TO FAHRENHEIT");
            System.out.println("7 - CANCEL");
            System.out.println("");
            
            try{
                System.out.print("CHOISE A OPTION WHAT YOU WANT TO CONVERTER?: ");
                opcao = Integer.parseInt(scanner.nextLine());

                if(opcao == 7){
                    System.out.println("CLOSING........");
                    valid = false;
                    break;
                }
                if (opcao < 1 || opcao > 7) {
                    System.out.println("INVALID OPTION, PLEASE CHOOSE A NUMBER BETWEEN 1 AND 7!");
                    continue; // Retorna ao início do loop
                }
            
                System.out.print("WRITE A NUMBER TO CONVERTER: ");
                num = Double.parseDouble(scanner.nextLine());

                    switch(opcao){
                        case 1:
                            double op1 = (num * 9/5) + 32;
                            System.out.print("RESULT: " + op1 + "ºF");
                            break;
                        case 2:
                            double op2 = num + 273.15;
                            System.out.print("RESULT: " + op2 + "K");
                            break;
                        case 3:
                            double op3 = (num - 32) * 5/9;
                            System.out.print("RESULT: " + op3 + "ºC");
                            break;
                        case 4:
                            double op4 = (num - 32) * 5/9 + 273.15;
                            System.out.print("RESULT: " + op4 + "K");
                            break;
                        case 5:
                            double op5 = num - 273.15;
                            System.out.print("RESULT: " + op5 + "ºC");
                            break;
                        case 6:
                            double op6 = (num - 273.15) * 9/5 + 32;
                            System.out.print("RESULT: " + op6 + "ºF");
                            break;
                    }
            }
            catch(Exception e){
            System.out.println("ERROR: INVALID INPUT, PLEASE ENTER A NUMBER!");
            }
        }

    }      
}
