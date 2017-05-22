import java.util.*;

public class MyHashmap<key_type,value_type>
{
    private key_type key;
    private value_type value;
    static final int hashMapSize = 1000000;

    ArrayList< Pair<key_type,value_type>  > hash_list[] = new ArrayList[hashMapSize];

    public value_type getElement(key_type key)
    {
        int index = getHashVal(key.hashCode());

        value_type ans = null;

        for(int i=0;i<hash_list[index].size();i++)
        {
            Pair<key_type,value_type> p = hash_list[index].get(i);

            if(p.key==key)
                ans = p.obj;
        }
        return ans;
    }

    public void pulElement(key_type key, value_type val)
    {
        int index = getHashVal(key.hashCode());

        Pair<key_type,value_type> p = new Pair<key_type,value_type>(key,val);

        if(hash_list[index]==null)
        {
            hash_list[index] = new ArrayList< Pair<key_type,value_type> >();
        }

        hash_list[index].add(p);
    }

    public int getHashVal(int hashCode)
    {
        int ans = (Math.abs(hashCode))%hashMapSize;

        ans = (ans*31)%hashMapSize;
        ans = (ans*17)%hashMapSize;
        ans = (ans*11)%hashMapSize;

        return ans;
    }
}
class Pair<key_type,val_type>
{
    public key_type key;
    public val_type obj;

    public Pair(key_type k,val_type o)
    {
        this.key = k;
        this.obj = o;
    }
}