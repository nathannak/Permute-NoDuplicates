
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        ArrayList<ArrayList<Integer>> list2 = getPermutations(list);
        System.out.println(list2);

    }

    public static ArrayList<ArrayList<Integer>> getPermutations(ArrayList<Integer> array) {

        ArrayList<ArrayList<Integer>> _res = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();

        permute(_res, temp , array);
        return _res;

    }

    public static void permute (ArrayList<ArrayList<Integer>> _res, ArrayList<Integer> temp, ArrayList<Integer> array) {

        if(temp.size()==array.size()){
            _res.add( new ArrayList<>(temp) );
            return;
        }

        for (int i=0 ; i < array.size() ; i++ ) {

            if(temp.contains(array.get(i))){
                continue;
            }

            temp.add(array.get(i));

            permute(_res, temp, array);

            temp.remove(temp.size()-1);

        }

    }

}
