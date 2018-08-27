
import java.util.HashMap;
import java.lang.Double;
import java.util.ArrayList;

public class ChemicalElements<chemical, mole> extends HashMap<String, Double> {
	
	private static final int numElements = 118;
	private static final long serialVersionUID = 1998528347754532733L;
	private ArrayList<String> chemicalElements;
	
	public ChemicalElements()
	{
		super();
		chemicalElements = new ArrayList<String>(numElements);
		initializeElements();
	}
	
	public void initializeElements()
	{
		chemicalElements.add("H");
		chemicalElements.add("He");
		chemicalElements.add("Li");
		chemicalElements.add("Be");
		chemicalElements.add("B");
		chemicalElements.add("C");
		chemicalElements.add("N");
		chemicalElements.add("O");
		chemicalElements.add("F");
		chemicalElements.add("Ne");
		chemicalElements.add("Na");
		chemicalElements.add("Mg");
		chemicalElements.add("Al");
		chemicalElements.add("Si");
		chemicalElements.add("P");
		chemicalElements.add("S");
		chemicalElements.add("Cl");
		chemicalElements.add("Ar");
		chemicalElements.add("K");
		chemicalElements.add("Ca");
		chemicalElements.add("Sc");
		chemicalElements.add("Ti");
		chemicalElements.add("V");
		chemicalElements.add("Cr");
		chemicalElements.add("Mn");
		chemicalElements.add("Fe");
		chemicalElements.add("Co");
		chemicalElements.add("Ni");
		chemicalElements.add("Cu");
		chemicalElements.add("Zn");
		chemicalElements.add("Ga");
		chemicalElements.add("Ge");
		chemicalElements.add("As");
		chemicalElements.add("Se");
		chemicalElements.add("Br");
		chemicalElements.add("Kr");
		chemicalElements.add("Rb");
		chemicalElements.add("Sr");
		chemicalElements.add("Y");
		chemicalElements.add("Zr");
		chemicalElements.add("Nb");
		chemicalElements.add("Mo");
		chemicalElements.add("Tc");
		chemicalElements.add("Ru");
		chemicalElements.add("Rh");
		chemicalElements.add("Pd");
		chemicalElements.add("Ag");
		chemicalElements.add("Cd");
		chemicalElements.add("In");
		chemicalElements.add("Sn");
		chemicalElements.add("Sb");
		chemicalElements.add("Te");
		chemicalElements.add("I");
		chemicalElements.add("Xe");
		chemicalElements.add("Cs");
		chemicalElements.add("Ba");
		chemicalElements.add("La");
		chemicalElements.add("Ce");
		chemicalElements.add("Pr");
		chemicalElements.add("Nd");
		chemicalElements.add("Pm");
		chemicalElements.add("Sm");
		chemicalElements.add("Eu");
		chemicalElements.add("Gd");
		chemicalElements.add("Tb");
		chemicalElements.add("Dy");
		chemicalElements.add("Ho");
		chemicalElements.add("Er");
		chemicalElements.add("Tm");
		chemicalElements.add("Yb");
		chemicalElements.add("Lu");
		chemicalElements.add("Hf");
		chemicalElements.add("Ta");
		chemicalElements.add("W");
		chemicalElements.add("Re");
		chemicalElements.add("Os");
		chemicalElements.add("Ir");
		chemicalElements.add("Pt");
		chemicalElements.add("Au");
		chemicalElements.add("Hg");
		chemicalElements.add("Tl");
		chemicalElements.add("Pb");
		chemicalElements.add("Bi");
		chemicalElements.add("Po");
		chemicalElements.add("At");
		chemicalElements.add("Rn");
		chemicalElements.add("Fr");
		chemicalElements.add("Ra");
		chemicalElements.add("Ac");
		chemicalElements.add("Th");
		chemicalElements.add("Pa");
		chemicalElements.add("U");
		chemicalElements.add("Np");
		chemicalElements.add("Pu");
		chemicalElements.add("Am");
		chemicalElements.add("Cm,");
		chemicalElements.add("Bk");
		chemicalElements.add("Cf");
		chemicalElements.add("Es");
		chemicalElements.add("Fm");
		chemicalElements.add("Md");
		chemicalElements.add("No");
		chemicalElements.add("Lr");
		chemicalElements.add("Rf");
		chemicalElements.add("Db");
		chemicalElements.add("Sg");
		chemicalElements.add("Bh");
		chemicalElements.add("Hs");
		chemicalElements.add("Mt");
		chemicalElements.add("Ds");
		chemicalElements.add("Rg");
		chemicalElements.add("Cn");
		chemicalElements.add("Nh");
		chemicalElements.add("Fl");
		chemicalElements.add("Mc");
		chemicalElements.add("Lv");
		chemicalElements.add("Ts");
		chemicalElements.add("Og");
	}
	
	@Override
	public Double put(String key, Double value) {
		try {
			if(!(key instanceof String))
				throw new Exception("The Key must be a chemical string");
			else if(!(value instanceof Double))
				throw new Exception("The value must be a molar mass Double");
			else if(isChemical(key))
				throw new Exception("The key entered must be a chemical element");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		super.put(key, value);
		return value;
	}
	
	public boolean isChemical(String keyStr)
	{
		return chemicalElements.contains(keyStr);
	}
	

}
