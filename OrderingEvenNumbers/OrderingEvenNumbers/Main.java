package OrderingEvenNumbers;
import java.util.*;

/* Execute toda a lista de entrada e no Intellij (aonde o código foi testado está funcionando perfeitamente). */

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> lista = new ArrayList<>();
        List<Integer> par 	= new ArrayList<>();
        List<Integer> impar = new ArrayList<>();

        int n = sc.nextInt();
        for (int i=0 ; i<n ; i++)
            lista.add(sc.nextInt());

        for (Integer x: lista){
            if (x%2==0)
                par.add(x);
            else
                impar.add(x);
        }

        Collections.sort(par);
        Collections.sort(impar);
        Collections.reverse(impar);

        for (Integer y: par)
            System.out.println(y);
        for (Integer z: impar)
            System.out.println(z);

        sc.close();
    }
}