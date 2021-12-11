public  class Main {
    public static class Pair <T extends Comparable<T>,E extends Comparable<E>> implements Comparable<Pair<T,E>> {
        public T first;
        public E second;
        public Pair(T first , E second) {
            this.first = first ;
            this.second = second;
        }
        public Pair() {}
        @Override
        public int compareTo(Pair<T, E> o) {
            if (this.first.compareTo(o.first)<0)  return -1;
            else if (this.first.compareTo(o.first)>0) return 1;
            else {
                if (this.second.compareTo(o.second)<0) return -1;
                else return 1;
            }
        }
    }
    public static void main(String [] args) {
        Pair<Integer,String> p = new Pair<>(1,"abcd"); 
    }
}
