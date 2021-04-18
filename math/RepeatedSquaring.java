public static long func(long n, long m, long p) {
    if(p == 0) return 1;
    if(p%2 == 0) {
        long t = func(n, m, p/2);
    } else {
        return n * func(n, m, p-1) % m;
    }
}
