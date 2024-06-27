package com.linearSearch;

public class SearchInStrings {

	public static void main(String[] args) {
		String name="Saksham";
		char target='h';
		
		System.out.println("IsPresent "+linearSearch(name,target));

	}

	private static boolean linearSearch(String name, char target) {
		// TODO Auto-generated method stub
		if(name.length()==0)
			return false;
		for(int i=0;i<name.length();i++)
		{
			if(target==name.charAt(i))
				return true;
		}
		return false;
	}

}
