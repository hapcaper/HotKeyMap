package com.lzh;

public  enum KeyRecord {
	Q(0,'Q'), W(0,'W'), E(0,'E'), R(0,'R'), T(0,'T'), Y(0,'Y'), U(0,'U'), I(0,'I'),
	O(0,'O'), P(0,'P'), A(0,'A'), S(0,'S'), D(0,'D'), F(0,'F'), G(0,'G'), H(0,'H'),
	J(0,'J'), K(0,'K'), L(0,'L'), Z(0,'Z'), X(0,'X'), C(0,'C'), V(0,'V'), B(0,'B'),
	N(0,'N'), M(0,'M');

	int num;
	char c;

	KeyRecord(int num, char c) {
		this.num = num;
		this.c = c;

	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public char getC() {
		return c;
	}
}
