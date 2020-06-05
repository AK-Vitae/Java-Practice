package datastructures.linkedlists;

public class StringNode {
	public String data;
	public StringNode next;

	public StringNode(String data, StringNode next) {
		this.data = data;
		this.next = next;
	}

	public StringNode(String data) {
		this.data = data;
		this.next = null;
	}

	public String toString() {
		return data + "";
	}

}
