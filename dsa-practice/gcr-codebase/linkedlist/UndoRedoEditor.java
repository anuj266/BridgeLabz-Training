package linkedlist;

class TextNode {
	String text;
	TextNode prev;
	TextNode next;

	TextNode(String text) {
		this.text = text;
		this.prev = null;
		this.next = null;
	}
}

public class UndoRedoEditor {
	TextNode head;
	TextNode tail;
	TextNode current;
	int size = 0;
	final int MAX_SIZE = 10;

	void addState(String newText) {

		TextNode newNode = new TextNode(newText);

		if (current != null && current.next != null) {
			current.next.prev = null;
			current.next = null;
			tail = current;
			size = countNodes();
		}

		if (head == null) {
			head = tail = current = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
			current = newNode;
		}

		size++;

		if (size > MAX_SIZE) {
			head = head.next;
			head.prev = null;
			size--;
		}
	}

	void undo() {
		if (current != null && current.prev != null) {
			current = current.prev;
		} else {
			System.out.println("Nothing to undo");
		}
	}

	void redo() {
		if (current != null && current.next != null) {
			current = current.next;
		} else {
			System.out.println("Nothing to redo");
		}
	}

	void showCurrentState() {
		if (current != null) {
			System.out.println("Current Text: " + current.text);
		} else {
			System.out.println("Editor is empty");
		}
	}

	int countNodes() {
		int count = 0;
		TextNode temp = head;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public static void main(String[] args) {

		UndoRedoEditor editor = new UndoRedoEditor();

		editor.addState("Hello");
		editor.addState("Hello World");
		editor.addState("Hello World Java");

		editor.showCurrentState();

		editor.undo();
		editor.showCurrentState();

		editor.undo();
		editor.showCurrentState();

		editor.redo();
		editor.showCurrentState();

		editor.addState("Hello World Java DS");
		editor.showCurrentState();
	}
}
