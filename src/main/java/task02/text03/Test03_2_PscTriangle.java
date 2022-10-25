package task02.text03;

public class Test03_2_PscTriangle {
    public static void main(String[] args) {
        //创建二维数组用来接收杨辉三角数据
        int [][] array=new int[10][10];
        //循环赋值
        for(int row=0;row< array.length;row++){
            for(int column=0;column<=row;column++){
                if(column==0||row==column) //两侧数值为1
                array[row][column]=1;
                else {
                    array[row][column] = array[row-1][column-1] + array[row - 1][column];//数值为肩上两数之和
                }
                System.out.print(array[row][column]+"\t");
            }
            System.out.println();
        }
    }
}
