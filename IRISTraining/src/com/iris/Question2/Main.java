package com.iris.Question2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Main {
	
	public static void main(String... arg) {
		BankAccount[] array = new BankAccount[10];
		
		Comparator<BankAccount> comp = new Comparator<BankAccount>() {
			
			@Override
			public int compare(BankAccount o1, BankAccount o2) {
				// TODO Auto-generated method stub
				return o1.account_holder_name.equalsIgnoreCase(o2.account_holder_name) ? -1 : 1;
			}
		};
		
		array[0] = new BankAccount();
		array[0].setAccount_holder_name("Niranjan Kachare");
		array[0].setContact_number("9789456123");
		array[0].setCurrent_balance(136482.25);
		array[0].setPostal_address("Bijlinagar, Chinchwad, Pune-411033");
		
		array[1] = new BankAccount();
		array[1].setAccount_holder_name("Pratiksha Kachare");
		array[1].setContact_number("8944526123");
		array[1].setCurrent_balance(136482.25);
		array[1].setPostal_address("Bijlinagar, Chinchwad, Pune-411033");
		
		array[2] = new BankAccount();
		array[2].setAccount_holder_name("Robert");
		array[2].setContact_number("9789456123");
		array[2].setCurrent_balance(136482.25);
		array[2].setPostal_address("Bijlinagar, Chinchwad, Pune-411033");
		
		array[3] = new BankAccount();
		array[3].setAccount_holder_name("Ellie Puge");
		array[3].setContact_number("789456123");
		array[3].setCurrent_balance(136482.25);
		array[3].setPostal_address("Bijlinagar, Chinchwad, Pune-411033");
		
		array[4] = new BankAccount();
		array[4].setAccount_holder_name("Laura Petrauskaite");
		array[4].setContact_number("9789456123");
		array[4].setCurrent_balance(136482.25);
		array[4].setPostal_address("Bijlinagar, Chinchwad, Pune-411033");
		
		array[5] = new BankAccount();
		array[5].setAccount_holder_name("Steven Wilford");
		array[5].setContact_number("9989456123");
		array[5].setCurrent_balance(136482.25);
		array[5].setPostal_address("Bijlinagar, Pune-410356");
		
		array[6] = new BankAccount();
		array[6].setAccount_holder_name("Viraj");
		array[6].setContact_number("945546123");
		array[6].setCurrent_balance(136482.25);
		array[6].setPostal_address("Bijlinagar, Chinchwad, Pune-411033");
		
		array[7] = new BankAccount();
		array[7].setAccount_holder_name("John Lindley");
		array[7].setContact_number("9976856123");
		array[7].setCurrent_balance(136482.25);
		array[7].setPostal_address("Bijlinagar, Chinchwad, Pune-411033");
		
		array[8] = new BankAccount();
		array[8].setAccount_holder_name("Vishal");
		array[8].setContact_number("9889456123");
		array[8].setCurrent_balance(136482.25);
		array[8].setPostal_address("Bijlinagar, Chinchwad, Pune-411033");
		
		array[9] = new BankAccount();
		array[9].setAccount_holder_name("Sweta");
		array[9].setContact_number("9657456123");
		array[9].setCurrent_balance(136482.25);
		array[9].setPostal_address("Bijlinagar, Chinchwad, Pune-411033");
		
		Arrays.sort(array, comp);
		
//		for(BankAccount a : array) {
//			System.out.println(a.account_holder_name);
//		}
		Stream.of(array).map(a -> a.getAccount_holder_name()).forEach(System.out::println);
	}
}
