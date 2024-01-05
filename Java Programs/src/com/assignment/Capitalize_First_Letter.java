package com.assignment;

import java.util.Scanner;

public class Capitalize_First_Letter {

	public static void main(String[] args) {

		String s1 = "the quick brown fox jumps over the lazy dog";
		
		// Convert String into character array
		char[] ch = s1.toCharArray();
		
		// string can have space
		boolean space = true;
		
		// for loop will run until character length i.e. String
			for(int i=0; i<ch.length;i++)
			{
				// checking at that character it is space or any letter
				if(Character.isLetter(ch[i]))
				{
					if(space)
					{
						 ch[i] = Character.toUpperCase(ch[i]);
						 space = false;
					}
					
				}
				else
				{
					space=true;
				}
			}
		
		// converting again into string
		String s2 = String.valueOf(ch);
		System.out.println(s2);
	}

}
