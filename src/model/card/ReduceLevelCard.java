package model.card;

import javax.swing.JOptionPane;

import context.GameState;
import language.UI_Language;
import model.PlayerModel;
import model.buildings.Building;

/**
 * 
 * ������,��ǰ���ݽ���һ�������֣�
 * OK
 *
 */
public class ReduceLevelCard extends Card{

	public ReduceLevelCard(PlayerModel owner) {
		super(owner);
		this.name = "ReduceLevelCard";
		this.cName = UI_Language.getLanguage().getRDL_EVENT_1();
		this.price = 30;
	}

	@Override
	public int useCard() {
		return GameState.CARD_REDUCELEVEL;
		}

}