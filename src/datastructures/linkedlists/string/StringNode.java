package datastructures.linkedlists.string;

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

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public StringNode getNext() {
		return next;
	}

	public void setNext(StringNode next) {
		this.next = next;
	}

	public String toString() {
		return data + "";
	}

}
