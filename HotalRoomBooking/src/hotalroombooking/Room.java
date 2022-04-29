/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotalroombooking;



/**
 *
 * @author abdel
 */
public abstract class Room extends RoomFutures{
   //kinds of Rooms in The hotal
   String [][]room ={
        //room name ,num of people for , size , price for one night,number Of All Rooms,number Of Avilble Room
        {"ONE PERSON ROOM","1","35","40","100",String.valueOf(100-(50+((int)(Math.random()*51))))},
        {"DOUBLE ROOM","2","50","70","100",String.valueOf(100-(50+((int)(Math.random()*51))))},
        {"FAMILY ROOM","4","60","90","75",String.valueOf(75-(50+((int)(Math.random()*26))))},
        {"SUITE","4","75","130","15",String.valueOf(15-(5+((int)(Math.random()*11))))},
        {"FANCY SUITE","4","90","180","10",String.valueOf(10-(5+((int)(Math.random()*6))))}
    };
     
    
    //Every Room have method And have a diffrents Quality 
   
   
   
    public void onepersnroom(){
        System.out.printf("%s FIT FOR %s PERSON..SIZE: %s m\n  ONE INDIVIDUAL BED\n  PRICE FOR ONE NIGHT %s $\n  LOOKING AT GARDEN\n",room[0][0],room[0][1],room[0][2],room[0][3]);
        System.out.println("There Are "+room[0][5]+" Rooms Avilable Now\n");
      
    }
    
    public void doubleroom(){
        System.out.printf("%s FIT FOR %s PERSON..SIZE: %s m\n  ONE DOUBLE BED\n  PRICE FOR ONE NIGHT %s $\n  LOOKING AT GARDEN\n",room[1][0],room[1][1],room[1][2],room[1][3]);
        System.out.println("There Are "+room[1][5]+" Rooms Avilable Now\n");
        

    }
    
    public void familyroom(){
        System.out.printf("%s FIT FOR %s PERSON..SIZE: %s m\n  TWO INDIVIDUAL BED,ONE DOUBLE BED\n  PRICE FOR ONE NIGHT %s $ \n  LOOKING AT GARDEN\n",room[2][0],room[2][1],room[2][2],room[2][3]);     
        System.out.println("There Are "+room[2][5]+" Rooms Avilable Now\n");
        

    } 
    
    public void suite(){
        System.out.printf("%s FIT FOR %s PERSON,#COULD FIT 5 PERSONS...SIZE: %s m\n  TWO INDIVIDUAL BED,ONE DOUBLE BED,A COUCH BED \n  PRICE FOR ONE NIGHT %s $\n  LOOKING AT CITY\n",room[3][0],room[3][1],room[3][2],room[3][3]);
        System.out.println("There Are "+room[3][5]+" Rooms Avilable Now\n");
      

    }
    
    public void fancysuite(){
        
        System.out.printf("%s FIT FOR %s PERSON,#COULD FIT 5 PERSONS...SIZE: %s m\n  TWO INDIVIDUAL BED,ONE DOUBLE BED,A COUCH BED\n  PRICE FOR ONE NIGHT %s $ \n  LOOKING AT SWIMMING POOL\n",room[4][0],room[4][1],room[4][2],room[4][3]);
        System.out.println("There Are "+room[4][5]+" Rooms Avilable Now\n");
        

    }
    
    public void displayRooms(){
        System.out.print("1.");
        onepersnroom();
        System.out.print("2.");
        doubleroom();
        System.out.print("3.");
        familyroom();
        System.out.print("4.");
        suite();
        System.out.print("5.");
        fancysuite();
    }

    
    
}
    
    

