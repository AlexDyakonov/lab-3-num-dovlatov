package StringMethods;

public final class StringMeth {
    public static String capitalize(String str) {
        if (str == null || str.length() == 0) return str;
    return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
    public static String dot(String str){
        return (str+= ".");
    }
    public static String dotn(String str){
        return (str+= ".\n");
    }
}
