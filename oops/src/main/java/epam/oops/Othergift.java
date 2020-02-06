package epam.oops;

public class Othergift extends Newyear{
	@Override
	public  void Giftssetter(String[] giftArray) {
		int frequency=0; 
		for(String gift:giftArray) {
			if(gift==null)
				break;
			if(!(gift.contains("candie")) && !(gift.contains("candies")) && !(gift.contains("candy")) && !(gift.contains("choco")) && !(gift.contains("chocolates")) && !(gift.contains("chocolate")))
				frequency++;
		}
		super.GiftDeatilssetter("Other Gifts",frequency);
	}

	@Override
	public String Giftsgetter() {
		return super.GiftDeatilsGetter();
	}


}
