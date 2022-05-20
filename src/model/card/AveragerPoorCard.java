package model.card;

import javax.swing.JOptionPane;

import context.GameState;
import language.UI_Language;
import model.PlayerModel;

/**
 * 
 * ��ƶ��,��һ������ʹ�þ�ؚ���������c�ˌ���ƽ�֬F��
 * OK
 * 
 */
public class AveragerPoorCard extends Card {

	public AveragerPoorCard(PlayerModel owner) {
		super(owner);
		this.name = "AveragerPoorCard";
		this.cName = UI_Language.getLanguage().getEAC_EVENT_1();
		this.price = 200;
	}

	@Override
	public int useCard() {
		return GameState.CARD_AVERAGERPOOR;
	}

}
