import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {

	public static void main(String[] args) {

		char[] nameArray = {'M', 'A', 'R', 'C'};
		
		List<Character> name = new ArrayList<Character>();
		for (char c : nameArray) {
			name.add(c);
		}
		
		List<Character> surname = new ArrayList<Character>();
		surname.add('P');
		surname.add('L');
		surname.add('A');
		surname.add('N');
		surname.add('S');

		
		phase1(nameArray);
		System.out.println();
		
		phase2(name);
		System.out.println();
		
		phase3(name);
		System.out.println();
		
		phase4(name, surname);
	}
	
	
	/* 
	 * Crea una taula (char[]) amb el teu nom on cada posició correspongui a una lletra
	 * Fes un bucle que recorri aquesta taula i mostri per consola cadascuna de les lletres
	 */
	public static void phase1(char[] nameArray) {
		for (char c : nameArray) {
			System.out.println(c);
		}
	}
		
		
	/* 
	 * Canvia la taula per una llista (List<Character>)
	 * Al bucle, si la lletra és una vocal imprimeix a la consola: ‘VOCAL’. Sinó, imprimeix: ‘CONSONANT’
	 * Si trobes un numero, mostra per pantalla: ‘Els noms de persones no contenen números!’
	 */
	public static void phase2(List<Character> nameList) {
		for (Character c : nameList) {
			String refString = "aeiouAEIOU";
			if (refString.contains(Character.toString(c))) {
				System.out.println("VOCAL");
			}
			refString = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
			if (refString.contains(Character.toString(c))) {
				System.out.println("CONSONANT");
			}
			refString = "123456789";
			if (refString.contains(Character.toString(c))) {
				System.out.println("Els noms de persones no contenen números!");
			}
		}
	}
		
	
	/* 
	 * Emmagatzemar en un Map tant les lletres de la llista com el nombre de vegades que apareixen
	 */
	public static void phase3(List<Character> nameList) {
		Map<Character, Integer> nameMap = new HashMap<Character, Integer>();		
		for (Character c : nameList) {
			if (nameMap.containsKey(c)){
				nameMap.put(c, nameMap.get(c) + 1);
			} else {
				nameMap.put(c, 1);
			}
		}
		System.out.println(nameMap.toString());
	}
	
	
	/* 
	 * Crea una altra llista amb el teu cognom on cada posició correspongui a una lletra
	 * Fusiona les dues llistes en una sola. A més, afegeix una posició amb un espai buit 
	 * entre la primera i la segona. És a dir, partim de la llista name i surname i al 
	 * acabar l’execució només tindrem una que es dirà fullName
	 */
	public static void phase4(List<Character> nameList, List<Character> surnameList) {
		List<Character> fullName = new ArrayList<Character>();
		fullName.addAll(nameList);
		fullName.add(' ');
		fullName.addAll(surnameList);
		System.out.println("FullName:" + fullName.toString());
	}
}
