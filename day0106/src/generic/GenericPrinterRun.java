package generic;

public class GenericPrinterRun {
	public static void main(String[] args) {
		
		GenericPrinter<Powder> powderPrint = new GenericPrinter<Powder>();
		
		powderPrint.setMaterial(new Powder());
		Powder powder = powderPrint.getMaterial();
		System.out.println("powder = " + powder);
		
		GenericPrinter<Plastic> plasticPrint = new GenericPrinter<Plastic>();
		
		plasticPrint.setMaterial(new Plastic());
		Plastic plastic = plasticPrint.getMaterial();
		System.out.println("plastic = " + plastic);
	}
}
