package inner;

public class OutInnerStaticRun {
	public static void main(String[] args) {
		
		OutClass.InnerStatic outInstatic = new OutClass.InnerStatic();
		outInstatic.instanceField1 = 10;
		OutClass.InnerStatic.staticField2 = 20;
		
		
	}
}
