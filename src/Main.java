/*
 * Author: Benigno Chihuahua
 * Project: ChemicalBalancer
 * Description: Given an input of any chemical equation, the program will give you the balanced chemical equation;
 * Version 1.0
 */
public class Main {
	static ChemicalElements<String, Double> elems;
	
	public static void main(String []args)
	{
		elems = new ChemicalElements<String, Double>();
		if(args.length > 0)
		{
			for(int i = 0; i < args.length; i++)
			{
				System.out.println("Given an input of: " + args[0] +  ", We were given an output of: " + elems.isChemical(args[i]));
			}
		}
	}
	
}
