class concatenate
{ 
  public static void main(String args[])
   {
   concatenate Obj=new concatenate();
   Obj.consum("2"+"1");
   Obj.consum("Athulya"+" "+"Lesslie");
   }
  void consum(int a)
  {
   System.out.println("Concatenated number:" +a);
  }
  void consum(String a)
   {
    System.out.println("Concatenated String=" +a);
   }
}
