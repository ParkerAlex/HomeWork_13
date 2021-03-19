package eu.senla;

public class Enter {
	
	void enter(Object s) {
        if (s == null) {
            throw new NullPointerException("ИСКЛЮЧАЕМ, ЕСЛИ ЯЧЕЙКА ПУСТА И ВЫВОДИМ СООБЩЕНИЕ: ");
        }
        System.out.println("Печатаем, что хранится в ARRAY_LISTe: " + s);
	}
}
