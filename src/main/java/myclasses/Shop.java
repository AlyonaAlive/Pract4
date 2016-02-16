package myclasses;

public class Shop {
	private Shop(){}
	private static class ShopSingletonHolder{
		static Shop instance = new Shop();
	}
	public static Shop getInstance(){
		return ShopSingletonHolder.instance;
	}

}
