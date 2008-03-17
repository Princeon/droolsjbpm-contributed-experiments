package id3;

public class Util {
	
	public static String ntimes(String s,int n){
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < n; i++) {
			buf.append(s);
		}
		return buf.toString();
	}
	
	//private static HashSet<String> simpletype = new HashSet<String>(0);
	public static boolean isSimpleType(String type_name) {
//		simpletype.contains(type_name)
		if (type_name.equalsIgnoreCase("boolean") ||
			type_name.equalsIgnoreCase("int") ||
			type_name.equalsIgnoreCase("double") ||
			type_name.equalsIgnoreCase("float") ||
			type_name.equalsIgnoreCase("java.lang.String"))
			return true;
		return false;
	}

	public static boolean isGetter(String method_name) {
		if (method_name.startsWith("get") || method_name.startsWith("is") )
			return true;
		return false;
	}

	public static String getAttributeName(String method_name) {
		if (method_name.startsWith("get"))
			return method_name.substring(3, method_name.length()).toLowerCase();
		else if (method_name.startsWith("is"))
			return method_name.substring(2, method_name.length()).toLowerCase();
		return null;
	}

	public static double log2(double prob) {
		return Math.log(prob) / Math.log(2);
	}

}