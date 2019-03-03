package core;

import java.util.ArrayList;

public class BlockChainStarter {
	public static void main(String[] args) {
		// ���ü���� ������ ����

		Block block1 = new Block(1, null, 0, new ArrayList());
		block1.mine();
		block1.getInformation();

		Block block2 = new Block(2, block1.getBlockHash(), 0, new ArrayList());
		block2.addTransaction(new Transaction("A", "B", 1.5));
		block2.addTransaction(new Transaction("C", "B", 0.7));
		block2.mine();
		block2.getInformation();

		Block block3 = new Block(3, block2.getBlockHash(), 0, new ArrayList());
		block3.addTransaction(new Transaction("D", "E", 8.2));
		block3.addTransaction(new Transaction("B", "A", 0.4));
		block3.mine();
		block3.getInformation();

		Block block4 = new Block(4, block3.getBlockHash(), 0, new ArrayList());
		block4.addTransaction(new Transaction("E", "D", 0.1));
		block4.mine();
		block4.getInformation();
	}
}
