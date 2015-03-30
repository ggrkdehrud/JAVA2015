package control;

import entity.CMember;
import view.CLoginView;

public class CLoginControl {
	private CMember member;
	public CMember login(CMember member) {
		this.member=member;
		return this.member;
	}
}
