<<<<<<< Updated upstream
// Hashing Implemenation

// Hashing is a technique of storing data in a list or table such that stored data can be found in single comparison or in very few comparisons. Several methods are defined to store data in a list: division by prime number, folding individual digits of the given data, etc.
// It is very possible that two or more data hash to same position, that is, hash method produce same hash values for different elements, this situation is known as Hash Collision.
// Hash collision can be reduced by considering big prime number to division given data; probing methods can be used to address hash collisions.
// Following program uses division by prime number to hash given elements, and quadratic probing to resolve collision.
// List of numbers are stored in array named keys, those keys are stored or hash to list name table of size 100. Prime number 97 is used to divide given elements.

import java.util.*;

class hashing_Demo
{
	public static void main(String[] aa){
		int keys [] = {111,14,222,333,423,4556,6777,8889,3232,4345,46787};
		int table[] = new int[100];
		int i,prime=97,hashvalue=0;
		for(i=0;i<keys.length;i++){
			hashvalue = keys[i] % prime;
			if(table[hashvalue]==0)
				table[hashvalue] = keys[i];
			else{
				for(int j=1;j<100;j=j*j){
					if(table[hashvalue+j]==0){
						table[hashvalue+j] = keys[i];
						break;
					}
				}
			}
		}
		for(i=0;i<table.length;i++){
			System.out.print(" "+table[i]);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value to search: ");
		int search = sc.nextInt();
		hashvalue = search % prime;
		if(table[hashvalue] == search)
			System.out.println("Found at"+hashvalue);
		else{
			for(int j=1;j<100;j=j*j){
				if(table[hashvalue+j]==search){
					System.out.println("Found at"+(hashvalue+j));
					break;
				}
			}
		}
	}
}
=======
import java.util.Scanner;

public class Hashing {
    public static void main(String[] args) {
        int keys[] = {23,67,78,87,879,23};
        int table[] = new int[100];
        int i, prime = 119;
        int hashvalue = 0;
        for ( i = 0; i < keys.length; i++) {
            hashvalue = keys[i] % prime;
            table[hashvalue] = keys[i];
        }
        for ( i = 0; i < table.length; i++) {
            System.out.println(" " + table[i]);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value to search");
        int search = sc.nextInt();
        hashvalue = search % prime;
        if (table [hashvalue] == search) {
            System.out.println("Found at " + hashvalue);
            
        }
    }
}
>>>>>>> Stashed changes
