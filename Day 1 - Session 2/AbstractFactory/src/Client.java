import com.debjyoti.abstractclass.Factory;
import com.debjyoti.abstractclass.Headlight;
import com.debjyoti.abstractclass.Tire;
import com.debjyoti.factory.AudiFactory;
import com.debjyoti.factory.FactoryGetter;
import com.debjyoti.factory.MercedesFactory;

public class Client {

	public static void main(String[] args) {
		Factory factory = FactoryGetter.getFactory(MercedesFactory.class);
		
		Headlight headlight = factory.makeHeadlight();
		Tire tire = factory.makeTire();
		System.out.println(headlight);
		System.out.println(tire);
		
		factory = FactoryGetter.getFactory(AudiFactory.class);
		headlight = factory.makeHeadlight();
		tire = factory.makeTire();
		System.out.println(headlight);
		System.out.println(tire);
	}
	
}
