package exam.ex04;

import exam.ex03.Area;

public class GuArea extends Area{
	final double PI = 3.141592;
	
	double guArea(int r) {
		return (4.0/3.0) * PI * r * r * r;
	}
}
