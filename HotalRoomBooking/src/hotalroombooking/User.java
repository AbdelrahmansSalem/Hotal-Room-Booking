/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotalroombooking;

import java.util.Scanner;

/**
 *
 * @author abdel
 */
public class User {

    Scanner s = new Scanner(System.in);
    private String username;
    private String email;
    private long phoneNum;
    private int age;
    private long ssd;

    public User() {
    }

    public void username() {
        System.out.print("YOUR NAME :");
        username = s.nextLine();
        if (username.isEmpty()){
           System.out.println("Plese,Enter Your Information Right");
           username();
        }
    }

    public void email() {
        System.out.print("YOUR MAIL :");
        email = s.nextLine();
        if (email.isEmpty()){
            System.out.println("Plese,Enter Your Information Right");
            email();
            
        }
    }

    public void phonenumber() {
        s = new Scanner(System.in);
        System.out.print("YOUR PHONE NUMBER :");
        if (s.hasNextLong()) {
            phoneNum = s.nextLong();
            if (phoneNum <0 || phoneNum >Long.MAX_VALUE) {               
                System.out.println("ENTER A CORRECT NUMBER");
                phonenumber();
            } else {

            }
        } else {
            System.out.println("YOU ENTERED A WRONG VALUE");
            phonenumber();
        }
    }

    public void age() {
        s = new Scanner(System.in);
        System.out.print("YOUR AGE :");
        if (s.hasNextInt()) {
            age = s.nextInt();
            if (age > 100 || age < 18) {
                System.out.println("ENTER A NUMBER BETWEEN 18 TO 100");
                age();
            }
        } else {
            System.out.println("YOU ENTERED A WRONG VALUE");
            age();
        }
    }

    public void ssd() {
        s = new Scanner(System.in);
        System.out.print("YOUR SSD NUMBER :");
        if (s.hasNextLong()) {
            ssd = s.nextLong();
            if (phoneNum > Long.MAX_VALUE || ssd < 0) {
                System.out.println("ENTER A CORRECT NUMBER");
                ssd();
            } else {

            }
        } else {
            System.out.println("YOU ENTERED A WRONG VALUE");
            ssd();
        }
    }

    public void INFO() {
        username();
        email();
        ssd();
        phonenumber();
        age();
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public int getAge() {
        return age;
    }

    public long getSsd() {
        return ssd;
    }

}
