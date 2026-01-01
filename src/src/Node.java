public class Node implements Comparable<Node>{
    Node lefT;
    Node right;
    char character;
    int frequency;
    Node(final char character, final int frequency, final Node lefT, final Node right) throws IllegalAccessException {
        this.character=character;
        if (frequency<0){
            throw new IllegalArgumentException("Error:Frequency must be >=0");
        }
        this.frequency=frequency;
        this.lefT = lefT;
        this.right=right;
    }

    public boolean isLeaf(){
        return this.lefT ==null&&this.right==null;
    }
    public int compareTo(final Node that){
        final int fre=Integer.compare(this.frequency,that.frequency);
        if (fre!=0){
            return fre;
        }
        return Integer.compare(this.character, that.character);
    }
    public String toString(){
        String str = ""+character;
        return str;
    }
}
