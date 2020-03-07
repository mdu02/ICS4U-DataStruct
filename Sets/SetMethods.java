import java.util.HashSet;

class SetMethods{
    public static void main(String[] args){
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        for (int i=0; i<5;i++){
            int t = 1+ (int)(Math.random()*10);
            set1.add(t);
        }
        System.out.println("Set 1");
        System.out.println(set1);
        for (int i=0; i<5;i++){
            int t = 1+ (int)(Math.random()*10);
            set2.add(t);
        }
        System.out.println("Set 2");
        System.out.println(set2);
        
        HashSet<Integer> union = (HashSet)(set1.clone());
        union.addAll(set2);
        System.out.println("Union");
        System.out.println(union);
        
        HashSet<Integer> intersection = (HashSet)(set1.clone());
        intersection.retainAll(set2);
        
        System.out.println("Intersection");
        System.out.println(intersection);
        
        HashSet<Integer> symdiff = (HashSet)(union.clone());
        symdiff.removeAll(intersection);
        
        System.out.println("Symmetreical Difference");
        System.out.println(symdiff);
    }
}