package model.card;

import javax.swing.JOptionPane;

import context.GameState;
import language.UI_Language;
import model.PlayerModel;

/**
 * 
 * �ڹ꿨,�����ֻ��Լ�ʹ�Þ���������׌���ֻ��Լ��B�m����ֻ��һ����
 * 
 * һ����������������������ͣ����Ч�������า�w��
 * 
 */
public class TortoiseCard extends Card {

	private int life = 3;

	public TortoiseCard(PlayerModel owner) {
		super(owner);
		this.name = "TortoiseCard";
		this.cName = UI_Language.getLanguage().getTCC_EVENT_1();
		this.price = 50;
	}

	@Override
	public int useCard() {
		return GameState.CARD_TORTOISE;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	/**
	 * 
	 * ��Ƭ����Ч��
	 * 
	 */
	@Override
	public int cardBuff() {
		/*
		// �����ı���ʾ
		this.owner.showTextTip(this.owner.getName() + " ��\"�ڹ꿨\" ���ã�ֻ���ƶ�һ��.. ", 2);
		this.owner.getRunning().setPoint(1);
		if (life < 0) {
			this.owner.getEffectCards().remove(this);
		}
		*/
		return GameState.CARD_BUFF_TORTOISE;
	}
}
