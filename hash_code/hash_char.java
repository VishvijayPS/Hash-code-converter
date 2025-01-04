package hash_code;
public class hash_char {
    public static void main(String[] args) {
        char [] alpha_l = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char [] alpha_h = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char [] char_sp =  {'`','~','!','@','#','$','%','^','&','*','(',')','-','_','=','+',';',':','{','}','[',']','|','\\','<',',','>','.','/','?',' ','"','\''};
        char [] numb = {'1','2','3','4','5','6','7','8','9','0'};
    
        int [] alpha_ln = {997 , 995 , 993 , 991 , 989 , 987 , 985 , 983 , 981 , 979 , 977 , 975 , 973 , 971 , 969 , 967 , 965 , 963 , 961 , 959 , 957 , 955 , 953 , 951 , 949 , 947};
        int [] alpha_hn = {998 , 996 , 994 , 992 , 990 , 988 , 986 , 984 , 982 , 980 , 978 , 976 , 974 , 972 , 970 , 968 , 966 , 964 , 962 , 960 , 958 , 956 , 954 , 952 , 950 , 948};
        int [] char_spn = {697 , 694 , 691 , 688 , 685 , 682 , 679 , 676 , 673 , 670 , 667 , 664 , 661 , 658 , 655 , 652 , 649 , 646 , 643 , 640 , 637 , 634 , 631 , 628 , 625 , 622 , 619 , 616 , 613 , 610 , 607 , 604 , 601};
        int [] numbn = {123 ,126 ,129 ,132 ,135 ,138 ,141 ,144 ,147 ,150};
        public char ch;

        // System.out.println("(a to z) alpha_l length : "+alpha_l.length+ " count length : "+ alpha_ln.length);
        // System.out.println();
        // System.out.println("(A to Z) alpha_h length : "+alpha_h.length+ " count length : "+ alpha_hn.length);
        // System.out.println();
        // System.out.println("(spacial character) char_sp length : "+char_sp.length+ " count length : "+ char_spn.length);
        // System.out.println();
        // System.out.println("(1 to 0) numb length : "+numb.length+ " count length : "+ numbn.length);

        public void setchar(char c){
            this.ch = c;
        }
        public int gethash(){
            if(Character.isUpperCase(ch)){
                for (int i = 0;i < alpha_h.length; i++) {
                    if(ch == alpha_h[i]){
                        return alpha_hn[i];
                    }
                }
            }
            else if(Character.isLowerCase(ch)){
                for (int i = 0;i < alpha_l.length; i++) {
                    if(ch == alpha_l[i]){
                        return alpha_ln[i];
                    }
                }
            }
        }

    }    
}
