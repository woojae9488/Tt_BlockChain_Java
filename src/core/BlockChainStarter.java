package core;

import util.Util;

public class BlockChainStarter {
	public static void main(String[] args) {
		// ���ü���� ������ ����
		int nonce = 0;

		while (true) {
			if (Util.getHash(nonce + "").substring(0, 6).equals("000000")) { // ä�� ���̵��� ���� ����
				System.out.println("���� : " + nonce);
				System.out.println("�ؽ� �� : " + Util.getHash(nonce + ""));
				break;
			}
			nonce++;
		}
	}
}
