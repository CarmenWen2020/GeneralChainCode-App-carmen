public class TestArray {
    public static void main(String[] args) {
        double[] myList = {1.9, 2.9, 3.4, 3.5};

        // 打印所有数组元素
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }
        // 计算所有元素的总和
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.println("Total is " + total);
        // 查找最大元素
        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) max = myList[i];
        }
        System.out.println("Max is " + max);


        Object [][] str1 = { { "1", "2", "3" }, { "11", "22", "33" } };
        Object [] st12 = { "1", "2", "3" };
        System.out.println(str1);
        System.out.println(st12);

        Object[][] s = new Object[5][4];
        s[0][0] = 0;


    }
}