package epam.oops;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Chocolate extends Newyear {
	@Override
	public  void Giftssetter(String[] giftArray) {
		int frequency=0; 
		List<String> gifts=(List<String>) Arrays.asList(giftArray);
		frequency+=Collections.frequency(gifts, "chocolates");
		super.GiftDeatilssetter("chocolates",frequency);
	}

	@Override
	public String Giftsgetter() {
		return super.GiftDeatilsGetter();
	}


}
