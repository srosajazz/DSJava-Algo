// public class Main {
//     public static void main(String[] args) {
//         int[] intArray = new int[7];

//         intArray[0] = 1;
//         intArray[1] = 2;
//         intArray[2] = 3;
//         intArray[3] = -4;
//         intArray[4] = 5;
//         intArray[5] = 6;
//         intArray[6] = 7;

//         for (int i = 0; i < intArray.length; i++) {
//             System.out.println(intArray[i]);
//         }
//     }
// }

//2
public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[7];

        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        intArray[3] = -4;
        intArray[4] = 5;
        intArray[5] = 6;
        intArray[6] = 7;

        int index = -1; // if dont find the array return -1
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == -4) {
                index = i;
                break;
            }

        }

        System.out.println("index = " + index);
    }
}