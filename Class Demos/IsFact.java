//methods with parameters
class Factor{
    boolean isFactor(int a,int b){
        if(b % a) == 0) return true;
else  return false;
    }
}
class IsFact{
    public static void main(String[] args) {
        Factor f = new Factor();

        if(f.isFactor(5,10)) System.out.println("5 is a Factor");
        if(f.isFactor(6,10)) System.out.println("this won't be displayed");
    }
}
