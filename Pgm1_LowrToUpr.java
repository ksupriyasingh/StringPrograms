package com.pmg;

public class Pgm1_LowrToUpr {
	public static void main(String[] args) {
		
		String str="StringProgramTOConvertLowerToUper";
		
		char[] c=str.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>=97 && c[i]<=122)
			{
				c[i]=(char)((int)c[i]-32);
			}
			System.out.print(c[i]);
		}
		
	}

}
