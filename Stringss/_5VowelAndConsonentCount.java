package Stringss;

public class _5VowelAndConsonentCount {
    public static void main(String[] args) {
        String s="Ravi kIraN";
        String s1=s.toLowerCase();

        int v_count=0;
        int c_count=0;
        int s_count=0;

        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);

            if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
                v_count++;
            } else if (ch==' ') {
                s_count++;
            }
            else {
                c_count++;
            }
        }

        System.out.println("Vowels Count "+v_count);
        System.out.println("Space Count "+s_count);
        System.out.println("Consonent Count "+c_count);

    }
}
