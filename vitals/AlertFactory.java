package vitals;

import java.lang.reflect.InvocationTargetException;
import java.util.ResourceBundle;


public class AlertFactory {
	public static IReporter getAlertInstance() {
		ResourceBundle.clearCache();
		ResourceBundle rb = ResourceBundle.getBundle("vitals.properties.config");
		String strclass = rb.getString("cname");
		IReporter ir = null;
		try {
			Class<?> cls = Class.forName(strclass);
			ir = (IReporter)cls.getDeclaredConstructor().newInstance();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException 
				| InvocationTargetException |NoSuchMethodException e) {
			e.printStackTrace();
		}
		return ir;
	}
}
