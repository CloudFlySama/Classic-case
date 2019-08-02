// 例如给定一个数组{10,5,22,68,52,71,33}
//将数组中的数据从大到小排序后输出
public class Demo {
    public static void main(String[] args) {
        //定义一个数组
        int arr[] = {10,5,22,68,52,71,33};
        //定义一个中间量 temp 用于交换数组中的元素
        int temp = 0;
        //把第一个位置的数字拿出来依次和后面位置的数字进行比较，
        // 如果后面位置的数字大，则交换位置。
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
