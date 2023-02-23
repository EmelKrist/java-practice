package _7kyu;

/*
https://www.codewars.com/kata/581c6b075cfa83852700021f
 */
public class FunWithLists {
    public static void main(String[] args) {
        System.out.println(indexOf(new Node(3, new Node(2, new Node(2))), 2));
        System.out.println(indexOfAlter(new Node(3, new Node(2, new Node(2))), 2));
    }

    public static int indexOf(Node head, Object value) {
        int indexOf = 0;
        while (head != null) { // пока голова не пустая
            // если данные в голове совпадают с значением
            if (head.data.equals(value)) return indexOf;
            head = head.next; // передвигаем указатель головы
            indexOf++; // инкриминируем индекс
        }
        return -1;
    }

    public static int indexOfAlter(Node head, Object value) {
        for (int indexOf = 0; head != null; head = head.next, indexOf++) {
            if (head.data.equals(value)) return indexOf;
        }
        return -1;
    }
}

class Node {
    public Object data;
    public Node next;

    Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(Object data) { // если задаем последний учел связного списка
        this(data, null);
    }
}