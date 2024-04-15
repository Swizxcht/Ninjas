import java.io.*;

public class babi {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int choice = 0;
        int item = 0;
        int quantity = 0;
        int pera = 0;
        int change = 0;
        String YesOrNo = " ";
        String line = "\n\t\t\t\t================================================================================\n"; //80 - 18 = 62 / 2 = 31

        do{
            System.out.println(line + "\n\t\t\t\t\t\t\t\tBig Black Lavapes!\n" + line);
            System.out.println("\t\t\t\t\t[1] Juice");
            System.out.println("\t\t\t\t\t[2] Vapes");
            System.out.println("\t\t\t\t\t[3] Magbayad ka muna dito pare. Kapal mo naman!");
            System.out.println("\t\t\t\t\t[4] Exit");
            System.out.println(line);

            try {
                System.out.print("\t\t\t\t\tEnter your choice: ");
                choice = Integer.parseInt(input.readLine());
            } catch(Exception A) {
                System.out.println("\t\t\t\t\tTanga mali! Ulitin mo!");
            }

            switch (choice) {
                case 1: // Juice
                    do {
                        System.out.println( line + "\n\t\t\t\t\tAvailable Juice based on Nicotine:\n");
                        System.out.println("\t\t\t\t\t   [1] 3mg - P150");
                        System.out.println("\t\t\t\t\t   [2] 6mg - P170");
                        System.out.println("\t\t\t\t\t   [3] 9mg - P180");
                        System.out.println("\t\t\t\t\t   [4] 12mg - P200");
                        System.out.println("\t\t\t\t\t   [5] 18mg - P210");
                        System.out.println("\t\t\t\t\t   [6] 24mg - P230");
                        System.out.println("\t\t\t\t\t   [7] 36mg - P250");

                        try {
                            System.out.print("\n\t\t\t\t\tEnter your choice: ");
                            choice = Integer.parseInt(input.readLine());
                            System.out.print("\t\t\t\t\tEnter your quantity: ");
                            quantity = Integer.parseInt(input.readLine());
                            switch(choice){
                                case 1: 
                                    item += (150 * quantity);
                                    break;
                                case 2: 
                                    item += (170 * quantity);
                                    break;
                                case 3: 
                                    item += (180 * quantity);
                                    break;
                                case 4: 
                                    item += (200 * quantity);
                                    break;
                                case 5: 
                                    item += (210 * quantity);
                                    break;
                                case 6: 
                                    item += (230 * quantity);
                                    break;
                                case 7: 
                                    item += (250 * quantity);
                                    break;
                                default:
                                    System.out.println("\t\t\t\t\tInvalid input pare.");
                            }
                        } catch(Exception A) {
                            System.out.println("\t\t\t\t\tTanga mali! Ulitin mo!");
                        }
                        System.out.print("\t\t\t\t\tDo you want to buy another juice? [ Y / N ]: ");
                        YesOrNo = input.readLine();
                    } while(YesOrNo.equalsIgnoreCase("Y"));
                    break;
                case 2: // Vapes
                    do{
                        System.out.println( line + "\n\t\t\t\t\tAvailable Vapes:\n");
                        System.out.println("\t\t\t\t\t   [1] Argus Pro - P1500");
                        System.out.println("\t\t\t\t\t   [2] Drag X2 - P1700");
                        System.out.println("\t\t\t\t\t   [3] Aegis Legend - P2100");

                        try {
                            System.out.print("\n\t\t\t\t\tEnter your choice: ");
                            choice = Integer.parseInt(input.readLine());
                            System.out.print("\t\t\t\t\tEnter your quantity: ");
                            quantity = Integer.parseInt(input.readLine());
                            switch(choice){
                                case 1: 
                                    item += (1500 * quantity); // item = item + 1500 * quantity
                                    break;
                                case 2: 
                                    item += (1700 * quantity);
                                    break;
                                case 3: 
                                    item += (2100 * quantity);
                                    break;
                                default:
                                    System.out.println("\t\t\t\t\tInvalid input pare.");
                            }
                        } catch(Exception A) {
                            System.out.println("\t\t\t\t\tTanga mali! Ulitin mo!");
                        }
                        System.out.print("\t\t\t\t\tDo you want to buy another vape? [ Y / N ]: ");
                        YesOrNo = input.readLine();
                    } while(YesOrNo.equalsIgnoreCase("Y"));
                    break;
                case 3: // Payments
                    System.out.println("\t\t\t\t\tAng kelangan mong bayaran ay : P"+ item);
                    try{
                        System.out.print("\t\t\t\t\tMagkano pera mo tol?! P");
                        pera = Integer.parseInt(input.readLine());

                        if(pera < item){
                            System.out.println("\t\t\t\t\tHanep na yan kulang pera mo tol!");
                        } else if(pera == item){
                            System.out.println("\t\t\t\t\tAngas mo pre sakto pera mo");
                        } else if(pera == 0){
                            System.out.println("\t\t\t\t\tTanga wala kang pera");
                        } else {
                            change = pera - item;
                            System.out.println("\t\t\t\t\tMay sukli ka pa brad na P" + change);
                        }
                    } catch(Exception A){
                        System.out.println("\t\t\t\t\tTanga mali! Ulitin mo!");
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("\t\t\t\t\tTanga mo naman kita mong 1-4 lang pipili ka ng wala sa pamilian. BOBO!\n");
                    //System.exit(0);
                    break;
            }
            System.out.println(line + "\t\t\t\t\tTo Pay: " + item + line);
        }while (true);
    }
}
