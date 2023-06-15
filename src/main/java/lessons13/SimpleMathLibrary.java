package lessons13;

public class SimpleMathLibrary {

    public double add(double a, double b){
        return a+b;
    }

    public double minus(double a, double b){
        return a-b;
    }

    public int[] afterLastFour(int[] array){
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==4){
                index=i;
            }
        }
        if (index==-1){
            throw new RuntimeException("Enter at least one 4");
        }

        int res[] = new int[array.length - index -1];
        System.arraycopy(array, index+1, res, 0, res.length);
        return res;
    }

    public boolean afterLastFourAndOne(int[] array){
        boolean one=false;
        boolean four=false;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==4){
                four=true;
            }else if (array[i]==1){
                one=true;
            }else {
                return false;
            }
        }
        return one && four;
    }
}

