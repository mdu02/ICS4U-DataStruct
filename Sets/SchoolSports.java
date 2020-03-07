import java.util.Arrays;
import java.util.TreeSet;

class SchoolSports {
    public static void main(String[] args){
        TreeSet<String> rugby = new TreeSet<String>(Arrays.asList("John", "Jack", "Jason", "Justin", "Brandon", "Ryan", "Paul", "Ingrid", "Emily", "Noah"));
        TreeSet<String> soccer = new TreeSet<String>(Arrays.asList("Noah", "Mark", "Michael", "Brandon", "Kelly", "Daniel", "Ben", "Ryan"));
        TreeSet<String> basketball = new TreeSet<String>(Arrays.asList("Lucas", "Noah", "Andrew", "Jason", "Emily", "Paul", "David"));

        TreeSet<String> union = new TreeSet<String>();
        union.addAll(rugby);
        union.addAll(soccer);
        union.addAll(basketball);
        System.out.println("Total of all 3 sports: " + union.size());

        TreeSet<String> intersection = new TreeSet<String>();
        intersection.addAll(soccer);
        intersection.retainAll(basketball);
        System.out.println("Soccer AND basketball");
        for (String name : intersection){
            System.out.println(name);
        }

        TreeSet<String> onlyOne = (TreeSet)(union.clone());
        TreeSet<String> sb = (TreeSet)(soccer.clone());
        sb.retainAll(basketball);
        TreeSet<String> rb = (TreeSet)(rugby.clone());
        rb.retainAll(basketball);
        TreeSet<String> sr = (TreeSet)(soccer.clone());
        sr.retainAll(rugby);
        onlyOne.removeAll(sb);
        onlyOne.removeAll(sr);
        onlyOne.removeAll(rb);
        System.out.println("Only one");
        for (String name : onlyOne){
            System.out.println(name);
        }

        TreeSet<String> rsnb = (TreeSet)(intersection.clone());
        rsnb.addAll(rugby);
        rsnb.retainAll(soccer);
        rsnb.removeAll(basketball);
        System.out.println("Rugby and Soccer but not Basketball");
        for (String name : rsnb){
            System.out.println(name);
        }
    }
}
