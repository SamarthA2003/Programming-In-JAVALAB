public class StrBuffer{

    public static void main(String[] args) {
    
        StringBuffer stringBuffer = new StringBuffer("Christ, ");

        
        stringBuffer.append("University");
        System.out.println("append: " + stringBuffer);

    
        stringBuffer.insert(8, "Central");
        System.out.println("insert: " + stringBuffer);


        stringBuffer.replace(5, 8, "Campus");
        System.out.println("replace: " + stringBuffer);

    
        stringBuffer.delete(5, 15);
        System.out.println("delete: " + stringBuffer);


        char charAtIndex = stringBuffer.charAt(6);
        System.out.println("charAt: " + charAtIndex);

        
        stringBuffer.setCharAt(4, 'L');
        System.out.println("setCharAt: " + stringBuffer);

        
        int length = stringBuffer.length();
        System.out.println("length: " + length);
        
        int capacity = stringBuffer.capacity();
        System.out.println("capacity: " + capacity);

        
        stringBuffer.ensureCapacity(25);
        System.out.println("ensureCapacity: " + stringBuffer);

        
        String toStringResult = stringBuffer.toString();
        System.out.println("toString: " + toStringResult);

        
        String substringStartResult = stringBuffer.substring(8);
        System.out.println("substring: " + substringStartResult);

    
        String substringStartEndResult = stringBuffer.substring(1, 9);
        System.out.println("substring(): " + substringStartEndResult);
    }
}
