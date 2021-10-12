public class Memory extends Operation {

    public double[] arr;
    private int memor = 0;

    public Memory(double[] arr) {
        this.arr = arr;
    }


    public void Mem(){
        arr [memor] = result;
        if(memor == 4){
            memor = 0;
        }else {
            memor++;
        }
        System.out.println(result);

    }

    public void saveMem(){
    }

    public double[] getArr() {
        return arr;
    }

    public void setArr(double[] arr) {
        this.arr = arr;
    }
}

