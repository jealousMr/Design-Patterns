package SimpleFactoryMode;

public class Factory {
	public static int type_Hy=1;
	public static int type_Ye=2;
	public static Noodles createNoodles(int type) {
		if(type==1)
			return new HyNoodle();
		else
			return new YeNoddle();
	}
	
	
	public static void main(String[]args) {
		Noodles n=Factory.createNoodles(1);
		n.desc();
	}

}
