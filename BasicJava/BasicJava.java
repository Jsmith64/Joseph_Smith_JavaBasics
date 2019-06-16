import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava {
    public void print1To255(){
        for(int i = 1; i <= 255; i++){
            System.out.println(i);
        }
    }

    public void printOdd1To255(){
        for(int i = 1; i <= 255; i+=2){
            System.out.println(i);
        }
    }

    public void printSum1To255(){
        int sum = 0;
        for(int i = 0; i <= 255; i++){
            sum += i;
            System.out.println("New Number: " + i + " Sum: " + sum);
        }
    }

    public void printArray(Integer[] arr){
        for(int i : arr)
        System.out.println(i);

    }

    public void printMax(Integer[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public void printAverage(Integer[] arr){
        Double sum = 0.0;
        for (int i : arr) sum += i;
        System.out.println(sum / arr.length);
    }

    public void arrayOdd1To255(){
        ArrayList y = new ArrayList<Integer>();
        for(int i = 1; i <= 255; i += 2){
            y.add(i);
        }
        System.out.println(y);
    }

    public Integer greaterThan(Integer[] arr, int y){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > y){
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    public Integer[] arraySquare(Integer[] x){
        for(int i = 1; i < x.length; i++){
           int b = x[i] * x[i];
            x[i] = b;
        }
        System.out.println(Arrays.toString(x));
        return x;
    }

    public Integer[] arrayNonNeg(Integer[] x){
        for(int i = 1; i < x.length; i++){
            if(x[i] < 0){
                x[i] = x[i] * -1;
            }
        }
        System.out.println(Arrays.toString(x));
        return x;
    }

    public Double[] maxMinAvg(Integer[] x){
        Double max = Double.MIN_VALUE;
        Double min = Double.MAX_VALUE;
        Double sum = 0.0;
        for(int i = 1; i < x.length; i++){
            sum += x[i];
            if(x[i] > max){
                Double d = new Double(x[i]);
                max = d;
            }
            if(x[i] < min){
                Double d = new Double(x[i]);
                min = d;
            }
        }
        Double[] y = {max, min, sum/x.length};
        System.out.println(Arrays.toString(y));
        return y;   
    }

    public Integer[] shift(Integer[] x){
        for(int i = 0; i < x.length; i++){
            if(i == x.length - 1){
                x[i] = 0;
            }else x[i] = x[i+1];
        }
        System.out.println(Arrays.toString(x));
        return x;
    }
    
}