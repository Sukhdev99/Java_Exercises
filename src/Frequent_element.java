public class Frequent_element {
    public static void main(String[] args) {
        int[] arr = {2, 7, 5, 6, 7, 1, 6, 2, 1, 7, 6};
        int[] result = findMostFrequent(arr);

        System.out.println("The most frequent number in the table is:");
        System.out.println(result[0] + " (" + result[1] + " x)");
    }    public static int[] findMostFrequent(int[] arr) {
        int[] frequency = new int[1000]; // Assuming a range of integers, adjust as needed
        int maxFrequency = 0;
        int mostFrequent = 0;

        for (int num : arr) {
            frequency[num]++;
            if (frequency[num] > maxFrequency) {
                maxFrequency = frequency[num];
                mostFrequent = num;
            }
        }

        return new int[]{mostFrequent, maxFrequency};
    }
}
