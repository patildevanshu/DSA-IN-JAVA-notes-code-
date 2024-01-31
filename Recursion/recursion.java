package Recursion;

public class recursion {
    public static void decreasingorder(int n){
        if (n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        decreasingorder(n-1);
    }

    public static void increasingorder(int n){
        if (n==1){
            System.out.println(1);
            return;
        }
        increasingorder(n-1);
        System.out.print(n + " ");
    }

    public static int fact(int n){
        if (n==0){
            return 1;
        }
        // int fnm1 = fact(n-1);
        int ans = n * fact(n-1);
        return ans;
    }

    public static int summ(int n){
        int sum = 0;
        if (n==1){
            return 1;
        }
        sum = n + (summ(n-1));
        return sum;
    }

    public static int fibonacci(int n){
        
        if ( n ==1 ){
            return 1 ;
        }
        else if (n==0){
            return 0 ;
        }
        int finnmo = fibonacci(n - 1);
        int finnmt = fibonacci(n - 2);
        int fn = finnmo + finnmt;
        return fn;
    }

    public static boolean issorted(int arr[], int i){
        if (i == arr.length - 1){
            return true;
        }
        if (arr[i] > arr[i+1]){
            return false;
        }

        return issorted(arr, i+1);
    }

    public static int firstoccourance(int arr[], int key , int i){
        if (i == arr.length){
            return -1;
        }
        if (arr[i] == key){
            return i;
        }
        return firstoccourance(arr, key, i+1);
    }

    public static int lastoccourance(int arr[], int key , int i){
        if (i < 0){
            return -1;
        }
        if (arr[i] == key){
            return i;
        }
        return lastoccourance(arr, key, i-1);
    }

    public static int lastocc(int arr[], int key , int i){
        if (i == arr.length){
            return -1;
        }
        int isfound = lastocc(arr , key , i+1);
        if (isfound == -1 && arr[i] == key){
            return i;
        }
        return isfound;
    }

    public static int power(int x , int n){ // time comp = O(n)
        if (n == 0){
            return 1;
        }
        return x * power(x, n-1); 
    }

    public static int powerx(int x , int n){  //optimize time comp = O(log n)
        if ( n == 0){
            return 1;
        }
        int halfpower = powerx(x, n/2);
        int halfpowersq = halfpower * halfpower;

        // n is odd
        if(n % 2 != 0){
            halfpowersq = halfpowersq * x;
        }
        return halfpowersq;
    }

    public static int tilingProblem(int n){ // 2 X n floor size
        // base
        if(n==1 || n == 0){
            return 1;
        }
        // kaam
        //  vertical choice
        int fnm1 = tilingProblem(n-1);

        //  horizonal choice
        int fnm2 = tilingProblem(n-2);

        int totalways = fnm1 + fnm2;
        return totalways;
    }

    public static void removeDublicates(String str , int idx , StringBuilder newstr , boolean map[]){
        if (idx == str.length()){
            System.out.println(newstr);
            return;
        }

        // kaam
        char currchar = str.charAt(idx);
        if(map[currchar - 'a'] == true){
            // dublicates
            removeDublicates(str, idx+1, newstr, map);
        }
        else {
            map[currchar - 'a'] =true;
            removeDublicates(str, idx+1, newstr.append(currchar), map);
        }
    }

    public static int frindspairing(int n){
        // base case
        if (n==1 || n==2){
            return n;
        }

        //  choice
        // single
        int fnm1 = frindspairing(n-1);

        // pairing
        int fnm2 = frindspairing(n-2);
        int pairways = (n-1) * fnm2;

        // total ways 
        int totalways = fnm1 + pairways;
        return totalways;
    }

    public static void printbinString(int n , int lastplace , String str){
        if (n==0){
            System.out.println(str);
            return;
        }

        // kaam
        // if (lastplace == 0){
        //     printbinString(n-1, 0, str.append("0"));
        //     printbinString(n-1, 1, str.append("1"));
        // }
        // else{
        //     printbinString(n-1, 0, str.append("0"));
        // }
        printbinString(n-1, 0, str+"0");
        if (lastplace == 0){
            printbinString(n-1, 1, str+"1");
        }
        
    }

    public static void main(String[] args) {
        //  int n = 25;
        // int m = 59;
        // decreasingorder(n);
        // increasingorder(m);
        //  System.out.println(fact(n));
        // System.out.println(fibonacci(n));
        // int arr[]={ 1, 20 ,20,3 , 4, 5 } ;
        // System.out.println(issorted(arr,0));
        // int k = 20;
        // System.out.println(firstoccourance(arr, k, 0));
        // System.out.println(lastoccourance(arr, k, 4));
        // System.out.println(lastocc(arr, k, 0));
        // System.out.println(power(2, 10));
        // System.out.println(powerx(2, 10));
        // System.out.println(tilingProblem(2));
        // String str = "appnnacollege";
        // removeDublicates(str, 0, new StringBuilder(""), new boolean[26]);
        // int n = 10;
        // printbinString(10, 0, (""));
        
        
    }
}
