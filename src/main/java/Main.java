public class Main {

    public static void main(String[] args) {
        //call Partition
        System.out.println(Partition.canPartition(new int[]{2, 8, 4, 1})); //true
        System.out.println(Partition.canPartition(new int[]{-1, -10, 1, -2, 20})); //false
        System.out.println(Partition.canPartition(new int[]{-1, -20, 5, -1, -2, 2})); //true

        //call ReorderDigits
        ReorderDigits.reorderDigits(new int[]{515, 341, 98, 44, 211}, "asc");
        ReorderDigits.reorderDigits(new int[]{515, 341, 98, 44, 211}, "desc");
        ReorderDigits.reorderDigits(new int[]{63251, 78221}, "asc");
        ReorderDigits.reorderDigits(new int[]{63251, 78221}, "desc");
        ReorderDigits.reorderDigits(new int[]{1, 2, 3, 4}, "asc");
        ReorderDigits.reorderDigits(new int[]{1, 2, 3, 4}, "desc");
    }
}
