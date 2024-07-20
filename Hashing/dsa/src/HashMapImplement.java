import java.util.*;
public class HashMapImplement {
    //key value are generics,values can be any data structure
    static class HashMap<K, V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }
        //nodes
        private int n;
        private int N;//buckets
        //hash map
        private LinkedList<Node> buckets[];
        //N=buckets.length
        //to remove the warnings of ll without data type
        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N=4;
            //new ll without values
            this.buckets=new LinkedList[4];
            for(int i=0;i<4;i++){
                this.buckets[i]=new LinkedList<>();
            }
        }
        private int hashFunction(K key){ //bi must be 0->N-1
            int bi=key.hashCode();
            //returns positive or negative value but we need positive one
            return Math.abs(bi) % N;
        }
        private int searchInLL(K key,int bi){
            LinkedList<Node> ll=buckets[bi];
            for(int i=0;i<ll.size();i++){
                if(ll.get(i).key==key){
                    return i;
                }
            }
            return -1;
        }
        private void rehash(){
            LinkedList<Node> oldBucket[]=buckets;
            buckets=new LinkedList[N*2];
            for(int i=0;i<N*2;i++){
                buckets[i]=new LinkedList<>();
            }
            for(int i=0;i<oldBucket.length;i++){
                LinkedList<Node> ll=oldBucket[i];
                for(int j=0;j<ll.size();j++){
                    Node node=ll.get(j);
                    put(node.key,node.value);
                }
            }
        }
        public void put(K key,V value){
            int bi=hashFunction(key);//got index of array
            int di=searchInLL(key,bi);
            //ll index-if di>0 key exists else di=-1 invalid index
            if(di==-1)//doesnt exist
            {
                buckets[bi].add(new Node(key,value));
            }
            else{//key exists
                Node data=buckets[bi].get(di);
                data.value=value;
            }
            double lambda=(double)n/N;
            if(lambda>2.0){
                //rehashing
            }
        }
        public V get(K key){
            int bi=hashFunction(key);//got index of array
            int di=searchInLL(key,bi);
            //ll index-if di>0 key exists else di=-1 invalid index
            if(di==-1)//doesnt exist
            {
                return null;
            }
            else{//key exists
                Node data=buckets[bi].get(di);
                return data.value;
            }
        }
        public boolean containsKey(K key){
            int bi=hashFunction(key);//got index of array
            int di=searchInLL(key,bi);
            //ll index-if di>0 key exists else di=-1 invalid index
            if(di==-1)//doesnt exist
            {
                return false;
            }
            else{//key exists
                //Node data=buckets[bi].get(di);
                return true;
            }
        }
        public V remove(K key){
            int bi=hashFunction(key);//got index of array
            int di=searchInLL(key,bi);
            //ll index-if di>0 key exists else di=-1 invalid index
            if(di==-1)//doesnt exist
            {
                return null;
            }
            else{//key exists
                Node data=buckets[bi].remove(di);
                n--;
                return data.value;
            }
        }
        public ArrayList<K> keySet(){
            ArrayList<K> keys=new ArrayList<>();
            for(int i=0;i<buckets.length;i++){
                LinkedList<Node> ll=buckets[i];
                for(int j=0;j<ll.size();j++){
                    Node node=ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }
        public boolean isEmpty(){
            return n==0;
        }
    }

    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("india",200);
        map.put("us",130);

        ArrayList<String> keys=map.keySet();
        for(int i=0;i<keys.size();i++){
            System.out.println(keys.get(i)+" "+map.get(keys.get(i)));
        }
    }
}
