public class IntBin {
    public static void main (String[] args){
        int i1 = 257;
        System.out.println(conv(i1));
    }
    public static String conv (int dec){
        Stack<Integer> binRep = new Stack<Integer>();
        int pow = 1;
        while (dec != 0){
            int bit = (int)Math.pow(2,pow);
            if (dec%bit != 0){
                dec -= bit/2;
                binRep.push(1);
            } else {
                binRep.push(0);
            }
            pow++;
        }
        String bin = "";
        while (!binRep.isEmpty()){
            bin += String.valueOf(binRep.pop());
        }
        return bin;
    }
}
