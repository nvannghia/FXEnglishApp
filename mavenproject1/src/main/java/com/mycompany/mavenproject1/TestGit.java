/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Joe
 */
public class TestGit {
    private String username;
    private String password;
    
    public TestGit(String usn, String pass){
        this.username = usn;
        this.password = pass;
    }

    public static void main(String[] args) {
        TestGit tg = new TestGit("root", "123456789");
        System.out.printf("User name = %s\n Password = %s",tg.username,tg.password);
    }
}
