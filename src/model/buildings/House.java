package model.buildings;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import model.PlayerModel;

import context.GameState;
import control.Control;
import language.UI_Language;
import util.FileUtil;
import util.MyThread;

/**
 * 
 * ���� 1-5�� ƽ�� ���� �̳� ��ҵ��¥ Ħ���¥
 * 
 * @author MOVELIGHTS
 * 
 */
public class House extends Building {

	private int upPrice;
	private String[] nameString = {  UI_Language.getLanguage().getHOUSE_EVENT_1(), UI_Language.getLanguage().getHOUSE_EVENT_2(), UI_Language.getLanguage().getHOUSE_EVENT_3(), UI_Language.getLanguage().getHOUSE_EVENT_4(), UI_Language.getLanguage().getHOUSE_EVENT_5(),  UI_Language.getLanguage().getHOUSE_EVENT_6(), };

	private PlayerModel player;

	public House(int posX, int posY) {
		super(posX, posY);
		this.maxLevel = 5;
	}

	public int getUpLevelPrice() {
		if (this.level == 0) {
			this.upPrice = 500;
		} else {
			this.upPrice = 1000 * this.level;
		}
		return upPrice;
	}
	
	/**
	 * 
	 * ��ȡ�����ܼ�ֵ
	 * 
	 * @return
	 */
	public int getAllPrice() {
		int price = 0;
		for (int i = 0; i <= level; i++) {
			if (this.level == 0) {
				price +=500;
			} else {
				price += 1000 * i;
			}
		}
		return price;
	}

	/**
	 * ˰��
	 * 
	 * @return
	 */
	public int getRevenue() {
		/**
		 * ˰�ʼ��㷽��
		 */
		this.revenue = this.level * (int) (Math.random() * 1000)
				+ (this.level * 300);
		return revenue;
	}

	public String getName() {
		return this.nameString[this.level];
	}

	/**
	 * �����һ������
	 * 
	 * @return
	 */
	public String getUpName() {
		if (this.level >= this.nameString.length - 1) {
			return "null";
		}
		return this.nameString[this.level + 1];
	}

	@Override
	public int getEvent() {
		return GameState.HUOSE_EVENT;
	}
}
