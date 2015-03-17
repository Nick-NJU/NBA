package presentation.button;

import java.awt.Dimension;

import presentation.common.ImgSys;
import presentation.common.MyButton;

/**
 * 球员排序按钮
 * @author HCW
 *
 */
public class Player_SortButton extends MyButton{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * @param name
	 * @param dimension
	 * @param x
	 * @param y
	 */
	public Player_SortButton(String name, Dimension dimension, int x, int y) {
		super(name, dimension, x, y);
		setImg(ImgSys.player_sort);
		setPressedImg(ImgSys.player_sort_selected);
		setRolloverImg(ImgSys.player_sort_selected);
	}

	@Override
	protected void enter() {
		// TODO Auto-generated method stub
		super.enter();
	}

	@Override
	protected void click() {
		// TODO Auto-generated method stub
		super.click();
	}
	
}
