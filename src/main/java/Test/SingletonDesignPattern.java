package Test;

public class SingletonDesignPattern {
  static SingletonDesignPattern obj= null;
  public int x =10;
  private SingletonDesignPattern(){

  }
  static  public SingletonDesignPattern getInstance(){
    if(obj==null){
        obj = new SingletonDesignPattern();
    }
    return obj;
  }
    public static void main(String[] args) {
        SingletonDesignPattern ob= new SingletonDesignPattern();
        System.out.println("");
  }
}
