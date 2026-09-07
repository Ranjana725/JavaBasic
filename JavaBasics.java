import java.util.* ;
public class JavaBasics {
   /* public static void printHelloWorld(){ 
        System.out.println("Hello World!");
         System.out.println("Hello World!");
          System.out.println("Hello World!");
    }*/
    //public static void main(String args []){
      //  Scanner sc = new Scanner(System.in);
        /*System.out.println("Hello World!");
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
        int a = 10;
        int b = 20;
        System.out.println(a);
        System.out.println(b);
        String name = "Tony stark";
        System.out.println(name);
        System.out.println(a+b);*/
       // Scanner sc = new Scanner(System.in);
    //   String input = sc.next();
        //for space as input 
      //  String a = sc.nextLine();
      //sum of two num and multiplication of two num
      /*int a = sc.nextInt();
      int b = sc.nextInt();
      int sum = a+b;
      int product = a*b;
      System.out.println(sum);
      System.out.println(product);*/
      //Area od a circle
     /* int r = sc.nextInt();
      double area = 3.14*r*r;
        System.out.println(area);

//Type Casting
        float a = 25.12f;
        int b = (int) a ;
        System.out.println(b);

    char ch = 'a';
    int number = ch;
    System.out.println(number);

byte b = 5;
byte a = (byte) (b * 2);
        System.out.println(a);

//Type promotion in expression
        byte a = 5;
        byte b = 10;
        int c = a * b;
        System.out.println(c);
        //Average of three numbers
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int avg = (a+b+c)/3;
        System.out.println(avg);
        int side = sc.nextInt();
        int area = side*side;
        System.out.println(area);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        Float eraser = sc.nextFloat();

        float total = pencil + pen + eraser;

    System.out.println("Bill is :"+ total);
    //add on - with 18% gst
    float newtotal = total + (0.18f* total);
    System.out.println("Bill with gst is :"+ newtotal);
    
    int A = 10;
    int B = 15;
    System.out.println("add = " + (A+B));
   //uninary operator
    int a = 10;
    int b = ++a;
    System.out.println(a);
    System.out.println(b);
    
   int A = 10;
   int B = 10;
   System.out.println((A==B));
   System.out.println((A!=B));
   System.out.println((A>=B));
   System.out.println((A<=B));
   System.out.println( (3>2) && (5>2));
   System.out.println( (3>2) || (5<2));
   System.out.println( !(3>2) );

    int age = 16;
    if(age>=18){
        System.out.println("adult: drive ,vote");
    }

    if(age > 13 && age< 18){
        System.out.println("not adult");
    }


//print the largest 2 numbers 
int A = 10;
int B = 5;
if(A>=B){
    System.out.println("A is greater than or equal to B");
} else {
    System.out.println("B is largest if 2");
}
int income = sc.nextInt();
int tax;
if(income >= 5000000){
    tax = 0;
}
   else if(income >= 500000 && income<1000000){
    tax = (int) (0.2*income);
}else {
    tax = (int) (income * 0.3);
}
System.out.println("Tax is :"+ tax);
} 
int number = 4;
//ternary operator
String type = ( (number%2) == 0)?"even":"odd"; 
System.out.println(type);

//Switch case 
int number = 2;
switch (number){
    case 1 : System.out.println("samosa");
         break;
    case 2 : System.out.println("burger");
        break;
    case 3 : System.out.println("Mango Shake");
        break;
    default : System.out.println("we wake up");
}
System.out.println("enter a : ");
int  a = sc.nextInt();
System.out.println("enter b : ");
int b = sc.nextInt();
System.out.println("enter operator : ");
char operator = sc.next().charAt(0);

switch(operator){
    case'+': System.out.print(a+b);
       break;
    case'-':System.out.println(a-b);
       break;
    case'*':System.out.println(a*b);
       break;
    case'/':System.out.println(a/b);
    break;
    case '%':System.out.println(a%b);
    break;

}
//positive,negative
int a = sc.nextInt();
System.out.println("enter a: ");
if(a>0){
    System.out.println("positive");
}else {
    System.out.println("Negative");
}
System.out.println("Enter week number(1-7):");
int week = sc.nextInt();
switch(week){
    case 1:
        System.out.println("Monday");
         break;
    case 2:
        System.out.println("Tuesday");;
        break;
    case 3:
         System.out.println("Wednesday");
        break;
    case 4:
        System.out.println("Thrusday");
        break;
    case 5:
        System.out.println("Friday");
        break;
    case 6:
        System.out.println("Saturday");
        break;
    case 7:
        System.out.println("Sunday");
        break;
    default:
        System.out.println("Wrong Input");
}
//for leap year
System.out.print("Input the year:");
int year = sc.nextInt();
 
 boolean x = (year % 4) == 0;
 boolean y = (year % 100)!=0;
 boolean z = ((year % 100  == 0 ) && (year % 400 == 0 ));

 if(x && (y || z)){
    System.out.println(year + "is a leap year");
 }else {
    System.out.println(year+"is not leap year");
 }
//while loop 
    int counter = 0;
    while(counter < 10 ){
        System.out.println("Hello world");
        counter++;
    }
    System.out.println("printed HW 100x");
    }
   //print number from 1 to 10 
   int n=1;
   while(n<=10){
    System.out.println(n);
    n++;
   }
   System.out.print("Enter n");
  int n = sc.nextInt();
  int counter = 1;
  while(counter<=n){
    System.out.println(counter);
    counter++;
  }
 //sum of n natural numbers
 int n = sc.nextInt();
 int counter = 1;
 int sum = 0 ;
 while(counter <= n ){
    sum += counter;
    counter++;
 }
 System.out.println(sum);
 
for(int i=1;i<=4;i++){
    System.out.println("****");
   }
   
  // reverse of num
  int n = 10899;

  while(n>0){
    int lastDigit = n%10;
    System.out.print(lastDigit);
    n = n/ 10;//n/=10
  }
  System.out.println();
  
 int n = 10899;
 int rev = 0;
 while (n>0) {
    int lastDigit = n%10;
    rev = (rev * 10) + lastDigit;
    n=n/10;
    System.out.println(rev);
 }
 
//do while 
  int counter = 1;
  do { 
    System.out.println("Hello world");
  counter++;
  }while(counter <= 10);
  
 for(int i =1; i<=5;i++){
    if(i==3){
        break;
    }
    System.out.println(i);
 }
 System.out.println("i am out of the loop");
 
do { 
    System.out.print("enter your number : ");
    int n = sc.nextInt();

    if(n%10 == 0){
        continue;
    }
    System.out.println("number was "+ n);
}while(true);

   int n = sc.nextInt();
    if(n==2) {
        System.out.println("n id prime");
    }else {
    boolean isPrime = true;
    for(int i=2;i<=Math.sqrt(n); i++){
if(n%i == 0) { //n is a multiple if i (i not equal to 1 or n) 
    isPrime = false;
}
}
if(isPrime == true) {
    System.out.println("n is prime");
}else {
    System.out.println("n is not prime");
}
    }
   //print star pattern
    for (int i =1 ; i<=4 ;i++){
        for(int j=1; j<=i; j++){
            System.out.print("*");
    }
    System.out.println();
      }
    //inverted star pattern
    for (int i = 6 ; i>=1 ;i--){
        for(int j=1; j<=i; j++){
            System.out.print("*");
    }
    System.out.println();
}
 // print Half-Pyramid pattern
 int n=4;

 for(int i=1; i<=n;i++){
    //numbers print
    for(int j=1;j<=i;j++){
        System.out.print(j+" ");
    }
    System.out.println();
 }
//print character pattern 
int n=7;
char ch = 'A';
for(int i = 1;i<=n;i++){
    for(int j=1;j<=i;j++){
        System.out.print(ch);
        ch++;
    }
    System.out.println();
}

System.out.println("enter number");
int n = sc.nextInt();
for(int i =1 ; i<=10;i++){
    System.out.println(n+"*"+i+"="+n*i);
}
    }
    */
  // printHelloWorld();
 /* public static int calculateSum(int num1,int num2){
    int sum = num1 + num2;
    return sum;
  }
  public static void calculateSum(){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = a+b;
    System.out.println("sum is :"+ sum);
  }
public static void main(String args[]){
   calculateSum();
   public static void main(String args[]){
    //swap - values exchange
    int a = 5;
    int b =10;

    //swap
    int temp = a;
    a = b;
    b = temp;

    System.out.println("a = "+a);
    System.out.println("b = "+b);

    //product of a*b
public static int multiply( int a,int b){
    int product = a*b;
    return product;
}
public static void main(String args[]){
    int prod = multiply(3,4);
    System.out.println("a*b = " + prod);
    prod = multiply(10,20);
    System.out.println("a*b = " + prod);

public static int factorial(int n){
    int f = 1;
    for(int i = 1; i<=n; i++){
        f = f * i;
}
   return f;
}
     public static int binCoeff( int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
     }

     public static void main(String args[]) {
        System.out.println(binCoeff(5,2));
     }
     
   // Function overloading
    public static int sum(int a,int b){
        return a + b;
    }
    //func to calc sum of 3 nums
    public static int sum(int a ,int b, int c){
        return a+b+c;
    }
    public static void main(String args[]) {
        System.out.println(sum(3,5));
        System.out.println(sum(3,6,9));
    
    }
   //only forn>=2
   public static boolean isPrime(int n){
    //corner cases
    if(n==2){
        return true;
    }
    for(int i=2; i<n-1;i++){
        if(n%i == 0){
            return false;
            
        }
    }
    return true;
   }
   public static void main(String args[]){
    System.out.println(isPrime(2));
   }
  public static boolean isPrime(int n){
    if(n==2){
        return true;
    }
    for(int i=2;i<=Math.sqrt(n);i++){
        if (n%i==0){
            return false;
        }
    }
    return true;
   }
  public static void PrimesInRange (int n){
      for(int i=2;i<=n;i++){
        if(isPrime(i)){
            System.out.print(i+" ");
        }   
      }
      System.out.println();
  }

  public static void main(String args[]){
    PrimesInRange(20);

   }
  public static void binToDec(int binNum){
    int mynum = binNum;
    int pow = 0;
    int decimal = 0;
    while(binNum>0){
        int lastDigit = binNum % 10;
        decimal = decimal + (lastDigit * (int) Math.pow(2,pow));
        pow++;
        binNum = binNum/10;

    }
    System.out.println("decimal of " + mynum + " = "+decimal);
  }
   public static void main(String args[]){
    binToDec(101);
   }
   public static void decToBin(int n ){
    int myNum = n ;
    int pow = 0;
    int binNum = 0;
    while(n>0){
        int rem = n%2;
        binNum = binNum + (rem * (int) Math.pow(10,pow));
        pow++;
        n = n/2;
    }
    System.out.println("binary of "+ myNum + "="+binNum);
   }
   public static void main(String args[]){
    decToBin(5);
   }
 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("input the first number:");
    double x = sc.nextDouble();
    System.out.print("input the second number:");
    double y = sc.nextDouble();
    System.out.print("input the third number:");
    double z = sc.nextDouble();
    System.out.print("the average of 3 numbers is :"+ average(x,y,z)+"\n");

 }
 public static double average(double x,double y ,double z){
    return(x+y+z)/3;

 }
 
 public static boolean isEven(int n){
    if(n%2 == 0){
       return true;
    }else {
        return false;
    }
 }
 public static void main(String args[]){
    System.out.println(isEven(4));
}
public static void hollow_rectangle(int totRows, int totCols){
    //outer loop - rows
     for(int i =1;i<totRows;i++){
        //inner-columns
        for(int j=1 ; j<=totCols;j++){
            if(i==1|| i==totRows || j==1 || j==totCols){
                System.out.print("*");
            }else {
                System.out.print(" ");
            }
        }
        System.out.println();
     }
}
public static void main (String args[]){
      hollow_rectangle(5,5);    
}

public static void inverted_rotated_half_pyramid(int n ){
    //outer
    for(int i=1;i<=n;i++) {
             //spaces
         for(int j=1;j<=n-1;j++){
            System.out.print(" ");
         }
         //stars
         for(int j=1;j<=i;j++){
            System.out.print("*");
         }
         System.out.println(); 
    }
}
    public static void main(String args[]){
        inverted_rotated_half_pyramid(4);
    }
    
   //FLOYD'S Triangle
    public static void floyds_triangle(int n){
        int counter = 1;
          for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
          }
     }
    public static void main (String args[]){
        floyds_triangle(7);
    }
    
   //0-1 Triangle
   public static void zero_one_triangle(int n){
    for(int i=1;i<=n;i++){
        for(int j=1; j<=i ; j++){
            if((i+j)%2==0){
                System.out.print("1 ");
            }else {
                System.out.print("0 ");
            }
        }
        System.out.println();
   }
   }
   public static void main (String args[]){
    //hollow_rectangle(10,7);
    //inverted_rotated_half_pyramid(7);
    //inverted_half_pyramid(7);
    //floyds_triangle(7);
    zero_one_triangle(7);
   }
  public static void butterfly(int n){
    //1st half
    for(int i=1 ;i<=n ; i++){
        //stars - i
        for(int j=1;j<=i;j++){
        System.out.print("*");
    }
        //spaces - 2*(n-i)
        for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        //stars - i
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    //2nd half
    for(int i=n ;i>=1 ; i--){
        //stars - i 
        for(int j=1;j<=i;j++ ) {
            System.out.print("*");
        }

        //spaces - 2*(n-i)
        for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        //stars - i
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
  }

  public static void main(String args[]){
    butterfly(4);

  }
 public static void diamond(int n){
    //1st half
    for(int i =1;i<=n;i++) {
        //spaces
        for(int j=1;j<=(n-i);j++){
            System.out.print(" ");
        }
        //stars
        for(int j=1;j<=(2*i)-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    //2nd half
    for(int i=n;i>=1;i--){
        //Spaces
        for(int j=1;j<=(n-i);j++){
            System.out.print(" ");
        }
        //stars
        for(int j=1;j<=(2*i)-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
 }
 public static void main(String args[]){
    diamond(4);
 }
 
//public class ArraysCC {
    public static void main(String args[]) {
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);
        System.out.println("length of array = " + marks.length);
        marks[0] = sc.nextInt();//ada
        marks[1] = sc.nextInt();//os
        marks[2] = sc.nextInt();//maths
        marks[3] = sc.nextInt();//coa


        System.out.println("ada :"+marks[0]);
        System.out.println("os :"+marks[1]);    
        System.out.println("maths :"+marks[2]);
        System.out.println("coa :"+marks[3]);
    }
   public static void update(int marks[]){
    for(int i=0;i<marks.length;i++){
        marks[i] = marks[i] + 1;
     }
   }
   public static void main(String args[]){
    int marks[] = {97,98,99};
    update(marks);

    //print our marks
    for(int i=0;i<marks.length;i++){
        System.out.print(marks[i]+" ");
    }
    System.out.println();
   }
   //linearsearch
  public static int linearSearch(int numbers[],int key){
    for(int i=0;i<=numbers.length;i++){
        if(numbers[i] == key){
            return i;
        }
    }
    return -1;
  }
  public static void main(String[] args) {
      int number[] = {2,4,6,8,10,12,14,16};
      int key = 10;
      int index = linearSearch(number,key);
      if(index == -1){
        System.out.println("Not found");
      }else {
        System.out.println("key is at index : "+ index);
      }
  }
 //largest in array
 public static int getLargest(int numbers[]){
    int largest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;
    
     for(int i=0;i<numbers.length;i++){
        if(largest < numbers[i]){
            largest = numbers[i];
        }
        if(smallest > numbers[i]){
            smallest = numbers[i];
        }
     }
     System.out.println("smallest is : "+ smallest);
     return largest;


 }
    public static void main(String args[]){
        int numbers[] = {1,2,6,3,5};
        System.out.println("largest is : "+ getLargest(numbers));
    }
   //binary search - only for sorted array
   public static int binarySearch(int numbers[],int key){
      int start = 0,end = numbers.length-1;

      while(start<=end){
        int mid = (start + end)/2;
        
        //comparisons
        if(numbers[mid] == key) {//found
            return mid;
        }
        if(numbers[mid] < key){//right
            start = mid + 1;
        } else { //left
            end = mid - 1;
        }
      }
        return -1;
   }
   public static void main(String args[]){
    int numbers[] = {2,4,6,8,10,13,14};
    int key = 10 ;

    System.out.println("index for key is : " + binarySearch(numbers , key));
   }

//reverse an array
public static void reverse(int numbers[]){
    int first = 0, last = numbers.length-1;

    while(first < last){
        //swap
        int temp =  numbers[last];
        numbers[last] = numbers[first];
        numbers[first] = temp;

        first ++;
        last --;
    }
}
   public static void main(String args[]){
    int numbers[]  = {2,4,6,8,10};

    reverse(numbers);

    //print the reversed array
    for(int i = 0;i<numbers.length;i++){
        System.out.println(numbers[i]+" ");
    }
    System.out.println();
   }
  //pairs in an array
  public static void printPaird(int numbers[]){
    int tp = 0;//total pairs
    for(int i=0;i<numbers.length;i++){
        int curr = numbers[i];//2,4,6,8,10
        for(int j=i+1;j<numbers.length;j++){
            System.out.print("("+curr + ","+numbers[j]+")");
            tp++;
        }
        System.out.println();
    }
    System.out.println("total pairs = "+ tp);
  }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        printPaird(numbers);
     }
    //subarrays of an array
    public static void printSubarrays(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            int start = i;
            for(int j=i;j<numbers.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){ //print
                    System.out.print(numbers[k]+" ");//subarray
                }
                System.out.println();
        }
        System.out.println();
}
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        printSubarrays(numbers);
    }

   //maximum subarray sum 
   public static void maxSubarraySum(int numbers[]){
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;
    for(int i = 0;i<=numbers.length;i++){
        int start = i;
        for(int j=i;j<numbers.length;j++){
            int end  = j;
            currSum = 0;
            for(int k=start;k<=end;k++){
                currSum += numbers[k];
            }
            System.out.println(currSum);
            if(maxSum < currSum){
                maxSum = currSum;
             }
        }
    }
         System.out.println("max sum is : "+ maxSum);
   }
   public static void main(String args[]){
    int numbers[] = {2,4,6,8,10};
    maxSubarraySum(numbers);
   }
  public static int trappedRainwater(int height[]){
    //calculate left max boundary - array
    int leftMax[] = new int[height.length];
    leftMax[0] = height[0];
    for(int i=1;i<height.length;i++){
        leftMax[i] = Math.max(height[i],leftMax[i-1]);
    }
    //calculate right max boundary - array
  }*/
  //Bubble sort
 /*public static void bubbleSort(int arr[]){
    for(int turn=0;turn<arr.length-1;turn++){
        int swap = 0;
        for(int j=0;j<arr.length-1-turn;j++){
            if(arr[j]<arr[j+1]){
                //swap
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;{
                swap++;
                }
            }
        }
    }
 }
 public static void printArr(int arr[]){
    for(int i =0 ; i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
 }
public static void main(String args[]){
   int arr[]={5,3,1,4,2};
    bubbleSort(arr);
    
    printArr(arr);
*/
/*public static void SelectionSort(int arr[]){
     for (int i = 0;i <arr.length-2;i++){
        int minPos = i;
    for(int j = i+1;j<arr.length;j++){
        if(arr[minPos]<arr[j]){
            minPos = j;
        }
       } 
       //swap
       int temp = arr[minPos];
       arr[minPos] = arr[i];
       arr[i] = temp;
     }
    
}
public static void main(String args[]){
    int arr[] = {3,5,1,2,4};
    SelectionSort(arr);
    System.out.println("sorted array is : ");
    for(int i=0;i<arr.length;i++){  
        System.out.print(arr[i]+" ");
    }
     System.out.println();
}
public static void insertionSort(int arr[]){
    for (int i=1;i<arr.length;i++){
        int curr = arr[i];
        int prev = i-1;
        //finding out the correct pos to insert
        while(prev >=0 && arr[prev] < curr){
            arr[prev+1]=arr[prev];
            prev--;
        }
    //insertion
    arr[prev+1] = curr;
    }
}
    public static void main(String args[]){
        int arr[] = { 5,4,1,3,2,};
            insertionSort(arr);
            System.out.println(arr);
        }*/
    /*
    //inbult sort function
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        //insertionSort(arr);
        Arrays.sort(arr);
        printArr(arr);
    }
    //counting sort 
    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            largest = Math.max(largest,arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i =0 ; i<arr.length;i++);
        count[arr[i]]++;
        }   
        //sorting
        int j = 0 ;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        } 
        public static void main(/String args[]){
            Integer arr [] = {5,4,1,3,2};
            countingSort(arr);
            printArr(arr);
        }
   //2D array 
       public static void main(String args[]){
        int matrix [] [] = new int[3][3];
        int n = matrix.length,m=matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for(int i=0 ; i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        //output
        for(int i  = 0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        //sum of two numbers
  /*  Scanner sc = new Scanner (System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = a+b;
    System.out.println("sum = " + sum);
    //product of two numbers
    Scanner sc = new Scanner (System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int product = a*b;
    System.out.println("product = " + product);
    
   //Area of circle
   Scanner sc = new Scanner(System.in);
   int r = sc.nextInt();
   double area = 3.14*r*r;
   System.out.println("area of crcle = " + area);

//type promotion in expression only work with expression
char a = 'a';
char b = 'b';
System.out.println((int)(b));
System.out.println((int)(a));
System.out.println(b-a);
short a = 5;
byte b = 10;
char c = 'c';
byte bt = (byte) (a+b+c);
System.out.println(bt);
//average of three numbers
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
int avg = (a+b+c)/3;
System.out.println("Average = " + avg);

//area of square
Scanner sc = new Scanner(System.in);
int side = sc.nextInt();
int area = side*side;
System.out.println("area of square = " + area);
//bill with gst
Scanner sc = new Scanner(System.in);
float pencil = sc.nextFloat();
float pen = sc.nextFloat(); 
float eraser = sc.nextFloat();
float totalprice = pencil+pen+eraser;
float newtotal =  (totalprice + (0.18f*totalprice));
System.out.println("total bill = " + totalprice);
System.out.println("total bill with GST = " + newtotal);
   // conditional statements
   int age = 16;
   if(age>=18){
    System.out.println("adult: drive ,vote");
   }else {
    System.out.println("not adult");
   }
  //largest of two numbers
  int A = 1;
  int B = 3;
  if(A>B){
    System.out.println("A is largest");
  }else{
    System.out.println("B is largest");
  }
 //number is even or odd
  Scanner sc = new Scanner(System.in);
 int n = sc.nextInt();
 if (n%2==0){
    System.out.println("number is even");
 }else {
    System.out.println("number is odd");
 }
//Income Tax Calculator
 Scanner sc = new Scanner(System.in);
 int income = sc.nextInt();
 int tax;
 if (income<500000){
    tax=0;
 }else if (income>=500000 && income <= 1000000){
    tax=(int)(0.2*income);
 }else {
    tax=(int)(0.3*income);
 }
 System.out.println("Tax is : " + tax);*/
 }
}















    









  

