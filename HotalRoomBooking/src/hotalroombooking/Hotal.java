/*r
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotalroombooking;


import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author abdel
 */
public class Hotal extends Room {
    
    private int num_pf_people;  //number of people want to reserve to show his the suitable room
    private String SelectedRoom;  //store the room that the gust select
    private int TotalPrice; // the price of staying
    private int NightsNum;
    private long CreditNum;
    User u = new User();

    public Hotal() {
        u.INFO();
        System.out.println("\t\t\t\t\t\t\t\t\t\t\tWELCOME TO ICLUB HOTAL\n");
        System.out.println("PUBLIC SERVICES:\n\n  #GYM  #RESTURANT  #ROOM SERVICE\n\n  #SERVICE FOR PEOPLE WITH SPECIAL NEEDS\n\n  #NON_SMOKING ROOMS  #CAR PARKING  #GOOD BREAKFAST\n");
        publicroomservices();
    }

    public void selectroom() {
      x: while(true){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number Of People You Want In Room:");
        try {
            num_pf_people = s.nextInt();
            if (num_pf_people > 5 || num_pf_people < 1) {
                System.out.println("Sorry There Are No Room Fit For This Number,From 1 To 5 Only");
                continue x;
            }
            else{
                
            }
        } catch (Exception e) {
            System.out.println("invalid value");
            continue x;
        }
        // Depend on The Room The the number the user put the Suitable room for the number will be shown
        if (num_pf_people == 1) {
            System.out.print("1.");
            onepersnroom();
            
            c: while (true) {
                System.out.print("To Book Enter 1:");
                try {
                    s = new Scanner(System.in);
                    int num = s.nextInt();
                    if (num == 1) {
                        if (Integer.parseInt(room[0][5])!=0){
                        SelectedRoom = room[0][0];
                        TotalPrice = Integer.parseInt(room[0][3]);
                        NightsNumber();
                        time();
                        System.out.println("\nBooking Done Successfully");
                        DisplayReceipt();
                        break x;
                        }
                        else {
                            System.out.println("Sorry There Are No Kind Of This Room Avilable Now\nYou Can Book Another Room");
                            break x;
                        }
                    } else {
                        System.out.println("Invalid Room Number");
                        continue c;
                    }
                } catch (Exception e) {
                    System.out.println("Invaid value");
                    continue c;
                }
            }
        } else if (num_pf_people == 2) {
            System.out.print("1.");
            doubleroom();
            y:
            while (true) {
                System.out.print("To Book Enter 1:");
                try {
                    s = new Scanner(System.in);
                    int num = s.nextInt();
                    if (num == 1) {
                        if (Integer.parseInt(room[1][5])!=0){
                        SelectedRoom = room[1][0];
                        TotalPrice = Integer.parseInt(room[1][3]);
                        NightsNumber();
                        time();
                        System.out.println("\nBooking Done Successfully");
                        DisplayReceipt();
                        break x;
                        }
                        else {
                            System.out.println("Sorry There Are No Kind Of This Room Avilable Now\nYou Can Book Another Room");
                            continue x;
                        }
                    } else {
                        System.out.println("Invalid Room Number");
                        continue y;
                    }
                } catch (Exception e) {
                    System.out.println("Invaid value");
                    continue y;
                }
            }
        } else if (num_pf_people == 3 || num_pf_people == 4) {
            System.out.print("1.");
            familyroom();
            System.out.print("2.");
            suite();
            System.out.print("3.");
            fancysuite();
            z:
            while (true) {
                System.out.print("To Book Enter Number Of The Room You Want:");
                try {
                    s = new Scanner(System.in);
                    int num = s.nextInt();
                    if (num == 1 || num == 2 || num == 3) {
                        if (Integer.parseInt(room[num+1][5])!=0){
                        SelectedRoom = room[num + 1][0];
                        TotalPrice = Integer.parseInt(room[num + 1][3]);
                        NightsNumber();
                        time();
                        System.out.println("\nBooking Done Successfully");
                        DisplayReceipt();
                        break x;
                        }
                        else {
                            System.out.println("Sorry There Are No Kind Of This Room Avilable Now\nYou Can Book Another Room");
                            continue x;
                        }
                    } else {
                        System.out.println("Invalid Room Number");
                        System.out.println("Enter Between 1 , 2 Or 3");
                        continue z;
                    }
                } catch (Exception e) {
                    System.out.println("Invaid value");
                    continue z;
                }
            }
        } else if (num_pf_people == 5) {
            System.out.print("1.");
            suite();
            System.out.print("2.");
            fancysuite();
            w:
            while (true) {
                System.out.print("To Book Enter Number Of The Room You Want:");
                try {
                    s = new Scanner(System.in);
                    int num = s.nextInt();
                    if (num == 1 || num == 2) {
                        if(Integer.parseInt(room[num+2][5])!=0){
                        SelectedRoom = room[num + 2][0];
                        TotalPrice = Integer.parseInt(room[num + 2][3]);
                        NightsNumber();
                        time();
                        System.out.println("\nBooking Done Successfully");
                        DisplayReceipt();
                        break x;
                        }
                        else {
                            System.out.println("Sorry There Are No Kind Of This Room Avilable Now\nYou Can Book Another Room");
                            continue x;
                        }
                    } else {
                        System.out.println("Invalid Room Number");
                        System.out.println("Enter Between 1 Or 2");

                        continue w;
                    }
                } catch (Exception e) {
                    System.out.println("Invaid value");
                    continue w;
                }
            }
        }
    }
    }

    public void Book() {
        Scanner s = new Scanner(System.in);
        System.out.print("Do you Want To Book Or Quit The Program \n To Book Enter 1 To Quit Enter 0:");
        try {
            int Book = s.nextInt();
            if (Book == 1) {
                selectroom();
            } else if (Book == 0) {
                System.exit(0);
            } else {
                System.out.println("Invalid Number");
                Book();
            }
        } catch (Exception e) {
            System.out.println("Invallid Value ");
            Book();
        }
    }

    public void Reviwe() {
        System.out.print("Do You Want To have a Reviwe About Rooms And See Avilable Rooms First? \n  If Yes Enter 1, If you want To Book Enter 2, If You Want To Quit The Program Enter 0:");
        Scanner s = new Scanner(System.in);
        try {
            int in = s.nextInt();
            if (in == 1) {
                displayRooms();
                Book();
            } else if (in == 2) {
                selectroom();
            } else if (in == 0) {
                System.exit(in);
            } else {
                System.out.println("Invalid Number");
                Reviwe();
            }
        } catch (Exception e) {
            System.out.println("\nInvalid input");
            Reviwe();
        }
    }

    public void NightsNumber() {
        System.out.println("How Many Nights Will You Stay");
        Scanner s = new Scanner(System.in);
        if (s.hasNextInt()) {
            NightsNum = s.nextInt();
            if (NightsNum < 1 || NightsNum > 7) {
                System.out.println("Sorry,You Can Reserve At most For One Week,You Can Renew The Reservation After That");
                NightsNumber();
            } else {

            }
        } else {
            System.out.println("Invalid value");
            NightsNumber();
        }
    }

    public void DisplayReceipt() {

        System.out.printf("\nYou Reserved %s For %d Nights\nYour Recipt is %d $\n", SelectedRoom, NightsNum, TotalPrice * NightsNum);
        System.out.println("Do You Want To Pay By Credit Card Or Cash\nBy Credit Card Enter 1,By Cash Enter 2 ");
        Scanner s;
        x:
        while (true) {
            s = new Scanner(System.in);
            if (s.hasNextInt()) {
                int input = s.nextInt();
                if (input == 1) {
                    y:
                    while (true) {
                        s = new Scanner(System.in);
                        System.out.print("Enetr Your Credit Number:");
                        try {
                            CreditNum = s.nextLong();
                            if (CreditNum < 1 || CreditNum > Long.MAX_VALUE) {
                                System.out.println("Invalid Value");
                                continue y;
                            } else {
                                break x;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid Value");
                            continue y;
                        }
                    }
                } else if (input == 2) {
                    System.out.println("Thank You,Good Bye :)");
                    System.exit(0);
                } else {
                    System.out.println("Invalid Number");
                }
            } else {
                System.out.println("invalid Input");
                continue x;
            }

        }
        while (true) {
            System.out.print("Enetr The Password:");
            s = new Scanner(System.in);
            try {
                int pass = s.nextInt();
                if (pass <0 || pass > 9999) {
                    System.out.println("Worng Pass,Form 0 To 9999");
                    continue;
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid Value");
                continue;
            }

        }
        System.out.printf("Thank You Mr %s We Will Contact With You By Your Mail(%s)\nGood Bye :)\n", u.getUsername(), u.getEmail());
    }
    
    public void time(){
        Scanner s;
        int time;
        Date d=new Date();
        System.out.println("Today Date IS "+d.toGMTString());
        System.out.println("In How Many Days You Want Your Reservation To Start?");
        while (true) {            
            s=new Scanner(System.in);
            try {
                s=new Scanner(System.in);
                time =s.nextInt();
                if (time <2 || time >20){
                    System.out.println("Sorry You Can't Reserve During This Whlie\nYou can Book At Least 2 Days Or At Most 20 Days Before Your Reservation");
                    continue;
                }
                else{
                    d.setDate(d.getDate()+time);
                    
                    System.out.print("Your Reservation Will Start At "+d.toGMTString());
                    d.setDate(d.getDate()+NightsNum);
                    System.out.print(" And End At "+d.toGMTString());
                    
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid Value");
                continue;
            }
        }
        
    }
    

    
}
