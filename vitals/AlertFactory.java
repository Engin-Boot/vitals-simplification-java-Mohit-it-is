package vitals;

import java.lang.reflect.InvocationTargetException;
import java.util.ResourceBundle;
import vitals.AlertService;

public class AlertFactory {
	public static IReporter getAlertInstance() {
		ResourceBundle.clearCache();
		ResourceBundle rb = ResourceBundle.getBundle("resources/config");
		String strclass = rb.getString("cname");
		
		IReporter ir = null;
		try {
<<<<<<< HEAD
			Class<?> cls = Class.forName(strclass);
			ir = (IReporter)cls.getDeclaredConstructor().newInstance();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException 
				| InvocationTargetException |NoSuchMethodException e) {
=======
			Class cls = Class.forName(strclass);
			ir = (IReporter)cls.newInstance();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
>>>>>>> cfde567e921bc699af70e14796fb549b658271b2
			e.printStackTrace();
		}
		return ir;
	}
}
