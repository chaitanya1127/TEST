public class ArrayExample{
public static void main(String[] args){
int[] array1 = { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
int[] array2 = new int[20];

System.out.println("printing array from left to right");
for(int i=0;i<array1.length;i++){
System.out.println(array1[i]);
}
System.out.println("printing array from right to left");
for(int i=array1.length-1;i>=0;i--){
System.out.println(array1[i]);
}
System.out.println("printing array from middle to left");
for(int i=(array1.length-1)/2;i>=0;i--){
System.out.println(array1[i]);
}
System.out.println("printing array by skipping one element");
for(int i=0;i<array1.length;i=i+2){
System.out.println(array1[i]);
}
}
}


