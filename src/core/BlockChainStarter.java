package core;

import util.Util;

public class BlockChainStarter {
	public static void main(String[] args) {
		// 블록체인의 진입점 역할
		int nonce = 0;

		while (true) {
			if (Util.getHash(nonce + "").substring(0, 6).equals("000000")) { // 채굴 난이도를 조절 가능
				System.out.println("정답 : " + nonce);
				System.out.println("해시 값 : " + Util.getHash(nonce + ""));
				break;
			}
			nonce++;
		}
	}
}
