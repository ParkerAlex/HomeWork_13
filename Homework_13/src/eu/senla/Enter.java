package eu.senla;

public class Enter {
	
	void enter(Object s) {
        if (s == null) {
            throw new NullPointerException("���������, ���� ������ ����� � ������� ���������: ");
        }
        System.out.println("��������, ��� �������� � ARRAY_LISTe: " + s);
	}
}
