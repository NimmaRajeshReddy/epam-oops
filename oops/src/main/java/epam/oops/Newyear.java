package epam.oops;

public abstract class Newyear {
	private int count;
	private String giftName;
	public void GiftDeatilssetter(String Name,int frequency) {
		giftName=Name;
		count=frequency;
	}
	public String GiftDeatilsGetter() {
		return "GiftName:- "+this.giftName+"\nthe weight of "+ this.giftName+" is = "+this.count;
	}
	public abstract void Giftssetter(String[] giftArray);
	public abstract String Giftsgetter();

}
