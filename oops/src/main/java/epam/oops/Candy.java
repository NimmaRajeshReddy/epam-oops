package epam.oops;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Candy extends Newyear{
	public  void Giftssetter(String[] giftArray) {
		// TODO Auto-generated method stub
		int frequency=0; 
		List<String> gifts=(List<String>) Arrays.asList(giftArray);
		frequency+=Collections.frequency(gifts, "candy");
		super.GiftDeatilssetter("candies",frequency);
	}
	@Override
	public String Giftsgetter() {
		return super.GiftDeatilsGetter();
		// TODO Auto-generated method stub
		
	}

}
