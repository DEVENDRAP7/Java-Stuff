public class NumberofemployeesWhoMetTheTarget {
    public static void main(String[] args) {
        int[] hours = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 5;
        System.out.println("Number of employees who met the target: " + numberOfEmployeesWhoMetTarget(hours, target));
    }

    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for (int hour : hours) {
            if (hour >= target) {
                count++;
            }
        }
        return count;
    }
    
}
