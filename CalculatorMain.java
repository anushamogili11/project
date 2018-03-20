package calc;
import static org.junit.Assert.assertEquals;
import java.util.Scanner;

public class CalculatorMain {
 public int add(int a, int b)
 {
	 return a+b;
 }
 public int sub(int x, int y)
 {
	 return x-y;
 }
 public int mul(int p, int q)
 {
	 return p*q;
 }
 public double div(double j, double k)throws Exception{
try{
	 double rem=j/k;
	 return rem;
 }
	 catch(Exception e) {
		 throw e;
	 }
 
 }
 public int div(int j, int k)throws Exception{
	 try{
	 	 int rem=j/k;
	 	 return rem;
	  }
	 	 catch(Exception e) {
	 		 throw e;
	 	 }
	  
	  }
 public double sqr(double number) {
	 double squareRoot = Math.sqrt(number);
	 return Math.round(squareRoot);
 }
 public int mod(int num1, int num2) {
	 return num1%num2;
 }
 public double area(int r) {
	 return 3.15*this.square(r);
 }
 public double sin(double val) {
	 return Math.sin(val);
 }

 public double cos(double val) {
	 return Math.cos(val);
 }
 public double tan(double val) {
	 return Math.tan(val);
 }
 public double sec(double val) {
	 double secVal=0.0;
	 try {
		 secVal= this.div(1,this.cos(val));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 return secVal;
 }
 public double log(double val) {
	 return Math.log(val);
 }
 
 public double power(double x,double y) {
	 return Math.pow(x, y);
 }
 public int square(int val) {
	 return val*val;
 }
}
 
 
 


