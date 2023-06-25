package src;

public class Numbers {
    public int integer1 = 10;
    public int integer2 = 15;

    public int getInteger1(){
        return this.integer1;
    }

    public int getInteger2(){
        return this.integer2;
    }

    public void add_to_integer1(int value){
        this.integer1 = this.integer1 + value;
    }

    public void add_one_to_int_one (){
        this.integer1 += 1;
    
  }
}
