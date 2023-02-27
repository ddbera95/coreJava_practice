package Practise;

public class BinaryPract {


  static public void main(String[] args){

      char c = 0b0000000000000000;
      char c2= 0b0100000000000000;

      int i = c2 << 16| c;

      System.out.println(i);
  }
}
