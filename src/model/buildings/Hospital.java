package model.buildings;


import model.LandModel;
import model.PlayerModel;
import context.GameState;
import control.Control;
import language.UI_Language;

/**
 * 
 * ҽԺ ��ɫ����˵ص㣬�����ò�����Ժ����ɫסԺ��Ϻ󣬻�����������Ϸ סԺʱ�䣺1 - 4��
 * 
 * 
 * @author MOVELIGHTS
 * 
 */
public class Hospital extends Building {

	private String[] events = {
			UI_Language.getLanguage().getHOSPITAL_EVENT_1(),
			UI_Language.getLanguage().getHOSPITAL_EVENT_2(),
			UI_Language.getLanguage().getHOSPITAL_EVENT_3(),
			UI_Language.getLanguage().getHOSPITAL_EVENT_4(),
	};
	
	public Hospital(int posX, int posY) {
		super(posX, posY);
		this.name = UI_Language.getLanguage().getHOSPITAL_EVENT_5();
	}
	public String[] getEvents() {
		return events;
	}
	@Override
	public int getEvent() {
		/*
		this.player = player;
		int days = (int) (Math.random() * 4) + 2;
		player.setInHospital(days);
		int random = (int) (Math.random() * events.length);
		String text = events[random];
		player.showTextTip(player.getName() + text + "ͣ��" + (days - 1) + "��.", 3);
		new Thread(this).start();
		*/
		return GameState.HOSPITAL_EVENT;
	}
}
