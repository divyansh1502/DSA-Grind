
public class StringBuilderEx {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Divyansh");
        sb.append(" Singh");

        System.out.println(sb);

        // insert()

        sb.insert(2, "MMM");
        System.out.println(sb);

        //delete()
        sb.delete(2, 5);
        System.out.println(sb); // deleted MMM which is added by insert()
        System.out.println(sb.deleteCharAt(8));

        // replace()

        sb.replace(8,13,"_Thakur");
        System.out.println(sb);

        //setCharAt()

        sb.setCharAt(8, '-');
        System.out.println(sb);
        System.out.println(sb.charAt(5));

        System.out.println(sb.capacity());

        sb.ensureCapacity(100);

        System.out.println(sb.capacity());

        sb.trimToSize();
        System.out.println(sb.capacity());
    }
}
//StringBuilder does not override == method
//StringBuilder is not used in thread case
//StringBuffer is used in thread case

// StringBuilder >>>>> StringBuffer  (very fast)
