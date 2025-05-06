class Program43{
    public static void main(String[] args){
        char c='A';
        int count=1;
        for(int i=0;i<=3;i++){
            for(int j=0;j<=i;j++){
                if(count%2==0){
                    System.out.print(c);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}