package core;

public class Transaction {
	String sender;
	String receiver;
	double amount;

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Transaction(String sender, String receiver, double amount) {
		super();
		this.sender = sender;
		this.receiver = receiver;
		this.amount = amount;
	}

	public String getInformation() {
		return sender + "��(��) " + receiver + "���� " + amount + "���� ������ ���½��ϴ�.";
	}
}
