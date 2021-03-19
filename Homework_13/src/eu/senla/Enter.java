package eu.senla;

public class Enter {
	
	void enter(Object s) {
        if (s == null) {
            throw new NullPointerException("ISKLUCHAEM, esli yacheyka pusta i vivodim tekst: ");
        }
        System.out.println("Pechataem to chto hranitsia v ARRAY_LISTe: " + s);
	}
}
