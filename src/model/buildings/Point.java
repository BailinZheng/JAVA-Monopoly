package model.buildings;

import model.PlayerModel;
import model.TextTipModel;
import context.GameState;
import control.Control;
import language.UI_Language;

/**
 * 
 * 10 30 50 ���λ ��ɫ������λ��ʱ�򣬿��Ի����Ӧ ��� �Ľ��
 * 
 * 
 * @author MOVELIGHTS
 * 
 */
public class Point extends Building {

	private int point;


	public Point(int posX, int posY, int point) {
		super(posX, posY);
		this.name = point + UI_Language.getLanguage().getPOINT_EVENT_1();
		this.point = point;
	}

	public int getPoint() {
		return point;
	}

	@Override
	public int getEvent() {
		return GameState.POINT_EVENT;
	}
}