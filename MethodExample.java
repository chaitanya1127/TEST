public class MethodExample {
public static void main(String[] args){

add();
multiply(2,3);

}
public static void add(){
int number1 = 10;
int number2 = 20;
int addedValue = number1+number2;
System.out.println(addedValue);
}
public static void multiply(int value1,int value2){
int multipliedValue = value1*value2;
System.out.println(multipliedValue);
}
}