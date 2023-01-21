import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {39,12,32};
//        System.out.println(counter(arr));
//        System.out.println(oddArray(arr));
//        removeDups(arr);
        //System.out.println(removeDuplicate(arr));
        // System.out.println(sumTen(arr));
        //   System.out.println(maxProduct(arr));

       // System.out.println(maxCount(arr));
        //System.out.println(Arrays.toString(rearenge(arr)));
        int[] arr1 ={8,1,4,7};
        int[] arr2={2,3,5};

       System.out.println(answerTwo1(arr));
       // System.out.println(maxOccurDigit(4456));
        System.out.println(Arrays.toString(answerOne(arr1,arr2)));


    }





    public static int[] answerOne(int[] a, int[] b) {
        int sizeA = a.length;
        int sizeB = b.length;
        int sizeC = sizeA + sizeB;
        int[] c = new int[sizeC];
        int i = 0; //index of a
        int j = 0; //index of b
        int k = 0; //index of c

        while (i < sizeA && j < sizeB) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements
        while (i < sizeA) {
            c[k] = a[i];
            i++;
            k++;
        }

        while (j < sizeB) {
            c[k] = b[j];
            j++;
            k++;
        }

        return c;
    }





    public static int answerTwo(int[] a)
    {
        if (a.length % 2 == 0) {
            int mid = (a.length / 2) - 1;
            int sum = a[mid] + a[mid + 1];
            int prevSum = 0;
            for (int i = 1; i <= mid; i++)
            {
                int left = mid - i;
                int right = mid + i;
                prevSum = sum;
                sum = a[left] + a[right];
                if (sum <= prevSum)
                {
                    return 0;
                }
            }
            return 1;
        }
        return 0;
    }









    public record person(int age, int height) {
    }

    public static int maxOfArray(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static void nameDisplay() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.nextLine();
        System.out.println("your name is:  " + name);
    }

    public static int counter(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            }
        }
        return count;
    }

    public static Collection<Integer> removeDuplicate(int[] arr) {
        HashMap<Integer, Integer> unique = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (unique.containsValue(arr[i])) {
                unique.remove(arr[i]);
            } else unique.put(i, arr[i]);
        }
        return unique.values();
    }


    //        HashSet<Integer> set = new HashSet<>(); // non duplicate and sorted
//        for(int i=0; i<arr.length; i++){
//        set.add(arr[i]);
//        }
//        return set;
//    }
    public static Collection<Integer> oddArray(int[] arr) {
        Collection<Integer> col = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                col.add(arr[i]);
            }
        }
        return col;
    }

    public static void removeDups(int[] arr) {
        HashMap<Integer, Boolean> mp = new HashMap<>();

        for (int i = 0; i < arr.length; ++i) {
            if (mp.get(arr[i]) == null) System.out.print(arr[i] + " ");
            mp.put(arr[i], true);
        }
    }

    public static List nonRepeatingElements(int[] arr) {
        List<Integer> collection = new ArrayList<>();
        for (int i = 0; i < arr.length; ++i) {
            boolean repeated = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j)  //  3,4,5,6,3
                {
                    repeated = true;
                }
            }
            if (!repeated) collection.add(arr[i]);
        }
        return collection;
    }

    public static HashMap sumTen(int[] arr) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] + arr[j] == 10) {
                    map.put(arr[i], arr[j]);
                }
            }

        }
        return map;
    }

    public static Collection maxProduct(int[] arr) {
        Collection<Integer> collection = new ArrayList<>();
        int x = 0;
        int y = 0;
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] * arr[j] > product) {
                    x = arr[i];
                    y = arr[j];
                    product = x * y;
                }
            }
        }
        collection.add(x);
        collection.add(y);
        return collection;
    }

    public static int indexOfZeros(int[] arr) {
        return arr.length;
    }


    public static boolean isPrime(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                count++;
            }
        }
        if (count != 0)
            return false;
        return true;
    }

    public static boolean perfect(int n) {
        if (isPrime(n)) {
            if (n % 2 != 0) {
                return true;
            }
        }
        return false;
    }


    static int isMeera(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                count++;
        }

        for (int j = 2; j < n; j++) {
            if (n % j == 0) {
                if (count == j)
                    return 1;
            }

        }
        return 0;
    }









    public static int maxCount(int[] arr){
        int count=0;
        int maxCount=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==1) {
                count++;
                 if(count>maxCount){
                     maxCount = count;
                 }

            }
            else
                count=0;

        }
        return maxCount;
    }




//    Input : [1, 3, 4, 2, 0]
//    Output: [4, 0, 3, 1, 2]
//    Explanation:
//
//    A[0] = 1, A[1] becomes 0
//    A[1] = 3, A[3] becomes 1
//    A[2] = 4, A[4] becomes 2
//    A[3] = 2, A[2] becomes 3
//    A[4] = 0, A[0] becomes 4
//




    public static int[] rearenge(int[] arr){
        int[] newArray = new int[arr.length];

        for(int i=0; i<arr.length; i++){
              newArray[arr[i]]=i;
        }
        for (int j=0; j<arr.length; j++){
            arr[j]=newArray[j];
        }
        return arr;
    }



    public static int answerTwo1(int[] a)
    {
        int n = a.length;
        int mid = n / 2;
        int sum = 0;

        if (n % 2 == 0)
        {
            for (int i = 0; i < mid; i++)
            {
                if (a[mid - i - 1] + a[mid + i] != sum)
                    return 0;
                sum += (2 * a[mid - i - 1]);
            }
            return 1;
        }
        else
        {
            for (int i = 0; i < mid; i++)
            {
                if (a[mid - i - 1] + a[mid + i + 1] != sum)
                    return 0;
                sum += (2 * a[mid - i - 1]);
            }
            return 1;
        }
    }





public static int maxOccurDigit(int n) {
    int[] count = new int[10];

    while (n > 0) {
        count[n % 10]++;
        n /= 10;
    }

    int maxOccur = 0;
    int maxCount = 0;
    for (int i = 0; i < count.length; i++) {
        if (count[i] > maxCount) {
            maxOccur = i;
            maxCount = count[i];
        }
    }
    if (maxCount == 0) {
        return -1;
    }

    int otherMaxCount = 0;
    for (int i = 0; i < count.length; i++) {
        if (i != maxOccur && count[i] > otherMaxCount) {
            otherMaxCount = count[i];
        }
    }

    if (maxCount == otherMaxCount) {
        return -1;
    }

    return maxOccur;
}






















}