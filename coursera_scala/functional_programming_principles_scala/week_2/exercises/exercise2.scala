object Exercise2 {
    def sum(f: Int => Int, a: Int, b: Int) = {
        def loop(a: Int, acc: Int): Int = 
            if (a>b) acc
            else loop(a + 1, f(a) + acc)
        loop(a,0)
    }
}

//Exercise2.sum(x=>x*x, 3,5)  res3: Int = 50