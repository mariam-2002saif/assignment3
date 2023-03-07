import java.util.Arrays;

public class HW3 {
    static int [] merge(int[] m,int[] l,int[] a)
    {
        int i=0,j=0,k=0;
        while (i<m.length&&j<l.length)
        {
            if(m[i]<=l[j])
            {
                a[k]=m[i];
                i++;
            }
            else
            {
                a[k]=l[j];
                j++;
            }
            k++;
        }
        while (i<m.length)
        {
            a[k]=m[i];
            i++;
            k++;
        }
        while(j<l.length)
        {
            a[k]=l[j];
            j++;
            k++;
        }
        return a;
    }
    public static void main(String[] args) {
        int[] d={2,4,6,9};
        int[] f={1,3,5,7,8};
        int[] z=new int[d.length+f.length];

        System.out.println(Arrays.toString(merge(d,f,z)));
    }
}
