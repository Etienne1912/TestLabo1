/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bonjournom;
import aleatoire.*;
/**
 *
 * @author User
 */
public class BonjourNom {
    public static void main(String[] args) {
        System.out.println("Bonjour Monde!");
        Person personne1 = new Person("Jean","Jacques",37);
        System.out.println(personne1.getFirstName() + personne1.getLastName());
    }

}